package base_local;
import java.util.Date;
import java.util.List;


public class Note implements Comparable<Note> {
	private Date date;
	private String title;
	
	public int compareTo(Note o){
		
		return this.date.compareTo(o.date);
	}
	
	public Note(String title){
		this.title = title;
		date = new Date(System.currentTimeMillis());
	}
	public String getTitle(){
		
		return title;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
