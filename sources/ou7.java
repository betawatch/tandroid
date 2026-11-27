// default package

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ou7 {
    public static final byte[] c;
    public static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    public static final byte[] b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    public static final byte[] d = new byte[128];
    public static final Charset e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i2 >= 30) {
                break;
            }
            byte b2 = bArr2[i2];
            if (b2 > 0) {
                c[b2] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(d, (byte) -1);
        while (true) {
            byte[] bArr3 = b;
            if (i >= 30) {
                return;
            }
            byte b3 = bArr3[i];
            if (b3 > 0) {
                d[b3] = (byte) i;
            }
            i++;
        }
    }

    public static void a(int i, String str, String str2) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) > i) {
                throw new w30("Non-encodable character detected: " + str.charAt(i2) + " (Unicode: " + ((int) str.charAt(i2)) + ") at position #" + i2 + " - " + str2);
            }
        }
    }

    public static void b(int i, int i2, StringBuilder sb, byte[] bArr) {
        if (i == 1 && i2 == 0) {
            sb.append((char) 913);
        } else if (i % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        int i3 = 0;
        if (i >= 6) {
            char[] cArr = new char[5];
            int i4 = 0;
            while (i - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + (bArr[i4 + i5] & 255);
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
            i3 = i4;
        }
        while (i3 < i) {
            sb.append((char) (bArr[i3] & 255));
            i3++;
        }
    }

    public static void c(int i, int i2, int i3, ys3 ys3Var, StringBuilder sb) {
        int min = Math.min(i2 + i, ys3Var.length());
        int i4 = i;
        while (true) {
            if (i4 >= min || !ys3Var.b(i4)) {
                int i5 = i4;
                while (i5 < min && !ys3Var.b(i5)) {
                    i5++;
                }
                int i6 = i5 - i4;
                if (i6 <= 0) {
                    return;
                }
                byte[] bArr = new byte[i6];
                for (int i7 = i4; i7 < i5; i7++) {
                    bArr[i7 - i4] = (byte) (ys3Var.charAt(i7) & 255);
                }
                b(i6, i4 == i ? i3 : 1, sb, bArr);
                i4 = i5;
            } else {
                f(ys3Var.a(i4), sb);
                i4++;
            }
        }
    }

    public static void d(ys3 ys3Var, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append((Object) ys3Var.subSequence(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00fd A[EDGE_INSN: B:24:0x00fd->B:25:0x00fd BREAK  A[LOOP:0: B:2:0x000e->B:19:0x000e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(int i, int i2, int i3, ys3 ys3Var, StringBuilder sb) {
        char charAt;
        StringBuilder sb2 = new StringBuilder(i2);
        int i4 = i3;
        int i5 = 0;
        while (true) {
            int i6 = i + i5;
            if (ys3Var.b(i6)) {
                f(ys3Var.a(i6), sb);
                i5++;
            } else {
                char charAt2 = ys3Var.charAt(i6);
                byte[] bArr = c;
                byte[] bArr2 = d;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            byte b2 = bArr[charAt2];
                            if (b2 != -1) {
                                sb2.append((char) b2);
                            } else if (h(charAt2)) {
                                sb2.append((char) 28);
                                i4 = 0;
                            } else if (g(charAt2)) {
                                sb2.append((char) 27);
                                i4 = 1;
                            } else {
                                int i7 = i6 + 1;
                                if (i7 >= i2 || ys3Var.b(i7) || bArr2[ys3Var.charAt(i7)] == -1) {
                                    sb2.append((char) 29);
                                    sb2.append((char) bArr2[charAt2]);
                                } else {
                                    sb2.append((char) 25);
                                    i4 = 3;
                                }
                            }
                        } else if (bArr2[charAt2] != -1) {
                            sb2.append((char) bArr2[charAt2]);
                        } else {
                            sb2.append((char) 29);
                            i4 = 0;
                        }
                    } else if (g(charAt2)) {
                        if (charAt2 == ' ') {
                            sb2.append((char) 26);
                        } else {
                            sb2.append((char) (charAt2 - 'a'));
                        }
                    } else if (h(charAt2)) {
                        sb2.append((char) 27);
                        sb2.append((char) (charAt2 - 'A'));
                    } else if (bArr[charAt2] != -1) {
                        sb2.append((char) 28);
                        i4 = 2;
                    } else {
                        sb2.append((char) 29);
                        sb2.append((char) bArr2[charAt2]);
                    }
                    i5++;
                    if (i5 < i2) {
                        break;
                    }
                } else {
                    if (h(charAt2)) {
                        if (charAt2 == ' ') {
                            sb2.append((char) 26);
                        } else {
                            sb2.append((char) (charAt2 - 'A'));
                        }
                    } else if (g(charAt2)) {
                        sb2.append((char) 27);
                        i4 = 1;
                    } else if (bArr[charAt2] != -1) {
                        sb2.append((char) 28);
                        i4 = 2;
                    } else {
                        sb2.append((char) 29);
                        sb2.append((char) bArr2[charAt2]);
                    }
                    i5++;
                    if (i5 < i2) {
                    }
                }
            }
        }
        int length = sb2.length();
        char c2 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 % 2 != 0) {
                charAt = (char) (sb2.charAt(i8) + (c2 * 30));
                sb.append(charAt);
            } else {
                charAt = sb2.charAt(i8);
            }
            c2 = charAt;
        }
        if (length % 2 != 0) {
            sb.append((char) ((c2 * 30) + 29));
        }
        return i4;
    }

    public static void f(int i, StringBuilder sb) {
        if (i >= 0 && i < 900) {
            sb.append((char) 927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i / 900) - 1));
            sb.append((char) (i % 900));
        } else {
            if (i >= 811800) {
                throw new w30(uh9.k(i, "ECI number not in valid range from 0..811799, but was "));
            }
            sb.append((char) 925);
            sb.append((char) (810900 - i));
        }
    }

    public static boolean g(char c2) {
        if (c2 != ' ') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    public static boolean h(char c2) {
        if (c2 != ' ') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }
}
