package org.telegram.ui;

import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ti1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ zi1 a;

    public ti1(zi1 zi1Var) {
        this.a = zi1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        zi1 zi1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = zi1Var.l1;
        if (pVar != null) {
            pVar.run();
            zi1Var.l1 = null;
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
