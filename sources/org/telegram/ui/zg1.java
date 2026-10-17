package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class zg1 implements RendererCommon.RendererEvents {
    public final /* synthetic */ jh1 a;

    public zg1(jh1 jh1Var) {
        this.a = jh1Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        jh1 jh1Var = this.a;
        com.google.android.gms.internal.cast.p pVar = jh1Var.l1;
        if (pVar != null) {
            pVar.run();
            jh1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new sy0(this, 23));
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
