import java.util.*;
public class Largest_smallest_element {
    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number of elements to be compared: ");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements: ");

        int elements [] = new int[size];
        for(int i = 0; i < size ; i++){
            elements[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < elements.length; i++){
            if(elements[i] > max){
                max = elements[i];
            }
            if(elements[i] < min){
                min = elements[i];
            }
        }
        
        System.out.print("\n");
        System.out.println("Largest element is: " + max);
        System.out.println("Smallest element is: " + min);
    }
}
