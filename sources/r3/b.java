package r3;

import h5.d0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b {
    public final long a;
    public final long b;
    public final long c;
    public long d = 0;
    public long e;
    public long f;
    public long g;
    public long h;

    public b(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.a = j10;
        this.b = j11;
        this.e = j12;
        this.f = j13;
        this.g = j14;
        this.c = j15;
        this.h = a(j11, 0L, j12, j13, j14, j15);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        return d0.i(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
    }
}
