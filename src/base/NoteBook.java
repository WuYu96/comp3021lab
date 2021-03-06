package base_local;

import java.util.ArrayList;
import java.util.Collections;

public class NoteBook {

	private ArrayList<Folder> folders;
	
	public void sortFolders(){
		
		for(Folder f : folders){
			f.sortNotes();
		}
		
		List<Folder> lfolders = folders;
		Collections.sort(folders);
		
	}

	public NoteBook() {

		folders = new ArrayList<>();
	}
	
	public ArrayList<Folder> getFolders(){
		
		return folders;
		
	}

	public boolean createTextNote(String folderName, String title) {
		TextNote note = new TextNote(title);
		return insertNote(folderName, note);
	}

	public boolean createImageNote(String folderName, String title) {
		ImageNote note = new ImageNote(title);
		return insertNote(folderName, note);
	}

	private boolean insertNote(String folderName, Note note) {
		Folder f = null;
		for (Folder f1 : folders) {
			if (f1.getName().equals(folderName)) {
				f = f1;
				break;
			}
		}
		if (f == null) {
			f = new Folder(folderName);
			folders.add(f);
		}
		for (Note n : f.getNotes()) {
			if (n.getTitle().equals(note.getTitle())) {
				System.out.println("Creating note" + note.getTitle() + "under folder" + folderName + "failed");
				return false;
			}
		}
		f.addNote(note);
		return true;
	}
}
