package z2;

import a8.ia;
import h9.f0;
import h9.g0;
import h9.i0;
import h9.n;
import h9.o1;
import h9.t1;
import h9.x;
import java.util.ArrayList;
import v0.j;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class c implements a {
    public static final x b = new x(new n(new j(28), o1.b), new n(new j(29), o1.c));
    public final ArrayList a = new ArrayList();

    @Override // z2.a
    public final long a(long j3) {
        int i7 = 0;
        long j10 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i7 >= arrayList.size()) {
                break;
            }
            long j11 = ((c4.a) arrayList.get(i7)).b;
            long j12 = ((c4.a) arrayList.get(i7)).d;
            if (j3 < j11) {
                j10 = j10 == -9223372036854775807L ? j11 : Math.min(j10, j11);
            } else {
                if (j3 < j12) {
                    j10 = j10 == -9223372036854775807L ? j12 : Math.min(j10, j12);
                }
                i7++;
            }
        }
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        return Long.MIN_VALUE;
    }

    @Override // z2.a
    public final i0 b(long j3) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j3 >= ((c4.a) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    c4.a aVar = (c4.a) arrayList.get(i7);
                    if (j3 >= aVar.b && j3 < aVar.d) {
                        arrayList2.add(aVar);
                    }
                    if (j3 < aVar.b) {
                        break;
                    }
                }
                t1 w10 = i0.w(b, arrayList2);
                f0 p10 = i0.p();
                for (int i10 = 0; i10 < w10.d; i10++) {
                    p10.d(((c4.a) w10.get(i10)).a);
                }
                return p10.f();
            }
        }
        g0 g0Var = i0.b;
        return t1.e;
    }

    @Override // z2.a
    public final boolean c(c4.a aVar, long j3) {
        long j10 = aVar.b;
        ia.f(j10 != -9223372036854775807L);
        ia.f(aVar.c != -9223372036854775807L);
        boolean z9 = j10 <= j3 && j3 < aVar.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((c4.a) arrayList.get(size)).b) {
                arrayList.add(size + 1, aVar);
                return z9;
            }
        }
        arrayList.add(0, aVar);
        return z9;
    }

    @Override // z2.a
    public final void clear() {
        this.a.clear();
    }

    @Override // z2.a
    public final long d(long j3) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j3 < ((c4.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j10 = ((c4.a) arrayList.get(0)).b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long j11 = ((c4.a) arrayList.get(i7)).b;
            long j12 = ((c4.a) arrayList.get(i7)).d;
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

    @Override // z2.a
    public final void e(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i7 >= arrayList.size()) {
                return;
            }
            long j10 = ((c4.a) arrayList.get(i7)).b;
            if (j3 > j10 && j3 > ((c4.a) arrayList.get(i7)).d) {
                arrayList.remove(i7);
                i7--;
            } else if (j3 < j10) {
                return;
            }
            i7++;
        }
    }
}
