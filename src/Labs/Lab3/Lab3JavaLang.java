package Labs.Lab3;

public class Lab3JavaLang {
    public static void main(String[] args) {
        //Задание 1.
        //Написать программу,где объявлены и проинициализированы все примитивные типы данных.
        //(byte, short, int, long, float, double, char, boolean)
        //Необходимо вывести на экран все значения этих переменных.
        //Пример: Значение типа byte = 10
        //Значение типа short = 100 и т д.
        byte b = 127;
        short s = 32767;
        int i = 584651;
        long l = 95_594_125L;
        float f = 154.236f;
        double d = 198.294;
        char c = 'A';
        boolean bool = true;
        System.out.println( "byte = " + b + "\n"
                + "short = " +  s + "\n"
                + "int = " +  i + "\n"
                + "long = " +  l + "\n"
                + "float = " +  f + "\n"
                + "double = " +  d + "\n"
                + "char = " +  c + "\n"
                + "boolean = " +  bool);
        System.out.println(" ");

        //Задание 2 Применить на практике возможные преобразования без потери точности.
        // 1.byte->short->int->long
        // 2.int->double
        // 3.short->float->double
        // 4.char->int
        byte b1 = -127;         // 1.byte->short->int->long
        short s1 = b1;
        int i1 = b1;
        long l1 = b1;
        System.out.println("byte = " + b1 + "\n"
                + "short = " + s1 + "\n"
                + "int = " + i1 + "\n"
                + "long = " + l1);

        int i2 = 343245;        // 2.int->double
        double d1 = i2;
        System.out.println("double = " + d1);

        short s2 = 32767;       // 3.short->float->double
        float f1 = s2;
        double d2 = s2;
        System.out.println("float = " + f1 + "\n"
                + "double = " + d2);

        char c1 = '\uffff';    // 4.char->int
        int i3 = c1;
        System.out.println("int = " + i3);
        System.out.println(" ");

        //Задание 3
        // Применить на практике автоматическое преобразование,но с потерей точности: int -> float.
        // 1.Проинициализировать переменную типа int максимальным значением
        // 2.Присвоить ее значение переменной типа float.
        // 3.Вывести оба числа на экран.
        int max = 2147483647;
        float f2 = (float) max;
        System.out.println("int = " + max + "\n"
                + "float = " + f2);
        System.out.println(" ");

        // Задание 4
        // Проверить работу переполнения мантиссы числа в java.
        // 1.Создать переменную типа byte и проинициализировать ее максимальным значением.
        // 2.Выполнить операцию "инкремент" для этой переменной.
        // 3.Вывести значение на экран.
        byte b2 = 127;
        b2++;
        System.out.println(b2);
        System.out.println(" ");

        //Задание 4
        // Написать тернарную операцию,которая определяет четность числа
        // и формирует соответствующую строку, которая выводится на экран.
        int a = 6;
        System.out.println(a%2 == 0 ? "четное" : "не четное");
    }
}
