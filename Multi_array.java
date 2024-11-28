package New;

public class Multi_array {
    public static void main(String[]args){
        int [][] matrix = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

        for(int i = 0; i<matrix.length; i++){
            for (int g=0; g<matrix[i].length;g++){
                System.out.print(matrix[i][g]+ " ");
            }
            System.out.println();
        }


    }
}
