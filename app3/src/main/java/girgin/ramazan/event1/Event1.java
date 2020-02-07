package girgin.ramazan.event1;

import org.apache.commons.lang3.RandomUtils;

import java.util.UUID;
public class Event1 {
    private final String field1 = UUID.randomUUID().toString();
    private final int field2 = RandomUtils.nextInt();
    private String filter;

    public String getField1() {
        return field1;
    }

    public int getField2() {
        return field2;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String route) {
        this.filter = route;
    }

    @Override
    public String toString() {
        return "Event1{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                ", filter='" + filter + '\'' +
                '}';
    }
}

