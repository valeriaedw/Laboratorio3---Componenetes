package writer;
import org.springframework.stereotype.Service;

public class NiceWriter implements IWriter {

	@Override
	public void writer(String s) {
		System.out.println("The String is " + s);

		
	}

}
