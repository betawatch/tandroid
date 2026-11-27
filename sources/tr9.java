// default package

import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpReceiver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr9 implements NativeLifecycleLock.NativePointerRunnable, NativeLifecycleLock.NativeDisposer {
    public final /* synthetic */ RtpReceiver a;

    public /* synthetic */ tr9(RtpReceiver rtpReceiver) {
        this.a = rtpReceiver;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeDisposer
    public final void dispose(long j) {
        this.a.lambda$dispose$2(j);
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerRunnable
    public final void run(long j) {
        this.a.lambda$SetObserver$3(j);
    }
}
