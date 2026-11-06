package x2;

import a8.ia;
import h9.t1;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class n implements e1 {
    public final t1 a;
    public long b;

    public n(List list, List list2) {
        h9.f0 p10 = h9.i0.p();
        ia.f(list.size() == list2.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            p10.c(new m((e1) list.get(i7), (List) list2.get(i7)));
        }
        this.a = p10.f();
        this.b = -9223372036854775807L;
    }

    @Override // x2.e1
    public final boolean c(l2.v0 v0Var) {
        boolean z9;
        boolean z10 = false;
        do {
            long e10 = e();
            if (e10 == Long.MIN_VALUE) {
                return z10;
            }
            int i7 = 0;
            z9 = false;
            while (true) {
                t1 t1Var = this.a;
                if (i7 >= t1Var.d) {
                    break;
                }
                long e11 = ((m) t1Var.get(i7)).a.e();
                boolean z11 = e11 != Long.MIN_VALUE && e11 <= v0Var.a;
                if (e11 == e10 || z11) {
                    z9 |= ((m) t1Var.get(i7)).a.c(v0Var);
                }
                i7++;
            }
            z10 |= z9;
        } while (z9);
        return z10;
    }

    @Override // x2.e1
    public final long e() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            t1 t1Var = this.a;
            if (i7 >= t1Var.d) {
                break;
            }
            long e10 = ((m) t1Var.get(i7)).a.e();
            if (e10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, e10);
            }
            i7++;
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // x2.e1
    public final boolean g() {
        int i7 = 0;
        while (true) {
            t1 t1Var = this.a;
            if (i7 >= t1Var.d) {
                return false;
            }
            if (((m) t1Var.get(i7)).a.g()) {
                return true;
            }
            i7++;
        }
    }

    @Override // x2.e1
    public final long p() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        while (true) {
            t1 t1Var = this.a;
            if (i7 >= t1Var.d) {
                break;
            }
            m mVar = (m) t1Var.get(i7);
            long p10 = mVar.a.p();
            h9.i0 i0Var = mVar.b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && p10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, p10);
            }
            if (p10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, p10);
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

    @Override // x2.e1
    public final void r(long j3) {
        int i7 = 0;
        while (true) {
            t1 t1Var = this.a;
            if (i7 >= t1Var.d) {
                return;
            }
            ((m) t1Var.get(i7)).r(j3);
            i7++;
        }
    }
}
