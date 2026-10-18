package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
