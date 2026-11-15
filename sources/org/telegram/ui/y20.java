package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y20 extends org.telegram.ui.Components.po0 {
    public final /* synthetic */ c40 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y20(c40 c40Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.V2 = c40Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            c40 c40Var = this.V2;
            if (m10 == 1) {
                c40Var.n1().m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i7), 41);
            } else {
                c40Var.n1().k(0L, 41, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
