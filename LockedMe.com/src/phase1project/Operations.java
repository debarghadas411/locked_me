package phase1project;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeSet;

public class Operations {
	private TreeSet<String> files;
	private HashMap<String, String> hm;
	
	public Operations(String path) {
		initialize(path);
	}
	private void initialize(String path) {
		this.files=new TreeSet<String>();
		this.hm=new HashMap<String,String>();
		final File folder = new File(path);
		for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isFile()) {
	            hm.put(fileEntry.getName(),"FILE");
	        } else {
	        	hm.put(fileEntry.getName(),"DIRECTORY");
	        }
	        files.add(fileEntry.getName());
	    }
		
	}
	public void show() {
		for(String F: files) {
			System.out.println(hm.get(F)+" : "+F);
		}
	}
	public void add(String filename) throws FileNotCreatedException, IOException {
		      File file = new File(filename);
		      if (file.createNewFile()) {
		        System.out.println("\nFile created: " + file.getName());
		        files.add(file.getName());
		        hm.put(file.getName(),"FILE");
		      } else {
		        throw new FileNotCreatedException(file.getName()+" Cannot be created!!");
		      }
		
	}
	public void delete(String filename) throws FileNotDeletedException {
		File file = new File(filename); 
	    if (file.delete()) { 
	    files.remove(file.getName());
		hm.remove(file.getName());
	      System.out.println("Deleted the file: " + file.getName());
	    } else {
	      throw new FileNotDeletedException(file.getName()+" not deleted!!");
	    } 
	}
	public void search(String filename) throws FileNotFoundException {
		if(files.contains(filename)) {
			System.out.println("The following file exists : "+filename);
		}
		else {
			throw new FileNotFoundException(filename+" not found!!");
		}
	}

}
