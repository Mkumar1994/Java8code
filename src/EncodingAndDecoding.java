import java.util.Base64;

public class EncodingAndDecoding {

    public static void main(String[] args) {
       String encode = Base64.getEncoder().encodeToString("bye".getBytes());
        System.out.println(encode);


        String encodeHiThere = "SGkgdGhlcmU";
        String decodedHiThere = new String( Base64.getDecoder().decode(encodeHiThere));
        System.out.println(decodedHiThere);

    }
}
