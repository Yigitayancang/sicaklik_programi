// Kullanıcıdan veri almak için kullanılan kütüphane
import java.util.Scanner;
public class sicaklik_programi {

    public static void main(String[] args) {
        // kullanıcı verisini tutmak için int türündeki veri tipi 
        int heat;
        Scanner deger = new Scanner(System.in);
        // kullanıcıdan veri almak 
        System.out.println("SICAKLIK DEĞERİNİZİ GİRİNİZ : ");
        heat = deger.nextInt();

        // if else ile kontrol etme 
        if(heat < 5 ){
            System.out.println("HAVA TAM KAYAK YAPMALIK.. ");
        }
        else if(heat <= 25){

            if ( heat <= 15){
                System.out.println("SİNEMAYA GİDEBİLİRSİNİZ");
            }
            if(heat >= 10 ){
                System.out.println("PİKNİĞE GİDEBİLİRSİNİZ..");
            }

            else{
                System.out.println("YÜZMEYE GİDEBİLİRİNİZ ");
            }
        }



    }
    
}