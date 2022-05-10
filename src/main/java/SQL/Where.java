package SQL;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Where {
    public String setWhereOR(String[] columns, String[] conditions, String[] values) {
        List<String> list = setWhere(columns, conditions, values);
        StringBuilder column = new StringBuilder("(");
        for (String s : list) column.append(" OR ").append(s);
        column.append(")");
        return column.toString();
    }

    public String setWhereAND(String[] columns, String[] conditions, String[] values) {
        List<String> list = setWhere(columns, conditions, values);
        StringBuilder column = new StringBuilder("(");
        for (String s : list) column.append(" AND ").append(s);
        column.append(")");
        return column.toString();
    }

    private List<String> setWhere(String[] columns, String[] conditions, String[] values) {
        if ((columns.length == conditions.length) && (columns.length == values.length)) System.err.println("길이 불일치");
        List<String> list = new ArrayList<>();
        for (int i = 0; i<columns.length; i++) list.add(columns[i] + conditions[i] + "'" + values[i] + "'");
        assert list.size() == conditions.length;
        return  list;
    }
}
