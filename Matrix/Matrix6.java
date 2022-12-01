class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        int rowCount=matrix.length;
        int columnCount=matrix[0].length;
        for(int i=0;i<rowCount;i++){
            for(int j=0;j<columnCount;j++){
                if(matrix[i][j]==0){
                    list1.add(i);
                    list2.add(j);
                }
            }
        }

        for(int i=0;i<list1.size();i++){
        	for(int j=0;j<columnCount;j++) {
        		matrix[list1.get(i)][j]=0;
        	}
        }
        for(int i=0;i<list2.size();i++){
        	for(int j=0;j<rowCount;j++) {
        		matrix[j][list2.get(i)]=0;
        	}
        }
    }
}
