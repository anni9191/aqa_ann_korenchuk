package homework_6;

public class task2 {
    public static void main(String[] args){

        int h = 0;
        for(int i=1; i<=99; i++){
            if(i%2!=0) h++;
        }

        int[] Mas = new int[h];
        for(int i=1,b=0; i<=99; i++){
            if(i%2!=0){
                Mas[b]=i;
                System.out.println(Mas[b]+" ");
                b++;
            }
        }

        System.out.println(" ");

        for(int i=Mas.length-1;i>=0;i--){
            System.out.println(Mas[i]);
        }
    }

}
