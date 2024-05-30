package struktural.sekprodi;

import struktural.kaprodi.kaprodi;
public class sekprodi {
    public void kerja() {
        System.out.println("1. Membantu melaksanakan kebijakan prodi");
    }
    
    public static void main(String[] args) {
        kaprodi TI;
        TI = new kaprodi();
        sekprodi ti= new sekprodi();
        System.out.println("Tugas Sekertaris prodi : ");
        ti.kerja();
        TI.santai();

    }
}
