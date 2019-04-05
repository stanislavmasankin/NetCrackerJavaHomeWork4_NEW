/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

import java.util.Objects;

/**
 *
 * @author Stas
 */
public class TestObject implements Comparable{
    private String name;
    private int testInt;
    private double testDouble;

    public TestObject(String name, int testInt, double testDouble) {
        this.name = name;
        this.testInt = testInt;
        this.testDouble = testDouble;
    }

    @Override
    public String toString() {
        return "TestObject{" + "name=" + name + ", testInt=" + testInt + ", testDouble=" + testDouble + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TestObject other = (TestObject) obj;
        if (this.testInt != other.testInt) {
            return false;
        }
        if (Double.doubleToLongBits(this.testDouble) != Double.doubleToLongBits(other.testDouble)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
       
}
