

public class Method {
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
        return sb.toString().trim();
    }
}