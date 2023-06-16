class Solution {
    public List<List<Integer>> generate(int numRows) {
       
        //  List<List<Integer>> res = new ArrayList<List<Integer>>();
        // List<Integer> row,pre = null;
        // for(int i=0;i<numRows;i++){
        //     row = new ArrayList<Integer>();
        //     for(int j=0;j<=i;j++)
        //         if(j==0 || j==i)
        //         row.add(1);
        //         else
        //         row.add(pre.get(j-1)+pre.get(j));
        //         pre = row;
        //         res.add(row);
            
        // }
        // return res;
          List<List<Integer>> list = new ArrayList<List<Integer>>();

        List<Integer> row , prev = null;

        for(int i=1; i<=N; i++){
            row = new ArrayList<Integer>();
            for(int j=1; j<=i; j++){
                row.add(combination(i-1,j-1));
            }
            list.add(row);
        }
        return list;
    }
    public int combination(int n, int r){
        long res = 1;
        for(int i=0; i<r; i++){
             res = res*(n-i);
            res = res/(i+1);
        }
        return (int)res;

    }
}