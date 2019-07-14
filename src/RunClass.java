import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class RunClass {
    ArrayList<Integer> list;
    public RunClass(){
        start();
    }

    private void start() {
        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                if(i1%2==0 && i2%2==1){
                    return -1;
                }else if(i1%2==0 && i2%2==0){
                    return i1-i2;
                }else if (i1%2==1 && i2%2==0){
                    return 1;
                }else if(i1%2==1 && i2%2==1){
                    return i1-i2;
                }
                return 0;
            }
        });
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(11);
        set.add(70);
        set.add(67);
        System.out.println(set);
    }
}
