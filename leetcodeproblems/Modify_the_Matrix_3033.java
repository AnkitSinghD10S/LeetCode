public class Modify_the_Matrix_3033{
    public int[][] modifiedMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int answer[][]=new int [row][col];
        int max[]=new int [col];
        for(int j=0;j<col;j++){
            max[j]=matrix[0][j];
            for(int i=0;i<row;i++){
                answer[i][j]=matrix[i][j];
                max[j]=Math.max(max[j],matrix[i][j]);
            }
        }
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                if(answer[i][j]==-1){
                    answer[i][j]=max[j];
                }
            }
        }
        return answer;
    }
}