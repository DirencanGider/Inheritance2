public class Kopek extends Hayvan {

    private int dis_sayisi;

    public Kopek(String isim, int kilo, int boy, int bacak_sayisi, int dis_sayisi) {

        super(isim, kilo, boy, bacak_sayisi);

        this.dis_sayisi = dis_sayisi;
    }
    public void harekete_gec(int hiz) { //Superclass olan Hayvan classından direkt kopyalayıp buraya yapıştırdık. Override etmiş olduk. Artık buradaki metod geçerli.
        System.out.println("Hayvan " + hiz + " kms hız ile hareket ediyor...");
    }
    public void kos(int hiz) {

        System.out.println("Köpek koşuyor...");

        //super.harekete_gec(hiz);

        /*
        super'i kaldırıp Hayvan superclassının içerisindeki metodu kopyalayıp yukarıya olduğu gibi yapıştırdık. Aşağıya direkt metodu
        yazıyoruz ve override etmiş oluyoruz.
        */

        harekete_gec(hiz); //Override edip bu şekilde kullanmamız daha güvenli. Daha sonra kodumuzu değiştirmek zorunda kalmıyoruz. Override metodlar öncellikli kullanılır.

        //Override etmezsek ve bir üst classtan kullanırsak burada "super." keywordünü yazmayı unutabiliriz ve bunu bulmak da bir hayli zor olabilir.
        //Bu yüzden bir üst sınıftan herzaman override ederek bu şekilde kullanım yapmak ve metodları böyle kullanmak daha önemli.

    }

    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
}
