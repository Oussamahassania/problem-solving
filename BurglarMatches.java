import java.util.*;

public class BurglarMatches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbBags=sc.nextInt();
        int numBox=sc.nextInt();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i=0;i<numBox;i++) {
            int num=sc.nextInt();
            int total=sc.nextInt();
            if(map.containsKey(total)){
                map.put(total,map.get(total)+num);
            }else{
                map.put(total,num);
            }
        }
        List<Integer>keys=new ArrayList<Integer>(map.keySet());
        int result=0;
        for(int i=keys.size()-1;i>=0;i--){
            if(map.get(keys.get(i))<numbBags){
                result+=(keys.get(i)*map.get(keys.get(i)));
            }else{
                result+=(numbBags*keys.get(i));
                break;
            }
            numbBags=numbBags-map.get(keys.get(i));
        }
        System.out.println(result);
    }
}

