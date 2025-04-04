package Interfaces.myTube;

import org.jetbrains.annotations.NotNull;

public class VideoEncoder implements CanVideoEncode {
//    public void encode(Video video) {
//        System.out.println("Encoding video...");
//        System.out.println("Done!\n");
//    }

    @Override
    public void encode(@NotNull Video video) {
        System.out.println("Encoding video -> " + video.getFileName());
        System.out.println("Video encoding done.");
    }

}
