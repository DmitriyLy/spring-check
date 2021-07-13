package net.dmly.refference.di;

import java.beans.ConstructorProperties;

public class ConstructorInjectionExampleBean {

    private final int _years;
    private final String _ultimateAnswer;

    @ConstructorProperties({"years", "ultimateAnswer"})
    public ConstructorInjectionExampleBean(int years, String ultimateAnswer) {
        _years = years;
        _ultimateAnswer = ultimateAnswer;

        System.out.println("years: " + _years + "; ultimateAnswer: " + _ultimateAnswer);
    }
}
