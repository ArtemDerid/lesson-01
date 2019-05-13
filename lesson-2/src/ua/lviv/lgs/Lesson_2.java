package ua.lviv.lgs;

public class Lesson_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = -9;
		int c = 8;
		 // позначимо корені рівняння x1 i x2
		double x1;
		double x2;
		System.out.println("Рівняння буде мати вигляд " + a + "x^2 + " + b + "x + " + c + " = 0" );
		// позначимо дискримінант літерою "d"
		int d = b*b-(4*a*c);
		System.out.println("Знаходимо дискримінант. d = " + d);
		System.out.println("Тепер знаходимо корені рівняння");
		// шукаємо корені
		if(d>0) {
			x1 = ((-b)+Math.sqrt(d))/(2*a);
			x2 = ((-b)-Math.sqrt(d))/(2*a);
			System.out.println("x1 = " + x1 + ";   x2 = " + x2);
		} else if(d==0) {
			x1=x2 = (-b)/(2*a);
			System.out.println("x1 = x2 = " + x1);
		} else {
			System.out.println("Дійсних коренів не існує");
			
		}
		

	}

}

// first commit to GitHub


