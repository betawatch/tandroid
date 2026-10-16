package w2;

import e9.c0;
import e9.k0;
import e9.l0;
import e9.n0;
import e9.r;
import e9.s1;
import e9.x1;
import java.util.ArrayList;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class c implements a {
    public static final c0 b = new c0(new r(new t0.a(19), s1.b), new r(new t0.a(20), s1.c));
    public final ArrayList a = new ArrayList();

    @Override // w2.a
    public final long b(long j10) {
        int i10 = 0;
        long j11 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j12 = ((z3.b) arrayList.get(i10)).b;
            long j13 = ((z3.b) arrayList.get(i10)).d;
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
    public final void clear() {
        this.a.clear();
    }

    @Override // w2.a
    public final n0 d(long j10) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((z3.b) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    z3.b bVar = (z3.b) arrayList.get(i10);
                    if (j10 >= bVar.b && j10 < bVar.d) {
                        arrayList2.add(bVar);
                    }
                    if (j10 < bVar.b) {
                        break;
                    }
                }
                x1 A = n0.A(b, arrayList2);
                k0 t10 = n0.t();
                for (int i11 = 0; i11 < A.d; i11++) {
                    t10.d(((z3.b) A.get(i11)).a);
                }
                return t10.f();
            }
        }
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // w2.a
    public final boolean j(z3.b bVar, long j10) {
        long j11 = bVar.b;
        u6.g(j11 != -9223372036854775807L);
        u6.g(bVar.c != -9223372036854775807L);
        boolean z10 = j11 <= j10 && j10 < bVar.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((z3.b) arrayList.get(size)).b) {
                arrayList.add(size + 1, bVar);
                return z10;
            }
        }
        arrayList.add(0, bVar);
        return z10;
    }

    @Override // w2.a
    public final long p(long j10) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < ((z3.b) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j11 = ((z3.b) arrayList.get(0)).b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j12 = ((z3.b) arrayList.get(i10)).b;
            long j13 = ((z3.b) arrayList.get(i10)).d;
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
    public final void q(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                return;
            }
            long j11 = ((z3.b) arrayList.get(i10)).b;
            if (j10 > j11 && j10 > ((z3.b) arrayList.get(i10)).d) {
                arrayList.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }
}
