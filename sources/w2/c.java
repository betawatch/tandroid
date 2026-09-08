package w2;

import e9.a0;
import e9.a1;
import e9.f0;
import e9.g0;
import e9.i0;
import e9.p;
import e9.x0;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c implements a {
    public static final a0 b = new a0(new p(new t0.a(16), x0.b), new p(new t0.a(17), x0.c));
    public final ArrayList a = new ArrayList();

    @Override // w2.a
    public final long a(long j3) {
        int i10 = 0;
        long j10 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j11 = ((z3.a) arrayList.get(i10)).b;
            long j12 = ((z3.a) arrayList.get(i10)).d;
            if (j3 < j11) {
                j10 = j10 == -9223372036854775807L ? j11 : Math.min(j10, j11);
            } else {
                if (j3 < j12) {
                    j10 = j10 == -9223372036854775807L ? j12 : Math.min(j10, j12);
                }
                i10++;
            }
        }
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        return Long.MIN_VALUE;
    }

    @Override // w2.a
    public final i0 b(long j3) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j3 >= ((z3.a) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    z3.a aVar = (z3.a) arrayList.get(i10);
                    if (j3 >= aVar.b && j3 < aVar.d) {
                        arrayList2.add(aVar);
                    }
                    if (j3 < aVar.b) {
                        break;
                    }
                }
                a1 B = i0.B(b, arrayList2);
                f0 u10 = i0.u();
                for (int i11 = 0; i11 < B.d; i11++) {
                    u10.d(((z3.a) B.get(i11)).a);
                }
                return u10.i();
            }
        }
        g0 g0Var = i0.b;
        return a1.e;
    }

    @Override // w2.a
    public final boolean c(z3.a aVar, long j3) {
        long j10 = aVar.b;
        e2.d.b(j10 != -9223372036854775807L);
        e2.d.b(aVar.c != -9223372036854775807L);
        boolean z10 = j10 <= j3 && j3 < aVar.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((z3.a) arrayList.get(size)).b) {
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
    public final long d(long j3) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j3 < ((z3.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j10 = ((z3.a) arrayList.get(0)).b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.a) arrayList.get(i10)).b;
            long j12 = ((z3.a) arrayList.get(i10)).d;
            if (j12 > j3) {
                if (j11 > j3) {
                    break;
                }
                j10 = Math.max(j10, j11);
            } else {
                j10 = Math.max(j10, j12);
            }
        }
        return j10;
    }

    @Override // w2.a
    public final void e(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                return;
            }
            long j10 = ((z3.a) arrayList.get(i10)).b;
            if (j3 > j10 && j3 > ((z3.a) arrayList.get(i10)).d) {
                arrayList.remove(i10);
                i10--;
            } else if (j3 < j10) {
                return;
            }
            i10++;
        }
    }
}
