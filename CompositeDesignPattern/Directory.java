package CompositeDesignPattern;

    import java.util.*;

    public class Directory implements FileSystem{

        String directoryName;
        List<FileSystem> fileSystemList;

        public Directory(String directoryName){

            this.directoryName = directoryName;
            fileSystemList = new ArrayList<>();
        }

        public void add(FileSystem fileSystemObj){ fileSystemList.add(fileSystemObj);}

        public void ls(){

            System.out.println("Name of the directory is " + directoryName);

            for(FileSystem fileSystemObj : fileSystemList){
                fileSystemObj.ls();
            }
        }
}