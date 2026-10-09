/**
 * Java Proqramlaşdırma — Dərs 05
 * Tapşırıq Vərəqi — Bölmə F: Praktik Tapşırıq
 * Müəllim: Samir Abbasov
 * Xal: 10 / 10
 *
 * TAPŞIRIQ: Massiv Analizi
 *
 * Şərt:
 *   Verilən massiv üçün:
 *   int[] ededler = {34, 7, 91, 15, 52, 3, 78, 44, 61, 28}
 *
 *   1. Minimum, maksimum və cəmi hesablayın
 *   2. Massivi sıralayın, Arrays.toString() ilə çap edin
 *   3. Sıralanmış massivdə ikili axtarış ilə 52-nin indeksini tapın
 *   4. Massivin cüt elementlərini ayrı ArrayList-ə toplayın, çap edin
 *
 * Gözlənilən çıxış:
 *   Minimum: 3
 *   Maksimum: 91
 *   Cəm: 413
 *   Sıralanmış: [3, 7, 15, 28, 34, 44, 52, 61, 78, 91]
 *   52-nin indeksi (sıralanmış massivdə): 6
 *   Cüt elementlər: [34, 52, 78, 44, 28]
 */
import java.util.Arrays;
import java.util.ArrayList;

public class MassivAnalizi {

    public static void main(String[] args) {

        int[] ededler = {34, 7, 91, 15, 52, 3, 78, 44, 61, 28};

        // TODO 1: Minimum, maksimum və cəmi hesabla
        // İpucu: ilk elementi min/maks-a mənimsəd, sonra for-each ilə müqayisə et
        int min = ededler[0];
        int maks = ededler[0];
        int cem = 0;
        // ... buraya yaz ...


        System.out.println("Minimum: " + min);
        System.out.println("Maksimum: " + maks);
        System.out.println("Cəm: " + cem);

        // TODO 2: Massivi sırala və Arrays.toString() ilə çap et
        // ...


        // TODO 3: Sıralanmış massivdə ikili axtarış ilə 52-nin indeksini tap
        // int indeks = Arrays.binarySearch(...)
        // ...


        // TODO 4: Cüt elementləri ArrayList-ə topla
        // ArrayList<Integer> cutler = new ArrayList<>();
        // for (int e : ededler) { if (...) cutler.add(e); }
        // ...

    }

}
