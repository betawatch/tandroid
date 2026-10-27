package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r40 extends org.telegram.ui.Components.nr0 {
    public final /* synthetic */ x50 a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r40(x50 x50Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.a1 = x50Var;
    }

    @Override // org.telegram.ui.Components.nr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            x50 x50Var = this.a1;
            if (m10 == 1) {
                x50Var.k1().m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 41);
            } else {
                x50Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
