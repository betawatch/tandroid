// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class usb {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public usb(long j) {
        g(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!f()) {
            long j2 = this.a;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.d.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.b = j2 - j;
            notifyAll();
        }
        this.c = j;
        return j + this.b;
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            String str = gcc.a;
            long b0 = gcc.b0(j2, 90000L, 1000000L, RoundingMode.DOWN);
            long j3 = (4294967296L + b0) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            long j5 = (j3 * 8589934592L) + j;
            j = Math.abs(j4 - b0) < Math.abs(j5 - b0) ? j4 : j5;
        }
        long j6 = j;
        String str2 = gcc.a;
        return a(gcc.b0(j6, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            String str = gcc.a;
            long b0 = gcc.b0(j2, 90000L, 1000000L, RoundingMode.DOWN);
            long j3 = b0 / 8589934592L;
            Long.signum(j3);
            long j4 = (j3 * 8589934592L) + j;
            j = j4 >= b0 ? j4 : ((j3 + 1) * 8589934592L) + j;
        }
        long j5 = j;
        String str2 = gcc.a;
        return a(gcc.b0(j5, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long d() {
        long j;
        j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized boolean f() {
        return this.b != -9223372036854775807L;
    }

    public final synchronized void g(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final synchronized void h(long j, boolean z) {
        yve.p(this.a == 9223372036854775806L);
        if (f()) {
            return;
        }
        if (z) {
            this.d.set(Long.valueOf(j));
        } else {
            while (!f()) {
                wait();
            }
        }
    }
}
