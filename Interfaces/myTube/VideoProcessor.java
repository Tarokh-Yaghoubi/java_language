package Interfaces.myTube;

import org.jetbrains.annotations.NotNull;

public class VideoProcessor {

    private VideoEncoder encoder;
    private VideoDatabase database;
    private EmailService emailService;

    // Here we are using Constructor Injection to prevent instantiating our Class directly in VideoProcessor.

    public VideoProcessor(
            VideoEncoder encoder,
            VideoDatabase database,
            EmailService emailService
    ) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {

        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }

}

