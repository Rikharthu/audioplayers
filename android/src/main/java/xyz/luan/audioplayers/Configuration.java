package xyz.luan.audioplayers;

abstract class Configuration {

    private final static long DEFAULT_PROGRESS_UPDATE_INTERVAL = 200L;

    private static long progressUpdateInterval = DEFAULT_PROGRESS_UPDATE_INTERVAL;

    public static void setProgressUpdateInterval(long newProgressUpdateInterval) {
        progressUpdateInterval = newProgressUpdateInterval;
    }

    public static long getProgressUpdateInterval() {
        return progressUpdateInterval;
    }

    public static void resetProgressUpdateInterval() {
        progressUpdateInterval = DEFAULT_PROGRESS_UPDATE_INTERVAL;
    }
}