package ru.mirea.it.ivbo01;
import java.sql.SQLOutput;
public class ProcessString {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessorImpl();

        System.out.println(
                processor.len("Hello barby girl")
        );

        System.out.println(StringInterface.len("Hello barby girl"));
        System.out.println(StringInterface.oddIndex("Hello barby girl"));
        System.out.println(StringInterface.reverse("Hello barby girl"));

    }
}
