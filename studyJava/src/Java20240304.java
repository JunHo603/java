public class Java20240304 {
    public static void main(String[] args) {

        /*int a;
        for(a = 0; a < 3; a++){
            System.out.print(a + " ");
        }
        System.out.println();*/

        for(int i = 0; i < 3; i++){
            System.out.print(i + " ");
        }

        for(int i = 0; i < 100; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 0; i < 10; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 0, j = 0; i < 10; i++, j++){
            System.out.print(i + j + " ");
        }
        System.out.println();

        for(int i = 0; ; i++){
            if(i > 10){
                break;
            }
            System.out.print(i + " ");
        }
        System.out.print("무한 루프 탈출");

        for(int a = 0, b = 0; a<5 || b<5; a++, b++){
            System.out.print(a + "_" + b + " ");
        }
        System.out.println();
        //while

        int cnt=0;
        do {
            System.out.print(cnt + " ");
            cnt++;
        }while (cnt<5);

        for(int k=0;k<3;k++){
            for (int j=0; j<5; j++){
                System.out.println("[k="+k+", j="+j+"]");
            }
        }


        //end
    }
}
