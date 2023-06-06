package arrayAssignment;

public class Assignment04 {
    public static void main(String[] args) {

        int arr[] = {2, 0, 4, 0, 1, 6, 3, 4, 0, 0, 5};
        int count=0;
        for (int i = 0; i < arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while (count< arr.length){
            arr[count++]=0;
        }

        System.out.println("For removing element to the end");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}