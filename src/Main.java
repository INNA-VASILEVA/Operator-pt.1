public class Main {
    public static void main(String[] args) {
//Задание 2.1
        System.out.println("Задание 2.1");
        int age3 = 17;
        if (age3 >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия еще не достигнут, нужно подождать");

        }

//Задание 2.2
        System.out.println("Задание 2.2");
        int age4 = 29;
        if (age4 >= 7 && age4 <= 17) {
            System.out.println("Пора идти в школу!");
        } else {
            if (age4 >= 18 && age4 <= 23) {
                System.out.println("Пора в университет!");
            } else {
                System.out.println("Пора искать работу!");
            }
        }

//Задание 2.3
        System.out.println("Задание 2.3");
        int totalSeats1 = 102;
        int sitSeats1 = 60;
        int upSpace1 = totalSeats1 - sitSeats1;

        int sitSeats0 = 38;
        int upSpace0 = 22;
        if (sitSeats1 >= 61) {
            System.out.println("Сидячих мест нет");
        } else {
            System.out.println("Есть еще " + (sitSeats1 - sitSeats0) + " сидячих мест");
        }
        if (upSpace0 >= 43) {
            System.out.println("Стоячих мест нет");
        } else {
            System.out.println("Есть еще " + (upSpace1 - upSpace0) + " сидячих мест");
        }
        if (sitSeats1 + upSpace1 >= 103) {
            System.out.println("Никаких мест нет");
        } else {
            System.out.println("Места есть!");
        }
    }
}