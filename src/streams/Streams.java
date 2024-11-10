package streams;
import java.io.*;
public class Streams {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String[] books = { "герой нашего времени", "евгений онегин", "алиса в стране чудес" };
		Books_ books_ = new Books_(books);
		FileOutputStream outputStream = new FileOutputStream("книги.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(books_);
		objectOutputStream.close();
		FileInputStream fileInputStream = new FileInputStream("книги.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		books_ = (Books_)objectInputStream.readObject();
		System.out.println(books_);
		objectInputStream.close();
	}
}