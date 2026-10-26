package org.webrtc;

import org.webrtc.Logging;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
