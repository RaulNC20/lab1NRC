package lab11;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        YouTubeChannel channel =
                new YouTubeChannel("Tech Explained");

        MediaInterested media1 =
                new MediaInterested("CNN");

        MediaInterested media2 =
                new MediaInterested("FoxNews");

        // adaugam 2 observatori
        channel.addObserver(media1);
        channel.addObserver(media2);

        // primul upload -> 2 observatori
        String message1 = "Observer Pattern in Java";
        channel.uploadVideo(message1);

        System.out.println();

        // eliminam un observator
        channel.removeObserver(media2);

        // al doilea upload -> 1 observator
        String message2 = "Singleton Pattern in Java";
        channel.uploadVideo(message2);
    }
}