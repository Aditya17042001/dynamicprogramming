class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> res=new ArrayList<List<Integer>>();
      List<Integer> row,pre=null;
      for(int i=0;i<numRows;++i){ //to construct each row
          row=new ArrayList<Integer>();
          for(int j=0;j<=i;++j){ // to fill each row
              if(j==0||j==i)
              row.add(1);
              else
              row.add(pre.get(j-1)+pre.get(j));
             
          }
           pre=row;
        res.add(row);
      }
      return res;
    }
}
