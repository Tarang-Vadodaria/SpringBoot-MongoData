package com.learnDevTarang.MongoDBData.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
  

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Book")
  
// Class
public class Book {
  
    // Attributes
    @Id private int pid;
    private String bookName;
    public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	private String authorName;
    
    @Override
	public String toString()
	{
    	return "Book[" +"+ id "+pid +" name "+ bookName + " author "+ authorName +"]";
	}
    
}
