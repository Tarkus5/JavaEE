/*
Scrivere un metodo capitalizeFirstChars(String src) in grado di capitalize la prima lettera di ogni sottostring ad esempio:

eric cartman in Eric Cartman
eric 90cartman in Eric 90Cartman

sfruttando gli opportuni metodi della classe Character e della classe String.
*/

public class Main {
    public static void main(String[] args) {
        String src = "eric cartman";
        String result = capitalizeFirstChars(src);
        System.out.println(result);
    }

    public static String capitalizeFirstChars(String src) {
        if (src == null || src.isEmpty()) {
            return src;
        }
        StringBuilder sb = new StringBuilder();
        String[] words = src.split("\\s+");
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            char[] chars = word.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            sb.append(chars).append(" ");
        }
        return sb.toString();
    }
}

