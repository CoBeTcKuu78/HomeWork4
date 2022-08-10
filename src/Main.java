public class Main {
    public static void main(String[] args) {


        //задача 2
    int firstFriday = 5;
    int nextFriday = firstFriday + 7;
    int lastFriday = 31;
    for (int i = firstFriday; i < lastFriday; i = i + 7){
        System.out.println( "Сегодня пятница " + i  + "-е, подготовьте отчет!");
        //break;
    }
        //задача 3
        int yearNow = 2022;
        int begin = yearNow -200;
        int end = yearNow + 100;
        for (int i = 0; i <= end; i = i + 79)
            if(i >= begin){
            System.out.println(i);
        }


        /* не моё решение,но смотрел и сверял
        int currentYear = 2022;
        int begin = currentYear - 200;
        int end = currentYear + 100;
        for (int year = 0; year <= end; year += 79) {
            if (year >= begin) {
                System.out.println(year);
            }
        }*/
    }
}
