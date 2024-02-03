
public class Lab03{
    public static int cycleCount(int n){
        int count=0;
        while (n!=1){
            if (n%2==0){
                n=n/2;
                count +=1;
            }
            else {
                n=(n*3)+1;
                count +=1;
            }
        }
        return count;
    }
    public static int algorithm(int i, int j){
        int x = 0;
        int y = 0;
        if(i<0||j<0){
            System.out.println("Error, negative inputs are not allowed");
            return 0;
        }
        System.out.print(i + " ");
        System.out.print(j + " ");
        y= cycleCount(i);
        while (i!=j){
       
            x = cycleCount(i);
        if (x>y){
            y=x;
        }
        i+=1;
        }

        System.out.println(y+1);
        return y+1;
    }
    public static void main(String[] args) {
        algorithm(1, 10);

    }
}
