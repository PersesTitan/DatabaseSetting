package SQL;

public class OrderBy {
    public String orderByAsc(String item) {
        return "Order by " + item + " ASC";
    }

    public String orderByDesc(String item) {
        return "Order by" + item + " DESC";
    }
}
