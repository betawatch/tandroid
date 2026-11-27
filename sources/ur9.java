// default package

import java.util.List;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtcError;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur9 implements NativeLifecycleLock.NativePointerRunnable, NativeLifecycleLock.NativePointerCallable {
    public final /* synthetic */ List a;

    public /* synthetic */ ur9(List list) {
        this.a = list;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        RtcError lambda$setCodecPreferences$7;
        lambda$setCodecPreferences$7 = RtpTransceiver.lambda$setCodecPreferences$7(this.a, j);
        return lambda$setCodecPreferences$7;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerRunnable
    public final void run(long j) {
        RtpSender.lambda$setStreams$2(this.a, j);
    }
}
