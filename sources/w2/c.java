package w2;

import e9.c0;
import e9.k0;
import e9.l0;
import e9.n0;
import e9.r;
import e9.s1;
import e9.x1;
import java.util.ArrayList;
import th.m1;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements a {
    public static final c0 b = new c0(new r(new m1(16), s1.b), new r(new m1(17), s1.c));
    public final ArrayList a = new ArrayList();

    @Override // w2.a
    public final long a(long j10) {
        int i10 = 0;
        long j11 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j12 = ((z3.a) arrayList.get(i10)).b;
            long j13 = ((z3.a) arrayList.get(i10)).d;
            if (j10 < j12) {
                j11 = j11 == -9223372036854775807L ? j12 : Math.min(j11, j12);
            } else {
                if (j10 < j13) {
                    j11 = j11 == -9223372036854775807L ? j13 : Math.min(j11, j13);
                }
                i10++;
            }
        }
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return Long.MIN_VALUE;
    }

    @Override // w2.a
    public final n0 b(long j10) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((z3.a) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    z3.a aVar = (z3.a) arrayList.get(i10);
                    if (j10 >= aVar.b && j10 < aVar.d) {
                        arrayList2.add(aVar);
                    }
                    if (j10 < aVar.b) {
                        break;
                    }
                }
                x1 A = n0.A(b, arrayList2);
                k0 t10 = n0.t();
                for (int i11 = 0; i11 < A.d; i11++) {
                    t10.d(((z3.a) A.get(i11)).a);
                }
                return t10.f();
            }
        }
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // w2.a
    public final boolean c(z3.a aVar, long j10) {
        long j11 = aVar.b;
        t6.f(j11 != -9223372036854775807L);
        t6.f(aVar.c != -9223372036854775807L);
        boolean z10 = j11 <= j10 && j10 < aVar.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((z3.a) arrayList.get(size)).b) {
                arrayList.add(size + 1, aVar);
                return z10;
            }
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override // w2.a
    public final void clear() {
        this.a.clear();
    }

    @Override // w2.a
    public final long d(long j10) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < ((z3.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j11 = ((z3.a) arrayList.get(0)).b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j12 = ((z3.a) arrayList.get(i10)).b;
            long j13 = ((z3.a) arrayList.get(i10)).d;
            if (j13 > j10) {
                if (j12 > j10) {
                    break;
                }
                j11 = Math.max(j11, j12);
            } else {
                j11 = Math.max(j11, j13);
            }
        }
        return j11;
    }

    @Override // w2.a
    public final void e(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                return;
            }
            long j11 = ((z3.a) arrayList.get(i10)).b;
            if (j10 > j11 && j10 > ((z3.a) arrayList.get(i10)).d) {
                arrayList.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }
}
