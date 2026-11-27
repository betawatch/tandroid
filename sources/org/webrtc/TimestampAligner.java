package org.webrtc;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class TimestampAligner {
    private final NativeLifecycleLock lifecycleLock;

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface Natives {
        long createTimestampAligner(long j);

        void releaseTimestampAligner(long j);

        long translateTimestamp(long j, long j2);
    }

    public TimestampAligner(Environment environment) {
        this.lifecycleLock = new NativeLifecycleLock("TimestampAligner", TimestampAlignerJni.get().createTimestampAligner(environment.ref()));
    }

    @Deprecated
    public static long getRtcTimeNanos() {
        return Environment.builder().build().getCurrentTimeNanos();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dispose$1(long j) {
        TimestampAlignerJni.get().releaseTimestampAligner(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$translateTimestamp$0(long j, long j2) {
        return Long.valueOf(TimestampAlignerJni.get().translateTimestamp(j2, j));
    }

    public void dispose() {
        this.lifecycleLock.dispose(new grb((byte) 2));
    }

    public long translateTimestamp(long j) {
        return ((Long) this.lifecycleLock.call(new h40((byte) 6, j))).longValue();
    }

    @Deprecated
    public TimestampAligner() {
        this(Environment.builder().build());
    }
}
