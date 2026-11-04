package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class te0 extends org.telegram.ui.Components.oo0 {
    public final /* synthetic */ ue0 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te0(ue0 ue0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.S2 = ue0Var;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        xe0 xe0Var = this.S2.L;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.bd.a0(null, null, 2131749195, org.telegram.messenger.bd.G(i3, "Chats", new Object[0]));
            } else {
                long j10 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j10 == 0 || j10 == xe0Var.getUserConfig().e()) ? org.telegram.messenger.bd.M0(2131749193, null) : org.telegram.messenger.bd.a0(null, null, 2131749192, xe0Var.getMessagesController().B1(j10, true));
            }
            org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(xe0Var).Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(a02));
            Q.r = false;
            Q.k(true);
        }
    }
}
