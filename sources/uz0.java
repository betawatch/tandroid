// default package

import java.util.Iterator;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class uz0 implements VideoSink {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uz0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                vz0 vz0Var = (vz0) obj;
                VideoSink incomingVideoSink = vz0Var.v.a.getIncomingVideoSink(vz0Var.a);
                if (incomingVideoSink != null) {
                    incomingVideoSink.onFrame(videoFrame);
                    break;
                }
                break;
            case 1:
                Iterator it = ((bo9) obj).a.iterator();
                while (it.hasNext()) {
                    ((VideoSink) it.next()).onFrame(videoFrame);
                }
                break;
            default:
                ((VideoSource) obj).lambda$setVideoProcessor$1(videoFrame);
                break;
        }
    }

    @Override // org.webrtc.VideoSink
    public final void setParentSink(VideoSink videoSink) {
        byte b = this.a;
    }

    private final void a(VideoSink videoSink) {
    }

    private final void b(VideoSink videoSink) {
    }

    private final void c(VideoSink videoSink) {
    }
}
