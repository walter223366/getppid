import java.util.Scanner;

/**
 * Created by walte on 2018/7/31.
 */
public class ATM {
    private Scanner scanner = new Scanner(System.in);
    private int money = 10000;

    public void saveMoney(){
        System.out.println("请输入存钱金额");
        int saveMoney = scanner.nextInt();
        money+=saveMoney;
        System.out.println("存钱成功，当前余额："+money+"元");
    }

    public void getMoney(){
        System.out.println("请输入取钱金额");
        int getMoney = scanner.nextInt();
        if(getMoney>money){
            System.out.println("余额不足，请重新输入！");
        }else{
            money-=getMoney;
            System.out.println("取钱成功，当前余额："+money+"元");
        }
    }

    public void queryMoney(){
        System.out.println("您当前帐户余额："+money+"元");
    }

    public void sendMoney(){
        System.out.println("请输入对方账户！");
        long acount = scanner.nextLong();
        System.out.println("请输入转账金额！");
        int sendMoney = scanner.nextInt();
        System.out.println("请确认对方账户是否正确：XX翼  "+acount+"; 确认转账请按 1，退出请按 2；");
        int num = scanner.nextInt();

            if(num==1&&sendMoney<=money){
                money-=sendMoney;
                System.out.println("转账成功，当前余额："+money+"元");
            }else if(num==2){

            }else{
                System.out.println("输入错误");
            }


    }

    public void quitAndExit(){
        System.exit(0);
    }
}
