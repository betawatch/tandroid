// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w extends tca {
    public final /* synthetic */ a1 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a1 a1Var, Context context, String str, String str2, ylb ylbVar) {
        super(context, null, str, false, str2, false, ylbVar);
        this.U2 = a1Var;
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        FrameLayout frameLayout = this.U2.D2;
        if (z) {
            c41 c41Var = new c41(frameLayout, this.J0);
            if (vh6Var.m() == 1) {
                long j = vh6Var.j(0);
                if (j == z8c.h(this.a).n) {
                    u31 G = c41Var.G(R.raw.saved_messages, 5000, gm.S2(jb6.a0(null, null, 2131754967, new Object[0])));
                    G.s = false;
                    G.j();
                } else {
                    int i2 = this.a;
                    if (j < 0) {
                        u31 G2 = c41Var.G(R.raw.forward, 5000, gm.S2(jb6.a0(null, null, 2131754971, tL_forumTopic != null ? tL_forumTopic.title : oc7.r1(i2).L0(Long.valueOf(-j)).title)));
                        G2.s = false;
                        G2.j();
                    } else {
                        u31 G3 = c41Var.G(R.raw.forward, 5000, gm.S2(jb6.a0(null, null, 2131754971, oc7.r1(i2).W1(Long.valueOf(j)).first_name)));
                        G3.s = false;
                        G3.j();
                    }
                }
            } else {
                u31 Q = c41Var.Q(R.raw.forward, 36, gm.S2(jb6.G(vh6Var.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(vh6Var.m()))));
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
