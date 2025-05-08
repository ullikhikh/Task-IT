using Avalonia.Data;
using Avalonia.Data.Converters;
using System;
using System.Globalization;

namespace ComplexNumberApp.Converters
{
    public class StringToBoolConverter : IValueConverter
    {
        public object? Convert(object? value, Type targetType, object? parameter, CultureInfo culture)
        {
            return value?.ToString() == parameter?.ToString();
        }

        public object? ConvertBack(object? value, Type targetType, object? parameter, CultureInfo culture)
        {
            return value is bool b && b ? parameter : BindingOperations.DoNothing;
        }
    }
}