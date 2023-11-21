public class Main {
    public static void main(String[] args) {
        List<String> list = new List<>();
        list.add("ollaaaaaa0");
        list.add("adeeeuuuuus1");
        list.add("hmmmmmm2");
        list.add("hmmmmmm3");
        list.add("hmmmmmm4");

        list.seeNodes();
        list.delete(4);
        list.seeNodes();

    }
}