package z3;

import e2.m0;
import e9.l0;
import e9.n0;
import e9.r;
import e9.s1;
import e9.x1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b implements d {
    public static final r c = new r(new v0.k(17), s1.b);
    public final n0 a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(x1 x1Var) {
        long j10;
        int i10 = x1Var.d;
        long j11 = -9223372036854775807L;
        int i11 = 0;
        if (i10 == 1) {
            l0 listIterator = x1Var.listIterator(0);
            Object next = listIterator.next();
            if (listIterator.hasNext()) {
                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                sb2.append(next);
                while (i11 < 4 && listIterator.hasNext()) {
                    sb2.append(", ");
                    sb2.append(listIterator.next());
                    i11++;
                }
                if (listIterator.hasNext()) {
                    sb2.append(", ...");
                }
                sb2.append('>');
                throw new IllegalArgumentException(sb2.toString());
            }
            a aVar = (a) next;
            long j12 = aVar.b;
            n0 n0Var = aVar.a;
            long j13 = aVar.c;
            long j14 = j12 == -9223372036854775807L ? 0L : j12;
            if (j13 == -9223372036854775807L) {
                this.a = n0.y(n0Var);
                this.b = new long[]{j14};
                return;
            } else {
                l0 l0Var = n0.b;
                this.a = n0.z(n0Var, x1.e);
                this.b = new long[]{j14, j13 + j14};
                return;
            }
        }
        long[] jArr = new long[i10 * 2];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        x1 A = n0.A(c, x1Var);
        int i12 = 0;
        while (i11 < A.d) {
            a aVar2 = (a) A.get(i11);
            long j15 = aVar2.b;
            long j16 = aVar2.c;
            n0 n0Var2 = aVar2.a;
            j15 = j15 == j11 ? 0L : j15;
            long j17 = j15 + j16;
            if (i12 != 0) {
                int i13 = i12 - 1;
                long j18 = this.b[i13];
                if (j18 >= j15) {
                    if (j18 == j15 && ((n0) arrayList.get(i13)).isEmpty()) {
                        arrayList.set(i13, n0Var2);
                        j10 = j11;
                    } else {
                        j10 = j11;
                        e2.a.l("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.b[i13] = j15;
                        arrayList.set(i13, n0Var2);
                    }
                    if (j16 == j10) {
                        this.b[i12] = j17;
                        arrayList.add(x1.e);
                        i12++;
                    }
                    i11++;
                    j11 = j10;
                }
            }
            j10 = j11;
            this.b[i12] = j15;
            arrayList.add(n0Var2);
            i12++;
            if (j16 == j10) {
            }
            i11++;
            j11 = j10;
        }
        this.a = n0.u(arrayList);
    }

    @Override // z3.d
    public final int d(long j10) {
        int b10 = m0.b(this.b, j10, false);
        if (b10 < this.a.size()) {
            return b10;
        }
        return -1;
    }

    @Override // z3.d
    public final long k(int i10) {
        u6.g(i10 < this.a.size());
        return this.b[i10];
    }

    @Override // z3.d
    public final List r(long j10) {
        int f7 = m0.f(this.b, j10, false);
        if (f7 != -1) {
            return (n0) this.a.get(f7);
        }
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // z3.d
    public final int v() {
        return this.a.size();
    }
}
