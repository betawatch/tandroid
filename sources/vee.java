// default package

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class vee {
    public static final long a(long j) {
        long j2 = (j << 1) + 1;
        int i = jr3.d;
        int i2 = lr3.a;
        return j2;
    }

    public static final long b(long j) {
        long j2 = j << 1;
        int i = jr3.d;
        int i2 = lr3.a;
        return j2;
    }

    public static final long c(int i, nr3 nr3Var) {
        if (nr3Var.compareTo(nr3.d) > 0) {
            return d(i, nr3Var);
        }
        return b(TimeUnit.NANOSECONDS.convert(i, nr3Var.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r5 > 4611686018427387903L) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long d(long j, nr3 nr3Var) {
        TimeUnit timeUnit = nr3Var.a;
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
