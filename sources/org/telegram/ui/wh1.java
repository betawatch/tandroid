package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wh1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ci1 a;

    public wh1(ci1 ci1Var) {
        this.a = ci1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        ci1 ci1Var = this.a;
        c2.p pVar = ci1Var.i1;
        if (pVar != null) {
            pVar.run();
            ci1Var.i1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
