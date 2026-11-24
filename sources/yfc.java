// default package

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yfc implements RendererCommon.RendererEvents {
    public final /* synthetic */ hgc a;

    public yfc(hgc hgcVar) {
        this.a = hgcVar;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        gl.c3(new kbc(this, (byte) 6));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
