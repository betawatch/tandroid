package u2;

import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o implements f1 {
    public final e9.a1 a;
    public long b;

    public o(List list, List list2) {
        e9.f0 u10 = e9.i0.u();
        e2.d.b(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            u10.b(new n((f1) list.get(i10), (List) list2.get(i10)));
        }
        this.a = u10.i();
        this.b = -9223372036854775807L;
    }

    @Override // u2.f1
    public final boolean c() {
        int i10 = 0;
        while (true) {
            e9.a1 a1Var = this.a;
            if (i10 >= a1Var.d) {
                return false;
            }
            if (((n) a1Var.get(i10)).a.c()) {
                return true;
            }
            i10++;
        }
    }

    @Override // u2.f1
    public final long d() {
        int i10 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            e9.a1 a1Var = this.a;
            if (i10 >= a1Var.d) {
                break;
            }
            long d = ((n) a1Var.get(i10)).a.d();
            if (d != Long.MIN_VALUE) {
                j3 = Math.min(j3, d);
            }
            i10++;
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // u2.f1
    public final boolean n(i2.q0 q0Var) {
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
                e9.a1 a1Var = this.a;
                if (i10 >= a1Var.d) {
                    break;
                }
                long d10 = ((n) a1Var.get(i10)).a.d();
                boolean z12 = d10 != Long.MIN_VALUE && d10 <= q0Var.a;
                if (d10 == d || z12) {
                    z10 |= ((n) a1Var.get(i10)).a.n(q0Var);
                }
                i10++;
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // u2.f1
    public final long r() {
        int i10 = 0;
        long j3 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        while (true) {
            e9.a1 a1Var = this.a;
            if (i10 >= a1Var.d) {
                break;
            }
            n nVar = (n) a1Var.get(i10);
            long r10 = nVar.a.r();
            e9.i0 i0Var = nVar.b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && r10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, r10);
            }
            if (r10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, r10);
            }
            i10++;
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

    @Override // u2.f1
    public final void u(long j3) {
        int i10 = 0;
        while (true) {
            e9.a1 a1Var = this.a;
            if (i10 >= a1Var.d) {
                return;
            }
            ((n) a1Var.get(i10)).u(j3);
            i10++;
        }
    }
}
