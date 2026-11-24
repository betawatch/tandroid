// default package

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class wge {
    public static final long a(long j) {
        long j2 = (j << 1) + 1;
        int i = ts3.d;
        int i2 = vs3.a;
        return j2;
    }

    public static final long b(long j) {
        long j2 = j << 1;
        int i = ts3.d;
        int i2 = vs3.a;
        return j2;
    }

    public static final long c(int i, xs3 xs3Var) {
        if (xs3Var.compareTo(xs3.d) > 0) {
            return d(i, xs3Var);
        }
        return b(TimeUnit.NANOSECONDS.convert(i, xs3Var.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r5 > 4611686018427387903L) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long d(long j, xs3 xs3Var) {
        TimeUnit timeUnit = xs3Var.a;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            return b(timeUnit2.convert(j, timeUnit));
        }
        long convert2 = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        long j2 = convert2 >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert2 = j2;
        return a(convert2);
    }
}
