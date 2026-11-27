// default package

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yj6 extends kea {
    public final /* synthetic */ zj6 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj6(zj6 zj6Var, Context context, String str, String str2, vnb vnbVar) {
        super(context, null, str, false, str2, false, vnbVar);
        this.U2 = zj6Var;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String a0;
        ck6 ck6Var = this.U2.L;
        if (z) {
            if (zh6Var == null || zh6Var.m() != 1) {
                a0 = ob6.a0(null, null, 2131748941, ob6.G(i, "Chats", new Object[0]));
            } else {
                long j = ((TLRPC.Dialog) zh6Var.n(0)).id;
                a0 = (j == 0 || j == ck6Var.getUserConfig().e()) ? ob6.M0(2131748939, null) : ob6.a0(null, null, 2131748938, ck6Var.getMessagesController().A1(j, true));
            }
            v21 Q = d31.b0(ck6Var).Q(R.raw.forward, 36, hl.S2(a0));
            Q.s = false;
            Q.k(true);
        }
    }
}
