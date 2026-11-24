// default package

import android.os.SystemClock;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pn9 implements VideoSink {
    public volatile ta8 a;
    public volatile zhc b;
    public volatile int c;
    public volatile int d;
    public volatile long e;
    public final zk9 f = new zk9(this, 6);
    public final /* synthetic */ sn9 h;

    public pn9(sn9 sn9Var) {
        this.h = sn9Var;
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
            gl.c3(this.f);
        }
        ta8 ta8Var = this.a;
        zhc zhcVar = this.b;
        if (ta8Var != null) {
            ta8Var.onFrame(videoFrame);
        }
        if (zhcVar != null) {
            zhcVar.onFrame(videoFrame);
        }
    }

    @Override // org.webrtc.VideoSink
    public final void setParentSink(VideoSink videoSink) {
    }
}
