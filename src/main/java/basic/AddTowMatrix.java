package basic;

public class AddTowMatrix {
    public static void main(String[] args) {
        int a[][]={{1,3,4},
                   {2,4,3},
                   {3,4,5}};
        int b[][]={{1,3,4},
                   {2,4,3},
                   {1,2,4}};

        int result[][] =new int[3][3];

        for(int i=0;i<a[0].length;i++){
         for(int j=0;j<b[0].length;j++){
             result[i][j] = a[i][j] + b[i][j];

         }
        }
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.print(result[i][j] + "  ");

            }
            System.out.println();
        }

    }
}
