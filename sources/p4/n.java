package p4;

import f5.d0;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class n extends s {
    public final long d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final long i;

    public n(j jVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
        super(jVar, j10, j11);
        this.d = j12;
        this.e = j13;
        this.f = list;
        this.i = j14;
        this.g = j15;
        this.h = j16;
    }

    public final long b(long j10, long j11) {
        long d = d(j10);
        return d != -1 ? d : (int) (f((j11 - this.h) + this.i, j10) - c(j10, j11));
    }

    public final long c(long j10, long j11) {
        long d = d(j10);
        long j12 = this.d;
        if (d == -1) {
            long j13 = this.g;
            if (j13 != -9223372036854775807L) {
                return Math.max(j12, f((j11 - this.h) - j13, j10));
            }
        }
        return j12;
    }

    public abstract long d(long j10);

    public final long e(long j10, long j11) {
        long j12 = this.b;
        long j13 = this.d;
        List list = this.f;
        if (list != null) {
            return (((q) list.get((int) (j10 - j13))).b * 1000000) / j12;
        }
        long d = d(j11);
        return (d == -1 || j10 != (j13 + d) - 1) ? (this.e * 1000000) / j12 : j11 - g(j10);
    }

    public final long f(long j10, long j11) {
        long d = d(j11);
        long j12 = this.d;
        if (d != 0) {
            if (this.f != null) {
                long j13 = (d + j12) - 1;
                long j14 = j12;
                while (j14 <= j13) {
                    long j15 = ((j13 - j14) / 2) + j14;
                    long g10 = g(j15);
                    if (g10 < j10) {
                        j14 = j15 + 1;
                    } else {
                        if (g10 <= j10) {
                            return j15;
                        }
                        j13 = j15 - 1;
                    }
                }
                return j14 == j12 ? j14 : j13;
            }
            long j16 = (j10 / ((this.e * 1000000) / this.b)) + j12;
            if (j16 >= j12) {
                return d == -1 ? j16 : Math.min(j16, (j12 + d) - 1);
            }
        }
        return j12;
    }

    public final long g(long j10) {
        long j11 = this.d;
        List list = this.f;
        return d0.O(list != null ? ((q) list.get((int) (j10 - j11))).a - this.c : (j10 - j11) * this.e, 1000000L, this.b);
    }

    public abstract j h(k kVar, long j10);

    public boolean i() {
        return this.f != null;
    }
}
