package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y61 extends org.telegram.ui.Components.oo0 {
    public final /* synthetic */ a71 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y61(a71 a71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.S2 = a71Var;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            a71 a71Var = this.S2;
            if (m10 == 1) {
                a71Var.a.n0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i3), 61);
            } else {
                a71Var.a.n0.k(0L, 61, Integer.valueOf(i3), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
