package SQL;

public class Comma {
    public String setComma(String[] texts) {
        StringBuilder totalText = new StringBuilder(texts[0]);
        if (texts.length > 1) {
            for (int i = 1; i<texts.length; i++) totalText.append(", ").append(texts[i]);
        } return totalText.toString();
    }
}
