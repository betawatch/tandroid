// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z38 extends tca {
    public final /* synthetic */ a58 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z38(a58 a58Var, Context context, String str, String str2, boolean z, pv0 pv0Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z, null, pv0Var);
        this.U2 = a58Var;
    }

    @Override // tca, my0
    public final void H() {
        super.H();
        this.U2.P2 = null;
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            a58 a58Var = this.U2;
            c41 c41Var = new c41(a58Var.S0, this.J0);
            if (vh6Var.m() == 1) {
                long j = vh6Var.j(0);
                if (j == z8c.h(this.a).n) {
                    u31 G = c41Var.G(R.raw.saved_messages, 5000, gm.S2(jb6.a0(null, null, 2131744149, new Object[0])));
                    G.s = false;
                    G.j();
                } else {
                    int i2 = this.a;
                    if (j < 0) {
                        u31 G2 = c41Var.G(R.raw.forward, 5000, gm.S2(jb6.a0(null, null, 2131744162, tL_forumTopic != null ? tL_forumTopic.title : oc7.r1(i2).L0(Long.valueOf(-j)).title)));
                        G2.s = false;
                        G2.j();
                    } else {
                        u31 G3 = c41Var.G(R.raw.forward, 5000, gm.S2(jb6.a0(null, null, 2131744162, oc7.r1(i2).W1(Long.valueOf(j)).first_name)));
                        G3.s = false;
                        G3.j();
                    }
                }
            } else {
                u31 Q = c41Var.Q(R.raw.forward, 36, gm.S2(jb6.G(vh6Var.m(), "StorySharedToManyChats", Integer.valueOf(vh6Var.m()))));
                Q.s = false;
                Q.j();
            }
            try {
                a58Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // tca
    public final void M0(View view) {
        this.U2.b1();
    }
}
