package org.webrtc;

import org.webrtc.Logging;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    private static native void nativeDeleteSink(long j3);

    private static native byte[] nativeGetLogData(String str);

    public void dispose() {
        long j3 = this.nativeSink;
        if (j3 != 0) {
            nativeDeleteSink(j3);
            this.nativeSink = 0L;
        }
    }
}
