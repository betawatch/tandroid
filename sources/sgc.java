// default package

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class sgc implements NativeLifecycleLock.NativePointerRunnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoTrack b;
    public final /* synthetic */ VideoSink c;

    public /* synthetic */ sgc(VideoTrack videoTrack, VideoSink videoSink, byte b) {
        this.a = b;
        this.b = videoTrack;
        this.c = videoSink;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerRunnable
    public final void run(long j) {
        byte b = this.a;
        VideoSink videoSink = this.c;
        VideoTrack videoTrack = this.b;
        switch (b) {
            case 0:
                videoTrack.lambda$removeSink$1(videoSink, j);
                break;
            default:
                videoTrack.lambda$addSink$0(videoSink, j);
                break;
        }
    }
}
