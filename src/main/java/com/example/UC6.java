public class UC6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder sb = new StringBuilder("Hello, ");

        for (String name : args) {
            sb.append(name).append(", ");
        }

        String result = sb.substring(0, sb.length() - 2);

        System.out.println(result + "!");
    }
}