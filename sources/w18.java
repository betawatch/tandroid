// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class w18 extends taa {
    public final /* synthetic */ y28 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w18(y28 y28Var, Context context, String str, String str2, boolean z, gu0 gu0Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z, null, gu0Var);
        this.U2 = y28Var;
    }

    @Override // taa, fx0
    public final void I() {
        super.I();
        this.U2.P2 = null;
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            y28 y28Var = this.U2;
            u21 u21Var = new u21(y28Var.S0, this.J0);
            if (vf6Var.m() == 1) {
                long j = vf6Var.j(0);
                if (j == y6c.h(this.a).n) {
                    m21 G = u21Var.G(R.raw.saved_messages, 5000, gl.T2(k96.a0(null, null, 2131744223, new Object[0])));
                    G.r = false;
                    G.j();
                } else {
                    int i2 = this.a;
                    if (j < 0) {
                        m21 G2 = u21Var.G(R.raw.forward, 5000, gl.T2(k96.a0(null, null, 2131744236, tL_forumTopic != null ? tL_forumTopic.title : na7.q1(i2).K0(Long.valueOf(-j)).title)));
                        G2.r = false;
                        G2.j();
                    } else {
                        m21 G3 = u21Var.G(R.raw.forward, 5000, gl.T2(k96.a0(null, null, 2131744236, na7.q1(i2).V1(Long.valueOf(j)).first_name)));
                        G3.r = false;
                        G3.j();
                    }
                }
            } else {
                m21 Q = u21Var.Q(R.raw.forward, 36, gl.T2(k96.G(vf6Var.m(), "StorySharedToManyChats", Integer.valueOf(vf6Var.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                y28Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // taa
    public final void M0(View view) {
        this.U2.b1();
    }
}
