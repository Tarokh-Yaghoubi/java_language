package Interfaces.myTube;

import org.jetbrains.annotations.NotNull;

public class VideoDatabase implements CanVideoStore {
//    public void store(Video video) {
//        System.out.println("Storing video metadata in a SQL database...");
//        System.out.println("Title: " + video.getTitle());
//        System.out.println("File Name: " + video.getFileName());
//        System.out.println("Done!\n");
//    }

    @Override
    public void store(@NotNull Video video) {
        System.out.println("Storing video -> " + video.getFileName() + " Into a DB.");
        System.out.println("Stored video inside the DB.");
    }

}
