import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dizinin boyutu n :");
        int num =sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Dizinin elemanlarını giriniz :");

        for (int i = 0; i<arr.length ; i++){
            System.out.print((i + 1) + ". Elemanı: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Sıralama: ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}