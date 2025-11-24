public class Book {
	
	private String title;
	private String author;
	private int year;
	private boolean isAvailable;
	private int pageCount;
	
	private static int totalBooks;
	public static final int MAX_YEAR = 2025;
	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.year = 0;
		this.isAvailable = true;
		this.pageCount = 0;
		totalBooks++;
	}
	
	public Book(String title, String author, int year) {
		setTitle(title);
		setAuthor(author);
		setYear(year);
		this.isAvailable = true;
		this.pageCount = 0;
		totalBooks++;
	}
	
	public Book(String title, String author, int year, boolean isAvailable, int pageCount) {
		setTitle(title);
		setAuthor(author);
		setYear(year);
		setIsAvailable(isAvailable);
		setPageCount(pageCount);
		totalBooks++;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getYear() {
		return year;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public void setTitle(String title) {
		if (title != null) {
			this.title = title;
		} else {
			System.out.println("Ошибка: Название не может быть пустым");
		}
	}
	
	public void setAuthor(String author) {
		if (author != null) {
			this.author = author;
		} else {
			System.out.println("Ошибка: Автор не может быть пустым");
		}
	}
	
	public void setYear(int year) {
		if (year >= 1 && year <= MAX_YEAR) {
			this.year = year;
		} else {
			System.out.println("Ошибка: Год должен быть в промежутке с 1 до " + MAX_YEAR);
		}
	}
	
	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public void setPageCount(int pageCount) {
		if (pageCount > 0) {
			this.pageCount = pageCount;
		} else {
			System.out.println("Ошибка: Количество страниц должно быть положительным");
		}
	}
	
	public static int getTotalBooks() {
		return totalBooks;
	}

	public void displayInfo() {
		System.out.println("Название: " + title);
		System.out.println("Автор: " + author);
		System.out.println("Год выпуска: " + year);
		if (isAvailable == true) {
			System.out.println("Книга доступна");
		} else {
			System.out.println("Книга не доступна");
		}
		System.out.println("Количество страниц: " + pageCount);
	}
	
	public void displayInfo(boolean detailed) {
		if (detailed == true) {
			displayInfo();
		} else {
			System.out.println("Название: " + title);
			System.out.println("Автор: " + author);
			System.out.println("Год выпуска: " + year);
		}
	}
	
	public void borrowBook() {
		if (isAvailable == true) {
			System.out.println("Книга выдана");
			isAvailable = false;
		} else {
			System.out.println("Книга уже была выдана");
		}
	}
	
	public void borrowBook(String borrowerName) {
		if (isAvailable == true) {
			System.out.println("Книга выдана: " + borrowerName);
			isAvailable = false;
		} else {
			System.out.println("Книга уже была выдана: " + borrowerName);
		}
	}
	
	public void returnBook() {
		if (isAvailable == false) {
			System.out.println("Книга сдана");
			isAvailable = true;
		} else {
			System.out.println("Книга уже была сдана");
		}
	}
	
	public void updateYear(int newYear) {
		setYear(newYear);
		System.out.println("Новый год выпуска книги: " + newYear);
	}
}