package com.yura;

public class Main1 {

    public static void main(String[] args) {

            Group gr = new Group();
        try{
            gr.addStudent(new Student("Marta", "Che", "white", 20, 3, 312121));
            gr.addStudent(new Student("Wasley", "Krusher", "black", 22, 3, 134324));
            gr.addStudent(new Student("Brian", "Terefin", "black", 19, 3, 454242));
            gr.addStudent(new Student("Den", "Lazkov", "white", 20, 3, 345345));
            gr.addStudent(new Student("Koral", "Illinoys", "black", 17, 3, 543523));
        }catch (MyExeption e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println(gr);

        Student[] voencomArray = gr.getVoencom();
        for (Student student : voencomArray) {
            System.out.println("Wake up at 6 o'clock " + student);
        }
    }
}
