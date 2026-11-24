// default package

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class v96 implements VideoSink {
    public volatile VideoSink a;
    public volatile int b;
    public volatile int c;
    public final kg5 d = new kg5(this, (byte) 22);
    public final /* synthetic */ w96 e;

    public v96(w96 w96Var) {
        this.e = w96Var;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.b || rotatedHeight != this.c) {
            this.b = rotatedWidth;
            this.c = rotatedHeight;
            gm.c3(this.d);
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
