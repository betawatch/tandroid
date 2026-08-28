package org.webrtc;

import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class MediaStreamTrack {
    public static final String AUDIO_TRACK_KIND = "audio";
    public static final String VIDEO_TRACK_KIND = "video";
    private long nativeTrack;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);

        private final int nativeIndex;

        MediaType(int i9) {
            this.nativeIndex = i9;
        }

        public static MediaType fromNativeIndex(int i9) {
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i9) {
                    return mediaType;
                }
            }
            throw new IllegalArgumentException(r0.l(i9, "Unknown native media type: "));
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public enum State {
        LIVE,
        ENDED;

        public static State fromNativeIndex(int i9) {
            return values()[i9];
        }
    }

    public MediaStreamTrack(long j10) {
        if (j10 == 0) {
            throw new IllegalArgumentException("nativeTrack may not be null");
        }
        this.nativeTrack = j10;
    }

    private void checkMediaStreamTrackExists() {
        if (this.nativeTrack == 0) {
            throw new IllegalStateException("MediaStreamTrack has been disposed.");
        }
    }

    public static MediaStreamTrack createMediaStreamTrack(long j10) {
        if (j10 == 0) {
            return null;
        }
        String nativeGetKind = nativeGetKind(j10);
        if (nativeGetKind.equals(AUDIO_TRACK_KIND)) {
            return new AudioTrack(j10);
        }
        if (nativeGetKind.equals(VIDEO_TRACK_KIND)) {
            return new VideoTrack(j10);
        }
        return null;
    }

    private static native boolean nativeGetEnabled(long j10);

    private static native String nativeGetId(long j10);

    private static native String nativeGetKind(long j10);

    private static native State nativeGetState(long j10);

    private static native boolean nativeSetEnabled(long j10, boolean z10);

    public void dispose() {
        checkMediaStreamTrackExists();
        JniCommon.nativeReleaseRef(this.nativeTrack);
        this.nativeTrack = 0L;
    }

    public boolean enabled() {
        checkMediaStreamTrackExists();
        return nativeGetEnabled(this.nativeTrack);
    }

    public long getNativeMediaStreamTrack() {
        checkMediaStreamTrackExists();
        return this.nativeTrack;
    }

    public String id() {
        checkMediaStreamTrackExists();
        return nativeGetId(this.nativeTrack);
    }

    public String kind() {
        checkMediaStreamTrackExists();
        return nativeGetKind(this.nativeTrack);
    }

    public boolean setEnabled(boolean z10) {
        checkMediaStreamTrackExists();
        return nativeSetEnabled(this.nativeTrack, z10);
    }

    public State state() {
        checkMediaStreamTrackExists();
        return nativeGetState(this.nativeTrack);
    }
}
