import Text.TextHolder;
import decoder.CaesarDecoder;

public class Main {
    private static CaesarDecoder decoder = new CaesarDecoder();
    public static void main(String[] args) {
        for (int i = 1; i < 33; i++){
            System.out.println(i);
            System.out.println(decoder.decode(TextHolder.inputText, i));
        }
    }
}
