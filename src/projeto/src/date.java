import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class date {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        ZonedDateTime agoraEmTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(agoraEmTokyo);

    }
}
