package th;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
