package org.webrtc;

import org.webrtc.Logging;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    public CallSessionFileRotatingLogSink(String str, int i7, Logging.Severity severity) {
        if (str == null) {
            throw new IllegalArgumentException("dirPath may not be null.");
        }
        this.nativeSink = nativeAddSink(str, i7, severity.ordinal());
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return nativeGetLogData(str);
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }

    private static native long nativeAddSink(String str, int i7, int i10);

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
