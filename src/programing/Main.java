package programing;

public class Main {
    public static void main(String[] args) {

    }
    public static void judgeNumber(){
        boolean flag =true;
        for(int i=2;i<=100;i++){
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+" ");
            }
            flag = true;
        }
    }
    public static boolean judgeZhiShu(int a){
        boolean flag = false;
        for(int j=2;j<a;j++){
            if(a%j == 0){
                break;
            }else{
                flag = true;
                break;
            }
        }
        return flag;
    }
}
