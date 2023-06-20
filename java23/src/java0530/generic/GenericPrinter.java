package java0530.generic;

public class GenericPrinter<T extends Material> {//상속받은 클래스만 제너릭프린터를 사용하도록 허가함
    private T material;
    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }
}