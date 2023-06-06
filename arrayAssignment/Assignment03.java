package arrayAssignment;

// remove 0 from original Array to the end of an array.
public class Assignment03 {

    static void pushZeros(int arr[],int n){
        int count=0;
        //Transverse the array .If element encountered  is non-zero,
        // then replace the element at index'count' with this element

        for(int i=0;i<n;i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
                //Here the count is incremented
                //Now all non-zero element shifted to front and
                //'count' is set as index of first 0.
                //make all element 0 from count to end

            }
        }
            while (count < n) {
                    arr[count++] = 0;
                }

    }
    public static void main(String[] args) {
        int array_Nos[]={0,0,1,0,3,0,5,0,6};
    int n= array_Nos.length;
    pushZeros(array_Nos,n);
        System.out.println("After pushing zeros");
        for (int i = 0; i < n; i++) {
            System.out.print(array_Nos[i]+" ");
        }
    }
}
