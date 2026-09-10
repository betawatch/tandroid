package u2;

import android.util.Pair;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class x extends r1 {
    public final int l;
    public final HashMap m;
    public final HashMap n;

    public x(a aVar) {
        super(new b0(aVar, false));
        this.l = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m = new HashMap();
        this.n = new HashMap();
    }

    @Override // u2.r1
    public final void A(b2.k1 k1Var) {
        int i10 = this.l;
        n(i10 != Integer.MAX_VALUE ? new w(k1Var, i10) : new v(k1Var, 0));
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, y2.d dVar, long j3) {
        int i10 = this.l;
        a aVar = this.k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, dVar, j3);
        }
        Object obj = g0Var.a;
        int i11 = i2.a.g;
        g0 a2 = g0Var.a(((Pair) obj).second);
        this.m.put(a2, g0Var);
        e0 c10 = aVar.c(a2, dVar, j3);
        this.n.put(c10, a2);
        return c10;
    }

    @Override // u2.r1, u2.a
    public final b2.k1 h() {
        b0 b0Var = (b0) this.k;
        int i10 = this.l;
        return i10 != Integer.MAX_VALUE ? new w(b0Var.o, i10) : new v(b0Var.o, 0);
    }

    @Override // u2.r1, u2.a
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

    @Override // u2.r1
    public final g0 z(g0 g0Var) {
        return this.l != Integer.MAX_VALUE ? (g0) this.m.get(g0Var) : g0Var;
    }
}
