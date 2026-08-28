package org.webrtc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class MediaSource {
    private long nativeSource;
    private final RefCountDelegate refCountDelegate;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        public static State fromNativeIndex(int i9) {
            return values()[i9];
        }
    }

    public MediaSource(final long j10) {
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.k
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeReleaseRef(j10);
            }
        });
        this.nativeSource = j10;
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource == 0) {
            throw new IllegalStateException("MediaSource has been disposed.");
        }
    }

    private static native State nativeGetState(long j10);

    public void dispose() {
        checkMediaSourceExists();
        this.refCountDelegate.release();
        this.nativeSource = 0L;
    }

    public long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
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
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }
}
