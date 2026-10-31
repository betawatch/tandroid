package u2;

import e9.x1;
import java.util.List;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n implements f1 {
    public final x1 a;
    public long b;

    public n(List list, List list2) {
        e9.k0 t10 = e9.n0.t();
        t6.f(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            t10.c(new m((f1) list.get(i10), (List) list2.get(i10)));
        }
        this.a = t10.f();
        this.b = -9223372036854775807L;
    }

    @Override // u2.f1
    public final long c() {
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        while (true) {
            x1 x1Var = this.a;
            if (i10 >= x1Var.d) {
                break;
            }
            long c10 = ((m) x1Var.get(i10)).a.c();
            if (c10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, c10);
            }
            i10++;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // u2.f1
    public final boolean d() {
        int i10 = 0;
        while (true) {
            x1 x1Var = this.a;
            if (i10 >= x1Var.d) {
                return false;
            }
            if (((m) x1Var.get(i10)).a.d()) {
                return true;
            }
            i10++;
        }
    }

    @Override // u2.f1
    public final boolean m(i2.w0 w0Var) {
        boolean z10;
        boolean z11 = false;
        do {
            long c10 = c();
            if (c10 == Long.MIN_VALUE) {
                return z11;
            }
            int i10 = 0;
            z10 = false;
            while (true) {
                x1 x1Var = this.a;
                if (i10 >= x1Var.d) {
                    break;
                }
                long c11 = ((m) x1Var.get(i10)).a.c();
                boolean z12 = c11 != Long.MIN_VALUE && c11 <= w0Var.a;
                if (c11 == c10 || z12) {
                    z10 |= ((m) x1Var.get(i10)).a.m(w0Var);
                }
                i10++;
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // u2.f1
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

    @Override // u2.f1
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
