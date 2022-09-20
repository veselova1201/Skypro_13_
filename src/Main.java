public class Main {
    public static void main(String[] args) {
        //задание 1

        int age = 20;
        if (age >= 18) {
            System.out.println("поздравляю с соверннолетием");
        } else {
            System.out.println("надо немного подождать");
        }
        //задание 2

        int age2 = 70;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("ребенок ходит в школу");
        } else if (age2 >= 18 && age2 >= 24) {
            System.out.println("Человек пошел в институт");
        }
        if (age2 >= 24) {
            System.out.println("Человеку пора на работу");
        }
        //  задание 3
        //
        int capacityOFHumans = 102;
        int seats = 60;
        int traffic = 70;
        if (capacityOFHumans - traffic >= seats) {
            System.out.println("Сидячие места есть");
        } else if (capacityOFHumans - traffic < seats) {
            System.out.println("Сидячих мест нет");
        } else if (capacityOFHumans - traffic == 0) {
            System.out.println("Мест нет");
        }
        //задание 4
        int age4 = 20;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить в детский сад");
        } else if (age4 >= 7 && age4 <= 18) {
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить в школу");
        } else if (age4 >= 18 && age4 < 24) {
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить в университет");
        } else if (age4 >= 24) {
            System.out.println("Если возраст человека равен " + age4 + " , то ему пора на работу");
        }
        // задание 5
        int age5 = 5;
        int adultWithUs = 0; // 0-Взрослый отсутствует|| 1-Взрослый присутстсвует
        if (age5 < 5) {
            System.out.println("рано кататься на аттракционах");
        } else if (age5 >= 5 && age5 < 14) {
            if (adultWithUs == 0) {
                System.out.println("Кататься нельзя без взрослого");
            } else {
                System.out.println("Кататься в присутствии взрослого можно");
            }
        } else {
            System.out.println(" Может кататься без сопровождения взрослого");
        }
        //задание 6
        int one = 3;
        int two = 5;
        int three = 1;
        if (one < two) {
            if (two < three) {
                System.out.println("Третия переменная самая большая");
            }else {
                System.out.println("Вторая самая большая");
            }
        }else {
            if (one < three) {
                System.out.println("Третия переменная самая большая");
            } else {
                System.out.println("первая  самая большая");
            }


        }

    }
}








