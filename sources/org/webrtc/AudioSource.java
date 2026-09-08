package org.webrtc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j3) {
        super(j3);
    }

    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
