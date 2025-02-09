public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());
        for (char ch = 'А'; ch <= 'ё'; ch++) {
            container.abc.add(ch);
        }
         for(int i = 1039; i<1110; i++){
            char ch = (char) i;
            if(container.abc.contains(ch)){
               container.searchAbc.add(i);
            }
        }
        for (char code : container.abc) {
            System.out.print(code + " ");
    }
        System.out.println(" ");
        for (int code : container.searchAbc) {
            System.out.print(code + " ");
        }
}
}