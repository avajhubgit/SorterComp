package main.java.sortercomp;

public class ParseWithOutLamb {

    public String extractNumberFromString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < stringBuilder.length(); i++) {
            Character ch = stringBuilder.charAt(i);
            if (!Character.isDigit(ch) && (ch != '.')) {
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }
        return stringBuilder.toString();
    }

}
