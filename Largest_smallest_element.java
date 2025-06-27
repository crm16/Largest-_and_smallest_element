import java.util.*;
public class Largest_smallest_element {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements: ");

        int numbers[] = new int[size];
        for(int i =0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<size; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.print("\n");
        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " +min);
    }
}
