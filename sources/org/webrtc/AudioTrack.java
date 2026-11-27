package org.webrtc;

import org.webrtc.AudioTrack;
import org.webrtc.NativeLifecycleLock;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public class AudioTrack extends MediaStreamTrack {

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
