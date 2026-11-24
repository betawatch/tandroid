package org.webrtc;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class TimestampAligner {
    private volatile long nativeTimestampAligner = nativeCreateTimestampAligner();

    private void checkNativeAlignerExists() {
        if (this.nativeTimestampAligner != 0) {
            return;
        }
        dq9.m("TimestampAligner has been disposed.");
    }

    public static long getRtcTimeNanos() {
        return nativeRtcTimeNanos();
    }

    private static native long nativeCreateTimestampAligner();

    private static native void nativeReleaseTimestampAligner(long j);

    private static native long nativeRtcTimeNanos();

    private static native long nativeTranslateTimestamp(long j, long j2);

    public void dispose() {
        checkNativeAlignerExists();
        nativeReleaseTimestampAligner(this.nativeTimestampAligner);
        this.nativeTimestampAligner = 0L;
    }

    public long translateTimestamp(long j) {
        checkNativeAlignerExists();
        return nativeTranslateTimestamp(this.nativeTimestampAligner, j);
    }
}
