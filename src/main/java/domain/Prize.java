package domain;

import java.util.Objects;

public class Prize {
    private final Integer Id;
    private final String Name;
    private final Float value;

    public Prize(Integer id, String name, Float value) {
        this.Id = Objects.requireNonNull(id);
        this.Name = name;
        this.value = value;
    }

    public Integer Id() {
        return Id;
    }

    public String name() {
        return Name;
    }

    public Float value() {
        return value;
    }

    @Override
    public String toString() {
        return value + " pesos más.";
    }
}
