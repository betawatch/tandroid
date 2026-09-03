package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vc1 extends org.telegram.ui.Components.lq0 {
    public final /* synthetic */ xc1 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc1(xc1 xc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.Y0 = xc1Var;
    }

    @Override // org.telegram.ui.Components.lq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (z4) {
            int m9 = hVar.m();
            xc1 xc1Var = this.Y0;
            if (m9 == 1) {
                xc1Var.a.i0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                xc1Var.a.i0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
