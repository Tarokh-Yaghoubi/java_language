package Interfaces.myTube;

import org.jetbrains.annotations.NotNull;

public class EmailService implements CanSendEmail {
//    public void sendEmail(@NotNull User user) {
//        System.out.println("Notifying " + user.getEmail() + "...");
//        System.out.println("Done!\n");
//    }

    @Override
    public void sendEmail(@NotNull User user) {
        System.out.println("Sending an email to -> " + user.getEmail());
        System.out.println("Done...");
    }
}
