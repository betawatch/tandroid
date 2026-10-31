package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vd1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ be1 a;

    public vd1(be1 be1Var) {
        this.a = be1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        be1 be1Var = this.a;
        com.google.android.gms.internal.cast.o oVar = be1Var.l1;
        if (oVar != null) {
            oVar.run();
            be1Var.l1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
