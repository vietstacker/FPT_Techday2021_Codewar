package fortest.codefest.service.socket;

public class ClientConfig {
    public static class PLAYER {
        public static class OUTGOING {
            public static final String JOIN_GAME = "join game";
            public static final String DRIVE_PLAYER = "drive player";
        }

        public static class INCOMMING {
            public static final String JOIN_GAME = "join game";
            public static final String TICKTACK_PLAYER = "ticktack player";
            public static final String DRIVE_PLAYER = "drive player";
        }
    }
}
