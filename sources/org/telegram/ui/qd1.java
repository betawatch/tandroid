package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qd1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ zd1 a;

    public qd1(zd1 zd1Var) {
        this.a = zd1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        zd1 zd1Var = this.a;
        com.google.android.gms.internal.cast.o oVar = zd1Var.l1;
        if (oVar != null) {
            oVar.run();
            zd1Var.l1 = null;
        }
        org.telegram.messenger.i0.g3(new vv0(this, 27));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
