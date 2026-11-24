// default package

import android.os.SystemClock;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qp9 implements VideoSink {
    public volatile wc8 a;
    public volatile zjc b;
    public volatile int c;
    public volatile int d;
    public volatile long e;
    public final kf9 f = new kf9(this, 14);
    public final /* synthetic */ tp9 h;

    public qp9(tp9 tp9Var) {
        this.h = tp9Var;
    }

    public final boolean a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return this.e < j ? elapsedRealtime - j < 700 : elapsedRealtime - this.e < 5000;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = elapsedRealtime - this.e > 5000;
        this.e = elapsedRealtime;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.c || rotatedHeight != this.d || z) {
            this.c = rotatedWidth;
            this.d = rotatedHeight;
            gm.c3(this.f);
        }
        wc8 wc8Var = this.a;
        zjc zjcVar = this.b;
        if (wc8Var != null) {
            wc8Var.onFrame(videoFrame);
        }
        if (zjcVar != null) {
            zjcVar.onFrame(videoFrame);
        }
    }

    @Override // org.webrtc.VideoSink
    public final void setParentSink(VideoSink videoSink) {
    }
}
