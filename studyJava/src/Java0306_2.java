import java.util.Arrays;
import java.util.Scanner;

public class Java0306_2 {
    public static void main(String[] args) {
        /*int[] cnt1 = new int[3];
        int[] cnt2 = {100,200,300};
        System.out.println(Arrays.toString(cnt1));
        for(int i=0;i<3;i++){
            cnt1=cnt2;
        }
        System.out.println(Arrays.toString(cnt1));*/

    /*    String[] fruitList ={"배","사과","바나나","딸기","사과","수박"};
        System.out.println(Arrays.toString(fruitList));
        int count=0;
        for(int i=0;i<fruitList.length;i++){
            //System.out.println(fruitList[i]);
            if(fruitList[i]== "사과"){
                count=count+1;
            }
        }
        System.out.println(count);*/
/*
        Scanner sc=new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해주세요 : ");
        int inputNumber = sc.nextInt();
        if(inputNumber >= 0 && inputNumber <=6){
            System.out.println(inputNumber);
        }else{
            System.out.println("잘못 입력하셨습니다");
        }*/

    /*    Scanner sc1=new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String inputString = sc1.nextLine();
        System.out.println(inputString);*/

        /*char[] week = {'월','화','수','목','금','토','일'};
        Scanner scan =new Scanner(System.in);
        System.out.println("0~6까지 숫자를 입력해주세요 : ");
        System.out.println(Arrays.toString(week));
        int num=scan.nextInt();
        System.out.println(week[num]);*/

        String[] members={"Steve","Tom","Michael","Laura","Jessica","Annie"};
        Scanner scan = new Scanner(System.in);
        System.out.println("이름을 입력해주세요 : ");
        System.out.println(Arrays.toString(members));
        String name = scan.nextLine();
        boolean found = false;
        for (int i=0;i<members.length;i++){
            if(name.equalsIgnoreCase(members[i])){
                System.out.println(members[i]+" welcome");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("회원가입필요");
        }

    }
}
