package base;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Folder implements Comparable<Folder>{
	private ArrayList<Note> notes;
	private String name;
	
	public int compareTo(Folder o){
		
		if(this.name.length()==o.name.length()){
			return 0;
		}
		else if(this.name.length()>o.name.length()){
			return 1;
		}
		else{
			return -1;
		}
	}
	public List<Note> searchNotes(String keywords){ 
		String[] words = keywords.split(" ");
	}
	
	public void sortNotes(){
		List<Note> lnotes = notes;
		Collections.sort(notes);
		
	}
        public Folder(String name){
    		this.name = name;
    		notes = new ArrayList<Note>(); 
        }
    	
        public void addNote(Note note){
    		notes.add(note);
        }
    	public String getName(){
    		return name;
    	}
    	public ArrayList<Note> getNotes(){
    		return notes;
    	}
    
    	@Override
	public String toString() {
	    int nText = 0;
	    int nImage = 0;
	    for(Note note: notes){
	    	if(note instanceof TextNote)
	    		++nText;
	    	else if(note instanceof ImageNote)
	    		++nImage;
		
		}
	    return name + ":" + nText + ":" +nImage;
	}
	    
	    public boolean equals(Folder other){
	    	return name.equals(other.getName());
	    }
	    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Folder other = (Folder) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

