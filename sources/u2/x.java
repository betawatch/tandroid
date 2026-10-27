package u2;

import android.util.Pair;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    @Override // u2.t1
    public final void A(b2.p1 p1Var) {
        int i10 = this.l;
        n(i10 != Integer.MAX_VALUE ? new w(p1Var, i10) : new v(p1Var, 0));
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, a8.h0 h0Var, long j10) {
        int i10 = this.l;
        a aVar = this.k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, h0Var, j10);
        }
        Object obj = g0Var.a;
        int i11 = i2.a.g;
        g0 a2 = g0Var.a(((Pair) obj).second);
        this.m.put(a2, g0Var);
        e0 c10 = aVar.c(a2, h0Var, j10);
        this.n.put(c10, a2);
        return c10;
    }

    @Override // u2.t1, u2.a
    public final b2.p1 h() {
        b0 b0Var = (b0) this.k;
        int i10 = this.l;
        return i10 != Integer.MAX_VALUE ? new w(b0Var.o, i10) : new v(b0Var.o, 0);
    }

    @Override // u2.t1, u2.a
    public final boolean j() {
        return false;
    }

    @Override // u2.a
    public final void o(e0 e0Var) {
        this.k.o(e0Var);
        g0 g0Var = (g0) this.n.remove(e0Var);
        if (g0Var != null) {
            this.m.remove(g0Var);
        }
    }

    @Override // u2.t1
    public final g0 z(g0 g0Var) {
        return this.l != Integer.MAX_VALUE ? (g0) this.m.get(g0Var) : g0Var;
    }
}
