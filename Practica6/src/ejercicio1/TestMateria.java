package ejercicio1;

import java.util.SortedSet;

public class TestMateria {

	public static void main(String[] args) {
		Alumno a1 = new Alumno(98,"qwe","qwe","qwe");
		Alumno a2 = new Alumno(23,"asd","asd","asd");
		Alumno a3 = new Alumno(5,"zxc","zxc","zxc");
		Alumno a4 = new Alumno(67,"rty","rty","rty");
		Alumno a5 = new Alumno(983,"wer","wer","wer");
		Alumno a6 = new Alumno(9822,"sdf","sdf","sdf");
		Alumno a7 = new Alumno(432,"xcv","xcv","xcv");
		Alumno a8 = new Alumno(1234,"cvb","cvb","cvb");
		Alumno a9 = new Alumno(66788,"fgh","fgh","fgh");
		Alumno a10 = new Alumno(3,"ddd","ddd","ddd");
		Materia<Alumno> m = new Materia<Alumno>();
		m.agregaAlumno(a1);
		m.agregaAlumno(a2);
		m.agregaAlumno(a3);
		m.agregaAlumno(a4);
		m.agregaAlumno(a5);
		m.agregaAlumno(a6);
		m.agregaAlumno(a7);
		m.agregaAlumno(a8);
		m.agregaAlumno(a9);
		m.agregaAlumno(a10);
		SortedSet<Alumno> mtest = m.getAlumnos();
		for(Alumno alu: mtest){
			System.out.print(alu.getLegajo());
			System.out.println("|" + alu.getNombre());
		}
	}

}
