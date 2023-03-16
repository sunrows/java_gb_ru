package org.example.seminar_2.cw4.model;

public class Vector {

    private Double x;
    private Double y;
    private Double z;

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return Длину вектора
     */
    public double lengthvector() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }


    /**
     * @param vector2 Второй вектор для произведения
     * @return Скалярное произведение
     */
    public double scalarMulti(Vector vector2) {

        return this.x * vector2.x + this.y * vector2.y + this.z * vector2.z;
    }

    /**
     * @param vector2 Второй вектор
     * @return векторное произведение
     */
    public Vector vectorMulti(Vector vector2) {
        return new Vector(this.y * vector2.z - this.z * vector2.y,
                this.z * vector2.x - this.x * vector2.z,
                this.x * vector2.y - this.y * vector2.x);
    }


    /**
     * @param vector2 воторой вектор
     * @return косинус угла
     */
    public double cosVector(Vector vector2) {

        return scalarMulti(vector2) / (lengthvector() * vector2.lengthvector());

    }

    /**
     * @param vector2 Второй вектор
     * @return Сумма векторов
     */
    public Vector sumVector(Vector vector2) {
        return new Vector(this.x + vector2.x,
                this.y + vector2.y,
                this.z + vector2.z);
    }


    /**
     *
     * @param vector2 Второй вектор
     * @return Разность векторов.
     */
    public Vector difVector(Vector vector2) {
        return new Vector(this.x-vector2.x,
                this.y - vector2.y,
                this.z - vector2.z);
    }
}
