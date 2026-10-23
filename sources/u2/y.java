package u2;

import android.util.Pair;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class y extends v1 {
    public final int l;
    public final HashMap m;
    public final HashMap n;

    public y(a aVar) {
        super(new c0(aVar, false));
        this.l = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.m = new HashMap();
        this.n = new HashMap();
    }

    @Override // u2.v1
    public final void A(b2.o1 o1Var) {
        int i10 = this.l;
        n(i10 != Integer.MAX_VALUE ? new x(o1Var, i10) : new w(o1Var, 0));
    }

    @Override // u2.a
    public final f0 c(h0 h0Var, androidx.biometric.e eVar, long j10) {
        int i10 = this.l;
        a aVar = this.k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(h0Var, eVar, j10);
        }
        Object obj = h0Var.a;
        int i11 = i2.a.g;
        h0 a2 = h0Var.a(((Pair) obj).second);
        this.m.put(a2, h0Var);
        f0 c10 = aVar.c(a2, eVar, j10);
        this.n.put(c10, a2);
        return c10;
    }

    @Override // u2.v1, u2.a
    public final b2.o1 h() {
        c0 c0Var = (c0) this.k;
        int i10 = this.l;
        return i10 != Integer.MAX_VALUE ? new x(c0Var.o, i10) : new w(c0Var.o, 0);
    }

    @Override // u2.v1, u2.a
    public final boolean j() {
        return false;
    }

    @Override // u2.a
    public final void o(f0 f0Var) {
        this.k.o(f0Var);
        h0 h0Var = (h0) this.n.remove(f0Var);
        if (h0Var != null) {
            this.m.remove(h0Var);
        }
    }

    @Override // u2.v1
    public final h0 z(h0 h0Var) {
        return this.l != Integer.MAX_VALUE ? (h0) this.m.get(h0Var) : h0Var;
    }
}
