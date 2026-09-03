package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yh1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ii1 a;

    public yh1(ii1 ii1Var) {
        this.a = ii1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        ii1 ii1Var = this.a;
        c2.p pVar = ii1Var.i1;
        if (pVar != null) {
            pVar.run();
            ii1Var.i1 = null;
        }
        AndroidUtilities.runOnUIThread(new sz0(this, 22));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
