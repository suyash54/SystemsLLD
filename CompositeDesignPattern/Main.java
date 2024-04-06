package CompositeDesignPattern;

    public class Main{

        public static void main(String[] args){

            Directory movieDirectory = new Directory("movie");
            FileSystem extraction = new File("extraction");
            movieDirectory.add(extraction);

            Directory comedyMovieDirectory = new Directory("comedy");
            FileSystem grownUps = new File("grownUps");
            comedyMovieDirectory.add(grownUps);
            movieDirectory.add(comedyMovieDirectory);

            movieDirectory.ls();
        }
    }