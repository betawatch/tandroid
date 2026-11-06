package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ye0 extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ ze0 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye0(ze0 ze0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.R2 = ze0Var;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String a02;
        cf0 cf0Var = this.R2.K;
        if (z9) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.hd.a0(null, null, 2131749186, org.telegram.messenger.hd.G(i7, "Chats", new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j3 == 0 || j3 == cf0Var.getUserConfig().e()) ? org.telegram.messenger.hd.M0(2131749184, null) : org.telegram.messenger.hd.a0(null, null, 2131749183, cf0Var.getMessagesController().B1(j3, true));
            }
            org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(cf0Var).Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(a02));
            Q.r = false;
            Q.k(true);
        }
    }
}
