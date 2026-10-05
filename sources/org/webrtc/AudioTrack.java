package org.webrtc;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public class AudioTrack extends MediaStreamTrack {
    public AudioTrack(long j3) {
        super(j3);
    }

    private static native void nativeSetVolume(long j3, double d);

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(double d) {
        nativeSetVolume(getNativeAudioTrack(), d);
    }
}
