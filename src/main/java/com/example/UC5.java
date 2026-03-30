public class UC5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder sb = new StringBuilder("Hello, ");
        int i = 0;
        for (String name : args) {
            sb.append(name);
            if (i < args.length - 1) {
                sb.append(", ");
            }
            i++;
        }
        sb.append("!");
        System.out.println(sb.toString());
    }
}