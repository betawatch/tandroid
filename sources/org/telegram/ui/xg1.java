package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class xg1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ hh1 a;

    public xg1(hh1 hh1Var) {
        this.a = hh1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        hh1 hh1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = hh1Var.l1;
        if (pVar != null) {
            pVar.run();
            hh1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new qy0(this, 23));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
