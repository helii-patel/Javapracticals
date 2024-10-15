import java.util.Scanner;
public class pr6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.println("Enter the first string:");
        String str1 = s.nextLine();
        System.out.println("How many times do you want to repeat the first string?");
        int n1 = s.nextInt();
        s.nextLine();
        System.out.println("Enter the second string:");
        String str2 = s.nextLine();
        System.out.println("How many times do you want to repeat the second string?");
        int n2 = s.nextInt();
        s.nextLine(); 

        System.out.println("Enter the third string:");
        String str3 = s.nextLine();
        System.out.println("How many times do you want to repeat the third string?");
        int n3 = s.nextInt();
        s.nextLine(); 

        String res1 = wanttorepeat(str1, n1);
        System.out.println("Result for the first string: " + res1);

        String res2 = wanttorepeat(str2, n2);
        System.out.println("Result for the second string: " + res2);

        String res3 = wanttorepeat(str3, n3);
        System.out.println("Result for the third string: " + res3);

        System.out.println("23DIT044-Heli Patel");
    }

    public static String wanttorepeat(String str, int n) {
        int r = 3;

        if (r > str.length()) {
            r = str.length();
        }

        String sc = str.substring(0, r);
        String res = "";

        for (int i = 0; i < n; i++) {
            res += sc;
        }

        return res;
    }
}











