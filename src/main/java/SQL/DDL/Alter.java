package SQL.DDL;

import jakarta.validation.constraints.NotBlank;

public class Alter {
    public StringBuilder start(@NotBlank String kind, @NotBlank String name) {
        StringBuilder value = new StringBuilder("ALTER ");
        value.append(kind).append(" ").append(name).append(" ");
        return value;
    }

//    public StringBuilder add(StringBuilder value) {
//        value.append("ADD COLUMN ");
//    }
}