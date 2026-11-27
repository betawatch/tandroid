// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class q43 implements heb {
    public static final d51 c = new d51(new p31(3), pk7.b);
    public final po5 a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q43(j99 j99Var) {
        long j;
        int i = j99Var.d;
        long j2 = -9223372036854775807L;
        int i2 = 0;
        if (i == 1) {
            no5 listIterator = j99Var.listIterator(0);
            Object next = listIterator.next();
            if (listIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && listIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(listIterator.next());
                    i2++;
                }
                if (listIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            p43 p43Var = (p43) next;
            long j3 = p43Var.b;
            long j4 = p43Var.c;
            long j5 = j3 == -9223372036854775807L ? 0L : j3;
            po5 po5Var = p43Var.a;
            if (j4 == -9223372036854775807L) {
                this.a = po5.u(po5Var);
                this.b = new long[]{j5};
                return;
            } else {
                no5 no5Var = po5.b;
                this.a = po5.v(po5Var, j99.e);
                this.b = new long[]{j5, j4 + j5};
                return;
            }
        }
        long[] jArr = new long[i << 1];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        j99 w = po5.w(c, j99Var);
        int i3 = 0;
        while (i2 < w.d) {
            p43 p43Var2 = (p43) w.get(i2);
            long j6 = p43Var2.b;
            long j7 = p43Var2.c;
            po5 po5Var2 = p43Var2.a;
            j6 = j6 == j2 ? 0L : j6;
            long j8 = j6 + j7;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j9 = this.b[i4];
                if (j9 >= j6) {
                    if (j9 == j6 && ((po5) arrayList.get(i4)).isEmpty()) {
                        arrayList.set(i4, po5Var2);
                        j = j2;
                    } else {
                        j = j2;
                        efd.f("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.b[i4] = j6;
                        arrayList.set(i4, po5Var2);
                    }
                    if (j7 == j) {
                        this.b[i3] = j8;
                        arrayList.add(j99.e);
                        i3++;
                    }
                    i2++;
                    j2 = j;
                }
            }
            j = j2;
            this.b[i3] = j6;
            arrayList.add(po5Var2);
            i3++;
            if (j7 == j) {
            }
            i2++;
            j2 = j;
        }
        this.a = po5.q(arrayList);
    }

    @Override // heb
    public final int b(long j) {
        int b = gcc.b(this.b, j, false);
        if (b < this.a.size()) {
            return b;
        }
        return -1;
    }

    @Override // heb
    public final long i(int i) {
        yve.f(i < this.a.size());
        return this.b[i];
    }

    @Override // heb
    public final List l(long j) {
        int f = gcc.f(this.b, j, false);
        if (f != -1) {
            return (po5) this.a.get(f);
        }
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // heb
    public final int q() {
        return this.a.size();
    }
}
