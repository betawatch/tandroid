// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y85 implements RendererCommon.RendererEvents {
    public final /* synthetic */ z85 a;

    public y85(z85 z85Var) {
        this.a = z85Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        gl.c3(new x85(this.a, (byte) 0));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        gl.c3(new x85(this.a, (byte) 1));
    }
}
