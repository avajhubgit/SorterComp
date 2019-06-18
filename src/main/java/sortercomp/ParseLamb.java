package main.java.sortercomp;

public class ParseLamb {

    public String extractNumberFromString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        string.chars().mapToObj(i -> (char) i).filter(ch -> Character.isDigit(ch) || ch == '.').forEach(ch -> stringBuilder.append(ch));
        return stringBuilder.toString();
    }



}

