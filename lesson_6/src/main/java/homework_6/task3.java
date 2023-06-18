package homework_6;

public class task3 {

    public static void main(String[] args){

        double sumMas1=0, sumMas2=0;

        int[] Mas1 = new int[5];
        for(int i=0; i<Mas1.length;i++){
            Mas1[i]=(int)(Math.random()*6);
            System.out.print(Mas1[i]+ " ");

            sumMas1+=(double)Mas1[i]/Mas1.length;
        }
        System.out.println(" ");


        int[] Mas2=new int [5];
        for(int i=0;i< Mas2.length;i++){
            Mas2[i]=(int)(Math.random()*6);
            System.out.print(Mas2[i]+" ");
            sumMas2+=(double)Mas2[i]/Mas2.length;
        }
        System.out.println(" ");

        if(sumMas1==sumMas2)
            System.out.println("Средние арифметические равны");

        else{if(sumMas1>sumMas2)
            System.out.println("Средние арифметическое значение массива1 больше и равно ");

            else
                System.out.println("Средние арифметическое значение массива2 больше и равно ");
        }
    }
}
