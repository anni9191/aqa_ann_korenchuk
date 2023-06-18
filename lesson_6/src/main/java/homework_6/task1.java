package homework_6;

public class task1 {

    public static void main(String[] args) {
        int h = 0;

        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) h++;
        }

        int[] Mas = new int[h];

        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                Mas[b] = i;
                System.out.print(Mas[b] + " ");
                b++;
            }
        }

        System.out.println(" ");

        for (int i=0;i< Mas.length;i++){
            System.out.println(Mas[i]);
        }

    }

}
