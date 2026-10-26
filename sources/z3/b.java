package z3;

import a8.yb;
import e2.n0;
import f9.g0;
import f9.i0;
import f9.n1;
import f9.s1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b implements d {
    public static final f9.n c = new f9.n(new vg.d(15), n1.b);
    public final i0 a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(s1 s1Var) {
        long j10;
        int i10 = s1Var.d;
        long j11 = -9223372036854775807L;
        int i11 = 0;
        if (i10 == 1) {
            g0 listIterator = s1Var.listIterator(0);
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
            i0 i0Var = aVar.a;
            long j13 = aVar.c;
            long j14 = j12 == -9223372036854775807L ? 0L : j12;
            if (j13 == -9223372036854775807L) {
                this.a = i0.y(i0Var);
                this.b = new long[]{j14};
                return;
            } else {
                g0 g0Var = i0.b;
                this.a = i0.z(i0Var, s1.e);
                this.b = new long[]{j14, j13 + j14};
                return;
            }
        }
        long[] jArr = new long[i10 * 2];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        s1 A = i0.A(c, s1Var);
        int i12 = 0;
        while (i11 < A.d) {
            a aVar2 = (a) A.get(i11);
            long j15 = aVar2.b;
            long j16 = aVar2.c;
            i0 i0Var2 = aVar2.a;
            j15 = j15 == j11 ? 0L : j15;
            long j17 = j15 + j16;
            if (i12 != 0) {
                int i13 = i12 - 1;
                long j18 = this.b[i13];
                if (j18 >= j15) {
                    if (j18 == j15 && ((i0) arrayList.get(i13)).isEmpty()) {
                        arrayList.set(i13, i0Var2);
                        j10 = j11;
                    } else {
                        j10 = j11;
                        e2.a.l("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.b[i13] = j15;
                        arrayList.set(i13, i0Var2);
                    }
                    if (j16 == j10) {
                        this.b[i12] = j17;
                        arrayList.add(s1.e);
                        i12++;
                    }
                    i11++;
                    j11 = j10;
                }
            }
            j10 = j11;
            this.b[i12] = j15;
            arrayList.add(i0Var2);
            i12++;
            if (j16 == j10) {
            }
            i11++;
            j11 = j10;
        }
        this.a = i0.u(arrayList);
    }

    @Override // z3.d
    public final int c(long j10) {
        int b10 = n0.b(this.b, j10, false);
        if (b10 < this.a.size()) {
            return b10;
        }
        return -1;
    }

    @Override // z3.d
    public final long e(int i10) {
        yb.g(i10 < this.a.size());
        return this.b[i10];
    }

    @Override // z3.d
    public final List g(long j10) {
        int f7 = n0.f(this.b, j10, false);
        if (f7 != -1) {
            return (i0) this.a.get(f7);
        }
        g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // z3.d
    public final int k() {
        return this.a.size();
    }
}
