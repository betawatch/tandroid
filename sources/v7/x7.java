package v7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class x7 {
    public static List a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new h9.b(0, iArr.length, iArr);
    }

    public static int b(long j3) {
        int i10 = (int) j3;
        t6.b(j3, "Out of range: %s", ((long) i10) == j3);
        return i10;
    }

    public static int c(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int d(int i10, int i11, int i12, int[] iArr) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int e(long j3) {
        return j3 > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : j3 < -2147483648L ? TLObject.FLAG_31 : (int) j3;
    }

    public static int[] f(Collection collection) {
        if (collection instanceof h9.b) {
            h9.b bVar = (h9.b) collection;
            return Arrays.copyOfRange(bVar.a, bVar.b, bVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Integer g(String str) {
        byte b10;
        Integer num;
        Long l4;
        byte b11;
        str.getClass();
        if (!str.isEmpty()) {
            int i10 = str.charAt(0) == '-' ? 1 : 0;
            if (i10 != str.length()) {
                int i11 = i10 + 1;
                char charAt = str.charAt(i10);
                if (charAt < 128) {
                    b10 = h9.c.a[charAt];
                } else {
                    byte[] bArr = h9.c.a;
                    b10 = -1;
                }
                if (b10 >= 0 && b10 < 10) {
                    long j3 = -b10;
                    long j10 = 10;
                    long j11 = Long.MIN_VALUE / j10;
                    while (true) {
                        if (i11 < str.length()) {
                            int i12 = i11 + 1;
                            char charAt2 = str.charAt(i11);
                            if (charAt2 < 128) {
                                b11 = h9.c.a[charAt2];
                            } else {
                                byte[] bArr2 = h9.c.a;
                                b11 = -1;
                            }
                            if (b11 < 0 || b11 >= 10 || j3 < j11) {
                                break;
                            }
                            long j12 = j3 * j10;
                            num = null;
                            long j13 = b11;
                            if (j12 < j13 - Long.MIN_VALUE) {
                                break;
                            }
                            j3 = j12 - j13;
                            i11 = i12;
                        } else {
                            num = null;
                            if (i10 != 0) {
                                l4 = Long.valueOf(j3);
                            } else if (j3 != Long.MIN_VALUE) {
                                l4 = Long.valueOf(-j3);
                            }
                        }
                    }
                }
                num = null;
                l4 = num;
                return (l4 == 0 && l4.longValue() == ((long) l4.intValue())) ? Integer.valueOf(l4.intValue()) : num;
            }
        }
        l4 = 0;
        num = null;
        if (l4 == 0) {
        }
    }
}
