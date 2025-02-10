package Classes;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress( address);
        String htmlContent = sendHttpRequest(ip);
        System.out.println(htmlContent);
    }


    private @NotNull String sendHttpRequest(String ip) {
        return "<html>Content</html>";
    }

    private @NotNull String findIpAddress(String address) {
        return "123.0.0.2";
    }
}
