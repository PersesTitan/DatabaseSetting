package SQL;

public class Setting {
    public String TableName = "";

    public String comma(String[] texts) {
        StringBuilder totalText = new StringBuilder(texts[0]);
        if (texts.length > 1) {
            for (int i = 1; i<texts.length; i++) totalText.append(", ").append(texts[i]);
        } return totalText.toString();
    }

    public void setTableName(String TableName) {
        this.TableName = TableName;
    }
}
