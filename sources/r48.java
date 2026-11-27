// default package

import org.webrtc.AudioTrack;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.VideoTrack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class r48 implements NativeLifecycleLock.NativePointerCallable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ r48(long j, String str, byte b) {
        this.a = b;
        this.b = j;
        this.c = str;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        AudioTrack lambda$createAudioTrack$6;
        VideoTrack lambda$createVideoTrack$3;
        switch (this.a) {
            case 0:
                lambda$createAudioTrack$6 = PeerConnectionFactory.lambda$createAudioTrack$6(this.b, this.c, j);
                return lambda$createAudioTrack$6;
            default:
                lambda$createVideoTrack$3 = PeerConnectionFactory.lambda$createVideoTrack$3(this.b, this.c, j);
                return lambda$createVideoTrack$3;
        }
    }
}
