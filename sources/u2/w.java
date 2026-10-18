package u2;

import android.util.Pair;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class w extends s1 {
    public final int l;
    public final HashMap m;
    public final HashMap n;

    public w(a aVar) {
        super(new a0(aVar, false));
        this.l = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m = new HashMap();
        this.n = new HashMap();
    }

    @Override // u2.s1
    public final void A(b2.o1 o1Var) {
        int i10 = this.l;
        n(i10 != Integer.MAX_VALUE ? new v(o1Var, i10) : new u(o1Var, 0));
    }

    @Override // u2.a
    public final d0 c(f0 f0Var, androidx.biometric.e eVar, long j10) {
        int i10 = this.l;
        a aVar = this.k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(f0Var, eVar, j10);
        }
        Object obj = f0Var.a;
        int i11 = i2.a.g;
        f0 a2 = f0Var.a(((Pair) obj).second);
        this.m.put(a2, f0Var);
        d0 c10 = aVar.c(a2, eVar, j10);
        this.n.put(c10, a2);
        return c10;
    }

    @Override // u2.s1, u2.a
    public final b2.o1 h() {
        a0 a0Var = (a0) this.k;
        int i10 = this.l;
        return i10 != Integer.MAX_VALUE ? new v(a0Var.o, i10) : new u(a0Var.o, 0);
    }

    @Override // u2.s1, u2.a
    public final boolean j() {
        return false;
    }

    @Override // u2.a
    public final void o(d0 d0Var) {
        this.k.o(d0Var);
        f0 f0Var = (f0) this.n.remove(d0Var);
        if (f0Var != null) {
            this.m.remove(f0Var);
        }
    }

    @Override // u2.s1
    public final f0 z(f0 f0Var) {
        return this.l != Integer.MAX_VALUE ? (f0) this.m.get(f0Var) : f0Var;
    }
}
