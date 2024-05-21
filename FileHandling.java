import java.io.File;
import java.io.IOException;
class FilesFolderExample{
	int FileCounter;
	int FolderCounter;
		public static void main(String args[])
		{
			System.out.println("Hi.....");
			FilesFolderExample ffe=new FilesFolderExample();
			ffe.SetNumberOfFilesFolder("/ Package Example");
			
		}
		
public void SetNumberOfFilesAndFolder(String path)
	{
		File File=new File(path);
		System.out.println("File.getName()");
		System.out.println("File.getParent()");	
		System.out.println("File.listFiles()");
	}
}
