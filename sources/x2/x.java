package x2;

import android.util.Pair;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class x extends s1 {
    public final int l;
    public final HashMap m;
    public final HashMap n;

    public x(a aVar) {
        super(new b0(aVar, false));
        this.l = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m = new HashMap();
        this.n = new HashMap();
    }

    @Override // x2.s1
    public final void A(e2.l1 l1Var) {
        int i7 = this.l;
        n(i7 != Integer.MAX_VALUE ? new w(l1Var, i7) : new v(l1Var, 0));
    }

    @Override // x2.a
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        int i7 = this.l;
        a aVar = this.k;
        if (i7 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, mVar, j3);
        }
        Object obj = g0Var.a;
        int i10 = l2.a.g;
        g0 a10 = g0Var.a(((Pair) obj).second);
        this.m.put(a10, g0Var);
        e0 c10 = aVar.c(a10, mVar, j3);
        this.n.put(c10, a10);
        return c10;
    }

    @Override // x2.s1, x2.a
    public final e2.l1 h() {
        b0 b0Var = (b0) this.k;
        int i7 = this.l;
        return i7 != Integer.MAX_VALUE ? new w(b0Var.o, i7) : new v(b0Var.o, 0);
    }

    @Override // x2.s1, x2.a
    public final boolean j() {
        return false;
    }

    @Override // x2.a
    public final void o(e0 e0Var) {
        this.k.o(e0Var);
        g0 g0Var = (g0) this.n.remove(e0Var);
        if (g0Var != null) {
            this.m.remove(g0Var);
        }
    }

    @Override // x2.s1
    public final g0 z(g0 g0Var) {
        return this.l != Integer.MAX_VALUE ? (g0) this.m.get(g0Var) : g0Var;
    }
}
