package IndependentWork;

public class sdss {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int[] array = new int[10];
//        for (int i = 0; i < 10; i++) {
//            array[i] = random.nextInt(25);
//            System.out.print(" " + array[i]);
//        }


//    public static void main (String args[]){
//
//        int x = sum(1, 2, 3);
//        int y = sum(1, 4, 9);
//        System.out.println(x);  // 6
//        System.out.println(y);  // 14
//    }
//    static int sum(int a, int b, int c){
//        return a + b + c;
public static void main(String[] args) {
    double[] array = new double[5];
    int b = 10;
    int i = 0;
   while ( i  < 5){
      array [i] = b;
       b=b+5;
       System.out.print("  "+ array[i]);
       if (i > 3){
           i = 0 ;
       } else {
           i++;
       }
    }
}
}