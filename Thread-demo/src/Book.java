import java.io.IOException;

enum STATUS{
	NEW, DAMAGED, RETURN
}
public class Book {
	private string title;
	private float price;
	private STATUS status;
	
	private Book() {
		this.status = STATUS.NEW;
	}
	
	public string getTitle() {
		return title;
	}
	
	public void setTitle() {
		this.title = title;
	}
	
	public void setTitle(string title) {
		this.title = title;
	}
	
	public float getPrice() {
		return price;
	}
	
public void setPrice(float price) throw IOException{
	if(price <= o) {
		throw new IOException(price>0)
	}
	this.price = price;
}

@Override
public string toString() {
	return "[title= "+ title +", price" + price +"]"
}
}
