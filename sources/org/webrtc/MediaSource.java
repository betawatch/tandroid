package org.webrtc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public class MediaSource {
    private long nativeSource;
    private final RefCountDelegate refCountDelegate;

    /* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        public static State fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    public MediaSource(final long j3) {
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.k
            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeReleaseRef(j3);
            }
        });
        this.nativeSource = j3;
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource == 0) {
            throw new IllegalStateException("MediaSource has been disposed.");
        }
    }

    private static native State nativeGetState(long j3);

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
