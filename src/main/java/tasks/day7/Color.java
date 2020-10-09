package main.java.tasks.day7;

import java.util.Objects;

public class Color {
    private String colorString;
    private int colorInt;

    public String getColorString() {
        return colorString;
    }

    public void setColorString(String colorString) {
        this.colorString = colorString;
    }

    public int getColorInt() {
        return colorInt;
    }

    public void setColorInt(int colorInt) {
        this.colorInt = colorInt;
    }

    public Color(String colorString, int colorInt) {
        this.colorString = colorString;
        this.colorInt = colorInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return colorInt == color.colorInt &&
                Objects.equals(colorString, color.colorString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorString, colorInt);
    }
}

