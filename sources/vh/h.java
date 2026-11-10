package vh;

import android.app.Activity;
import hi.u1;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.k;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.e51;
import org.telegram.ui.q41;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h extends ma {
    public m41 S1;
    public final q41 T1;
    public boolean U1;
    public int V1;

    public h(Activity activity, h6 h6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, h6Var);
        v0(m6.w0(m6.a7, h6Var));
        this.x = true;
        this.n = false;
        this.F1 = false;
        this.E1 = g0.L(12.0f);
        this.T1 = e51.i0(tL_statsPollStats.votes_graph, id.M0(2131747119, null), 2, false);
        pj0 pj0Var = this.n1;
        int i7 = this.t0;
        pj0Var.setPadding(i7, 0, i7, g0.n);
        this.n1.setClipToPadding(false);
        this.n1.setSections(true);
        y s5 = this.o1.s();
        s5.a(-1, R.drawable.ic_close_white);
        s5.setTranslationX(-g0.L(5.0f));
        this.S1.O(false);
    }

    public static int d1(int i7, long j3, int i10, k kVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = qp.s1(i7).j1(j3);
        tL_statsGetPollStats.msg_id = i10;
        return ConnectionsManager.getInstance(i7).sendRequestTyped(tL_statsGetPollStats, new d3.b(1), new u1(kVar, 24));
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.a, 0, true, new u1(this, 23), this.I0);
        this.S1 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return id.M0(2131747120, null);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            int w02 = m6.w0(m6.a7, this.I0);
            if (this.U1 && w02 == this.V1) {
                return;
            }
            this.U1 = true;
            this.V1 = w02;
            v0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
