// default package

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
