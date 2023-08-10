class Solution {
    // without recursion
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
// with recursion
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        ans.add(row);
        generateRows(--numRows, ans);
        return ans;
    }
    void generateRows(int numRows, List<List<Integer>> ans){
        if(numRows==0){
            return;
        }
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i=1; i<ans.get(ans.size()-1).size(); i++){
            row.add(ans.get(ans.size()-1).get(i) + ans.get(ans.size()-1).get(i-1));            
        }
        row.add(1);
        
        ans.add(row);
        generateRows(--numRows, ans);
    }
}
