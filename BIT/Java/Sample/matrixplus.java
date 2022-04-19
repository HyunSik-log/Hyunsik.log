
public class matrixplus {
        
    public static void addmatrix() {
        int a_col = 2;
        int a_row = 3;
        int b_col = 2;
        int b_row = 3;
        
         int [][] a = { { 2 , 3 , 4} , {4,5,6} };
        int[][] b = { { 4, 5 ,6}, { 6, 7, 8 } };
        int [][] c = { { 0, 0 ,0}, { 0, 0, 0 } };
        
        
        for (int i=0; i <a_col; i++){
            for (int j=0; j <a_row; j++){
                System.out.println(c[i][j] = a[i][j] + b[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
        addmatrix();
 } 
}