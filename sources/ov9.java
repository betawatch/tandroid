// default package

import java.math.RoundingMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ov9 extends tv9 {
    public final long d;
    public final long e;
    public final ArrayList f;
    public final long g;
    public final long h;
    public final long i;

    public ov9(az8 az8Var, long j, long j2, long j3, long j4, ArrayList arrayList, long j5, long j6, long j7) {
        super(az8Var, j, j2);
        this.d = j3;
        this.e = j4;
        this.f = arrayList;
        this.i = j5;
        this.g = j6;
        this.h = j7;
    }

    public final long c(long j, long j2) {
        long e = e(j);
        return e != -1 ? e : (int) (g((j2 - this.h) + this.i, j) - d(j, j2));
    }

    public final long d(long j, long j2) {
        long e = e(j);
        long j3 = this.d;
        if (e == -1) {
            long j4 = this.g;
            if (j4 != -9223372036854775807L) {
                return Math.max(j3, g((j2 - this.h) - j4, j));
            }
        }
        return j3;
    }

    public abstract long e(long j);

    public final long f(long j, long j2) {
        long j3 = this.b;
        long j4 = this.d;
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            return (((rv9) arrayList.get((int) (j - j4))).b * 1000000) / j3;
        }
        long e = e(j2);
        return (e == -1 || j != (j4 + e) - 1) ? (this.e * 1000000) / j3 : j2 - h(j);
    }

    public final long g(long j, long j2) {
        long e = e(j2);
        long j3 = this.d;
        if (e != 0) {
            if (this.f != null) {
                long j4 = (e + j3) - 1;
                long j5 = j3;
                while (j5 <= j4) {
                    long j6 = ((j4 - j5) / 2) + j5;
                    long h = h(j6);
                    if (h < j) {
                        j5 = j6 + 1;
                    } else {
                        if (h <= j) {
                            return j6;
                        }
                        j4 = j6 - 1;
                    }
                }
                return j5 == j3 ? j5 : j4;
            }
            long j7 = (j / ((this.e * 1000000) / this.b)) + j3;
            if (j7 >= j3) {
                return e == -1 ? j7 : Math.min(j7, (j3 + e) - 1);
            }
        }
        return j3;
    }

    public final long h(long j) {
        ArrayList arrayList = this.f;
        long j2 = j - this.d;
        long j3 = arrayList != null ? ((rv9) arrayList.get((int) j2)).a - this.c : j2 * this.e;
        String str = g8c.a;
        return g8c.b0(j3, 1000000L, this.b, RoundingMode.DOWN);
    }

    public abstract az8 i(g89 g89Var, long j);

    public boolean j() {
        return this.f != null;
    }
}
