// default package

import android.app.Activity;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xe8 extends fy0 {
    public l5c S1;
    public final gxa T1;
    public boolean U1;
    public int V1;

    public xe8(Activity activity, wjb wjbVar, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, wjbVar);
        s0(bkb.v0(bkb.Z6, wjbVar));
        this.x = true;
        this.n = false;
        this.F1 = false;
        this.E1 = gl.L(12.0f);
        this.T1 = uxa.f0(tL_statsPollStats.votes_graph, k96.M0(2131746926, null), 2, false);
        o39 o39Var = this.n1;
        int i = this.u0;
        o39Var.setPadding(i, 0, i, gl.n);
        this.n1.setClipToPadding(false);
        this.n1.setSections(true);
        r6 t = this.o1.t();
        t.a(-1, R.drawable.ic_close_white);
        t.setTranslationX(-gl.L(5.0f));
        this.S1.O(false);
    }

    public static int Y0(int i, long j, int i2, x0 x0Var) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = na7.q1(i).h1(j);
        tL_statsGetPollStats.msg_id = i2;
        return ConnectionsManager.getInstance(i).sendRequestTyped(tL_statsGetPollStats, new hc((byte) 0), new ur4((Object) x0Var, (byte) 29));
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, true, new ur4((Object) this, (byte) 28), this.J0);
        this.S1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        return k96.M0(2131746927, null);
    }

    @Override // fx0
    public final void p0() {
        super.p0();
        try {
            int v0 = bkb.v0(bkb.Z6, this.J0);
            if (this.U1 && v0 == this.V1) {
                return;
            }
            this.U1 = true;
            this.V1 = v0;
            s0(v0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
