package src.app;

public class Main {

    public static void main(String[] args) {
        DataHandler handler = new DataHandler();  // Створюємо об'єкт обробника даних
        UIOperator uiOperator = new UIOperator();  // Створюємо оператор для виведення

        // Виведення всіх користувачів
        uiOperator.getOutput(handler.getAll());

        // Виведення користувача за певним id
        uiOperator.getOutput(handler.getById(172));  // Ідентифікатор 172
    }
}
