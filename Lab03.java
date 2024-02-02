
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
        System.out.print(i + " ");
        System.out.print(j + " ");
        while (i!=j){
        x = cycleCount(i);
        if (x>y){
            y=x;
        }
        i+=1;
        }


        System.out.println(y+1);
        return 0;
    }
    public static void main(String[] args) {
        algorithm(900, 1000);

    }
}
