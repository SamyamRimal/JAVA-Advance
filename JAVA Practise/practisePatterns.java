public class practisePatterns {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // int n=5;
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println("");
        // }

        // 0-1 Triangle
        int a=1;

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
              int sum = i+j;
              if(sum % 2==0){
                System.out.print("1 ");
              }
              else{
                System.out.print("0 ");
              }
            }
            System.out.println("");
        }
    }
}
