class A2_primitives{
    public static void main(String[] args) {
        int age= 20;
        long population = 348978324452452L;
        char grade = 'a';
        float percentage = 98.343f;
        double temperature = 73.234325;
        boolean check = true;

        String name = "Manasi";
        System.out.println(name.charAt(2));

        Integer marks = 89;
        System.out.println(marks.compareTo(age));

        int millions = 230_000_000;
        System.out.println(millions);

        String sh = " hi, I am Manasi! ";
        System.out.println(sh.trim());
        System.out.println(sh.charAt(3));

    }
}