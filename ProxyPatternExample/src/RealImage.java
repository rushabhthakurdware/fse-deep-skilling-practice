public class RealImage implements Image{
    private String fileName;

    public RealImage(String file){
        this.fileName = file;
        loadFromServer();
    }
    private void loadFromServer() {
        System.out.println("Loading image from remote server: " + fileName);
    }

    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}
