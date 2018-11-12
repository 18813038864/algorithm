package easyProblem.fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> lst = new ArrayList<>();
        for (int i = 1;i<=n;i++){
            if (i%15==0){
                lst.add("FizzBuzz");
                continue;
            }
            if (i%3==0){
                lst.add("Fizz");
                continue;
            }

            if (i%5==0){
                lst.add("Buzz");
                continue;
            }
            lst.add(String.valueOf(i));
        }
        return lst;
    }
}
