package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class wb1 extends org.telegram.ui.Components.fr0 {
    public final /* synthetic */ yb1 c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb1(yb1 yb1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.c1 = yb1Var;
    }

    @Override // org.telegram.ui.Components.fr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            yb1 yb1Var = this.c1;
            if (m10 == 1) {
                yb1Var.a.l0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                yb1Var.a.l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
