// default package

import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpReceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
