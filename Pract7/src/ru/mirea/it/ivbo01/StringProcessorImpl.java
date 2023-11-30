package ru.mirea.it.ivbo01;

public class StringProcessorImpl implements StringProcessor {
    @Override
    public int len(String s) {
        return s.length();
    }

    @Override
    public String oddIndex(String s) {
        String result = "";
        for (int i = 1; i < s.length(); i += 2) {
            result += s.charAt(i);
        }
        return result;
    }

    @Override
    public String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
