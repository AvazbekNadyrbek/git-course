import java.util.ArrayList;
import java.util.List;
public class Artifact {
    public static void main(String[] args) {
        List<String> arrayAdd = new ArrayList<String>();
        arrayAdd.add("Avazbek");
        arrayAdd.add("Avazbek2");
        arrayAdd.add("Avazbek3");
        arrayAdd.add("Avazbek3");
        String arrayGet = arrayAdd.get(1);
        System.out.println(arrayGet);
        System.out.println(arrayGet);
        Solution test = new Solution();
        System.out.println(test.x);

        Solution.InnerClass test2 = new Solution().new InnerClass();
        System.out.println(test2.x);
    }
}
