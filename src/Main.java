public class Main {
    public static void main(String[] args) {System.out.println("Домашняя работ №4 Циклы");
        //Задание 1
        //С помощью цикла for выведите в консоль все числа от 1 до 10.
        System.out.println("Задание №1");
        for (int i=1; i<11; i++)
        {
           System.out.println("Число = "+i);
        }
        System.out.println("");
        //Задание 2
        //С помощью цикла for выведите в консоль все числа от 10 до 1.
        System.out.println("Задание №2");
        for (int i=10; i>0; i--)
        {
            System.out.println("Число = "+i);
        }
        System.out.println("");
        //Задание 3
        //Выведите в консоль все четные числа от 0 до 17.
        System.out.println("Задание №3");
        for (int i=0; i<17; i+=2)
        {
            System.out.println("Число = "+i);
        }
        System.out.println("");
        //Задание 4
        //Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.
        System.out.println("Задание №4");
        for (int i=10; i>-11; i--)
        {
            System.out.println("Число = "+i);
        }
        System.out.println("");

        //Домашнее задание -2
        //Задание 1
        //Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        // В консоль результат должен выводиться в формате "… год является високосным".
        System.out.println("Задание-2 №1");
        for (int i=1904; i<2096;i+=4){
            System.out.println("Високосный год - "+i);
        }
        System.out.println("");

        //Задание 2
        //Напишите программу, которая выводит в консоль последовательность цифр:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println("Задание-2 №2");
        for (int i=7; i<=98; i+=7){
            System.out.println(" Числа кратные 7 = "+i);
        }
        System.out.println("");

        //Задание 3
        //Напишите программу, которая выводит в консоль последовательность цифр:
        //1 2 4 8 16 32 64 128 256 512
        System.out.println("Задание-2 №3");
        for (int i=1; i<=512;i*=2){
            System.out.println("Числа умноженные на 2 - "+i);
        }
        System.out.println("");

        //Домашнее задание - 3
        //Задание 1
        //Посчитайте с помощью цикла for сумму годовых накоплений,
        //если каждый месяц вы будете откладывать по 29 000 рублей "в банку".
        //Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей".
        System.out.println("Задание-3 №1");
        int salaryMonth = 29000;
        int salaryYear=0;
        for (int i=1;i<=12;i++){
            salaryYear=salaryYear+salaryMonth;
            System.out.println("Месяц "+i+" сумма накоплений равна "+salaryYear+" рублей.");
        }
        System.out.println("");

        //Задание 2
        //Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку",
        // а в банк под проценты – 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … ,
        // сумма накоплений равна … рублей" .
        System.out.println("Задание-2 №2");
        int salaryMonth2 = 29000;
        double salaryYear2=0;
        double percent=0.01; //12% годовых (12/100/12 месяцев=0,01)
        for (int i=1;i<=12;i++){
            salaryYear2=salaryYear2+salaryMonth2+(salaryYear2+salaryMonth2)*percent; // Первый вклад + последующий + (проценты от вклада 12% годовых)
            System.out.println("Месяц "+i+" сумма накоплений равна "+salaryYear2+" рублей.");
        }
        System.out.println("");

    }
}