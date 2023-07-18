import java.util.Scanner;

class Solution {
    public int minordiagonalcount(int[][] arr) {
        int ro = arr.length;
        int sum = 0;
        for (int i = 0; i < ro; i++) {
            int j = ro-i-1;
            sum = sum + arr[i][j];
        }
        return sum;
    }
}

public class MinorDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows size: ");
        int rows = sc.nextInt();
        System.out.print("enter the column size: ");
        int column = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[][] arr = new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Solution answer = new Solution();
        if(rows == column) {
            System.out.println(answer.minordiagonalcount(arr));
        }
        else{
            System.out.println("invalid matrix");
        }


    }
}
