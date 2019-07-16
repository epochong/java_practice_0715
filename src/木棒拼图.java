import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/15 22:51
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 木棒拼图 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int n = input.nextInt();
            List<Integer> list = new ArrayList <>();
            for (int i = 0; i < n; i++) {
                int op = input.nextInt();
                int len = input.nextInt();
                if (op == 1) {
                    list.add(len);
                } else {
                    list.remove(new Integer(len));
                }
                Collections.sort(list);
                int other = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (j < list.size() - 1) {
                        other += list.get(j);
                    }
                }
                if (other <= list.get(list.size() - 1)) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        }
    }
}
