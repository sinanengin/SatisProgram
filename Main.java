import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean bitir = false;
        Scanner girdi = new Scanner(System.in);
        while(!bitir)
        {
            int secim;
            System.out.println("********** HOŞGELDİNİZ **********");
            promptEnterKey();
            System.out.println("[1] İlan oluştur");
            System.out.println("[2] İlanları görüntüle");
            System.out.println("[3] İlanları text dosyasına yazdır.");
            System.out.println("[4] Programı kapat");
            System.out.println("Seçiminizi giriniz: ");
            secim = girdi.nextInt();

            switch (secim){
                case 1:
                        IlanOlustur();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    bitir = true;
                        break;
            }

            bitir =true;
        }

    }
    public static void IlanGoruntule()
    {
        System.out.println();
    }

    public static int IlanOlustur() {
        Scanner girdi = new Scanner(System.in);
        int secim;
        System.out.println("********** İLAN OLUŞTURUCUYA HOŞGELDİNİZ **********");
        System.out.println("[1] Araç İlanı");
        System.out.println("Oluşturacağınız ilan türünü giriniz: ");
        secim = girdi.nextInt();

        switch (secim){
        case 1:
            Otomobil otomobil1 = new Otomobil();
            otomobilOlustur(otomobil1);
            break;
        }
        return 0;
    }
    static int i =0;
    public static void otomobilOlustur(Otomobil otomobil1){
        Scanner girdi = new Scanner(System.in);
        Date tarih = new Date();

        i++;
        //Otomobil otomobil1 = new Otomobil();
        otomobil1.tarih = tarih.toString();
        otomobil1.ilanNo = i;
        System.out.println("İlan başlığını giriniz: ");
        otomobil1.baslik = girdi.next();
        System.out.println("İlan açıklamasını giriniz: ");
        otomobil1.aciklama = girdi.next();
        System.out.println("Adresi giriniz(İlçe ve İl): ");
        otomobil1.konum = girdi.next();
        System.out.println("Telefon numaranızı giriniz:");
        otomobil1.telefon = girdi.next();

        System.out.println("\n****** İLAN BİLGİLERİ TAMAMLANDI... ******\n");

        System.out.println("Otomobilinizin markasını giriniz: ");
        otomobil1.marka = girdi.next();
        System.out.println("Otomobilinizin modelini giriniz: ");
        otomobil1.model = girdi.next();
        System.out.println("Otomobilinizin vites türünü giriniz: ");
        otomobil1.vites = girdi.next();
        System.out.println("Otomobilinizin kilometresini giriniz: ");
        otomobil1.km = girdi.nextInt();
        System.out.println("Otomobilinizin rengini giriniz: ");
        otomobil1.renk = girdi.next();
        System.out.println("Otomobilinizin üretim yılını giriniz: ");
        otomobil1.uretimYili = girdi.nextInt();
        System.out.println("Otomobilinizin kasa tipini giriniz: ");
        otomobil1.kasa = girdi.next();
        System.out.println("Otomobilinizin çekiş türünü giriniz: ");
        otomobil1.cekis = girdi.next();
        System.out.println("Otomobilinizin yakıt türünü giriniz: ");
        otomobil1.yakit = girdi.next();
        System.out.println("İlanınız için bir fiyat belirleyin: ");
        otomobil1.fiyat = girdi.nextInt();

        System.out.println("\n****** TEBRİKLER İLANINIZ YAYINLANDI ... ******\n");


    }
    public static void promptEnterKey() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}

