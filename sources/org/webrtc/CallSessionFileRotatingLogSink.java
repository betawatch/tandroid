package org.webrtc;

import org.webrtc.Logging;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    public CallSessionFileRotatingLogSink(String str, int i3, Logging.Severity severity) {
        if (str == null) {
            throw new IllegalArgumentException("dirPath may not be null.");
        }
        this.nativeSink = nativeAddSink(str, i3, severity.ordinal());
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return nativeGetLogData(str);
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }

    private static native long nativeAddSink(String str, int i3, int i10);

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
