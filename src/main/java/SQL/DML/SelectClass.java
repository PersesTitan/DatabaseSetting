package SQL.DML;

import SQL.Setting;
import lombok.NonNull;

public class SelectClass extends Setting {

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
