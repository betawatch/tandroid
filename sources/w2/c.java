package w2;

import e9.a0;
import e9.a1;
import e9.f0;
import e9.g0;
import e9.i0;
import e9.p;
import e9.x0;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
            long j11 = ((z3.b) arrayList.get(i10)).b;
            long j12 = ((z3.b) arrayList.get(i10)).d;
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
            if (j3 >= ((z3.b) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    z3.b bVar = (z3.b) arrayList.get(i10);
                    if (j3 >= bVar.b && j3 < bVar.d) {
                        arrayList2.add(bVar);
                    }
                    if (j3 < bVar.b) {
                        break;
                    }
                }
                a1 B = i0.B(b, arrayList2);
                f0 u10 = i0.u();
                for (int i11 = 0; i11 < B.d; i11++) {
                    u10.d(((z3.b) B.get(i11)).a);
                }
                return u10.i();
            }
        }
        g0 g0Var = i0.b;
        return a1.e;
    }

    @Override // w2.a
    public final boolean c(z3.b bVar, long j3) {
        long j10 = bVar.b;
        e2.d.b(j10 != -9223372036854775807L);
        e2.d.b(bVar.c != -9223372036854775807L);
        boolean z10 = j10 <= j3 && j3 < bVar.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((z3.b) arrayList.get(size)).b) {
                arrayList.add(size + 1, bVar);
                return z10;
            }
        }
        arrayList.add(0, bVar);
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
        if (j3 < ((z3.b) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j10 = ((z3.b) arrayList.get(0)).b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.b) arrayList.get(i10)).b;
            long j12 = ((z3.b) arrayList.get(i10)).d;
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
            long j10 = ((z3.b) arrayList.get(i10)).b;
            if (j3 > j10 && j3 > ((z3.b) arrayList.get(i10)).d) {
                arrayList.remove(i10);
                i10--;
            } else if (j3 < j10) {
                return;
            }
            i10++;
        }
    }
}
