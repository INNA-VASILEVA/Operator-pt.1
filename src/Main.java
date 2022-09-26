public class Main {
    public static void main(String[] args) {
//Задание 3.1
        System.out.println("Задание 3.1");
        int ageKid = 25;
        if (ageKid >= 2 && ageKid <= 6) {
            System.out.println("Если возраст человека равен " + ageKid + ", то ему нужно ходить в сад");
        } else if (ageKid >= 7 && ageKid <= 18) {
            System.out.println("Если возраст человека равен " + ageKid + ", то ему нужно ходить в школу");
        } else if (ageKid >= 19 && ageKid <= 24) {
            System.out.println("Если возраст человека равен " + ageKid + ", то ему нужно ходить в университет");
        } else if (ageKid > 24) {
            System.out.println("Если возраст человека равен " + ageKid + ", то ему нужно ходить на работу");
        }
//Задание 3.2
        System.out.println("Задание 3.2");
        int ageChild = 29;
        if (ageChild < 5) {
            System.out.println("Кататься нельзя");
        } else {
            if (ageChild >= 5 && ageChild <= 13) {
                System.out.println("Кататься можно только со взрослыми");
            } else {
                System.out.println("Кататься без взрослых можно");
            }
        }
//Задание 3.3
        System.out.println("Задание 3.3");
        int one = 14;
        int two = 11;
        int free = 8;
        if (free > one && free > two) {
            System.out.println("бОльшее из трех числел " + free);
        } else {
            if (two > one && two > free) {
                System.out.println("бОльшее из трех числел " + two);
            } else {
                if (one > two && one > free) {
                    System.out.println("бОльшее из трех числел " + one);
                } else {
                    if (one == two || one == free) {
                        System.out.println(one + " числа равны!");
                    } else {
                        if (two == one || two == free) {
                            System.out.println(two + " числа равны!");
                        } else {
                            if (free == one || free == two) {
                                System.out.println(free + " числа равны!");
                            }
                        }
                    }
                }
            }
        }
    }
}