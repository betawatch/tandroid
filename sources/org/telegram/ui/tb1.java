package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tb1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ zb1 a;

    public tb1(zb1 zb1Var) {
        this.a = zb1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        zb1 zb1Var = this.a;
        b8.cg cgVar = zb1Var.m1;
        if (cgVar != null) {
            cgVar.run();
            zb1Var.m1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
    }
}
