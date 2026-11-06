package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class y20 extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ c40 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y20(c40 c40Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.R2 = c40Var;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            int m10 = hVar.m();
            c40 c40Var = this.R2;
            if (m10 == 1) {
                c40Var.n1().m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i7), 41);
            } else {
                c40Var.n1().k(0L, 41, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
