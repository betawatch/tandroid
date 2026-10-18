package u2;

import e9.x1;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class n implements e1 {
    public final x1 a;
    public long b;

    public n(List list, List list2) {
        e9.k0 t10 = e9.n0.t();
        u6.g(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            t10.c(new m((e1) list.get(i10), (List) list2.get(i10)));
        }
        this.a = t10.f();
        this.b = -9223372036854775807L;
    }

    @Override // u2.e1
    public final boolean c() {
        int i10 = 0;
        while (true) {
            x1 x1Var = this.a;
            if (i10 >= x1Var.d) {
                return false;
            }
            if (((m) x1Var.get(i10)).a.c()) {
                return true;
            }
            i10++;
        }
    }

    @Override // u2.e1
    public final long d() {
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        while (true) {
            x1 x1Var = this.a;
            if (i10 >= x1Var.d) {
                break;
            }
            long d = ((m) x1Var.get(i10)).a.d();
            if (d != Long.MIN_VALUE) {
                j10 = Math.min(j10, d);
            }
            i10++;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // u2.e1
    public final boolean p(i2.u0 u0Var) {
        boolean z10;
        boolean z11 = false;
        do {
            long d = d();
            if (d == Long.MIN_VALUE) {
                return z11;
            }
            int i10 = 0;
            z10 = false;
            while (true) {
                x1 x1Var = this.a;
                if (i10 >= x1Var.d) {
                    break;
                }
                long d10 = ((m) x1Var.get(i10)).a.d();
                boolean z12 = d10 != Long.MIN_VALUE && d10 <= u0Var.a;
                if (d10 == d || z12) {
                    z10 |= ((m) x1Var.get(i10)).a.p(u0Var);
                }
                i10++;
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // u2.e1
    public final long s() {
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        while (true) {
            x1 x1Var = this.a;
            if (i10 >= x1Var.d) {
                break;
            }
            m mVar = (m) x1Var.get(i10);
            long s10 = mVar.a.s();
            e9.n0 n0Var = mVar.b;
            if ((n0Var.contains(1) || n0Var.contains(2) || n0Var.contains(4)) && s10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, s10);
            }
            if (s10 != Long.MIN_VALUE) {
                j11 = Math.min(j11, s10);
            }
            i10++;
        }
        if (j10 != Long.MAX_VALUE) {
            this.b = j10;
            return j10;
        }
        if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j12 = this.b;
        return j12 != -9223372036854775807L ? j12 : j11;
    }

    @Override // u2.e1
    public final void u(long j10) {
        int i10 = 0;
        while (true) {
            x1 x1Var = this.a;
            if (i10 >= x1Var.d) {
                return;
            }
            ((m) x1Var.get(i10)).u(j10);
            i10++;
        }
    }
}
