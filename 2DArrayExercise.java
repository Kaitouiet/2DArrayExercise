public class ExerciseNewArray {
    public static void main (String[] args) {
        int[][] multTable = new int[12][12];
        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++) {
                multTable[i][j] = (i+1) * (j+1);
                System.out.print(multTable[i][j]+" ");
            }
         System.out.println();
        }
    }
}
