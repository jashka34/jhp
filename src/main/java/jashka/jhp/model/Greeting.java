package jashka.jhp.model;

public class Greeting {

    private String name;

    public final void setName(final String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public Greeting(final String parName) {
        this.name = parName;
    }
}
