package x2;

import android.util.Pair;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class w extends r1 {
    public final int l;
    public final HashMap m;
    public final HashMap n;

    public w(a aVar) {
        super(new a0(aVar, false));
        this.l = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m = new HashMap();
        this.n = new HashMap();
    }

    @Override // x2.r1
    public final void A(e2.l1 l1Var) {
        int i7 = this.l;
        n(i7 != Integer.MAX_VALUE ? new v(l1Var, i7) : new u(l1Var, 0));
    }

    @Override // x2.a
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        int i7 = this.l;
        a aVar = this.k;
        if (i7 == Integer.MAX_VALUE) {
            return aVar.c(f0Var, mVar, j3);
        }
        Object obj = f0Var.a;
        int i10 = l2.a.g;
        f0 a10 = f0Var.a(((Pair) obj).second);
        this.m.put(a10, f0Var);
        d0 c10 = aVar.c(a10, mVar, j3);
        this.n.put(c10, a10);
        return c10;
    }

    @Override // x2.r1, x2.a
    public final e2.l1 h() {
        a0 a0Var = (a0) this.k;
        int i7 = this.l;
        return i7 != Integer.MAX_VALUE ? new v(a0Var.o, i7) : new u(a0Var.o, 0);
    }

    @Override // x2.r1, x2.a
    public final boolean j() {
        return false;
    }

    @Override // x2.a
    public final void o(d0 d0Var) {
        this.k.o(d0Var);
        f0 f0Var = (f0) this.n.remove(d0Var);
        if (f0Var != null) {
            this.m.remove(f0Var);
        }
    }

    @Override // x2.r1
    public final f0 z(f0 f0Var) {
        return this.l != Integer.MAX_VALUE ? (f0) this.m.get(f0Var) : f0Var;
    }
}
