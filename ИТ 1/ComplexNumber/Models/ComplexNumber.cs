using System;

namespace ComplexNumberApp.Models
{
    public class ComplexNumber : IEquatable<ComplexNumber>, IComparable<ComplexNumber>
    {
        public double Real { get; set; } // Изменено на set
        public double Imaginary { get; set; } // Изменено на set


        public ComplexNumber(double real = 0, double imaginary = 0)
        {
            Real = real;
            Imaginary = imaginary;
        }

public override string ToString()
{
    if (double.IsNaN(Real)) return "не определено";
    
    // Для случая сравнения (0 + i*0)
    if (Real == 0 && Imaginary == 0) return "равные числа";
    
    string re = Real.ToString("0.##");
    string im = Math.Abs(Imaginary).ToString("0.##");
    
    if (Imaginary == 0) return re;
    if (Real == 0) return $"i*{im}";
    
    string sign = Imaginary > 0 ? "+" : "-";
    return $"{re} {sign} i*{im}";
}

        // Арифметические операторы
        public static ComplexNumber operator +(ComplexNumber a, ComplexNumber b) 
            => new(a.Real + b.Real, a.Imaginary + b.Imaginary);

        public static ComplexNumber operator -(ComplexNumber a, ComplexNumber b)
            => new(a.Real - b.Real, a.Imaginary - b.Imaginary);

        public static ComplexNumber operator *(ComplexNumber a, ComplexNumber b)
            => new(
                a.Real * b.Real - a.Imaginary * b.Imaginary,
                a.Real * b.Imaginary + a.Imaginary * b.Real
            );

        public static ComplexNumber operator /(ComplexNumber a, ComplexNumber b)
        {
            double denominator = b.Real * b.Real + b.Imaginary * b.Imaginary;
            return new(
                (a.Real * b.Real + a.Imaginary * b.Imaginary) / denominator,
                (a.Imaginary * b.Real - a.Real * b.Imaginary) / denominator
            );
        }

        // Операторы сравнения
        public static bool operator ==(ComplexNumber left, ComplexNumber right)
            => left?.Equals(right) ?? right is null;

        public static bool operator !=(ComplexNumber left, ComplexNumber right)
            => !(left == right);

        public static bool operator <(ComplexNumber left, ComplexNumber right)
            => left.CompareTo(right) < 0;

        public static bool operator >(ComplexNumber left, ComplexNumber right)
            => left.CompareTo(right) > 0;

        public static bool operator <=(ComplexNumber left, ComplexNumber right)
            => left.CompareTo(right) <= 0;

        public static bool operator >=(ComplexNumber left, ComplexNumber right)
            => left.CompareTo(right) >= 0;

        // Реализация интерфейсов
        public bool Equals(ComplexNumber? other)
            => other is not null && 
               Real.Equals(other.Real) && 
               Imaginary.Equals(other.Imaginary);

        public override bool Equals(object? obj)
            => obj is ComplexNumber other && Equals(other);

        public override int GetHashCode()
            => HashCode.Combine(Real, Imaginary);

        public int CompareTo(ComplexNumber? other)
        {
            if (other is null) return 1;
            
            double thisMagnitude = Math.Sqrt(Real * Real + Imaginary * Imaginary);
            double otherMagnitude = Math.Sqrt(other.Real * other.Real + other.Imaginary * other.Imaginary);
            
            return thisMagnitude.CompareTo(otherMagnitude);
        }
    }
}