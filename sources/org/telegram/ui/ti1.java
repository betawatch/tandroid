package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ti1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ dj1 a;

    public ti1(dj1 dj1Var) {
        this.a = dj1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        dj1 dj1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = dj1Var.l1;
        if (pVar != null) {
            pVar.run();
            dj1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new uz0(this, 23));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
