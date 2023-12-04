package edu.camilaavillaa.reto12.lenguaje;

public class Russian implements Lenguaje{

    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "Добро пожаловать в калькулятор";
            case "select_option":
                return "Выберите опцию";
            case "invalid_option":
                return "Неверная опция, попробуйте снова";
            case "continue":
                return "Продолжить (да/нет)?: ";
            case "exit":
                return "Выход...";
            case "enter_first_number":
                return "Введите первое число";
            case "enter_second_number":
                return "Введите второе число";
            case "enter_raiz":
                return "Введите основание для извлечения квадратного корня";
            case "enter_base":
                return "Введите число, из которого мы извлечем корень:";
            case "enter_exponent":
                return "Введите показатель степени";
            case "enter_dividend":
                return "Введите делимое:";
            case "enter_divisor":
                return "Введите делитель:";
            case "enter_modulo_number":
                return "Введите число для вычисления остатка";
            case "enter_modulo_divisor":
                return "Введите делитель для вычисления остатка";
            case "enter_logarithm_number":
                return "Введите число для логарифма: ";
            case "enter_logarithm_base":
                return "Введите основание логарифма";
            case "result":
                return "Результат:";
            case "menu":
                return "Меню: \n1 Сложение\n2 Вычитание\n3 Умножение\n4 Возведение в степень\n5 Деление\n6 Остаток\n7 Логарифм\n8 Квадратный корень\n0 Выход\nS";
            case "operation_description":
                return "Операция:";
            case "is":
                return "это";
            case "Adding":
                return "Добавление";
            case "Subtracting":
                return "Вычитание";
            case  "Multiplying":
                return "Умножение";
            case "Dividing":
                return "Разделение";
            case "Calculating the modulus of":
                return "Расчет модуля упругости: ";
            case "Calculating the logarithm of: ":
                return  "Вычисление логарифма от:";
            case "Raising":
                return "Райзинг:";
            case "Calculating the square root of: ":
                return "Вычисление квадратного корня из:";
            case "Do you want to see the arithmetic operations performed so far? (s/S):":
                return  "Хотите посмотреть выполненные арифметические операции до сих пор? (да/нет)";

            default:
                return "Сообщение не найдено";
        }
    }
}
