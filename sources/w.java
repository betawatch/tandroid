// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class w extends kea {
    public final /* synthetic */ b1 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b1 b1Var, Context context, String str, String str2, vnb vnbVar) {
        super(context, null, str, false, str2, false, vnbVar);
        this.U2 = b1Var;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        FrameLayout frameLayout = this.U2.D2;
        if (z) {
            d31 d31Var = new d31(frameLayout, this.J0);
            if (zh6Var.m() == 1) {
                long j = zh6Var.j(0);
                if (j == yac.h(this.a).n) {
                    v21 G = d31Var.G(R.raw.saved_messages, 5000, hl.S2(ob6.a0(null, null, 2131754964, new Object[0])));
                    G.s = false;
                    G.j();
                } else {
                    int i2 = this.a;
                    if (j < 0) {
                        v21 G2 = d31Var.G(R.raw.forward, 5000, hl.S2(ob6.a0(null, null, 2131754968, tL_forumTopic != null ? tL_forumTopic.title : uc7.s1(i2).M0(Long.valueOf(-j)).title)));
                        G2.s = false;
                        G2.j();
                    } else {
                        v21 G3 = d31Var.G(R.raw.forward, 5000, hl.S2(ob6.a0(null, null, 2131754968, uc7.s1(i2).X1(Long.valueOf(j)).first_name)));
                        G3.s = false;
                        G3.j();
                    }
                }
            } else {
                v21 Q = d31Var.Q(R.raw.forward, 36, hl.S2(ob6.G(zh6Var.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(zh6Var.m()))));
                Q.s = false;
                Q.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
