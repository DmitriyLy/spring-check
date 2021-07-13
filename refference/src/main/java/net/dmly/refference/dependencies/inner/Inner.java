package net.dmly.refference.dependencies.inner;

public class Inner {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private void destroy() {
        System.out.println("Inner bean destroy.");
    }
}
