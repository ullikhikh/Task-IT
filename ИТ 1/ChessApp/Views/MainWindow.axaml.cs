using Avalonia.Controls;
using Avalonia.Interactivity;
using ChessApp.ViewModels;
using Avalonia.Media;
using System;
using Avalonia;
using Avalonia.Layout;

namespace ChessApp.Views
{
    public partial class MainWindow : Window
    {
        public MainWindowViewModel ViewModel => (MainWindowViewModel)DataContext!;
        private int? selectedPieceIndex = null;

        public MainWindow()
        {
            InitializeComponent();
            DataContext = ViewModel;
            RenderBoard();
        }

        private void RenderBoard()
        {
            BoardGrid.Children.Clear();

            for (int y = 0; y < 8; y++)
            {
                for (int x = 0; x < 8; x++)
                {
                    var button = new Button
                    {
                        Tag = (x, y),
                        FontSize = 32,
                        Width = 60,      
                        Height = 60,       
                        BorderThickness = new Thickness(0.5),
                        BorderBrush = Brushes.Gray,
                        Padding = new Thickness(0),
                        Focusable = false,
                        HorizontalContentAlignment = HorizontalAlignment.Center,
                        VerticalContentAlignment = VerticalAlignment.Center,
                        Background = (x + y) % 2 == 0 ? Brushes.White : Brushes.Black,
                        Foreground = (x + y) % 2 == 0 ? Brushes.Black : Brushes.White
                    };


                    var piece = ViewModel.GetPieceAt(x, y);
                    if (piece != null)
                    {
                        button.Content = piece.GetSymbol();
                    }

                    button.Click += OnCellClick;

                    BoardGrid.Children.Add(button);
                }
            }
        }
        private void OnCellClick(object? sender, RoutedEventArgs e)
        {
            if (sender is Button button && button.Tag is ValueTuple<int, int> coords)
            {
                var (x, y) = coords;
                var pieceIndex = ViewModel.GetPieceIndexAt(x, y);

                if (selectedPieceIndex == null)
                {
                    if (pieceIndex != -1)
                    {
                        selectedPieceIndex = pieceIndex;
                        StatusText.Text = $"Выбрана фигура: {ViewModel.Pieces[pieceIndex]}";
                    }
                    else
                    {
                        StatusText.Text = "Здесь нет фигуры.";
                    }
                }
                else
                {
                    var moved = ViewModel.MovePiece(selectedPieceIndex.Value, x, y);
                    StatusText.Text = moved ? "Ход выполнен." : "Невозможный ход.";
                    selectedPieceIndex = null;
                    RenderBoard();
                }
            }
        }
    }
}
