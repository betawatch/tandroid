package org.webrtc;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j3) {
        super(j3);
    }

    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
