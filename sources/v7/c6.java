package v7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class c6 {
    public static int a(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.h1 h1Var) {
        int f7 = f(bArr, i10, h1Var);
        int i11 = h1Var.a;
        if (i11 < 0) {
            throw new com.google.android.gms.internal.play_billing.c2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - f7) {
            throw new com.google.android.gms.internal.play_billing.c2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            h1Var.d = com.google.android.gms.internal.play_billing.l1.c;
            return f7;
        }
        h1Var.d = com.google.android.gms.internal.play_billing.l1.q(f7, i11, bArr);
        return f7 + i11;
    }

    public static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int c(com.google.android.gms.internal.play_billing.t2 t2Var, int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.h1 h1Var) {
        com.google.android.gms.internal.play_billing.v1 zze = t2Var.zze();
        com.google.android.gms.internal.play_billing.t2 t2Var2 = t2Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        com.google.android.gms.internal.play_billing.h1 h1Var2 = h1Var;
        int k10 = k(zze, t2Var2, bArr2, i11, i13, h1Var2);
        t2Var2.zzf(zze);
        h1Var2.d = zze;
        z1Var.add(zze);
        while (k10 < i13) {
            com.google.android.gms.internal.play_billing.h1 h1Var3 = h1Var2;
            int i14 = i13;
            int f7 = f(bArr2, k10, h1Var3);
            if (i10 != h1Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            com.google.android.gms.internal.play_billing.t2 t2Var3 = t2Var2;
            com.google.android.gms.internal.play_billing.v1 zze2 = t2Var3.zze();
            k10 = k(zze2, t2Var3, bArr3, f7, i14, h1Var3);
            t2Var2 = t2Var3;
            bArr2 = bArr3;
            i13 = i14;
            h1Var2 = h1Var3;
            t2Var2.zzf(zze2);
            h1Var2.d = zze2;
            z1Var.add(zze2);
        }
        return k10;
    }

    public static int d(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.h1 h1Var) {
        com.google.android.gms.internal.play_billing.w1 w1Var = (com.google.android.gms.internal.play_billing.w1) z1Var;
        int f7 = f(bArr, i10, h1Var);
        int i11 = h1Var.a + f7;
        while (f7 < i11) {
            f7 = f(bArr, f7, h1Var);
            w1Var.o(h1Var.a);
        }
        if (f7 == i11) {
            return f7;
        }
        throw new com.google.android.gms.internal.play_billing.c2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int e(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.x2 x2Var, com.google.android.gms.internal.play_billing.h1 h1Var) {
        if ((i10 >>> 3) == 0) {
            throw new com.google.android.gms.internal.play_billing.c2("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int i14 = i(bArr, i11, h1Var);
            x2Var.c(i10, Long.valueOf(h1Var.c));
            return i14;
        }
        if (i13 == 1) {
            x2Var.c(i10, Long.valueOf(l(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int f7 = f(bArr, i11, h1Var);
            int i15 = h1Var.a;
            if (i15 < 0) {
                throw new com.google.android.gms.internal.play_billing.c2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 > bArr.length - f7) {
                throw new com.google.android.gms.internal.play_billing.c2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i15 == 0) {
                x2Var.c(i10, com.google.android.gms.internal.play_billing.l1.c);
            } else {
                x2Var.c(i10, com.google.android.gms.internal.play_billing.l1.q(f7, i15, bArr));
            }
            return f7 + i15;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new com.google.android.gms.internal.play_billing.c2("Protocol message contained an invalid tag (zero).");
            }
            x2Var.c(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i16 = (i10 & (-8)) | 4;
        com.google.android.gms.internal.play_billing.x2 b10 = com.google.android.gms.internal.play_billing.x2.b();
        int i17 = h1Var.b + 1;
        h1Var.b = i17;
        if (i17 >= 100) {
            throw new com.google.android.gms.internal.play_billing.c2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i18 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int f10 = f(bArr, i11, h1Var);
            int i19 = h1Var.a;
            if (i19 == i16) {
                i18 = i19;
                i11 = f10;
                break;
            }
            i11 = e(i19, bArr, f10, i12, b10, h1Var);
            i18 = i19;
        }
        h1Var.b--;
        if (i11 > i12 || i18 != i16) {
            throw new com.google.android.gms.internal.play_billing.c2("Failed to parse the message.");
        }
        x2Var.c(i10, b10);
        return i11;
    }

    public static int f(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.h1 h1Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return g(b10, bArr, i11, h1Var);
        }
        h1Var.a = b10;
        return i11;
    }

    public static int g(int i10, byte[] bArr, int i11, com.google.android.gms.internal.play_billing.h1 h1Var) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            h1Var.a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            h1Var.a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            h1Var.a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            h1Var.a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                h1Var.a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.h1 h1Var) {
        com.google.android.gms.internal.play_billing.w1 w1Var = (com.google.android.gms.internal.play_billing.w1) z1Var;
        int f7 = f(bArr, i11, h1Var);
        w1Var.o(h1Var.a);
        while (f7 < i12) {
            int f10 = f(bArr, f7, h1Var);
            if (i10 != h1Var.a) {
                break;
            }
            f7 = f(bArr, f10, h1Var);
            w1Var.o(h1Var.a);
        }
        return f7;
    }

    public static int i(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.h1 h1Var) {
        long j3 = bArr[i10];
        int i11 = i10 + 1;
        if (j3 >= 0) {
            h1Var.c = j3;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j10 = (j3 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j10 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        h1Var.c = j10;
        return i12;
    }

    public static int j(Object obj, com.google.android.gms.internal.play_billing.t2 t2Var, byte[] bArr, int i10, int i11, int i12, com.google.android.gms.internal.play_billing.h1 h1Var) {
        com.google.android.gms.internal.play_billing.n2 n2Var = (com.google.android.gms.internal.play_billing.n2) t2Var;
        int i13 = h1Var.b + 1;
        h1Var.b = i13;
        if (i13 >= 100) {
            throw new com.google.android.gms.internal.play_billing.c2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int q6 = n2Var.q(obj, bArr, i10, i11, i12, h1Var);
        h1Var.b--;
        h1Var.d = obj;
        return q6;
    }

    public static int k(Object obj, com.google.android.gms.internal.play_billing.t2 t2Var, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.h1 h1Var) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = g(i13, bArr, i12, h1Var);
            i13 = h1Var.a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw new com.google.android.gms.internal.play_billing.c2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = h1Var.b + 1;
        h1Var.b = i15;
        if (i15 >= 100) {
            throw new com.google.android.gms.internal.play_billing.c2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = i14 + i13;
        t2Var.e(obj, bArr, i14, i16, h1Var);
        h1Var.b--;
        h1Var.d = obj;
        return i16;
    }

    public static long l(int i10, byte[] bArr) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
