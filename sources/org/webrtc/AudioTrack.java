package org.webrtc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
