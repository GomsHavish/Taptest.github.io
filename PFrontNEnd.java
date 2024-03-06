package com.tap;
import java.util.Scanner;

public class PFrontNEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		rearrange(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		}
		static void rearrange(int[] ar) {
			int j=0;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]>=0) {
					//swap elements at indices i & j
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					j++;
			}
			
				}
			}}
		
		

/*public class PFrontNEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        rearrangeArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void rearrangeArray(int[] arr) {
        int positiveIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                int temp = arr[i];
                for (int j = i; j > positiveIndex; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[positiveIndex++] = temp;
            }
        }
    }
}
public class PFrontNEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		
	}

}*/


/*ip
 6
-3 5 -1 2 -8 -7

op
5 2 -1 -3 -7 -8 */
