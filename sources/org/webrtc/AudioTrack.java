package org.webrtc;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class AudioTrack extends MediaStreamTrack {
    public AudioTrack(long j) {
        super(j);
    }

    private static native void nativeSetVolume(long j, double d);

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(double d) {
        nativeSetVolume(getNativeAudioTrack(), d);
    }
}
