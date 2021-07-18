package net.dmly.refference.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelApplication1 {

    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();

        System.out.println(parser.parseExpression("'Hello World'.concat('!')").getValue());
        System.out.println(parser.parseExpression("'Hello World'.bytes").getValue());

    }

}
