package org.webrtc;

import org.webrtc.Logging;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    public CallSessionFileRotatingLogSink(String str, int i10, Logging.Severity severity) {
        if (str == null) {
            throw new IllegalArgumentException("dirPath may not be null.");
        }
        this.nativeSink = nativeAddSink(str, i10, severity.ordinal());
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return nativeGetLogData(str);
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }

    private static native long nativeAddSink(String str, int i10, int i11);

    private static native void nativeDeleteSink(long j10);

    private static native byte[] nativeGetLogData(String str);

    public void dispose() {
        long j10 = this.nativeSink;
        if (j10 != 0) {
            nativeDeleteSink(j10);
            this.nativeSink = 0L;
        }
    }
}
