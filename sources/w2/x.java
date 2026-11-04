package w2;

import android.util.Pair;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x extends t1 {
    public final int l;
    public final HashMap m;
    public final HashMap n;

    public x(a aVar) {
        super(new b0(aVar, false));
        this.l = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m = new HashMap();
        this.n = new HashMap();
    }

    @Override // w2.t1
    public final void A(d2.n1 n1Var) {
        int i3 = this.l;
        n(i3 != Integer.MAX_VALUE ? new w(n1Var, i3) : new v(n1Var, 0));
    }

    @Override // w2.a
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        int i3 = this.l;
        a aVar = this.k;
        if (i3 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, a0Var, j10);
        }
        Object obj = g0Var.a;
        int i10 = k2.a.g;
        g0 a10 = g0Var.a(((Pair) obj).second);
        this.m.put(a10, g0Var);
        e0 c2 = aVar.c(a10, a0Var, j10);
        this.n.put(c2, a10);
        return c2;
    }

    @Override // w2.t1, w2.a
    public final d2.n1 h() {
        b0 b0Var = (b0) this.k;
        int i3 = this.l;
        return i3 != Integer.MAX_VALUE ? new w(b0Var.o, i3) : new v(b0Var.o, 0);
    }

    @Override // w2.t1, w2.a
    public final boolean j() {
        return false;
    }

    @Override // w2.a
    public final void o(e0 e0Var) {
        this.k.o(e0Var);
        g0 g0Var = (g0) this.n.remove(e0Var);
        if (g0Var != null) {
            this.m.remove(g0Var);
        }
    }

    @Override // w2.t1
    public final g0 z(g0 g0Var) {
        return this.l != Integer.MAX_VALUE ? (g0) this.m.get(g0Var) : g0Var;
    }
}
