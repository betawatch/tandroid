package tc;

import c5.c0;
import e2.j0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public abstract class d {
    public static final int[] a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final byte[] b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String a(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (bArr == 0) {
            return null;
        }
        int length = (((((bArr.length * 8) + 5) / 6) + 3) / 4) * 4;
        StringBuilder sb2 = new StringBuilder(length);
        int i14 = 0;
        while (true) {
            int i15 = i14 / 8;
            if (bArr.length <= i15) {
                i11 = -1;
            } else {
                int i16 = bArr.length - 1 == i15 ? 0 : bArr[i15 + 1];
                int i17 = (i14 % 24) / 6;
                if (i17 != 0) {
                    if (i17 == 1) {
                        i12 = (bArr[i15] << 4) & 48;
                        i13 = (i16 >> 4) & 15;
                    } else if (i17 == 2) {
                        i12 = (bArr[i15] << 2) & 60;
                        i13 = (i16 >> 6) & 3;
                    } else if (i17 != 3) {
                        i11 = 0;
                    } else {
                        i10 = bArr[i15];
                    }
                    i11 = i12 | i13;
                } else {
                    i10 = bArr[i15] >> 2;
                }
                i11 = i10 & 63;
            }
            if (i11 < 0) {
                break;
            }
            sb2.append((char) b[i11]);
            i14 += 6;
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
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != ' ' && charAt != '\"' && charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}' && charAt != '(' && charAt != ')') {
                switch (charAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        break;
                    default:
                        switch (charAt) {
                            case '[':
                            case '\\':
                            case ']':
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
    public static void c(c0 c0Var, int[] iArr, int[] iArr2, j0 j0Var) {
        int i10;
        int s10;
        int s11;
        int i11;
        int i12 = 0;
        while (i12 < iArr2.length) {
            int i13 = j0Var.i(c0Var, iArr);
            if (i13 < 0 || i13 > 15) {
                switch (i13) {
                    case 16:
                        i10 = iArr2[i12 - 1];
                        s10 = c0Var.s(2, iArr) + 3;
                        for (i11 = 0; i11 < s10; i11++) {
                            iArr2[i12 + i11] = i10;
                        }
                        i12 += s10 - 1;
                        break;
                    case 17:
                        s11 = c0Var.s(3, iArr) + 3;
                        s10 = s11;
                        i10 = 0;
                        while (i11 < s10) {
                        }
                        i12 += s10 - 1;
                        break;
                    case 18:
                        s11 = c0Var.s(7, iArr) + 11;
                        s10 = s11;
                        i10 = 0;
                        while (i11 < s10) {
                        }
                        i12 += s10 - 1;
                        break;
                    default:
                        throw new com.google.firebase.messaging.q(String.format("[%s] Bad code length '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(i13), iArr));
                }
            } else {
                iArr2[i12] = i13;
            }
            i12++;
        }
    }

    public static int d(c0 c0Var, int[] iArr, j0 j0Var) {
        int i10;
        int i11 = j0Var.i(c0Var, iArr);
        int i12 = 2;
        int i13 = 5;
        switch (i11) {
            case 0:
            case 1:
            case 2:
            case 3:
                return i11 + 1;
            case 4:
                i12 = 1;
                return c0Var.s(i12, iArr) + i13;
            case 5:
                i12 = 1;
                i13 = 7;
                return c0Var.s(i12, iArr) + i13;
            case 6:
                i13 = 9;
                return c0Var.s(i12, iArr) + i13;
            case 7:
                i13 = 13;
                return c0Var.s(i12, iArr) + i13;
            case 8:
                i13 = 17;
                i12 = 3;
                return c0Var.s(i12, iArr) + i13;
            case 9:
                i13 = 25;
                i12 = 3;
                return c0Var.s(i12, iArr) + i13;
            case 10:
                i13 = 33;
                i12 = 4;
                return c0Var.s(i12, iArr) + i13;
            case 11:
                i13 = 49;
                i12 = 4;
                return c0Var.s(i12, iArr) + i13;
            case 12:
                i10 = 65;
                i12 = 5;
                i13 = i10;
                return c0Var.s(i12, iArr) + i13;
            case 13:
                i10 = 97;
                i12 = 5;
                i13 = i10;
                return c0Var.s(i12, iArr) + i13;
            case 14:
                i13 = 129;
                i12 = 6;
                return c0Var.s(i12, iArr) + i13;
            case 15:
                i13 = 193;
                i12 = 6;
                return c0Var.s(i12, iArr) + i13;
            case 16:
                i13 = 257;
                i12 = 7;
                return c0Var.s(i12, iArr) + i13;
            case 17:
                i13 = 385;
                i12 = 7;
                return c0Var.s(i12, iArr) + i13;
            case 18:
                i13 = 513;
                i12 = 8;
                return c0Var.s(i12, iArr) + i13;
            case 19:
                i13 = 769;
                i12 = 8;
                return c0Var.s(i12, iArr) + i13;
            case 20:
                i13 = 1025;
                i12 = 9;
                return c0Var.s(i12, iArr) + i13;
            case 21:
                i13 = 1537;
                i12 = 9;
                return c0Var.s(i12, iArr) + i13;
            case 22:
                i13 = 2049;
                i12 = 10;
                return c0Var.s(i12, iArr) + i13;
            case 23:
                i13 = 3073;
                i12 = 10;
                return c0Var.s(i12, iArr) + i13;
            case 24:
                i13 = 4097;
                i12 = 11;
                return c0Var.s(i12, iArr) + i13;
            case 25:
                i13 = 6145;
                i12 = 11;
                return c0Var.s(i12, iArr) + i13;
            case 26:
                i13 = 8193;
                i12 = 12;
                return c0Var.s(i12, iArr) + i13;
            case 27:
                i13 = 12289;
                i12 = 12;
                return c0Var.s(i12, iArr) + i13;
            case 28:
                i13 = 16385;
                i12 = 13;
                return c0Var.s(i12, iArr) + i13;
            case 29:
                i13 = 24577;
                i12 = 13;
                return c0Var.s(i12, iArr) + i13;
            default:
                throw new com.google.firebase.messaging.q(String.format("[%s] Bad distance code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(i11), Integer.valueOf(iArr[0])));
        }
    }

    public static void e(c0 c0Var, int[] iArr, j0[] j0VarArr) {
        int s10 = c0Var.s(5, iArr) + 257;
        int s11 = c0Var.s(5, iArr) + 1;
        int s12 = c0Var.s(4, iArr) + 4;
        int[] iArr2 = new int[19];
        for (int i10 = 0; i10 < s12; i10++) {
            iArr2[a[i10]] = (byte) c0Var.s(3, iArr);
        }
        j0 j0Var = new j0(iArr2);
        int[] iArr3 = new int[s10];
        c(c0Var, iArr, iArr3, j0Var);
        j0 j0Var2 = new j0(iArr3);
        int[] iArr4 = new int[s11];
        c(c0Var, iArr, iArr4, j0Var);
        j0 j0Var3 = new j0(iArr4);
        j0VarArr[0] = j0Var2;
        j0VarArr[1] = j0Var3;
    }

    public static int f(c0 c0Var, int[] iArr, int i10) {
        int i11;
        int i12 = 1;
        switch (i10) {
            case 257:
            case 258:
            case 259:
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
                return i10 - 254;
            case 265:
                i11 = 11;
                return c0Var.s(i12, iArr) + i11;
            case 266:
                i11 = 13;
                return c0Var.s(i12, iArr) + i11;
            case 267:
                i11 = 15;
                return c0Var.s(i12, iArr) + i11;
            case 268:
                i11 = 17;
                return c0Var.s(i12, iArr) + i11;
            case 269:
                i11 = 19;
                i12 = 2;
                return c0Var.s(i12, iArr) + i11;
            case 270:
                i11 = 23;
                i12 = 2;
                return c0Var.s(i12, iArr) + i11;
            case 271:
                i11 = 27;
                i12 = 2;
                return c0Var.s(i12, iArr) + i11;
            case 272:
                i11 = 31;
                i12 = 2;
                return c0Var.s(i12, iArr) + i11;
            case 273:
                i11 = 35;
                i12 = 3;
                return c0Var.s(i12, iArr) + i11;
            case 274:
                i11 = 43;
                i12 = 3;
                return c0Var.s(i12, iArr) + i11;
            case 275:
                i11 = 51;
                i12 = 3;
                return c0Var.s(i12, iArr) + i11;
            case 276:
                i11 = 59;
                i12 = 3;
                return c0Var.s(i12, iArr) + i11;
            case 277:
                i11 = 67;
                i12 = 4;
                return c0Var.s(i12, iArr) + i11;
            case 278:
                i11 = 83;
                i12 = 4;
                return c0Var.s(i12, iArr) + i11;
            case 279:
                i11 = 99;
                i12 = 4;
                return c0Var.s(i12, iArr) + i11;
            case 280:
                i11 = 115;
                i12 = 4;
                return c0Var.s(i12, iArr) + i11;
            case 281:
                i11 = 131;
                i12 = 5;
                return c0Var.s(i12, iArr) + i11;
            case 282:
                i11 = 163;
                i12 = 5;
                return c0Var.s(i12, iArr) + i11;
            case 283:
                i11 = 195;
                i12 = 5;
                return c0Var.s(i12, iArr) + i11;
            case 284:
                i11 = 227;
                i12 = 5;
                return c0Var.s(i12, iArr) + i11;
            case 285:
                return 258;
            default:
                throw new com.google.firebase.messaging.q(String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", d.class.getSimpleName(), Integer.valueOf(i10), Integer.valueOf(iArr[0])));
        }
    }
}
