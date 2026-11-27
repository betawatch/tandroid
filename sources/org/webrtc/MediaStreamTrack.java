package org.webrtc;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class MediaStreamTrack {
    public static final String AUDIO_TRACK_KIND = "audio";
    public static final String VIDEO_TRACK_KIND = "video";
    final NativeLifecycleLock lifecycleLock;

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);

        private final int nativeIndex;

        MediaType(int i) {
            this.nativeIndex = i;
        }

        public static MediaType fromNativeIndex(int i) {
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i) {
                    return mediaType;
                }
            }
            lq5.j(uh9.k(i, "Unknown native media type: "));
            return null;
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface Natives {
        boolean getEnabled(long j);

        String getId(long j);

        String getKind(long j);

        State getState(long j);

        boolean setEnabled(long j, boolean z);
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    public enum State {
        LIVE,
        ENDED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaStreamTrack(long j) {
        if (j != 0) {
            this.lifecycleLock = new NativeLifecycleLock("MediaStreamTrack", j);
        } else {
            lq5.j("nativeTrack may not be null");
            throw null;
        }
    }

    public static MediaStreamTrack createMediaStreamTrack(long j) {
        if (j == 0) {
            return null;
        }
        String kind = MediaStreamTrackJni.get().getKind(j);
        if (kind.equals(AUDIO_TRACK_KIND)) {
            return new AudioTrack(j);
        }
        if (kind.equals(VIDEO_TRACK_KIND)) {
            return new VideoTrack(j);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$enabled$2(long j) {
        return Boolean.valueOf(MediaStreamTrackJni.get().getEnabled(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$id$0(long j) {
        return MediaStreamTrackJni.get().getId(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$kind$1(long j) {
        return MediaStreamTrackJni.get().getKind(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$setEnabled$3(boolean z, long j) {
        return Boolean.valueOf(MediaStreamTrackJni.get().setEnabled(j, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$state$4(long j) {
        return MediaStreamTrackJni.get().getState(j);
    }

    public void dispose() {
        this.lifecycleLock.dispose(new da3((byte) 28));
    }

    public boolean enabled() {
        return ((Boolean) this.lifecycleLock.call(new hz6((byte) 7))).booleanValue();
    }

    public long getNativeMediaStreamTrack() {
        return this.lifecycleLock.getNativePointer();
    }

    public String id() {
        return (String) this.lifecycleLock.call(new hz6((byte) 10));
    }

    public String kind() {
        return (String) this.lifecycleLock.call(new hz6((byte) 9));
    }

    public boolean setEnabled(boolean z) {
        return ((Boolean) this.lifecycleLock.call(new k64((byte) 6, z))).booleanValue();
    }

    public State state() {
        return (State) this.lifecycleLock.call(new hz6((byte) 8));
    }
}
