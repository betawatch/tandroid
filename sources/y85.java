// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class y85 implements RendererCommon.RendererEvents {
    public final /* synthetic */ z85 a;

    public y85(z85 z85Var) {
        this.a = z85Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        gl.d3(new x85(this.a, (byte) 0));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        gl.d3(new x85(this.a, (byte) 1));
    }
}
