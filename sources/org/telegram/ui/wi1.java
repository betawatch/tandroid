package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wi1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ cj1 a;

    public wi1(cj1 cj1Var) {
        this.a = cj1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        cj1 cj1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = cj1Var.l1;
        if (pVar != null) {
            pVar.run();
            cj1Var.l1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
