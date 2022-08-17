package String;

public class BigString {
    private int length;
    private String values;

    public BigString(int length, String values) {
        this.length = length;
        this.values = values;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }
}
