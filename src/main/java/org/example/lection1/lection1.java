package org.example.lection1;
/*  1. Основы основ: Типы, базовые конструкции
*   2. Детальный разбор некоторых API^ Файлы и работа с потоками ввода \Вывода
*   3. Погружение в Java Collection API^ List- ы и не только
* */
// Комментарии строчные

// Типы данные и переменные:
/*
Типы данных: а) ссылочные: (классы и интерфейсы (ООП))
             б) примитивные: (boolean, int, short, long, float, double, char)

Создание переменной:

    <тип> <идентификатор>;
    <идентификатор> = <значение>;

    Нужно всегда положить какое то значение на переменную.
    String s = null; //(ничего- null)
Примитивные типы:
    Целые числа: int - 4 байта, Short..
    Вещественные числа: float e = 2.7f // нужно вставить всегда букву "f"
                        double d = 2.12312d // Здесь можно вставить можно нет
                        char ch = 123 // char будет хранить символы (будет неявное преобразование)
             Неявное преобразование:
                        Можем преобразовать int к double (потому что байты у double больше)
                        а наоборот не получиться.
                        boolean flag1 = 123 <= 234
                        System.out.println(flag1); //true
                            && -И (конюнкция, AND),
                            || - ИЛИ,
                            &-| побитовая операция И, ИЛИ.
                            ^ - разделительная дизьюнкция.

                                        Логический операторы	Значение
                                        ==	                    Проверка на соответствие (допустим, что a равен b)
                                        !=	                    Не равно (если a не равно b, то)
                                        !	                    Отрицание, логическое не
                                        &	                    Логическое И, and
                                        |	                    Логическое или, or
                                        ^	                    Исключительное или, XOR
                                        &&	                    Укороченный &
                                        ||	                    Укороченный или
Ссылочные типы:
    Строки: String s = "Hello World!" // смотриться примитивно, но не так !
Неявная типизация:
    var i = 123_456_789; // вместо типа var переставится int  i = 123456789
    var d = 123.456 // будет double
    getType(i) // метод для возврата типы данных не  забыть написать статический член класса.
                        static String getType(Object o){
                                 return o.getClass().getSimpleName();
                                                     }
    system.ot.println(getType(i))


Классы-Обертки: если int напишем то все хорошо, но не будет доступны полная функция.
Примитив    Обертка
int         Integer
short       Short
long        Long
byte        Byte
float       Float
double      Double
char        Character
boolean     Boolean




Операции JAVA:
    ● Присваивание: =
    ● Арифметические: *, /, +, -, %, ++, --
    ● Операции сравнения: <, >, ==, !=, >=, <=
    ● Логические операции: ||, &&, ^, !
    ● Побитовые операции <<, >>, &, |, ^

Массивы:
    Одномерные:
        int [] arr = new int [10];
        system.out.println(arr.length); //10
        arr - new int[] {1,2,3,4,5};
        system.out.println(arr.length); //5
    Многомерные:
         int[] arr[] = new int[3][5];
            for (int[] line : arr) {
                for (int item : line) {
                    System.out.printf("%d ", item);
                }
             System.out.println();

Преобразования:
                    char
                      |
                      v
    byte -> short -> int -> long
                      |  \ /  |
                      v  / \  v
                   float     double
int[] a = new int[10];
 double[] d = a; // ИЗУЧАЕМ ковариантность и контравариантность



Получение данных из терминала:

import java.util.Scanner;

public class Program {
 public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in); // Экземпляр класса Scaner.

    System.out.printf("name: ");
    String name = iScanner.nextLine();
    System.out.printf("Привет, %s!", name);
    iScanner.close();

 }
}

Форматированный вывод

 int a = 1, b = 2;
 int c = a + b;
 String res = a + " + " + b + " = " + c;
 System.out.println(res);

Конкатенацию не использовать.

//  тут маскировка и вывод:
         int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);





//Виды спецификаторов
%d: целочисленных значений
%x: для вывода шестнадцатеричных чисел
%f: для вывода чисел с плавающей точкой
%e: для вывода чисел в экспоненциальной форме,
например, 3.1415e+01
%c: для вывода одиночного символа
%s: для вывода строковых значений


Область видимости переменных
У переменных существует понятие «область видимости».
Если переменную объявили внутри некоторого блока фигурных скобок { },
то снаружи этого блока переменная будет недоступна.

public class Program {
    public static void main(String[] args) {
    {
        int i = 123;
        System.out.println(i);
     }
        System.out.println(i); // error: cannot find symbol
     }
}



Функции и методы:
    Функции и методы — это технически одно и то же. Функции могут
    не принадлежать классам, а методы принадлежат.
    В java все функции являются методами.

    Можем создать в одной папке файл с классом java и запихать туда все методы и функции,
    В этом случае чтобы достучаться до метода в созданном классе нужно прописать:
    namefile.nameOfMethod()
    static void sayHi(){
            System.out.println("Hi");
        };

    public class Program {
     static void sayHi() {
     System.out.println("hi!");
     }
     static int sum(int a, int b) {
     return a+b;
     }
     static double factor(int n) {
     if(n==1)return 1;
     return n * factor(n-1);
     }
     public static void main(String[] args) {
     sayHi(); // hi!
     System.out.println(sum(1, 3)); // 4
     System.out.println(factor(5)); // 120.0
     }}


//Управляющие конструкции:

//условный оператор
     int a = 1;
     int b = 2;
     int c = 0;
     if (a > b) c = a;
     if (b > a) c = b;
     System.out.println(c);
//тернарный оператор
     int a = 1;
     int b = 2;
     int min = a < b ? a : b;
     System.out.println(min);

//Оператор выбора
    int mounth = value;
     String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            ...
            default:
                text = "mistake";
                break;
                }
     System.out.println(text);
     iScanner.close();


//Циклы
В java доступны следующие циклы:
● цикл while;
● цикл do while;
● цикл for; и его модификация for in

● цикл while;
    int value = 321;
     int count = 0;
     while (value != 0) {
     value /= 10;
     count++;
     }

● цикл do while;  делает с одним заходом.
    int value = 321;
     int count = 0;
     do {
     value /= 10;
     count++;
     } while (value != 0);
     System.out.println(count);

//continue, break
Операторы для управления циклами — continue и break.
Выполнение следующей итерации цикла — continue.
Прерывание текущей итерации цикла — break.
* ближайшего к оператору

for (int i = 0; i < 10; i++)
{
    if (i % 2 != 0 ) {
    //continue;
    break;
    }
}
//Вложенные циклы

    for (int i = 0; i < 5; i++) {
     for (int j = 0; j < 5; j++) {
     System.out.print("* ");
     }
     System.out.println();
     }

     // * * * * *
     // * * * * *
     // * * * * *
     // * * * * *
     // * * * * *


//Работает только для коллекций foreach

    int arr[] = new int[10];
     for (int item : arr) {
     System.out.printf("%d ", item);
     }
     System.out.println();



//Работа с файлами

//Создание и запись\ дозапись
        import java.io.FileWriter;
        import java.io.IOException;

        try (FileWriter fw = new FileWriter("file.txt", false)) {
         fw.write("line 1");
         fw.append('\n');
         fw.append('2');
         fw.append('\n');
         fw.write("line 3");
         fw.flush();
         } catch (IOException ex) {
         System.out.println(ex.getMessage());
         }



//Чтение, Вариант посимвольно

    import java.io.*;
        public class Program {
             public static void main(String[] args) throws Exception {
                     FileReader fr = new FileReader("file.txt");
                     int c;
                     while ((c = fr.read()) != -1) {
                     char ch = (char) c;
                     if (ch == '\n') {
                     System.out.print(ch);
                     } else {
                     System.out.print(ch);
                     }
                    }
             } }
//Вариант построчно

    import java.io.*;
        public class Program {
             public static void main(String[] args) throws Exception {
                 BufferedReader br = new BufferedReader(new FileReader("file.txt"));
                 String str;
                     while ((str = br.readLine()) != null) {
                     System.out.printf("== %s ==\n", str);
                     }
                 br.close();
                 }
        }







 */
public class lection1 {
    public static void main(String[] args) {

//        String s = "Hi!";
//        s.length(); // Длина строки.
//        System.out.println(s.charAt(1)); // Возвращает первый символ нумерация с 0!
//    var d = 123.456;
//    System.out.println(getType(d));



        //Операции JAVA:

//        double num = 123.456;
//        double n = num / 100;
//        System.out.println(n);

        //int a = 456;
        //a = a-- - --a;

/*        a (1) -> a-- (2) -> --a (3) -> (a--)-(--a) (4)
        Step 1: a evaluates to 456.
        Step 2: a--; evaluates to 455, a becomes 455.
        Step 3: --a; evaluates to 454, a becomes 454.
        Step 4: 456 - 454; evaluates to 2.*/

        //a = --a - a--;

        /* a (1) -> --a (2) -> a-- (3) -> --a - a-- (4)
        Step 1: a evaluates to 456.
        Step 2: --a; evaluates to 455, a becomes 455.
        Step 3: a--; evaluates to 455, a becomes 455.
        Step 4: 455 - 455; evaluates to 0.
            a-- will never use ! */
        //System.out.println(a); // Постфикс приоритетом ниже чем вывод, и префикс приоритетом выше чем вывод!
//
//    boolean f= 123 > 234;
//        System.out.println(f);
//
//    int a = 5;
//    int b = 2;
//        System.out.println(a|b);
//        //101  - 5
//        //010  - 2
//        //111  - 7
//
//    boolean a = true;
//    boolean b = true;
//        System.out.println(a & b);  //Одинарное посмотрить оба части выражения.
//        System.out.println(a && b); //Быстрая И не посмотрит дсоконально и левую и правую часть выражения.



        // Массивы
        // Одномерные
//        int [] arra = new int [10];
//        System.out.println(arra.length); //10
//        arra = new int[] {1,2,3,4,5};
//        arra [3] = 13;
//        System.out.println(arra.length); //5
//        System.out.println(arra[3]);

        // Многомерные:
//        int[] arr[] = new int[3][5];
//        for (int[] line : arr) {
//            for (int item : line) {
//                System.out.printf("%d ", item);
//            }
//            System.out.println();
//
//        }
        // Еще вот так можно:
        //They are semantically identical. The int array[] syntax was only added to help C programmers get used to java.
        //int[] array is much preferable, and less confusing.

        /*int[][] arrays = new int[3][5];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%d ", arrays[i][j]);
            }
            System.out.println();}
*/

            // Преобразования
//        int i = 123; double d = i;
//        System.out.println(i); // 123
//        System.out.println(d); // 123.0
//        d = 3.1415; i = (int)d;
//        System.out.println(d); // 3.1415
//        System.out.println(i); // 3
//        d = 3.9415; i = (int)d;
//        System.out.println(d); // 3.9415
//        System.out.println(i); // 3
//        byte b = Byte.parseByte("123");
//        System.out.println(b); // 123
//        b = Byte.parseByte("123"); // тип данных byte хранит значение от 0 до 255
//        System.out.println(b); // NumberFormatException: Value out of range


//
//        Scanner iScanner = new Scanner(System.in); // Экземпляр класса Scaner.
//
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//
//        System.out.printf("years old: ");
//        int yearsold = iScanner.nextInt();
//
//        System.out.printf("Привет, %s, %d!", name,yearsold);
//        iScanner.close();

                //%s - insert a string
                //%d - insert a signed integer (decimal)
                //%f - insert a real number, standard notation


//        Scanner iScanners = new Scanner(System.in);
//        System.out.printf("int a: ");
//        int x = iScanners.nextInt();
//        System.out.printf("double a: ");
//        double y = iScanners.nextDouble(); // Указать данные через запятую!
//        System.out.printf("%d + %f = %f", x, y, x + y);
//        iScanners.close();

//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt(); // hasnextin проверяет если следующая типа данных int!
//        System.out.println(flag);
//        int i = iScanner.nextInt();
//        System.out.println(i);
//        iScanner.close();






//        int a = 1, b = 2;
//        int c = a + b;
//        String res = String.format("%d + %d = %d \n", a, b, c);
//        System.out.printf("%d + %d = %d \n", a, b, c);
//        System.out.println(res);
//        System.out.printf("%d + %d = %d \n", a, b, c); - здесь маскировка
//        System.out.println(res); Здесь результат переменной если это новая строка!





//Виды  спецификаторов:
//        float pi = 3.1415f;
//        System.out.printf("%f\n", pi); // 3,141500
//        System.out.printf("%.2f\n", pi); // 3,14
//        System.out.printf("%.3f\n", pi); // 3,141
//        System.out.printf("%e\n", pi); // 3,141500e+00
//        System.out.printf("%.2e\n", pi); // 3,14e+00
//        System.out.printf("%.3e\n", pi); // 3,141e+00














    }


    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}






