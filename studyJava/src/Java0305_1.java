public class Java0305_1 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println(i);
            if(i>5){
                break;
            }
        }

        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(j==3){
                    break;
                }
                System.out.println(i+","+j);
            }
        }
        System.out.println();

/*        for (int i=0;i<10;i++){
            if(i % 2 == 1){
                // break;
                 continue;
            }
            System.out.println(i);
        }
        System.out.println();*/

        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if (j==3){
                    continue;
                }
                System.out.println(i+","+j);
            }
        }

    }
}
