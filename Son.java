class Son extends Father {
    Son(int age) {
        super("Tom");
        System.out.println("Age of son is " + age);
    }

    public static void main(String[] args) {
        Son s = new Son(22);
    }
}