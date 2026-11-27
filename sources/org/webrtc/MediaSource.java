package org.webrtc;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class MediaSource {
    final NativeLifecycleLock lifecycleLock;
    private final RefCountDelegate refCountDelegate;

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface Natives {
        State getState(long j);
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaSource(long j) {
        this.refCountDelegate = new RefCountDelegate(new tz6((byte) 0, j));
        this.lifecycleLock = new NativeLifecycleLock("MediaSource", j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispose$2(long j) {
        this.refCountDelegate.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$state$1(long j) {
        return MediaSourceJni.get().getState(j);
    }

    public void dispose() {
        this.lifecycleLock.dispose(new bm6(this, (byte) 9));
    }

    public long getNativeMediaSource() {
        return this.lifecycleLock.getNativePointer();
    }

    public void runWithReference(Runnable runnable) {
        if (this.refCountDelegate.safeRetain()) {
            try {
                runnable.run();
            } finally {
                this.refCountDelegate.release();
            }
        }
    }

    public State state() {
        return (State) this.lifecycleLock.call(new hz6((byte) 5));
    }
}
