package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qi1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ wi1 a;

    public qi1(wi1 wi1Var) {
        this.a = wi1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        wi1 wi1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = wi1Var.l1;
        if (pVar != null) {
            pVar.run();
            wi1Var.l1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
