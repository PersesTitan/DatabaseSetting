package SQL;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Where {
    public String setWhereOR(String[] columns, String[] conditions, String[] values) {
        if ((columns.length == conditions.length) && (columns.length == values.length)) System.err.println("길이 불일치");
        List<String> list = new ArrayList<>();
        for (int i = 0; i<columns.length; i++) list.add(columns[i] + conditions[i] + "'" + values[i] + "'");
        assert list.size() == conditions.length;

        StringBuilder column = new StringBuilder("(");
        for (String s : list) column.append(" OR ").append(s);
        column.append(")");
        return column.toString();
    }
}
