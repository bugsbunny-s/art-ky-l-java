import java.util.Scanner;
public class artıkyıl {
    public static void main(String[] args) throws Exception {
        int yıl;

        Scanner inp= new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yıl = inp.nextInt();
        
       if (yıl % 4 == 0){
        if ((yıl % 100 == 0) && !(yıl % 400 == 0)){
            System.out.println(yıl + " bir artık yıl değildir!");
        }else {
            System.out.println(yıl + " bir artık yıldır!");
        }
        }
        else {
            System.out.println(yıl + " bir artık yıl değildir!");
        }
    }
}