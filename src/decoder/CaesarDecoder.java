package decoder;

public class CaesarDecoder {
    public String decode (String inputString, int code) {
        StringBuilder outputString = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char symbol = inputString.charAt(i);
            if (Character.isLetter(symbol)) {
                boolean isUpperCase = Character.isUpperCase(symbol);
                if (isUpperCase) {
                    symbol = Character.toLowerCase(symbol);
                }
                symbol = codeOneSymbolRu(symbol,code);
                if (isUpperCase){
                    symbol = Character.toUpperCase(symbol);
                }
                outputString.append(symbol);
            } else {
                outputString.append(inputString.charAt(i));
            }
        }
        return outputString.toString();
    }

    private Character codeOneSymbolRu(char symbol, int code) {
        String codeString = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        for (int x=0; x < codeString.length(); x++){
            if (symbol == codeString.charAt(x)){
                return codeString.charAt((x+code) % 33);
            }
        }
        return null;
    }

}
