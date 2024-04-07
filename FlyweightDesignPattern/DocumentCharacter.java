package FlyweightDesignPattern;

    public class DocumentCharacter implements ILetter{

        private char character;
        private String fontType;
        private int size;

        public DocumentCharacter(char character, String fontType, int size){
                this.character = character;
                this.fontType = fontType;
                this.size = size;
        }

        public void display(int row, int column){
            System.out.println("Character exists at x-axis " + row + " and y-axis" + column);
        }
}