package pl.sda.mapy;

public class Generyka<T> {
    private T fieldl;

    public T getFieldl() {
        return fieldl;
    }

    public void setFieldl(T fieldl) {
        this.fieldl = fieldl;
    }

    public Generyka(T fieldl) {
        this.fieldl = fieldl;
    }
}
