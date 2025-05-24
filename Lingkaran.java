public class Lingkaran {
  int jari;

  public Lingkaran(int jariA) {
    jari = jariA;
  }

  public int getJari2() {
    return jari;
  }

  public void setJari2(int jariB) {
    jari = jariB;
  }

  public static void main(String[] args)
  {
    System.out.println("Referensi Objek");
    Lingkaran L11 = new Lingkaran(3);
    System.out.println("L11 jari-jari = " + L11.getJari2());

    System.out.println("");
    System.out.println("Referensi Objek 2 Variabel");
    Lingkaran L21 = new Lingkaran(5);
    Lingkaran L22 = L21;
    System.out.println("L21 jari-jari = " + L21.getJari2());
    System.out.println("L22 jari-jari = " + L22.getJari2());
    L22.setJari2(10);
    System.out.println("L21 jari-jari = " + L21.getJari2());
    System.out.println("L22 jari-jari = " + L22.getJari2());

    System.out.println("");
    System.out.println("Referensi Objek 3 Variabel dan Referensi Objek = NULL");
    Lingkaran L31 = new Lingkaran(5);
    Lingkaran L32 = L31;
    Lingkaran L33 = new Lingkaran(7);
    System.out.println("L31 jari-jari = " + L31.getJari2());
    System.out.println("L32 jari-jari = " + L32.getJari2());
    System.out.println("L33 jari-jari = " + L33.getJari2());
    L32 = null;
    System.out.println("L31 jari-jari = " + L31.getJari2());
    if (L32 != null) System.out.println("L32 jari-jari = " + L32.getJari2());
    System.out.println("L33 jari-jari = " + L33.getJari2());
  }
}
