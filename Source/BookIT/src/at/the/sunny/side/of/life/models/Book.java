package at.the.sunny.side.of.life.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "books")
public class Book {

	@DatabaseField(id = true,index = true)	
	private String ISBN;

	@DatabaseField(index = true)
	private String name;

	@DatabaseField(canBeNull = false)
	private String description;

	
	public Book() {}
	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
