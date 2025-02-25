import java.util.Scanner;

 class Tong {
    public static int So(int x)
    {
        int Q = 0;
        for (int i = 1 ; i <= x ; i++)
         {
          String xx = ""+x+x;
            Q += xx;
        }
        return Q;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap N: ");
        int N = scanner.nextInt();
                
        System.out.println("Tong S = "+ So(N));
        
        scanner.close();
    }
}
