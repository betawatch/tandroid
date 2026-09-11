package u2;

import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class n implements d1 {
    public final e9.a1 a;
    public long b;

    public n(List list, List list2) {
        e9.f0 u10 = e9.i0.u();
        e2.d.b(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            u10.b(new m((d1) list.get(i10), (List) list2.get(i10)));
        }
        this.a = u10.i();
        this.b = -9223372036854775807L;
    }

    @Override // u2.d1
    public final boolean c() {
        int i10 = 0;
        while (true) {
            e9.a1 a1Var = this.a;
            if (i10 >= a1Var.d) {
                return false;
            }
            if (((m) a1Var.get(i10)).a.c()) {
                return true;
            }
            i10++;
        }
    }

    @Override // u2.d1
    public final long d() {
        int i10 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            e9.a1 a1Var = this.a;
            if (i10 >= a1Var.d) {
                break;
            }
            long d = ((m) a1Var.get(i10)).a.d();
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

    @Override // u2.d1
    public final boolean p(i2.r0 r0Var) {
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
                long d10 = ((m) a1Var.get(i10)).a.d();
                boolean z12 = d10 != Long.MIN_VALUE && d10 <= r0Var.a;
                if (d10 == d || z12) {
                    z10 |= ((m) a1Var.get(i10)).a.p(r0Var);
                }
                i10++;
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // u2.d1
    public final long s() {
        int i10 = 0;
        long j3 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        while (true) {
            e9.a1 a1Var = this.a;
            if (i10 >= a1Var.d) {
                break;
            }
            m mVar = (m) a1Var.get(i10);
            long s10 = mVar.a.s();
            e9.i0 i0Var = mVar.b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && s10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, s10);
            }
            if (s10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, s10);
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

    @Override // u2.d1
    public final void u(long j3) {
        int i10 = 0;
        while (true) {
            e9.a1 a1Var = this.a;
            if (i10 >= a1Var.d) {
                return;
            }
            ((m) a1Var.get(i10)).u(j3);
            i10++;
        }
    }
}
