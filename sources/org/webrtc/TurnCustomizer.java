package org.webrtc;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public class TurnCustomizer {
    private final NativeLifecycleLock lifecycleLock;

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    interface Natives {
        void freeTurnCustomizer(long j);
    }

    public TurnCustomizer(long j) {
        this.lifecycleLock = new NativeLifecycleLock("TurnCustomizer", j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dispose$0(long j) {
        TurnCustomizerJni.get().freeTurnCustomizer(j);
    }

    public void dispose() {
        this.lifecycleLock.dispose(new grb((byte) 14));
    }

    public long getNativeTurnCustomizer() {
        return this.lifecycleLock.getNativePointer();
    }
}
