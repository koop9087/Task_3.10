import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String letter = scanner.nextLine();
        char[] chr = line.toCharArray();
        for(int i = 0; i < chr.length; i++) {
            if(line.charAt(line.indexOf(letter)) == chr[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}

