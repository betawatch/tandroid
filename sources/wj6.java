// default package

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wj6 extends tca {
    public final /* synthetic */ xj6 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj6(xj6 xj6Var, Context context, String str, String str2, ylb ylbVar) {
        super(context, null, str, false, str2, false, ylbVar);
        this.U2 = xj6Var;
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String a0;
        ak6 ak6Var = this.U2.L;
        if (z) {
            if (vh6Var == null || vh6Var.m() != 1) {
                a0 = jb6.a0(null, null, 2131748944, jb6.G(i, "Chats", new Object[0]));
            } else {
                long j = ((TLRPC.Dialog) vh6Var.n(0)).id;
                a0 = (j == 0 || j == ak6Var.getUserConfig().e()) ? jb6.M0(2131748942, null) : jb6.a0(null, null, 2131748941, ak6Var.getMessagesController().z1(j, true));
            }
            u31 Q = c41.b0(ak6Var).Q(R.raw.forward, 36, gm.S2(a0));
            Q.s = false;
            Q.k(true);
        }
    }
}
