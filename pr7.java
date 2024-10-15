
import java.util.Scanner;


public class pr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int count = countNines(array);
        System.out.println("Number of times 9 appears in the array: " + count);

        sc.close();
        System.out.println("23DIT044-Heli Patel");
    }

    public static int countNines(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }
}



// import java.util.Scanner;
    // public class prseven {
    //     public static void main(String[] args) {
    //         int[] array = {1, 9, 3, 9, 5, 9, 7, 9, 9, 10}; // Example array
    //         int count = countNines(array);
    //         System.out.println("Number of times 9 appears in the array: " + count);
    //     }
    
    //     public static int countNines(int[] array) {
    //         int count = 0;
    //         for (int num : array) {
    //             if (num == 9) {
    //                 count++;
    //             }
    //         }
           
    //         return count;
            
    //     }
       
    // }