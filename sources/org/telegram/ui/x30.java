package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x30 extends org.telegram.ui.Components.op0 {
    public final /* synthetic */ b50 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(b50 b50Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.R2 = b50Var;
    }

    @Override // org.telegram.ui.Components.op0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            b50 b50Var = this.R2;
            if (m10 == 1) {
                b50Var.m1().m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 41);
            } else {
                b50Var.m1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
