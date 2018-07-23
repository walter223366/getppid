/**
 * Created by walte on 2018/7/19.
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println(1000+"以内的完数：");
        for(int i=1;i<1000+1;i++){
            int sum = 0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(i==sum){
                System.out.println(i);
            }
        }
    }
}
