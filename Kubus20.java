import java.util.Scanner;
    public class Kubus20 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int s,vol,lp;

            System.out.print("Masukan sisi kubus: ");
            s = sc.nextInt();
            
            vol = hitungVolume (s);
            System.out.println("Volume kubus adalah: " + vol);

            lp = hitungLuasPermukaan (s);
            System.out.println("Luas permukaan kubus adalah: " + lp);

        }
        static int hitungVolume(int sisi){
            int vol = sisi*sisi*sisi;
            return vol;
        }
        static int hitungLuasPermukaan(int sisi){
            int lp = 6*sisi*sisi;
            return lp;
        }
    
}