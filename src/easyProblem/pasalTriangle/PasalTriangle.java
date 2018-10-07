package easyProblem.pasalTriangle;

import java.util.*;

public class PasalTriangle {

    public static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i=1;i<=numRows;i++){
            List<Integer> ele = new ArrayList<>();
            ele.add(1);

            int tmp = 2;
            while (tmp<i){
                int val = res.get(i-2).get(tmp-2)+res.get(i-2).get(tmp-1);
                ele.add(val);
                tmp++;
            }

            if (i!=1){
                ele.add(1);
            }
            res.add(ele);
        }
        return res;
    }

    public static void main(String[] args){

        List<List<Integer>> res = generate(1);
    }
}
