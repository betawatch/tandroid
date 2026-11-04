package wh;

import android.app.Activity;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.x;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.d41;
import org.telegram.ui.r41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i extends ma {
    public f41 Q1;
    public final d41 R1;
    public boolean S1;
    public int T1;

    public i(Activity activity, e6 e6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, e6Var);
        v0(k6.w0(k6.a7, e6Var));
        this.x = true;
        this.n = false;
        this.D1 = false;
        this.C1 = g0.L(12.0f);
        this.R1 = r41.i0(tL_statsPollStats.votes_graph, bd.M0(2131747127, null), 2, false);
        tj0 tj0Var = this.l1;
        int i3 = this.u0;
        tj0Var.setPadding(i3, 0, i3, g0.n);
        this.l1.setClipToPadding(false);
        this.l1.setSections(true);
        x q10 = this.m1.q();
        q10.a(-1, R.drawable.ic_close_white);
        q10.setTranslationX(-g0.L(5.0f));
        this.Q1.O(false);
    }

    public static int d1(int i3, long j10, int i10, mi.f fVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = hp.s1(i3).j1(j10);
        tL_statsGetPollStats.msg_id = i10;
        return ConnectionsManager.getInstance(i3).sendRequestTyped(tL_statsGetPollStats, new c3.b(1), new org.telegram.ui.web.b(fVar, 4));
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.a, 0, true, new org.telegram.ui.web.b(this, 3), this.J0);
        this.Q1 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return bd.M0(2131747128, null);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            int w02 = k6.w0(k6.a7, this.J0);
            if (this.S1 && w02 == this.T1) {
                return;
            }
            this.S1 = true;
            this.T1 = w02;
            v0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
