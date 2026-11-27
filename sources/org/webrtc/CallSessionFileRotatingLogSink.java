package org.webrtc;

import org.webrtc.Logging;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class CallSessionFileRotatingLogSink {
    private final NativeLifecycleLock lifecycleLock;

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface Natives {
        long addSink(String str, int i, int i2);

        void deleteSink(long j);

        byte[] getLogData(String str);
    }

    public CallSessionFileRotatingLogSink(String str, int i, Logging.Severity severity) {
        if (str != null) {
            this.lifecycleLock = new NativeLifecycleLock("CallSessionFileRotatingLogSink", CallSessionFileRotatingLogSinkJni.get().addSink(str, i, severity.ordinal()));
        } else {
            lq5.j("dirPath may not be null.");
            throw null;
        }
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return CallSessionFileRotatingLogSinkJni.get().getLogData(str);
        }
        lq5.j("dirPath may not be null.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dispose$0(long j) {
        CallSessionFileRotatingLogSinkJni.get().deleteSink(j);
    }

    public void dispose() {
        this.lifecycleLock.dispose(new rm0((byte) 17));
    }
}
