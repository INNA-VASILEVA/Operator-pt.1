public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int age1 = 29;
        if (age1 >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        }
        if (age1 < 18) {
            System.out.println("Возраст совершеннолетия еще не достигнут, нужно подождать");
        }
//Задание 2
        System.out.println("Задание 2");
        int age2 = 23;
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Пора идти в школу!");
        }
        if (age2 >= 18 && age2 <= 23) {
            System.out.println("Пора в университет!");
        }
        if (age2 >= 24) {
            System.out.println("Пора искать работу!");
        }
//Задание 3
        System.out.println("Задание 3");
        int totalSeats = 102;
        int totalSitSeats = 60;
        int totalUpSpace = totalSeats - totalSitSeats;

        int sitSeats = 59;
        int upSpace = 0;
        if (sitSeats >= 61) {
            System.out.println("Сидячих мест нет");
        }
        if (sitSeats < 60) {
            System.out.println("Есть еще " + (totalSitSeats - sitSeats) + " сидячих мест");
        }
        if (upSpace >= 43) {
            System.out.println("Стоячих мест нет");
        }
        if (upSpace <= 42) {
            System.out.println("Есть еще " + (totalUpSpace - upSpace) + " стоячих мест");
        }
        if (sitSeats + upSpace >= 103) {
            System.out.println("Никаких мест нет");
        }
        if (sitSeats + upSpace <= 102) {
            System.out.println("Места есть!");
        }
    }
}