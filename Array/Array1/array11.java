class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2;
        list.add(1);
        if(rowIndex==0){
            return list;
        }
        list.add(1);
        if(rowIndex==1){
            return list;
        }
        for(int i=0;i<rowIndex-1;i++){
            int size=list.size();
            list2=new ArrayList<>();
            for(int j=0;j<size;j++){
                if(j==0){
                    list2.add(1);
                }
                else if(j==size-1){
                    list2.add(1);
                    list.clear();
                    list.addAll(list2);
                    break;
                }
                list2.add(list.get(j)+list.get(j+1));
            }
        }
        return list;
    }
}
