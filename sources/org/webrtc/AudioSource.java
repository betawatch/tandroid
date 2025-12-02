package org.webrtc;

/* loaded from: classes3.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j) {
        super(j);
    }

    long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
