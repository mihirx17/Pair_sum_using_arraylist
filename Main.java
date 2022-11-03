import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static Boolean PAIR_SUM(ArrayList <Integer> number,int Target)
    {
        for(int i=0;i<number.size();i++)
        {
            for(int j=i+1;j<number.size();j++)
            {
                if(number.get(i)+number.get(j)==Target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(5);
        number.add(9);
        number.add(10);
        Collections.sort(number);
        int Target=3;
        System.out.println(PAIR_SUM(number,Target));

    }
}