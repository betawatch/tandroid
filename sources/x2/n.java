package x2;

import a8.ma;
import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class n implements f1 {
    public final h9.s1 a;
    public long b;

    public n(List list, List list2) {
        h9.f0 p10 = h9.i0.p();
        ma.f(list.size() == list2.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            p10.c(new m((f1) list.get(i7), (List) list2.get(i7)));
        }
        this.a = p10.f();
        this.b = -9223372036854775807L;
    }

    @Override // x2.f1
    public final boolean d(l2.t0 t0Var) {
        boolean z10;
        boolean z11 = false;
        do {
            long f10 = f();
            if (f10 == Long.MIN_VALUE) {
                return z11;
            }
            int i7 = 0;
            z10 = false;
            while (true) {
                h9.s1 s1Var = this.a;
                if (i7 >= s1Var.d) {
                    break;
                }
                long f11 = ((m) s1Var.get(i7)).a.f();
                boolean z12 = f11 != Long.MIN_VALUE && f11 <= t0Var.a;
                if (f11 == f10 || z12) {
                    z10 |= ((m) s1Var.get(i7)).a.d(t0Var);
                }
                i7++;
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // x2.f1
    public final long f() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            h9.s1 s1Var = this.a;
            if (i7 >= s1Var.d) {
                break;
            }
            long f10 = ((m) s1Var.get(i7)).a.f();
            if (f10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, f10);
            }
            i7++;
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // x2.f1
    public final boolean g() {
        int i7 = 0;
        while (true) {
            h9.s1 s1Var = this.a;
            if (i7 >= s1Var.d) {
                return false;
            }
            if (((m) s1Var.get(i7)).a.g()) {
                return true;
            }
            i7++;
        }
    }

    @Override // x2.f1
    public final long r() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        while (true) {
            h9.s1 s1Var = this.a;
            if (i7 >= s1Var.d) {
                break;
            }
            m mVar = (m) s1Var.get(i7);
            long r10 = mVar.a.r();
            h9.i0 i0Var = mVar.b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && r10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, r10);
            }
            if (r10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, r10);
            }
            i7++;
        }
        if (j3 != Long.MAX_VALUE) {
            this.b = j3;
            return j3;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j11 = this.b;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // x2.f1
    public final void u(long j3) {
        int i7 = 0;
        while (true) {
            h9.s1 s1Var = this.a;
            if (i7 >= s1Var.d) {
                return;
            }
            ((m) s1Var.get(i7)).u(j3);
            i7++;
        }
    }
}
