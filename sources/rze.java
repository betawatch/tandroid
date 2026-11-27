// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class rze {
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(String str, long j, long j2, long j3) {
        String str2;
        Long l;
        boolean z;
        int i = chb.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        str2.getClass();
        int length = str2.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str2.charAt(0);
            long j4 = -9223372036854775807L;
            if (ur5.b(charAt, 48) < 0) {
                z = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z = false;
                        i2 = 1;
                    } else if (charAt == '-') {
                        j4 = Long.MIN_VALUE;
                        i2 = 1;
                    }
                }
            } else {
                z = false;
            }
            long j5 = 0;
            long j6 = -256204778801521550L;
            while (i2 < length) {
                int digit = Character.digit((int) str2.charAt(i2), 10);
                if (digit >= 0) {
                    if (j5 < j6) {
                        if (j6 == -256204778801521550L) {
                            j6 = j4 / 10;
                            if (j5 < j6) {
                            }
                        }
                    }
                    long j7 = j5 * 10;
                    int i3 = length;
                    int i4 = i2;
                    long j8 = digit;
                    if (j7 >= j4 + j8) {
                        j5 = j7 - j8;
                        i2 = i4 + 1;
                        length = i3;
                    }
                }
            }
            l = z ? Long.valueOf(j5) : Long.valueOf(-j5);
            if (l != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
            }
            long longValue = l.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        l = null;
        if (l != null) {
        }
    }

    public static int b(int i, int i2, String str) {
        return (int) a(str, i, 1L, (i2 & 8) != 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2097150);
    }
}
