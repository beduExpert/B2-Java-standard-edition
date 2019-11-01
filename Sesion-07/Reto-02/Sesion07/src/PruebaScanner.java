import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PruebaScanner {
	public static void main(String args[]) {
		Path p = Paths.get("archivo");
		try {
			Scanner s = new Scanner( new File(p.toString()) );
			while(s.hasNext()) {
				String numSuma = s.next();
				int num1 = s.nextInt();
				int num2 = s.nextInt();
				System.out.println(numSuma + ": " + (num1+num2));
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("Archvio no encontrado...");
		}
	}
}
