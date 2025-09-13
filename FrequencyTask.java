package task.index;

public class FrequencyTask {

    public static void main(String[] args) {
        String str = "Apple";
        str = str.toLowerCase();  // convert to lowercase

        int countA = 0, countP = 0, countL = 0, countE = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a') {
                countA++;
            } else if (ch == 'p') {
                countP++;
            } else if (ch == 'l') {
                countL++;
            } else if (ch == 'e') {
                countE++;
            }
        }

        System.out.println("a = " + countA);
        System.out.println("p = " + countP);
        System.out.println("l = " + countL);
        System.out.println("e = " + countE);
    }
}
