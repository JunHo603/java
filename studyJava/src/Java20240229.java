public class Java20240229 {
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            if(i < 5){
                System.out.print(i);
            } else{
                System.out.println("  숫자 5 미만으로만 출력");
                break;
            }
        }

        boolean x = true;
        if(x){
            System.out.println("테스트중");
        }else {
            System.out.println("테스트실패");
        }

        if(!x){
            System.out.println("이건 안 보일걸");
        }

        if(x){
            System.out.println("x는 true");
        }else{
            System.out.println("x는 false");
        }

        boolean a = true;
        boolean b = true;
        boolean c = true;
        if(a){
            System.out.println("a");
        }else if (b){
            System.out.println("a는 false, b가 true");
        }else if (c){
            System.out.println("a,b는 false, c가 true");
        }else {
            System.out.println("a,b,c는 false");
        }

        int score = 91;
        if(score >= 90){
            System.out.println("A학점");
        }else if(score >= 80 && score < 90){
            System.out.println("B학점");
        } else if (score >= 70 && score < 80) {
            System.out.println("C학점");
        } else if (score >= 60 && score < 70) {
            System.out.println("D학점");
        }else{
            System.out.println("F학점");
        }

        if(true){
            if(true){
                if(true){
                    System.out.println("if문 속에 if문");
                }
            }
        }
    //switch, case---------------------------------------------------------
    int number = 2;
    switch (number){
        case 1 :
            System.out.println("A");
            break;
        case 2 :
            System.out.println("B");
            break;
        case 3 :
            System.out.println("C");
            break;
        default:
            System.out.println("D");
    }
    }
}
