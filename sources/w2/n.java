package w2;

import b8.zb;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n implements f1 {
    public final g9.s1 a;
    public long b;

    public n(List list, List list2) {
        g9.f0 p10 = g9.i0.p();
        zb.f(list.size() == list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            p10.c(new m((f1) list.get(i3), (List) list2.get(i3)));
        }
        this.a = p10.f();
        this.b = -9223372036854775807L;
    }

    @Override // w2.f1
    public final boolean c(k2.v0 v0Var) {
        boolean z10;
        boolean z11 = false;
        do {
            long e10 = e();
            if (e10 == Long.MIN_VALUE) {
                return z11;
            }
            int i3 = 0;
            z10 = false;
            while (true) {
                g9.s1 s1Var = this.a;
                if (i3 >= s1Var.d) {
                    break;
                }
                long e11 = ((m) s1Var.get(i3)).a.e();
                boolean z12 = e11 != Long.MIN_VALUE && e11 <= v0Var.a;
                if (e11 == e10 || z12) {
                    z10 |= ((m) s1Var.get(i3)).a.c(v0Var);
                }
                i3++;
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // w2.f1
    public final boolean d() {
        int i3 = 0;
        while (true) {
            g9.s1 s1Var = this.a;
            if (i3 >= s1Var.d) {
                return false;
            }
            if (((m) s1Var.get(i3)).a.d()) {
                return true;
            }
            i3++;
        }
    }

    @Override // w2.f1
    public final long e() {
        int i3 = 0;
        long j10 = Long.MAX_VALUE;
        while (true) {
            g9.s1 s1Var = this.a;
            if (i3 >= s1Var.d) {
                break;
            }
            long e10 = ((m) s1Var.get(i3)).a.e();
            if (e10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, e10);
            }
            i3++;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // w2.f1
    public final long q() {
        int i3 = 0;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        while (true) {
            g9.s1 s1Var = this.a;
            if (i3 >= s1Var.d) {
                break;
            }
            m mVar = (m) s1Var.get(i3);
            long q10 = mVar.a.q();
            g9.i0 i0Var = mVar.b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && q10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, q10);
            }
            if (q10 != Long.MIN_VALUE) {
                j11 = Math.min(j11, q10);
            }
            i3++;
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

    @Override // w2.f1
    public final void t(long j10) {
        int i3 = 0;
        while (true) {
            g9.s1 s1Var = this.a;
            if (i3 >= s1Var.d) {
                return;
            }
            ((m) s1Var.get(i3)).t(j10);
            i3++;
        }
    }
}
