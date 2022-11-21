public class Main {
    public static void main(String[] args) {System.out.println("Домашняя работ №4 Циклы");
        //Задание 1
        //С помощью цикла for выведите в консоль все числа от 1 до 10.
        for (int i=1; i<11; i++)
        {
           System.out.println("Число = "+i);
        }
        System.out.println("");
        //Задание 2
        //С помощью цикла for выведите в консоль все числа от 10 до 1.
        for (int i=10; i>0; i--)
        {
            System.out.println("Число = "+i);
        }
        System.out.println("");
        //Задание 3
        //Выведите в консоль все четные числа от 0 до 17.
        for (int i=0; i<17; i+=2)
        {
            System.out.println("Число = "+i);
        }
        System.out.println("");
        //Задание 4
        //Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.
        for (int i=10; i>-11; i--)
        {
            System.out.println("Число = "+i);
        }
        System.out.println("");

    }
}