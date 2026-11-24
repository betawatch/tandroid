// default package

import j$.util.Objects;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class yad {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        gre.p(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static String c(fm4 fm4Var) {
        String str = fm4Var.t;
        String str2 = fm4Var.l;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return fm4Var.t;
    }

    public static boolean d(byte[] bArr, int i, fm4 fm4Var) {
        int i2;
        if (Objects.equals(fm4Var.t, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(fm4Var.t, "video/hevc")) {
            pc0 f = f(new rf6(bArr, 4, i + 4));
            int i3 = f.a;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && f.c == fm4Var.M - 1) {
                return false;
            }
        }
        return true;
    }

    public static int e(fm4 fm4Var) {
        String c2 = c(fm4Var);
        if (Objects.equals(c2, "video/avc")) {
            return 1;
        }
        return (Objects.equals(c2, "video/hevc") || Objects.equals(c2, "video/vvc")) ? 2 : 0;
    }

    public static pc0 f(rf6 rf6Var) {
        rf6Var.j();
        return new pc0(rf6Var.e(6), rf6Var.e(6), rf6Var.e(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qh7 g(rf6 rf6Var, boolean z, int i, qh7 qh7Var) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (z) {
            int e = rf6Var.e(2);
            z3 = rf6Var.d();
            i5 = rf6Var.e(5);
            i6 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (rf6Var.d()) {
                    i6 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = rf6Var.e(8);
            }
            i2 = e;
        } else {
            if (qh7Var == null) {
                iArr = iArr2;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                z2 = false;
                int e2 = rf6Var.e(8);
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    if (rf6Var.d()) {
                        i9 += 88;
                    }
                    if (rf6Var.d()) {
                        i9 += 8;
                    }
                }
                rf6Var.k(i9);
                if (i > 0) {
                    rf6Var.k((8 - i) << 1);
                }
                return new qh7(i2, i3, i4, e2, z2, iArr);
            }
            int i11 = qh7Var.a;
            z3 = qh7Var.b;
            i5 = qh7Var.c;
            i6 = qh7Var.d;
            iArr2 = qh7Var.e;
            i2 = i11;
        }
        iArr = iArr2;
        z2 = z3;
        i3 = i5;
        i4 = i6;
        int e22 = rf6Var.e(8);
        int i92 = 0;
        while (i10 < i) {
        }
        rf6Var.k(i92);
        if (i > 0) {
        }
        return new qh7(i2, i3, i4, e22, z2, iArr);
    }

    public static g30 h(int i, int i2, byte[] bArr) {
        int i3 = i + 2;
        do {
            i2--;
            if (bArr[i2] != 0) {
                if (i2 <= i3) {
                    return null;
                }
                rf6 rf6Var = new rf6(bArr, i3, i2 + 1);
                while (rf6Var.b(16)) {
                    int e = rf6Var.e(8);
                    int i4 = 0;
                    while (e == 255) {
                        i4 += kk7.d4;
                        e = rf6Var.e(8);
                    }
                    int i5 = i4 + e;
                    int e2 = rf6Var.e(8);
                    int i6 = 0;
                    while (e2 == 255) {
                        i6 += kk7.d4;
                        e2 = rf6Var.e(8);
                    }
                    int i7 = i6 + e2;
                    if (i7 == 0 || !rf6Var.b(i7)) {
                        return null;
                    }
                    if (i5 == 176) {
                        int f = rf6Var.f();
                        boolean d2 = rf6Var.d();
                        int f2 = d2 ? rf6Var.f() : 0;
                        int f3 = rf6Var.f();
                        int i8 = -1;
                        for (int i9 = 0; i9 <= f3; i9++) {
                            i8 = rf6Var.f();
                            rf6Var.f();
                            int e3 = rf6Var.e(6);
                            if (e3 == 63) {
                                return null;
                            }
                            rf6Var.e(e3 == 0 ? Math.max(0, f - 30) : Math.max(0, (e3 + f) - 31));
                            if (d2) {
                                int e4 = rf6Var.e(6);
                                if (e4 == 63) {
                                    return null;
                                }
                                rf6Var.e(e4 == 0 ? Math.max(0, f2 - 30) : Math.max(0, (e4 + f2) - 31));
                            }
                            if (rf6Var.d()) {
                                rf6Var.k(10);
                            }
                        }
                        return new g30(i8);
                    }
                    rf6Var.k(i7 << 3);
                }
                return null;
            }
        } while (i2 > i3);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static th7 i(byte[] bArr, int i, int i2, c5a c5aVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int f;
        int i7;
        int f2;
        int i8;
        int i9;
        int i10;
        int f3;
        int i11;
        qh7 qh7Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        byte b2;
        int i17;
        int i18;
        int i19;
        byte b3;
        rh7 rh7Var;
        int i20;
        int i21;
        int i22;
        wk4 wk4Var;
        pc0 f4 = f(new rf6(bArr, i, i2));
        rf6 rf6Var = new rf6(bArr, i + 2, i2);
        int i23 = 4;
        rf6Var.k(4);
        int e = rf6Var.e(3);
        int i24 = f4.b;
        boolean z = i24 != 0 && e == 7;
        if (c5aVar != null) {
            mm5 mm5Var = (mm5) c5aVar.b;
            if (!mm5Var.isEmpty()) {
                i3 = ((ph7) mm5Var.get(Math.min(i24, mm5Var.size() - 1))).a;
                qh7 qh7Var2 = null;
                if (z) {
                    rf6Var.j();
                    qh7Var2 = g(rf6Var, true, e, null);
                } else if (c5aVar != null) {
                    rh7 rh7Var2 = (rh7) c5aVar.c;
                    int[] iArr = rh7Var2.b;
                    mm5 mm5Var2 = rh7Var2.a;
                    int i25 = iArr[i3];
                    if (mm5Var2.size() > i25) {
                        qh7Var2 = (qh7) mm5Var2.get(i25);
                    }
                }
                rf6Var.f();
                if (z) {
                    int f5 = rf6Var.f();
                    if (f5 == 3) {
                        rf6Var.j();
                    }
                    int f6 = rf6Var.f();
                    int f7 = rf6Var.f();
                    if (rf6Var.d()) {
                        int f8 = rf6Var.f();
                        int f9 = rf6Var.f();
                        int f10 = rf6Var.f();
                        int f11 = rf6Var.f();
                        i4 = f6 - ((f8 + f9) * ((f5 == 1 || f5 == 2) ? 2 : 1));
                        i5 = f7 - ((f10 + f11) * (f5 == 1 ? 2 : 1));
                    } else {
                        i4 = f6;
                        i5 = f7;
                    }
                    i6 = i5;
                    f = rf6Var.f();
                    i7 = i4;
                    f2 = rf6Var.f();
                    i8 = f7;
                    i9 = f6;
                } else {
                    int e2 = rf6Var.d() ? rf6Var.e(8) : -1;
                    if (c5aVar != null && (wk4Var = (wk4) c5aVar.d) != null) {
                        mm5 mm5Var3 = (mm5) wk4Var.b;
                        if (e2 == -1) {
                            e2 = ((int[]) wk4Var.c)[i3];
                        }
                        if (e2 != -1 && mm5Var3.size() > e2) {
                            sh7 sh7Var = (sh7) mm5Var3.get(e2);
                            int i26 = sh7Var.a;
                            i7 = sh7Var.d;
                            int i27 = sh7Var.e;
                            f = sh7Var.b;
                            f2 = sh7Var.c;
                            i6 = i27;
                            i8 = i6;
                            i9 = i7;
                        }
                    }
                    f = 0;
                    f2 = 0;
                    i7 = 0;
                    i9 = 0;
                    i6 = 0;
                    i8 = 0;
                }
                int f12 = rf6Var.f();
                if (z) {
                    i10 = -1;
                    for (int i28 = rf6Var.d() ? 0 : e; i28 <= e; i28++) {
                        rf6Var.f();
                        i10 = Math.max(rf6Var.f(), i10);
                        rf6Var.f();
                    }
                } else {
                    i10 = -1;
                }
                rf6Var.f();
                rf6Var.f();
                rf6Var.f();
                rf6Var.f();
                rf6Var.f();
                rf6Var.f();
                if (rf6Var.d()) {
                    int i29 = 6;
                    if (z ? rf6Var.d() : false) {
                        rf6Var.k(6);
                    } else if (rf6Var.d()) {
                        int i30 = 0;
                        while (i30 < i23) {
                            int i31 = 0;
                            while (i31 < i29) {
                                if (rf6Var.d()) {
                                    int min = Math.min(64, 1 << ((i30 << 1) + 4));
                                    if (i30 > 1) {
                                        rf6Var.g();
                                    }
                                    for (int i32 = 0; i32 < min; i32++) {
                                        rf6Var.g();
                                    }
                                } else {
                                    rf6Var.f();
                                }
                                i31 += i30 == 3 ? 3 : 1;
                                i29 = 6;
                            }
                            i30++;
                            i23 = 4;
                            i29 = 6;
                        }
                    }
                }
                rf6Var.k(2);
                if (rf6Var.d()) {
                    rf6Var.k(8);
                    rf6Var.f();
                    rf6Var.f();
                    rf6Var.j();
                }
                f3 = rf6Var.f();
                int[] iArr2 = new int[0];
                int[] iArr3 = new int[0];
                i11 = 0;
                int i33 = -1;
                int i34 = -1;
                while (i11 < f3) {
                    if (i11 == 0 || !rf6Var.d()) {
                        i20 = f3;
                        i21 = i3;
                        i22 = i11;
                        int f13 = rf6Var.f();
                        i33 = rf6Var.f();
                        int[] iArr4 = new int[f13];
                        int i35 = 0;
                        while (i35 < f13) {
                            iArr4[i35] = (i35 > 0 ? iArr4[i35 - 1] : 0) - (rf6Var.f() + 1);
                            rf6Var.j();
                            i35++;
                        }
                        int[] iArr5 = new int[i33];
                        int i36 = 0;
                        while (i36 < i33) {
                            iArr5[i36] = rf6Var.f() + 1 + (i36 > 0 ? iArr5[i36 - 1] : 0);
                            rf6Var.j();
                            i36++;
                        }
                        i34 = f13;
                        iArr2 = iArr4;
                        iArr3 = iArr5;
                    } else {
                        i20 = f3;
                        int i37 = i34 + i33;
                        int f14 = (1 - ((rf6Var.d() ? 1 : 0) << 1)) * (rf6Var.f() + 1);
                        i21 = i3;
                        int i38 = i37 + 1;
                        i22 = i11;
                        boolean[] zArr = new boolean[i38];
                        for (int i39 = 0; i39 <= i37; i39++) {
                            if (rf6Var.d()) {
                                zArr[i39] = true;
                            } else {
                                zArr[i39] = rf6Var.d();
                            }
                        }
                        int[] iArr6 = new int[i38];
                        int[] iArr7 = new int[i38];
                        int i40 = 0;
                        for (int i41 = i33 - 1; i41 >= 0; i41--) {
                            int i42 = iArr3[i41] + f14;
                            if (i42 < 0 && zArr[i34 + i41]) {
                                iArr6[i40] = i42;
                                i40++;
                            }
                        }
                        if (f14 < 0 && zArr[i37]) {
                            iArr6[i40] = f14;
                            i40++;
                        }
                        int i43 = i40;
                        int[] iArr8 = iArr2;
                        for (int i44 = 0; i44 < i34; i44++) {
                            int i45 = iArr8[i44] + f14;
                            if (i45 < 0 && zArr[i44]) {
                                iArr6[i43] = i45;
                                i43++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr6, i43);
                        int i46 = 0;
                        for (int i47 = i34 - 1; i47 >= 0; i47--) {
                            int i48 = iArr8[i47] + f14;
                            if (i48 > 0 && zArr[i47]) {
                                iArr7[i46] = i48;
                                i46++;
                            }
                        }
                        if (f14 > 0 && zArr[i37]) {
                            iArr7[i46] = f14;
                            i46++;
                        }
                        int i49 = i43;
                        int i50 = i46;
                        for (int i51 = 0; i51 < i33; i51++) {
                            int i52 = iArr3[i51] + f14;
                            if (i52 > 0 && zArr[i34 + i51]) {
                                iArr7[i50] = i52;
                                i50++;
                            }
                        }
                        iArr3 = Arrays.copyOf(iArr7, i50);
                        i33 = i50;
                        i34 = i49;
                        iArr2 = copyOf;
                    }
                    i11 = i22 + 1;
                    f3 = i20;
                    i3 = i21;
                }
                int i53 = i3;
                if (rf6Var.d()) {
                    int f15 = rf6Var.f();
                    for (int i54 = 0; i54 < f15; i54++) {
                        rf6Var.k(f12 + 5);
                    }
                }
                rf6Var.k(2);
                float f16 = 1.0f;
                if (rf6Var.d()) {
                    qh7Var = qh7Var2;
                    i12 = f;
                    i13 = i7;
                    i14 = i9;
                    i15 = i8;
                    i16 = -1;
                    b2 = -1;
                    i17 = -1;
                } else {
                    if (rf6Var.d()) {
                        int e3 = rf6Var.e(8);
                        if (e3 == 255) {
                            int e4 = rf6Var.e(16);
                            int e5 = rf6Var.e(16);
                            if (e4 != 0 && e5 != 0) {
                                f16 = e4 / e5;
                            }
                        } else if (e3 < 17) {
                            f16 = b[e3];
                        } else {
                            b00.o(e3, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (rf6Var.d()) {
                        rf6Var.j();
                    }
                    if (rf6Var.d()) {
                        rf6Var.k(3);
                        b3 = rf6Var.d() ? (byte) 1 : (byte) 2;
                        if (rf6Var.d()) {
                            int e6 = rf6Var.e(8);
                            int e7 = rf6Var.e(8);
                            rf6Var.k(8);
                            i18 = hl2.f(e6);
                            i19 = hl2.g(e7);
                        } else {
                            i18 = -1;
                            i19 = -1;
                        }
                    } else {
                        if (c5aVar != null && (rh7Var = (rh7) c5aVar.e) != null) {
                            mm5 mm5Var4 = rh7Var.a;
                            int i55 = rh7Var.b[i53];
                            if (mm5Var4.size() > i55) {
                                uh7 uh7Var = (uh7) mm5Var4.get(i55);
                                int i56 = uh7Var.a;
                                byte b4 = uh7Var.b;
                                i19 = uh7Var.c;
                                i18 = i56;
                                b3 = b4;
                            }
                        }
                        i18 = -1;
                        i19 = -1;
                        b3 = -1;
                    }
                    if (rf6Var.d()) {
                        rf6Var.f();
                        rf6Var.f();
                    }
                    rf6Var.j();
                    if (rf6Var.d()) {
                        i6 <<= 1;
                    }
                    i16 = i18;
                    i17 = i19;
                    b2 = b3;
                    qh7Var = qh7Var2;
                    i12 = f;
                    i13 = i7;
                    i14 = i9;
                    i15 = i8;
                }
                return new th7(e, qh7Var, i12, f2, i13, i6, i14, i15, f16, i10, i16, b2, i17);
            }
        }
        i3 = 0;
        qh7 qh7Var22 = null;
        if (z) {
        }
        rf6Var.f();
        if (z) {
        }
        int f122 = rf6Var.f();
        if (z) {
        }
        rf6Var.f();
        rf6Var.f();
        rf6Var.f();
        rf6Var.f();
        rf6Var.f();
        rf6Var.f();
        if (rf6Var.d()) {
        }
        rf6Var.k(2);
        if (rf6Var.d()) {
        }
        f3 = rf6Var.f();
        int[] iArr22 = new int[0];
        int[] iArr32 = new int[0];
        i11 = 0;
        int i332 = -1;
        int i342 = -1;
        while (i11 < f3) {
        }
        int i532 = i3;
        if (rf6Var.d()) {
        }
        rf6Var.k(2);
        float f162 = 1.0f;
        if (rf6Var.d()) {
        }
        return new th7(e, qh7Var, i12, f2, i13, i6, i14, i15, f162, i10, i16, b2, i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c5a j(int i, int i2, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        rh7 rh7Var;
        int i3;
        int i4;
        int i5;
        w59 w59Var;
        boolean[][] zArr;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i6;
        int i7;
        boolean d2;
        int i8;
        int i9;
        int i10;
        boolean d3;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        rf6 rf6Var = new rf6(bArr, i, i2);
        f(rf6Var);
        rf6Var.k(4);
        boolean d4 = rf6Var.d();
        boolean d5 = rf6Var.d();
        int e = rf6Var.e(6);
        int i13 = e + 1;
        int e2 = rf6Var.e(3);
        rf6Var.k(17);
        qh7 g = g(rf6Var, true, e2, null);
        for (int i14 = rf6Var.d() ? 0 : e2; i14 <= e2; i14++) {
            rf6Var.f();
            rf6Var.f();
            rf6Var.f();
        }
        int e3 = rf6Var.e(6);
        int f = rf6Var.f() + 1;
        int i15 = 6;
        rh7 rh7Var2 = new rh7(mm5.u(g), new int[1], (byte) 0);
        boolean z3 = i13 >= 2 && f >= 2;
        boolean z4 = d4 && d5;
        int i16 = e3 + 1;
        boolean z5 = i16 >= i13;
        if (!z3 || !z4 || !z5) {
            return new c5a((w59) null, rh7Var2, (wk4) null, (rh7) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, f, i16);
        int i17 = 1;
        int[] iArr6 = new int[f];
        int[] iArr7 = new int[f];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i18 = 1; i18 < f; i18++) {
            int i19 = 0;
            for (int i20 = 0; i20 <= e3; i20++) {
                if (rf6Var.d()) {
                    iArr5[i18][i19] = i20;
                    iArr7[i18] = i20;
                    i19++;
                }
                iArr6[i18] = i19;
            }
        }
        if (rf6Var.d()) {
            rf6Var.k(64);
            if (rf6Var.d()) {
                rf6Var.f();
            }
            int f2 = rf6Var.f();
            int i21 = 0;
            while (i21 < f2) {
                rf6Var.f();
                if (i21 == 0 || rf6Var.d()) {
                    boolean d6 = rf6Var.d();
                    boolean d7 = rf6Var.d();
                    z2 = d6;
                    z = d7;
                    if (d6 || d7) {
                        d2 = rf6Var.d();
                        if (d2) {
                            rf6Var.k(19);
                        }
                        rf6Var.k(8);
                        if (d2) {
                            rf6Var.k(4);
                        }
                        rf6Var.k(15);
                        i9 = d6;
                        i8 = d7;
                        i10 = 0;
                        while (i10 <= e2) {
                            boolean d8 = rf6Var.d();
                            if (!d8) {
                                d8 = rf6Var.d();
                            }
                            if (d8) {
                                rf6Var.f();
                                d3 = false;
                            } else {
                                d3 = rf6Var.d();
                            }
                            if (d3) {
                                i11 = i21;
                                i12 = 0;
                            } else {
                                i11 = i21;
                                i12 = rf6Var.f();
                            }
                            int[][] iArr8 = iArr5;
                            int i22 = i9 + i8;
                            int[] iArr9 = iArr7;
                            int i23 = 0;
                            while (i23 < i22) {
                                int i24 = i22;
                                for (int i25 = 0; i25 <= i12; i25++) {
                                    rf6Var.f();
                                    rf6Var.f();
                                    if (d2) {
                                        rf6Var.f();
                                        rf6Var.f();
                                    }
                                    rf6Var.j();
                                }
                                i23++;
                                i22 = i24;
                            }
                            i10++;
                            i21 = i11;
                            iArr5 = iArr8;
                            iArr7 = iArr9;
                        }
                        i21++;
                    }
                } else {
                    z2 = false;
                    z = false;
                }
                d2 = false;
                i9 = z2;
                i8 = z;
                i10 = 0;
                while (i10 <= e2) {
                }
                i21++;
            }
        }
        int[][] iArr10 = iArr5;
        int[] iArr11 = iArr7;
        if (!rf6Var.d()) {
            return new c5a((w59) null, rh7Var2, (wk4) null, (rh7) null);
        }
        int i26 = rf6Var.d;
        if (i26 > 0) {
            rf6Var.k(8 - i26);
        }
        qh7 g2 = g(rf6Var, false, e2, g);
        boolean d9 = rf6Var.d();
        boolean[] zArr3 = new boolean[16];
        int i27 = 0;
        for (int i28 = 0; i28 < 16; i28++) {
            boolean d10 = rf6Var.d();
            zArr3[i28] = d10;
            if (d10) {
                i27++;
            }
        }
        if (i27 == 0 || !zArr3[1]) {
            return new c5a((w59) null, rh7Var2, (wk4) null, (rh7) null);
        }
        int[] iArr12 = new int[i27];
        for (int i29 = 0; i29 < i27 - (d9 ? 1 : 0); i29++) {
            iArr12[i29] = rf6Var.e(3);
        }
        int[] iArr13 = new int[i27 + 1];
        if (d9) {
            int i30 = 1;
            while (true) {
                iArr = iArr13;
                if (i30 >= i27) {
                    break;
                }
                for (int i31 = 0; i31 < i30; i31++) {
                    iArr[i30] = iArr12[i31] + 1 + iArr[i30];
                }
                i30++;
                iArr13 = iArr;
            }
            iArr[i27] = 6;
        } else {
            iArr = iArr13;
        }
        int[][] iArr14 = (int[][]) Array.newInstance((Class<?>) cls, i13, i27);
        int[] iArr15 = new int[i13];
        iArr15[0] = 0;
        boolean d11 = rf6Var.d();
        int i32 = 1;
        while (i32 < i13) {
            int i33 = i32;
            if (d11) {
                iArr15[i33] = rf6Var.e(i15);
            } else {
                iArr15[i33] = i33;
            }
            int i34 = 0;
            if (d9) {
                while (i34 < i27) {
                    iArr14[i33][i34] = (iArr15[i33] & ((1 << iArr[r31]) - 1)) >> iArr[i34];
                    i34++;
                }
            } else {
                while (i34 < i27) {
                    int i35 = i34;
                    iArr14[i33][i35] = rf6Var.e(iArr12[i34] + 1);
                    i34 = i35 + 1;
                }
            }
            i32 = i33 + 1;
            i15 = 6;
        }
        int[] iArr16 = new int[i16];
        int i36 = 1;
        int i37 = 0;
        while (i37 < i13) {
            iArr16[iArr15[i37]] = -1;
            int[] iArr17 = iArr16;
            int i38 = 0;
            int i39 = 0;
            while (i38 < 16) {
                if (zArr3[i38]) {
                    if (i38 == i17) {
                        iArr17[iArr15[i37]] = iArr14[i37][i39];
                    }
                    i39++;
                }
                i38++;
                i17 = 1;
            }
            if (i37 > 0) {
                while (true) {
                    if (i7 >= i37) {
                        i36++;
                        break;
                    }
                    i7 = iArr17[iArr15[i37]] != iArr17[iArr15[i7]] ? i7 + 1 : 0;
                }
            }
            i37++;
            iArr16 = iArr17;
            i17 = 1;
        }
        int[] iArr18 = iArr16;
        int e4 = rf6Var.e(4);
        if (i36 < 2 || e4 == 0) {
            return new c5a((w59) null, rh7Var2, (wk4) null, (rh7) null);
        }
        int[] iArr19 = new int[i36];
        for (int i40 = 0; i40 < i36; i40++) {
            iArr19[i40] = rf6Var.e(e4);
        }
        int[] iArr20 = new int[i16];
        for (int i41 = 0; i41 < i13; i41++) {
            iArr20[Math.min(iArr15[i41], e3)] = i41;
        }
        jm5 p = mm5.p();
        int i42 = 0;
        while (i42 <= e3) {
            int[] iArr21 = iArr20;
            int i43 = i36;
            int min = Math.min(iArr18[i42], i43 - 1);
            p.c(new ph7(iArr21[i42], min >= 0 ? iArr19[min] : -1));
            i42++;
            iArr20 = iArr21;
            iArr15 = iArr15;
            i36 = i43;
        }
        int[] iArr22 = iArr15;
        w59 f3 = p.f();
        if (((ph7) f3.get(0)).b == -1) {
            return new c5a((w59) null, rh7Var2, (wk4) null, (rh7) null);
        }
        int i44 = 1;
        while (true) {
            if (i44 > e3) {
                i44 = -1;
                break;
            }
            if (((ph7) f3.get(i44)).b != -1) {
                break;
            }
            i44++;
        }
        if (i44 == -1) {
            return new c5a((w59) null, rh7Var2, (wk4) null, (rh7) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        for (int i45 = 1; i45 < i13; i45++) {
            for (int i46 = 0; i46 < i45; i46++) {
                boolean[] zArr6 = zArr4[i45];
                boolean[] zArr7 = zArr5[i45];
                boolean d12 = rf6Var.d();
                zArr7[i46] = d12;
                zArr6[i46] = d12;
            }
        }
        for (int i47 = 1; i47 < i13; i47++) {
            int i48 = 0;
            while (i48 < e) {
                boolean[][] zArr8 = zArr4;
                int i49 = 0;
                while (true) {
                    if (i49 < i47) {
                        boolean[] zArr9 = zArr5[i47];
                        if (zArr9[i49] && zArr5[i49][i48]) {
                            zArr9[i48] = true;
                            break;
                        }
                        i49++;
                    }
                }
                i48++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr23 = new int[i16];
        for (int i50 = 0; i50 < i13; i50++) {
            int i51 = 0;
            for (int i52 = 0; i52 < i50; i52++) {
                i51 += zArr10[i50][i52] ? 1 : 0;
            }
            iArr23[iArr22[i50]] = i51;
        }
        int i53 = 0;
        for (int i54 = 0; i54 < i13; i54++) {
            if (iArr23[iArr22[i54]] == 0) {
                i53++;
            }
        }
        if (i53 > 1) {
            return new c5a((w59) null, rh7Var2, (wk4) null, (rh7) null);
        }
        int[] iArr24 = new int[i13];
        int[] iArr25 = new int[f];
        if (rf6Var.d()) {
            iArr2 = iArr23;
            int i55 = 0;
            while (i55 < i13) {
                int i56 = i55;
                iArr24[i56] = rf6Var.e(3);
                i55 = i56 + 1;
            }
        } else {
            iArr2 = iArr23;
            Arrays.fill(iArr24, 0, i13, e2);
        }
        int i57 = 0;
        while (i57 < f) {
            int i58 = i57;
            boolean[][] zArr11 = zArr5;
            int[] iArr26 = iArr24;
            int i59 = 0;
            for (int i60 = 0; i60 < iArr6[i58]; i60++) {
                i59 = Math.max(i59, iArr26[((ph7) f3.get(iArr10[i58][i60])).a]);
            }
            iArr25[i58] = i59 + 1;
            i57 = i58 + 1;
            zArr5 = zArr11;
            iArr24 = iArr26;
        }
        boolean[][] zArr12 = zArr5;
        if (rf6Var.d()) {
            int i61 = 0;
            while (i61 < e) {
                int i62 = i61 + 1;
                int i63 = i62;
                while (i63 < i13) {
                    if (zArr10[i63][i61]) {
                        i6 = e;
                        rf6Var.k(3);
                    } else {
                        i6 = e;
                    }
                    i63++;
                    e = i6;
                }
                i61 = i62;
            }
        }
        rf6Var.j();
        int f4 = rf6Var.f() + 1;
        jm5 p2 = mm5.p();
        p2.c(g);
        if (f4 > 1) {
            p2.c(g2);
            for (int i64 = 2; i64 < f4; i64++) {
                g2 = g(rf6Var, rf6Var.d(), e2, g2);
                p2.c(g2);
            }
        }
        w59 f5 = p2.f();
        int f6 = rf6Var.f() + f;
        if (f6 > f) {
            return new c5a((w59) null, rh7Var2, (wk4) null, (rh7) null);
        }
        int e5 = rf6Var.e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, f6, i16);
        int[] iArr27 = new int[f6];
        int i65 = 0;
        int[] iArr28 = new int[f6];
        int i66 = 0;
        while (i66 < f) {
            iArr27[i66] = i65;
            iArr28[i66] = iArr11[i66];
            int i67 = i66;
            if (e5 == 0) {
                zArr2 = zArr13;
                iArr3 = iArr27;
                iArr4 = iArr25;
                Arrays.fill(zArr13[i67], i65, iArr6[i67], true);
                iArr3[i67] = iArr6[i67];
            } else {
                zArr2 = zArr13;
                iArr3 = iArr27;
                iArr4 = iArr25;
                if (e5 == 1) {
                    int i68 = iArr11[i67];
                    for (int i69 = 0; i69 < iArr6[i67]; i69++) {
                        zArr2[i67][i69] = iArr10[i67][i69] == i68;
                    }
                    iArr3[i67] = 1;
                } else {
                    i65 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i66 = i67 + 1;
                    zArr13 = zArr2;
                    iArr27 = iArr3;
                    iArr25 = iArr4;
                }
            }
            i65 = 0;
            i66 = i67 + 1;
            zArr13 = zArr2;
            iArr27 = iArr3;
            iArr25 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr29 = iArr27;
        int[] iArr30 = iArr25;
        int[] iArr31 = new int[i16];
        int i70 = 2;
        int[] iArr32 = new int[2];
        iArr32[1] = i16;
        iArr32[i65] = f6;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr32);
        int i71 = 1;
        int i72 = 0;
        while (i71 < f6) {
            if (e5 == i70) {
                for (int i73 = 0; i73 < iArr6[i71]; i73++) {
                    zArr14[i71][i73] = rf6Var.d();
                    int i74 = iArr29[i71];
                    boolean z6 = zArr14[i71][i73];
                    iArr29[i71] = i74 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr28[i71] = iArr10[i71][i73];
                    }
                }
            }
            if (i72 == 0 && iArr10[i71][0] == 0 && zArr14[i71][0]) {
                for (int i75 = 1; i75 < iArr6[i71]; i75++) {
                    if (iArr10[i71][i75] == i44 && zArr14[i71][i44]) {
                        i72 = i71;
                    }
                }
            }
            int i76 = 0;
            while (i76 < iArr6[i71]) {
                if (f4 > 1) {
                    zArr15[i71][i76] = zArr14[i71][i76];
                    w59Var = f5;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int c2 = lee.c(f4);
                    if (!zArr[i71][i76]) {
                        int i77 = ((ph7) f3.get(iArr10[i71][i76])).a;
                        int i78 = 0;
                        while (true) {
                            if (i78 >= i76) {
                                break;
                            }
                            int i79 = i78;
                            if (zArr12[i77][((ph7) f3.get(iArr10[i71][i79])).a]) {
                                zArr[i71][i76] = true;
                                break;
                            }
                            i78 = i79 + 1;
                        }
                    }
                    if (zArr[i71][i76]) {
                        if (i72 <= 0 || i71 != i72) {
                            rf6Var.k(c2);
                        } else {
                            iArr31[i76] = rf6Var.e(c2);
                        }
                    }
                } else {
                    w59Var = f5;
                    zArr = zArr15;
                }
                i76++;
                f5 = w59Var;
                zArr15 = zArr;
            }
            w59 w59Var2 = f5;
            boolean[][] zArr16 = zArr15;
            if (iArr29[i71] == 1 && iArr2[iArr28[i71]] > 0) {
                rf6Var.j();
            }
            i71++;
            f5 = w59Var2;
            zArr15 = zArr16;
            i70 = 2;
        }
        w59 w59Var3 = f5;
        boolean[][] zArr17 = zArr15;
        if (i72 == 0) {
            return new c5a((w59) null, rh7Var2, (wk4) null, (rh7) null);
        }
        int f7 = rf6Var.f();
        int i80 = f7 + 1;
        krd.b(i80, "expectedSize");
        krd.b(i80, "initialCapacity");
        int[] iArr33 = new int[i13];
        Object[] objArr = new Object[i80];
        int i81 = 0;
        int i82 = 0;
        boolean z7 = false;
        while (i81 < i80) {
            int i83 = i81;
            int e6 = rf6Var.e(16);
            int e7 = rf6Var.e(16);
            boolean z8 = z7;
            if (rf6Var.d()) {
                i3 = rf6Var.e(2);
                if (i3 == 3) {
                    rf6Var.j();
                }
                i4 = rf6Var.e(4);
                i5 = rf6Var.e(4);
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            if (rf6Var.d()) {
                int f8 = rf6Var.f();
                int f9 = rf6Var.f();
                int f10 = rf6Var.f();
                int f11 = rf6Var.f();
                e6 -= (f8 + f9) * ((i3 == 1 || i3 == 2) ? 2 : 1);
                e7 -= (f10 + f11) * (i3 == 1 ? 2 : 1);
            }
            sh7 sh7Var = new sh7(i3, i4, i5, e6, e7);
            int b2 = fm5.b(objArr.length, i82 + 1);
            if (b2 > objArr.length || z8) {
                objArr = Arrays.copyOf(objArr, b2);
                z7 = false;
            } else {
                z7 = z8;
            }
            objArr[i82] = sh7Var;
            i82++;
            i81 = i83 + 1;
        }
        if (i80 <= 1 || !rf6Var.d()) {
            for (int i84 = 1; i84 < i13; i84++) {
                iArr33[i84] = Math.min(i84, f7);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int c3 = lee.c(i80);
            for (int i85 = 1; i85 < i13; i85++) {
                iArr33[i85] = rf6Var.e(c3);
            }
        }
        wk4 wk4Var = new wk4(mm5.o(i82, objArr), iArr33);
        rf6Var.k(2);
        for (int i86 = 1; i86 < i13; i86++) {
            if (iArr2[iArr22[i86]] == 0) {
                rf6Var.j();
            }
        }
        for (int i87 = 1; i87 < f6; i87++) {
            boolean d13 = rf6Var.d();
            int i88 = 0;
            while (i88 < iArr30[i87]) {
                if ((i88 <= 0 || !d13) ? i88 == 0 : rf6Var.d()) {
                    for (int i89 = 0; i89 < iArr6[i87]; i89++) {
                        if (zArr17[i87][i89]) {
                            rf6Var.f();
                        }
                    }
                    rf6Var.f();
                    rf6Var.f();
                }
                i88++;
            }
        }
        int f12 = rf6Var.f() + 2;
        if (rf6Var.d()) {
            rf6Var.k(f12);
        } else {
            for (int i90 = 1; i90 < i13; i90++) {
                for (int i91 = 0; i91 < i90; i91++) {
                    if (zArr10[i90][i91]) {
                        rf6Var.k(f12);
                    }
                }
            }
        }
        int f13 = rf6Var.f();
        for (int i92 = 1; i92 <= f13; i92++) {
            rf6Var.k(8);
        }
        if (rf6Var.d()) {
            int i93 = rf6Var.d;
            if (i93 > 0) {
                rf6Var.k(8 - i93);
            }
            if (!rf6Var.d() ? rf6Var.d() : true) {
                rf6Var.j();
            }
            boolean d14 = rf6Var.d();
            boolean d15 = rf6Var.d();
            if (d14 || d15) {
                for (int i94 = 0; i94 < f; i94++) {
                    for (int i95 = 0; i95 < iArr30[i94]; i95++) {
                        boolean d16 = d14 ? rf6Var.d() : false;
                        boolean d17 = d15 ? rf6Var.d() : false;
                        if (d16) {
                            rf6Var.k(32);
                        }
                        if (d17) {
                            rf6Var.k(18);
                        }
                    }
                }
            }
            boolean d18 = rf6Var.d();
            int e8 = d18 ? rf6Var.e(4) + 1 : i13;
            krd.b(e8, "expectedSize");
            krd.b(e8, "initialCapacity");
            int[] iArr34 = new int[i13];
            Object[] objArr2 = new Object[e8];
            int i96 = 0;
            int i97 = 0;
            boolean z9 = false;
            while (i96 < e8) {
                rf6Var.k(3);
                int i98 = rf6Var.d() ? 1 : 2;
                int f14 = hl2.f(rf6Var.e(8));
                boolean z10 = d18;
                int g3 = hl2.g(rf6Var.e(8));
                rf6Var.k(8);
                uh7 uh7Var = new uh7(f14, i98, g3);
                int b3 = fm5.b(objArr2.length, i97 + 1);
                if (b3 > objArr2.length || z9) {
                    objArr2 = Arrays.copyOf(objArr2, b3);
                    z9 = false;
                }
                objArr2[i97] = uh7Var;
                i96++;
                i97++;
                d18 = z10;
            }
            if (d18 && e8 > 1) {
                for (int i99 = 0; i99 < i13; i99++) {
                    iArr34[i99] = rf6Var.e(4);
                }
            }
            rh7Var = new rh7(mm5.o(i97, objArr2), iArr34, (byte) 1);
        } else {
            rh7Var = null;
        }
        return new c5a(f3, new rh7(w59Var3, iArr31, (byte) 0), wk4Var, rh7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wh7 k(int i, int i2, byte[] bArr) {
        int f;
        int f2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean d2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f3;
        int i14;
        int i15;
        int i16;
        boolean d3;
        boolean d4;
        int i17;
        rf6 rf6Var = new rf6(bArr, i + 1, i2);
        int e = rf6Var.e(8);
        int e2 = rf6Var.e(8);
        int e3 = rf6Var.e(8);
        int f4 = rf6Var.f();
        if (e == 100 || e == 110 || e == 122 || e == 244 || e == 44 || e == 83 || e == 86 || e == 118 || e == 128 || e == 138) {
            f = rf6Var.f();
            boolean d5 = f == 3 ? rf6Var.d() : false;
            int f5 = rf6Var.f();
            f2 = rf6Var.f();
            rf6Var.j();
            if (rf6Var.d()) {
                int i18 = f != 3 ? 8 : 12;
                int i19 = 0;
                while (i19 < i18) {
                    if (rf6Var.d()) {
                        int i20 = i19 < 6 ? 16 : 64;
                        int i21 = 8;
                        int i22 = 8;
                        for (int i23 = 0; i23 < i20; i23++) {
                            if (i21 != 0) {
                                i21 = ((rf6Var.g() + i22) + 256) % 256;
                            }
                            if (i21 != 0) {
                                i22 = i21;
                            }
                        }
                    }
                    i19++;
                }
            }
            z = d5;
            i3 = f5;
        } else {
            f = 1;
            i3 = 0;
            z = false;
            f2 = 0;
        }
        int f6 = rf6Var.f() + 4;
        int f7 = rf6Var.f();
        if (f7 == 0) {
            i7 = rf6Var.f() + 4;
            i4 = e;
            i5 = f7;
            i6 = f2;
        } else {
            if (f7 == 1) {
                boolean d6 = rf6Var.d();
                rf6Var.g();
                rf6Var.g();
                i4 = e;
                long f8 = rf6Var.f();
                i5 = f7;
                for (int i24 = 0; i24 < f8; i24++) {
                    rf6Var.f();
                }
                i6 = f2;
                z2 = d6;
                i7 = 0;
                rf6Var.f();
                rf6Var.j();
                int f9 = rf6Var.f() + 1;
                int f10 = rf6Var.f() + 1;
                d2 = rf6Var.d();
                int i25 = 2 - (d2 ? 1 : 0);
                int i26 = f10 * i25;
                if (!d2) {
                    rf6Var.j();
                }
                rf6Var.j();
                int i27 = f9 << 4;
                int i28 = i26 << 4;
                if (rf6Var.d()) {
                    int f11 = rf6Var.f();
                    int f12 = rf6Var.f();
                    int f13 = rf6Var.f();
                    int f14 = rf6Var.f();
                    if (f == 0) {
                        i17 = 1;
                    } else {
                        i17 = f == 3 ? 1 : 2;
                        i25 *= f == 1 ? 2 : 1;
                    }
                    i27 -= (f11 + f12) * i17;
                    i28 -= (f13 + f14) * i25;
                }
                int i29 = i28;
                int i30 = i27;
                int i31 = i4;
                int i32 = ((i31 != 44 || i31 == 86 || i31 == 100 || i31 == 110 || i31 == 122 || i31 == 244) && (e2 & 16) != 0) ? 0 : 16;
                int i33 = -1;
                float f15 = 1.0f;
                if (rf6Var.d()) {
                    i8 = f6;
                    i9 = i6;
                    i10 = i32;
                    i11 = -1;
                    i12 = -1;
                    i13 = i7;
                    f3 = 1.0f;
                    i14 = -1;
                } else {
                    if (rf6Var.d()) {
                        int e4 = rf6Var.e(8);
                        if (e4 == 255) {
                            int e5 = rf6Var.e(16);
                            int e6 = rf6Var.e(16);
                            if (e5 != 0 && e6 != 0) {
                                f15 = e5 / e6;
                            }
                        } else if (e4 < 17) {
                            f15 = b[e4];
                        } else {
                            i8 = f6;
                            b00.o(e4, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                            if (rf6Var.d()) {
                                rf6Var.j();
                            }
                            if (rf6Var.d()) {
                                i15 = -1;
                                i16 = -1;
                            } else {
                                rf6Var.k(3);
                                i15 = rf6Var.d() ? 1 : 2;
                                if (rf6Var.d()) {
                                    int e7 = rf6Var.e(8);
                                    int e8 = rf6Var.e(8);
                                    rf6Var.k(8);
                                    i33 = hl2.f(e7);
                                    i16 = hl2.g(e8);
                                } else {
                                    i16 = -1;
                                }
                            }
                            if (rf6Var.d()) {
                                rf6Var.f();
                                rf6Var.f();
                            }
                            if (rf6Var.d()) {
                                rf6Var.k(65);
                            }
                            d3 = rf6Var.d();
                            if (d3) {
                                l(rf6Var);
                            }
                            d4 = rf6Var.d();
                            if (d4) {
                                l(rf6Var);
                            }
                            if (!d3 || d4) {
                                rf6Var.j();
                            }
                            rf6Var.j();
                            if (rf6Var.d()) {
                                rf6Var.j();
                                rf6Var.f();
                                rf6Var.f();
                                rf6Var.f();
                                rf6Var.f();
                                i32 = rf6Var.f();
                                rf6Var.f();
                            }
                            int i34 = i33;
                            i13 = i7;
                            f3 = f15;
                            i14 = i34;
                            i11 = i15;
                            i12 = i16;
                            i9 = i6;
                            i10 = i32;
                        }
                    }
                    i8 = f6;
                    if (rf6Var.d()) {
                    }
                    if (rf6Var.d()) {
                    }
                    if (rf6Var.d()) {
                    }
                    if (rf6Var.d()) {
                    }
                    d3 = rf6Var.d();
                    if (d3) {
                    }
                    d4 = rf6Var.d();
                    if (d4) {
                    }
                    if (!d3) {
                    }
                    rf6Var.j();
                    rf6Var.j();
                    if (rf6Var.d()) {
                    }
                    int i342 = i33;
                    i13 = i7;
                    f3 = f15;
                    i14 = i342;
                    i11 = i15;
                    i12 = i16;
                    i9 = i6;
                    i10 = i32;
                }
                return new wh7(i31, e2, e3, f4, i30, i29, f3, i3, i9, z, d2, i8, i5, i13, z2, i14, i11, i12, i10);
            }
            i4 = e;
            i5 = f7;
            i6 = f2;
            i7 = 0;
        }
        z2 = false;
        rf6Var.f();
        rf6Var.j();
        int f92 = rf6Var.f() + 1;
        int f102 = rf6Var.f() + 1;
        d2 = rf6Var.d();
        int i252 = 2 - (d2 ? 1 : 0);
        int i262 = f102 * i252;
        if (!d2) {
        }
        rf6Var.j();
        int i272 = f92 << 4;
        int i282 = i262 << 4;
        if (rf6Var.d()) {
        }
        int i292 = i282;
        int i302 = i272;
        int i312 = i4;
        if (i312 != 44) {
        }
        int i332 = -1;
        float f152 = 1.0f;
        if (rf6Var.d()) {
        }
        return new wh7(i312, e2, e3, f4, i302, i292, f3, i3, i9, z, d2, i8, i5, i13, z2, i14, i11, i12, i10);
    }

    public static void l(rf6 rf6Var) {
        int f = rf6Var.f() + 1;
        rf6Var.k(8);
        for (int i = 0; i < f; i++) {
            rf6Var.f();
            rf6Var.f();
            rf6Var.j();
        }
        rf6Var.k(20);
    }

    public static int m(int i, byte[] bArr) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        iArr = Arrays.copyOf(iArr, iArr.length << 1);
                        d = iArr;
                    }
                    iArr[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
