package rc;

import ab.b0;
import h2.j0;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class d {
    public static final int[] a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final byte[] b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String a(byte[] bArr) {
        int i7;
        int i10;
        int i11;
        int i12;
        if (bArr == 0) {
            return null;
        }
        int length = (((((bArr.length * 8) + 5) / 6) + 3) / 4) * 4;
        StringBuilder sb2 = new StringBuilder(length);
        int i13 = 0;
        while (true) {
            int i14 = i13 / 8;
            if (bArr.length <= i14) {
                i10 = -1;
            } else {
                int i15 = bArr.length - 1 == i14 ? 0 : bArr[i14 + 1];
                int i16 = (i13 % 24) / 6;
                if (i16 != 0) {
                    if (i16 == 1) {
                        i11 = (bArr[i14] << 4) & 48;
                        i12 = (i15 >> 4) & 15;
                    } else if (i16 == 2) {
                        i11 = (bArr[i14] << 2) & 60;
                        i12 = (i15 >> 6) & 3;
                    } else if (i16 != 3) {
                        i10 = 0;
                    } else {
                        i7 = bArr[i14];
                    }
                    i10 = i11 | i12;
                } else {
                    i7 = bArr[i14] >> 2;
                }
                i10 = i7 & 63;
            }
            if (i10 < 0) {
                break;
            }
            sb2.append((char) b[i10]);
            i13 += 6;
        }
        for (int length2 = sb2.length(); length2 < length; length2++) {
            sb2.append('=');
        }
        return sb2.toString();
    }

    public static boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (charAt != '\t' && charAt != ' ' && charAt != '\"' && charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}' && charAt != '(' && charAt != ')') {
                switch (charAt) {
                    case ks.v0 /* 58 */:
                    case ks.w0 /* 59 */:
                    case ks.x0 /* 60 */:
                    case ks.y0 /* 61 */:
                    case ks.z0 /* 62 */:
                    case ks.A0 /* 63 */:
                    case '@':
                        break;
                    default:
                        switch (charAt) {
                            case ks.c1 /* 91 */:
                            case ks.d1 /* 92 */:
                            case ks.e1 /* 93 */:
                                break;
                            default:
                        }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[LOOP:1: B:16:0x0050->B:17:0x0052, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(b3.j jVar, int[] iArr, int[] iArr2, j0 j0Var) {
        int i7;
        int r10;
        int r11;
        int i10;
        int i11 = 0;
        while (i11 < iArr2.length) {
            int m10 = j0Var.m(jVar, iArr);
            if (m10 < 0 || m10 > 15) {
                switch (m10) {
                    case 16:
                        i7 = iArr2[i11 - 1];
                        r10 = jVar.r(iArr, 2) + 3;
                        for (i10 = 0; i10 < r10; i10++) {
                            iArr2[i11 + i10] = i7;
                        }
                        i11 += r10 - 1;
                        break;
                    case 17:
                        r11 = jVar.r(iArr, 3) + 3;
                        r10 = r11;
                        i7 = 0;
                        while (i10 < r10) {
                        }
                        i11 += r10 - 1;
                        break;
                    case 18:
                        r11 = jVar.r(iArr, 7) + 11;
                        r10 = r11;
                        i7 = 0;
                        while (i10 < r10) {
                        }
                        i11 += r10 - 1;
                        break;
                    default:
                        throw new b0(String.format("[%s] Bad code length '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(m10), iArr));
                }
            } else {
                iArr2[i11] = m10;
            }
            i11++;
        }
    }

    public static int d(b3.j jVar, int[] iArr, j0 j0Var) {
        int i7;
        int m10 = j0Var.m(jVar, iArr);
        int i10 = 2;
        int i11 = 5;
        switch (m10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return m10 + 1;
            case 4:
                i10 = 1;
                return jVar.r(iArr, i10) + i11;
            case 5:
                i10 = 1;
                i11 = 7;
                return jVar.r(iArr, i10) + i11;
            case 6:
                i11 = 9;
                return jVar.r(iArr, i10) + i11;
            case 7:
                i11 = 13;
                return jVar.r(iArr, i10) + i11;
            case 8:
                i11 = 17;
                i10 = 3;
                return jVar.r(iArr, i10) + i11;
            case 9:
                i11 = 25;
                i10 = 3;
                return jVar.r(iArr, i10) + i11;
            case 10:
                i11 = 33;
                i10 = 4;
                return jVar.r(iArr, i10) + i11;
            case 11:
                i11 = 49;
                i10 = 4;
                return jVar.r(iArr, i10) + i11;
            case 12:
                i7 = 65;
                i10 = 5;
                i11 = i7;
                return jVar.r(iArr, i10) + i11;
            case 13:
                i7 = 97;
                i10 = 5;
                i11 = i7;
                return jVar.r(iArr, i10) + i11;
            case 14:
                i11 = ks.N1;
                i10 = 6;
                return jVar.r(iArr, i10) + i11;
            case 15:
                i11 = ks.X2;
                i10 = 6;
                return jVar.r(iArr, i10) + i11;
            case 16:
                i11 = ks.g4;
                i10 = 7;
                return jVar.r(iArr, i10) + i11;
            case 17:
                i11 = 385;
                i10 = 7;
                return jVar.r(iArr, i10) + i11;
            case 18:
                i11 = 513;
                i10 = 8;
                return jVar.r(iArr, i10) + i11;
            case 19:
                i11 = 769;
                i10 = 8;
                return jVar.r(iArr, i10) + i11;
            case 20:
                i11 = 1025;
                i10 = 9;
                return jVar.r(iArr, i10) + i11;
            case 21:
                i11 = 1537;
                i10 = 9;
                return jVar.r(iArr, i10) + i11;
            case 22:
                i11 = 2049;
                i10 = 10;
                return jVar.r(iArr, i10) + i11;
            case 23:
                i11 = 3073;
                i10 = 10;
                return jVar.r(iArr, i10) + i11;
            case 24:
                i11 = 4097;
                i10 = 11;
                return jVar.r(iArr, i10) + i11;
            case 25:
                i11 = 6145;
                i10 = 11;
                return jVar.r(iArr, i10) + i11;
            case 26:
                i11 = 8193;
                i10 = 12;
                return jVar.r(iArr, i10) + i11;
            case 27:
                i11 = 12289;
                i10 = 12;
                return jVar.r(iArr, i10) + i11;
            case 28:
                i11 = 16385;
                i10 = 13;
                return jVar.r(iArr, i10) + i11;
            case 29:
                i11 = 24577;
                i10 = 13;
                return jVar.r(iArr, i10) + i11;
            default:
                throw new b0(String.format("[%s] Bad distance code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(m10), Integer.valueOf(iArr[0])));
        }
    }

    public static void e(b3.j jVar, int[] iArr, j0[] j0VarArr) {
        int r10 = jVar.r(iArr, 5) + ks.g4;
        int r11 = jVar.r(iArr, 5) + 1;
        int r12 = jVar.r(iArr, 4) + 4;
        int[] iArr2 = new int[19];
        for (int i7 = 0; i7 < r12; i7++) {
            iArr2[a[i7]] = (byte) jVar.r(iArr, 3);
        }
        j0 j0Var = new j0(iArr2);
        int[] iArr3 = new int[r10];
        c(jVar, iArr, iArr3, j0Var);
        j0 j0Var2 = new j0(iArr3);
        int[] iArr4 = new int[r11];
        c(jVar, iArr, iArr4, j0Var);
        j0 j0Var3 = new j0(iArr4);
        j0VarArr[0] = j0Var2;
        j0VarArr[1] = j0Var3;
    }

    public static int f(b3.j jVar, int[] iArr, int i7) {
        int i10;
        int i11 = 1;
        switch (i7) {
            case ks.g4 /* 257 */:
            case ks.h4 /* 258 */:
            case ks.i4 /* 259 */:
            case ks.j4 /* 260 */:
            case ks.k4 /* 261 */:
            case ks.l4 /* 262 */:
            case ks.m4 /* 263 */:
            case ks.n4 /* 264 */:
                return i7 - 254;
            case ks.o4 /* 265 */:
                i10 = 11;
                return jVar.r(iArr, i11) + i10;
            case ks.p4 /* 266 */:
                i10 = 13;
                return jVar.r(iArr, i11) + i10;
            case ks.q4 /* 267 */:
                i10 = 15;
                return jVar.r(iArr, i11) + i10;
            case ks.r4 /* 268 */:
                i10 = 17;
                return jVar.r(iArr, i11) + i10;
            case ks.s4 /* 269 */:
                i10 = 19;
                i11 = 2;
                return jVar.r(iArr, i11) + i10;
            case ks.t4 /* 270 */:
                i10 = 23;
                i11 = 2;
                return jVar.r(iArr, i11) + i10;
            case ks.u4 /* 271 */:
                i10 = 27;
                i11 = 2;
                return jVar.r(iArr, i11) + i10;
            case ks.v4 /* 272 */:
                i10 = 31;
                i11 = 2;
                return jVar.r(iArr, i11) + i10;
            case ks.w4 /* 273 */:
                i10 = 35;
                i11 = 3;
                return jVar.r(iArr, i11) + i10;
            case ks.x4 /* 274 */:
                i10 = 43;
                i11 = 3;
                return jVar.r(iArr, i11) + i10;
            case ks.y4 /* 275 */:
                i10 = 51;
                i11 = 3;
                return jVar.r(iArr, i11) + i10;
            case ks.z4 /* 276 */:
                i10 = 59;
                i11 = 3;
                return jVar.r(iArr, i11) + i10;
            case ks.A4 /* 277 */:
                i10 = 67;
                i11 = 4;
                return jVar.r(iArr, i11) + i10;
            case ks.B4 /* 278 */:
                i10 = 83;
                i11 = 4;
                return jVar.r(iArr, i11) + i10;
            case ks.C4 /* 279 */:
                i10 = 99;
                i11 = 4;
                return jVar.r(iArr, i11) + i10;
            case ks.D4 /* 280 */:
                i10 = ks.A1;
                i11 = 4;
                return jVar.r(iArr, i11) + i10;
            case ks.E4 /* 281 */:
                i10 = ks.P1;
                i11 = 5;
                return jVar.r(iArr, i11) + i10;
            case ks.F4 /* 282 */:
                i10 = ks.t2;
                i11 = 5;
                return jVar.r(iArr, i11) + i10;
            case ks.G4 /* 283 */:
                i10 = ks.Z2;
                i11 = 5;
                return jVar.r(iArr, i11) + i10;
            case ks.H4 /* 284 */:
                i10 = ks.E3;
                i11 = 5;
                return jVar.r(iArr, i11) + i10;
            case ks.I4 /* 285 */:
                return ks.h4;
            default:
                throw new b0(String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(i7), Integer.valueOf(iArr[0])));
        }
    }
}
