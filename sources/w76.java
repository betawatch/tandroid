// default package

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class w76 implements VideoSink {
    public volatile VideoSink a;
    public volatile int b;
    public volatile int c;
    public final tp5 d = new tp5(this, (byte) 15);
    public final /* synthetic */ x76 e;

    public w76(x76 x76Var) {
        this.e = x76Var;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.b || rotatedHeight != this.c) {
            this.b = rotatedWidth;
            this.c = rotatedHeight;
            gl.c3(this.d);
        }
        VideoSink videoSink = this.a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override // org.webrtc.VideoSink
    public final void setParentSink(VideoSink videoSink) {
    }
}
