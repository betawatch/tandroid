package org.webrtc;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class TurnCustomizer {
    private final NativeLifecycleLock lifecycleLock;

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
