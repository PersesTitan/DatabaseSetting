package SQL.DML;

import SQL.Setting;
import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;

public class Select extends Setting {

    /**
     * @param table 테이블 이름
     * @param name 1번째 컬럼명
     * @param values 나머지 컬럼명
     * @return 처음 시작한 텍스트
     */
    public StringBuilder start(@NotBlank String table, @NotBlank String name, String... values) {
        StringBuilder startText = new StringBuilder("SELECT ");
        startText.append(name);
        for (String value : values) startText.append(" ,").append(value);
        startText.append(" FROM ").append(table);
        return startText;
    }

    //테이블이름 생략 버전
    public String SELECT_Table() {
        return String.format("SELECT * FROM %s;", TableName);
    }

    /**
     * @param tableName 테이블 이름
     * @return 테이블 이름만 입력시 전부 출력
     */
    public String SELECT(@NonNull String tableName) {
        return String.format("SELECT * FROM %s;", tableName);
    }

    public String SELECT(String Column, @NonNull String tableName) {
        return String.format("SELECT %s FROM %s", Column, tableName);
    }

    public String SELECT(String[] Columns, @NonNull String tableName) {
        String Column = comma(Columns);
        return String.format("SELECT %s FROM %s", Column, tableName);
    }
}
