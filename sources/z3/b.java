package z3;

import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.p;
import e9.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b implements d {
    public static final p c = new p(new t0.a(29), x0.b);
    public final i0 a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(a1 a1Var) {
        long j3;
        int i10 = a1Var.d;
        long j10 = -9223372036854775807L;
        int i11 = 0;
        if (i10 == 1) {
            g0 listIterator = a1Var.listIterator(0);
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
            long j11 = aVar.b;
            i0 i0Var = aVar.a;
            long j12 = aVar.c;
            long j13 = j11 == -9223372036854775807L ? 0L : j11;
            if (j12 == -9223372036854775807L) {
                this.a = i0.z(i0Var);
                this.b = new long[]{j13};
                return;
            } else {
                g0 g0Var = i0.b;
                this.a = i0.A(i0Var, a1.e);
                this.b = new long[]{j13, j12 + j13};
                return;
            }
        }
        long[] jArr = new long[i10 * 2];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        a1 B = i0.B(c, a1Var);
        int i12 = 0;
        while (i11 < B.d) {
            a aVar2 = (a) B.get(i11);
            long j14 = aVar2.b;
            long j15 = aVar2.c;
            i0 i0Var2 = aVar2.a;
            j14 = j14 == j10 ? 0L : j14;
            long j16 = j14 + j15;
            if (i12 != 0) {
                int i13 = i12 - 1;
                long j17 = this.b[i13];
                if (j17 >= j14) {
                    if (j17 == j14 && ((i0) arrayList.get(i13)).isEmpty()) {
                        arrayList.set(i13, i0Var2);
                        j3 = j10;
                    } else {
                        j3 = j10;
                        e2.a.n("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.b[i13] = j14;
                        arrayList.set(i13, i0Var2);
                    }
                    if (j15 == j3) {
                        this.b[i12] = j16;
                        arrayList.add(a1.e);
                        i12++;
                    }
                    i11++;
                    j10 = j3;
                }
            }
            j3 = j10;
            this.b[i12] = j14;
            arrayList.add(i0Var2);
            i12++;
            if (j15 == j3) {
            }
            i11++;
            j10 = j3;
        }
        this.a = i0.v(arrayList);
    }

    @Override // z3.d
    public final int d(long j3) {
        int a2 = d0.a(this.b, j3, false);
        if (a2 < this.a.size()) {
            return a2;
        }
        return -1;
    }

    @Override // z3.d
    public final long e(int i10) {
        e2.d.b(i10 < this.a.size());
        return this.b[i10];
    }

    @Override // z3.d
    public final List h(long j3) {
        int e7 = d0.e(this.b, j3, false);
        if (e7 != -1) {
            return (i0) this.a.get(e7);
        }
        g0 g0Var = i0.b;
        return a1.e;
    }

    @Override // z3.d
    public final int k() {
        return this.a.size();
    }
}
