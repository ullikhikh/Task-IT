using ComplexNumberApp.Models;
using ReactiveUI;
using System;
using System.Reactive;

namespace ComplexNumberApp.ViewModels
{
    public class MainWindowViewModel : ReactiveObject
    {
        private ComplexNumber _number1 = new ComplexNumber(0, 0);
        private ComplexNumber _number2 = new ComplexNumber(0, 0);
        private ComplexNumber _result = new ComplexNumber(0, 0);
        private string _operation = "+";
        private string _errorMessage = "";

public ComplexNumber Number1
{
    get => _number1;
    set
    {
        this.RaiseAndSetIfChanged(ref _number1, value);
    }
}

public ComplexNumber Number2
{
    get => _number2;
    set
    {
        this.RaiseAndSetIfChanged(ref _number2, value);
    }
}
        public ComplexNumber Result
        {
            get => _result;
            set => this.RaiseAndSetIfChanged(ref _result, value);
        }

        public string Operation
        {
            get => _operation;
            set
            {
                this.RaiseAndSetIfChanged(ref _operation, value);
            }
        }

        public string ErrorMessage
        {
            get => _errorMessage;
            set => this.RaiseAndSetIfChanged(ref _errorMessage, value);
        }

        public ReactiveCommand<Unit, Unit> CalculateCommand { get; }
        public ReactiveCommand<Unit, Unit> CompareCommand { get; }

        public MainWindowViewModel()
        {
            CalculateCommand = ReactiveCommand.Create(Calculate);
            CompareCommand = ReactiveCommand.Create(Compare);
        }


        private void Calculate()
        {
            try
            {
                ErrorMessage = "";

                Result = Operation switch
                {
                    "+" => Number1 + Number2,
                    "-" => Number1 - Number2,
                    "*" => Number1 * Number2,
                    "/" => Number1 / Number2,
                    _ => throw new InvalidOperationException("Неизвестная операция")
                };
            }
            catch (Exception ex)
            {
                ErrorMessage = $"Ошибка: {ex.Message}";
                Result = new ComplexNumber(double.NaN, double.NaN);
            }
        }

private void Compare()
{
    ErrorMessage = "";
    string comparison;
    ComplexNumber comparisonResult;
    
    if (Number1 == Number2)
    {
        comparison = "Числа равны";
        comparisonResult = new ComplexNumber(0, 0); // Нули для отображения равенства
    }
    else if (Number1 > Number2)
    {
        comparison = "Первое число больше";
        comparisonResult = Number1; // Показываем первое число
    }
    else
    {
        comparison = "Второе число больше";
        comparisonResult = Number2; // Показываем второе число
    }

    Operation = comparison;
    Result = comparisonResult;
    
}
    }
}   