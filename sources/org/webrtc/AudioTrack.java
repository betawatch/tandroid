package org.webrtc;

import org.webrtc.AudioTrack;
import org.webrtc.NativeLifecycleLock;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class AudioTrack extends MediaStreamTrack {

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    interface Natives {
        void setVolume(long j, double d);
    }

    public AudioTrack(long j) {
        super(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setVolume$0(double d, long j) {
        AudioTrackJni.get().setVolume(j, d);
    }

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(final double d) {
        this.lifecycleLock.run(new NativeLifecycleLock.NativePointerRunnable() { // from class: d40
            @Override // org.webrtc.NativeLifecycleLock.NativePointerRunnable
            public final void run(long j) {
                AudioTrack.lambda$setVolume$0(d, j);
            }
        });
    }
}
