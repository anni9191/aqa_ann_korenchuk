package homework9;

public class task_3 {

    public static void main(String[] args) {
        char[] array = {'o', 'f', 'g', 'f', 'j'};
        int maxcount = 0;
        for (int i = 0; i < array.length; ++i) {
            int currentLetterCount = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[i] == array[j]) {
                    currentLetterCount++;
                }
            }
            if (currentLetterCount > maxcount) {
                maxcount = currentLetterCount;
            }
        }
        System.out.println(maxcount);
    }
}