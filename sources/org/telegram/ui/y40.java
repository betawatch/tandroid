package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class y40 extends org.telegram.ui.Components.uq0 {
    public final /* synthetic */ d60 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y40(d60 d60Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.b1 = d60Var;
    }

    @Override // org.telegram.ui.Components.uq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = iVar.m();
            d60 d60Var = this.b1;
            if (m10 == 1) {
                d60Var.k1().m(((TLRPC.Dialog) iVar.n(0)).id, Integer.valueOf(i10), 41);
            } else {
                d60Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
            }
        }
    }
}
