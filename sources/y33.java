// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class y33 implements kab {
    public static final v41 c = new v41(new g31(3), hi7.b);
    public final mm5 a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y33(w59 w59Var) {
        long j;
        int i = w59Var.d;
        long j2 = -9223372036854775807L;
        int i2 = 0;
        if (i == 1) {
            km5 listIterator = w59Var.listIterator(0);
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
            x33 x33Var = (x33) next;
            long j3 = x33Var.b;
            long j4 = x33Var.c;
            long j5 = j3 == -9223372036854775807L ? 0L : j3;
            mm5 mm5Var = x33Var.a;
            if (j4 == -9223372036854775807L) {
                this.a = mm5.u(mm5Var);
                this.b = new long[]{j5};
                return;
            } else {
                km5 km5Var = mm5.b;
                this.a = mm5.v(mm5Var, w59.e);
                this.b = new long[]{j5, j4 + j5};
                return;
            }
        }
        long[] jArr = new long[i << 1];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        w59 w = mm5.w(c, w59Var);
        int i3 = 0;
        while (i2 < w.d) {
            x33 x33Var2 = (x33) w.get(i2);
            long j6 = x33Var2.b;
            long j7 = x33Var2.c;
            mm5 mm5Var2 = x33Var2.a;
            j6 = j6 == j2 ? 0L : j6;
            long j8 = j6 + j7;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j9 = this.b[i4];
                if (j9 >= j6) {
                    if (j9 == j6 && ((mm5) arrayList.get(i4)).isEmpty()) {
                        arrayList.set(i4, mm5Var2);
                        j = j2;
                    } else {
                        j = j2;
                        lad.f("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.b[i4] = j6;
                        arrayList.set(i4, mm5Var2);
                    }
                    if (j7 == j) {
                        this.b[i3] = j8;
                        arrayList.add(w59.e);
                        i3++;
                    }
                    i2++;
                    j2 = j;
                }
            }
            j = j2;
            this.b[i3] = j6;
            arrayList.add(mm5Var2);
            i3++;
            if (j7 == j) {
            }
            i2++;
            j2 = j;
        }
        this.a = mm5.q(arrayList);
    }

    @Override // kab
    public final int b(long j) {
        int b = g8c.b(this.b, j, false);
        if (b < this.a.size()) {
            return b;
        }
        return -1;
    }

    @Override // kab
    public final long h(int i) {
        gre.f(i < this.a.size());
        return this.b[i];
    }

    @Override // kab
    public final List l(long j) {
        int f = g8c.f(this.b, j, false);
        if (f != -1) {
            return (mm5) this.a.get(f);
        }
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // kab
    public final int t() {
        return this.a.size();
    }
}
