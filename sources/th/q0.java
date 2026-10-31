package th;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q0 extends VoIPService.ProxyVideoSink {
    public final /* synthetic */ s0 a;

    public q0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // org.telegram.messenger.voip.VoIPService.ProxyVideoSink, org.webrtc.VideoSink
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.a.s) {
            org.telegram.messenger.i0.g3(new sg.v(this, 3));
        }
    }
}
