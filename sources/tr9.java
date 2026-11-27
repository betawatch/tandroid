// default package

import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpReceiver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
