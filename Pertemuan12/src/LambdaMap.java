import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        mahasiswaMap.put("101", "Adi");
        mahasiswaMap.put("102", "Bambang");
        mahasiswaMap.put("103", "Cici");
        mahasiswaMap.put("104", "Didi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}