// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xa5 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ya5 a;

    public xa5(ya5 ya5Var) {
        this.a = ya5Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        gm.c3(new wa5(this.a, (byte) 0));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        gm.c3(new wa5(this.a, (byte) 1));
    }
}
