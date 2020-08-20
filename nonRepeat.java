import java.util.*;
public class nonRepeat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        int count = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        do 
        {
            array.add(temp % 10);
            temp /= 10;
        } while (temp > 0);
        for (int i = 0; i < array.size(); i++) {
            if (Collections.frequency(array, array.get(i)) == 1)
                ++count;
        }
        System.out.println(count);
    }
}
