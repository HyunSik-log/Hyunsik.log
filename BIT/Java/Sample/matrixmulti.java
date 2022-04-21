
class matrixmulti {
        
    public static void mulmatrix() {
        int a_col = 2;
        int a_row = 3;
        int b_col = 3;
        int b_row = 2;
        
        int [][] a = { { 2 , 3 , 4} , {4,5,6} };
        int[][] b = { { 4, 5 } , { 6, 7 }, { 8,9} };
        int[][] c = { { 0 , 0 } , {0 , 0} };
        
        for (int i=0; i <a_col; i++){
            for(int j=0; j <b_row; j++){
            	for(int k=0; k <a_row; k++ ) {
                System.out.println(c[i][j] += (a[i][k] * b[k][j]));
            	}
            }
        }
    }
    
    public static void main(String[] args) {
        mulmatrix();
 } 
}