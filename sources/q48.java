// default package

import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpCapabilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class q48 implements NativeLifecycleLock.NativePointerCallable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MediaStreamTrack.MediaType b;

    public /* synthetic */ q48(MediaStreamTrack.MediaType mediaType, byte b) {
        this.a = b;
        this.b = mediaType;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        RtpCapabilities lambda$getRtpReceiverCapabilities$8;
        RtpCapabilities lambda$getRtpSenderCapabilities$9;
        byte b = this.a;
        MediaStreamTrack.MediaType mediaType = this.b;
        switch (b) {
            case 0:
                lambda$getRtpReceiverCapabilities$8 = PeerConnectionFactory.lambda$getRtpReceiverCapabilities$8(mediaType, j);
                return lambda$getRtpReceiverCapabilities$8;
            default:
                lambda$getRtpSenderCapabilities$9 = PeerConnectionFactory.lambda$getRtpSenderCapabilities$9(mediaType, j);
                return lambda$getRtpSenderCapabilities$9;
        }
    }
}
