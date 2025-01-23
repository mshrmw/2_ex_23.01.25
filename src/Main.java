import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Fun(a,b));
    }
    public static int Fun(int a, int b) {
        if (a > b) {
            return a;
        }
        else if (b > a) {
            return b;
        }
        else {
            throw new IllegalArgumentException("Числа равны, невозможно определить максимум");
        }
    }
}

class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа для деления");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Division(a,b));
    }
    public static double Division(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("недопустимость деления на ноль");
        }
        else return a/b;
    }
}

class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(toint(s));
    }
    public static int toint(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("строка не может быть конвертирована");
        }
    }
}

class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Age(n));
    }
    public static int Age(int n) {
        if (n < 0 || n > 150) {
            throw new IllegalArgumentException("возраст меньше нуля или больше 150");
        }
        else return n;
    }
}

class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sqrt(n));
    }
    public static double sqrt(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n is negative");
        }
        else return Math.sqrt(n);

    }
}

class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Factorial(n));
    }
    public static int Factorial(int n) {
        if(n < 0) throw new IllegalArgumentException("число отрицательное");
        else if(n == 1) return 1;
        else return n * Factorial(n-1);
    }
}

class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(IsNull(arr));
    }
    public static boolean IsNull(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                throw new IllegalArgumentException("есть нули");
            }
        }
        return false;
    }
}

class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double s = scanner.nextInt();
        System.out.println(Pow(n, s));
    }
    static double Pow(double n, double s) {
        if (s < 0) {
            throw new IllegalArgumentException("степень отрицательная");
        }
        else return Math.pow(n, s);
    }
}

class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = scanner.nextInt();
        System.out.println(Fun(input, n));
    }
    public static String Fun(String input, int n) {
        if (input.length() < n) {
            throw new IllegalArgumentException("число символов больше длины строки");
        }
        else return input.substring(0, n);
    }
}

class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int f = scanner.nextInt();
        System.out.println("индекс " + Find(arr, f));
    }
    public static int Find(int[] arr, int f) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == f) {
                return i;
            }
        }
        throw new IllegalArgumentException("элемент не найден");
    }
}

class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Dvoich(n));
    }
    public static int Dvoich(int n) {
        if (n < 0) throw new IllegalArgumentException("Число не может быть отрицательным");
        else {
            String s = "";
            while (n > 0) {
                s += n % 2;
                n /= 2;
            }
            String str = "";
            for (int i = s.length() - 1; i > 0; i--) {
                str += s.charAt(i);
            }
            return Integer.parseInt(str);
        }
    }
}

class ex_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Dvoich(n));
    }
    public static String Dvoich(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        return Integer.toBinaryString(n);
    }
}

class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(Div(n,m));
    }
    public static boolean Div(int n, int m) {
        if ( m == 0) throw new ArithmeticException("второе число равно нулю");
        else return true;
    }
}

class ex13 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        try {
            System.out.println("Элемент на индексе 1: " + getElement(items, 1));
            System.out.println("Элемент на индексе 5: " + getElement(items, 5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static <T> T getElement(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс " + index + " выходит за пределы списка. Размер списка: " + list.size());
        }
        return list.get(index);
    }
}

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

class ex14 {
    public static void main(String[] args) {
        try {
            checkPassword("12345");
            checkPassword("StrongPass123!");
        } catch (WeakPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void checkPassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Пароль слишком короткий. Длина должна быть не менее 8 символов.");
        }
        System.out.println("Пароль принят: " + password);
    }
}

class ex15 {
    public static void main(String[] args) {
        try {
            checkDate("25.12.2023");
            checkDate("25-12-2023");
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void checkDate(String date) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate parsedDate = LocalDate.parse(date, formatter);
        System.out.println("Корректная дата: " + parsedDate);
    }
}

class ex16 {
    public static void main(String[] args) {
        try {
            System.out.println(concatenateStrings("Hello", "World"));
            System.out.println(concatenateStrings("Java", null));
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null");
        }
        return str1 + str2;
    }
}

class ex17 {
    public static void main(String[] args) {
        try {
            System.out.println("Остаток от деления 10 на 3: " + calculateRemainder(10, 3));
            System.out.println("Остаток от деления 15 на 0: " + calculateRemainder(15, 0));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static int calculateRemainder(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return dividend % divisor;
    }
}

class ex18 {
    public static void main(String[] args) {
        try {
            System.out.println("Квадратный корень из 16: " + calculateSquareRoot(16));
            System.out.println("Квадратный корень из -4: " + calculateSquareRoot(-4));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно вычислить квадратный корень из отрицательного числа");
        }
        return Math.sqrt(number);
    }
}

class ex19 {
    public static void main(String[] args) {
        try {
            System.out.println("Температура в Фаренгейтах: " + convertCelsiusToFahrenheit(25));
            System.out.println("Температура в Фаренгейтах: " + convertCelsiusToFahrenheit(-300));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура не может быть ниже абсолютного нуля (-273.15 C).");
        }
        return (celsius * 9 / 5) + 32;
    }
}

class ex20 {
    public static void main(String[] args) {
        try {
            System.out.println(checkString("Hello"));
            System.out.println(checkString(""));
            System.out.println(checkString(null));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static String checkString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или равна null");
        }
        return str;
    }
}





