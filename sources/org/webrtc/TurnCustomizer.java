package org.webrtc;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class TurnCustomizer {
    private final NativeLifecycleLock lifecycleLock;

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
