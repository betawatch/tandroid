// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yfc implements RendererCommon.RendererEvents {
    public final /* synthetic */ hgc a;

    public yfc(hgc hgcVar) {
        this.a = hgcVar;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        gl.d3(new kbc(this, (byte) 6));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
