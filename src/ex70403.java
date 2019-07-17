import  java.util.Scanner;

public class ex70403 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        String[] list = new String[10];
        for (int i = 0; i < list.length; i++){
            list[i] = in.nextLine();
        }

        in.nextLine();

        int[] list2 = new int[10];

        for (int i = 0; i < list2.length; i++){
            list2[i] = in.nextInt();
            System.out.println(list2[i]);
        }



    }
}
