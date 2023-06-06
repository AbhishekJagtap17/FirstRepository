package arrayAssignment;

//sum of even index from an integer array.
public class Assignment01 {
    public static void main(String[] args) {
        int[] nos={10,15,42,63,48,75,12,96,45,20};
        int sum=0;
        for (int i = 0; i < nos.length; i++) {
            if(nos[i]%2==0){
                sum=sum+nos[i];
            }
        }
        System.out.println(sum);
    }

}
