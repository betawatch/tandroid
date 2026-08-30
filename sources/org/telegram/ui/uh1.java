package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uh1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ai1 a;

    public uh1(ai1 ai1Var) {
        this.a = ai1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        ai1 ai1Var = this.a;
        c2.p pVar = ai1Var.i1;
        if (pVar != null) {
            pVar.run();
            ai1Var.i1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
