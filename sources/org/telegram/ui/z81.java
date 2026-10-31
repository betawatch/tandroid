package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z81 extends org.telegram.ui.Components.op0 {
    public final /* synthetic */ b91 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z81(b91 b91Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.R2 = b91Var;
    }

    @Override // org.telegram.ui.Components.op0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            b91 b91Var = this.R2;
            if (m10 == 1) {
                b91Var.a.m0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                b91Var.a.m0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
