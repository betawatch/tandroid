// default package

import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class pse {
    public static boolean a(m08[] m08VarArr, m08[] m08VarArr2) {
        int i;
        if (m08VarArr != null && m08VarArr2 != null && m08VarArr.length == m08VarArr2.length) {
            for (0; i < m08VarArr.length; i + 1) {
                m08 m08Var = m08VarArr[i];
                char c = m08Var.a;
                m08 m08Var2 = m08VarArr2[i];
                i = (c == m08Var2.a && m08Var.b.length == m08Var2.b.length) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static float[] b(int i, float[] fArr) {
        if (i < 0) {
            i98.g();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
    
        if (r13 == 0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[Catch: NumberFormatException -> 0x00b2, LOOP:3: B:25:0x0065->B:35:0x0091, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b2, blocks: (B:22:0x0051, B:25:0x0065, B:27:0x006b, B:31:0x0077, B:35:0x0091, B:38:0x0096, B:43:0x00a8, B:54:0x00ab), top: B:21:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[Catch: NumberFormatException -> 0x00b2, TryCatch #0 {NumberFormatException -> 0x00b2, blocks: (B:22:0x0051, B:25:0x0065, B:27:0x006b, B:31:0x0077, B:35:0x0091, B:38:0x0096, B:43:0x00a8, B:54:0x00ab), top: B:21:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[Catch: NumberFormatException -> 0x00b2, TryCatch #0 {NumberFormatException -> 0x00b2, blocks: (B:22:0x0051, B:25:0x0065, B:27:0x006b, B:31:0x0077, B:35:0x0091, B:38:0x0096, B:43:0x00a8, B:54:0x00ab), top: B:21:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m08[] c(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) == 'z' || trim.charAt(i2) == 'Z') {
                            fArr = new float[i2];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < trim.length(); i11++) {
                                        char charAt2 = trim.charAt(i11);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6) {
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        i9 = 1;
                                                        i10 = 1;
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 == 0) {
                                                if (i6 < i11) {
                                                    fArr2[i5] = Float.parseFloat(trim.substring(i6, i11));
                                                    i5++;
                                                }
                                                i6 = i10 == 0 ? i11 : i11 + 1;
                                                i2 = 0;
                                            }
                                        }
                                        i7 = 0;
                                        i9 = 1;
                                        if (i9 == 0) {
                                        }
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArr = b(i5, fArr2);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                rjb.k(kt6.o("error in parsing \"", trim, "\""), e);
                                return null;
                            }
                        }
                        arrayList.add(new m08(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new m08(str.charAt(i3), new float[0]));
        }
        return (m08[]) arrayList.toArray(new m08[i]);
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            f(c(str), path);
            return path;
        } catch (RuntimeException e) {
            rjb.k("Error in parsing ".concat(str), e);
            return null;
        }
    }

    public static m08[] e(m08[] m08VarArr) {
        m08[] m08VarArr2 = new m08[m08VarArr.length];
        for (int i = 0; i < m08VarArr.length; i++) {
            m08VarArr2[i] = new m08(m08VarArr[i]);
        }
        return m08VarArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(m08[] m08VarArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        m08 m08Var;
        int i3;
        char c;
        float f;
        float f2;
        m08 m08Var2;
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        m08[] m08VarArr2 = m08VarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = m08VarArr2.length;
        int i4 = 0;
        int i5 = 0;
        char c2 = 'm';
        while (i5 < length) {
            m08 m08Var3 = m08VarArr2[i5];
            char c3 = m08Var3.a;
            float[] fArr3 = m08Var3.b;
            float f11 = fArr2[i4];
            float f12 = fArr2[1];
            float f13 = fArr2[2];
            float f14 = fArr2[3];
            float f15 = fArr2[4];
            int i6 = i4;
            float f16 = fArr2[5];
            switch (c3) {
                case 'A':
                case nm7.h1 /* 97 */:
                    i = 7;
                    break;
                case nm7.D0 /* 67 */:
                case nm7.j1 /* 99 */:
                    i = 6;
                    break;
                case nm7.I0 /* 72 */:
                case nm7.W0 /* 86 */:
                case nm7.o1 /* 104 */:
                case nm7.C1 /* 118 */:
                    i = 1;
                    break;
                case nm7.R0 /* 81 */:
                case nm7.T0 /* 83 */:
                case nm7.x1 /* 113 */:
                case nm7.z1 /* 115 */:
                    i = 4;
                    break;
                case nm7.a1 /* 90 */:
                case nm7.F1 /* 122 */:
                    path2.close();
                    path2.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                default:
                    i = 2;
                    break;
            }
            float f17 = f15;
            float f18 = f16;
            float f19 = f11;
            float f20 = f12;
            int i7 = i6;
            while (i7 < fArr3.length) {
                if (c3 == 'A') {
                    fArr = fArr3;
                    i2 = i7;
                    m08Var = m08Var3;
                    float f21 = f19;
                    float f22 = f20;
                    i3 = i5;
                    c = c3;
                    int i8 = i2 + 5;
                    int i9 = i2 + 6;
                    m08.a(path, f21, f22, fArr[i8], fArr[i9], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f ? 1 : i6, fArr[i2 + 4] != 0.0f ? 1 : i6);
                    f13 = fArr[i8];
                    f = fArr[i9];
                    f14 = f;
                    f2 = f13;
                } else if (c3 == 'C') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    m08Var = m08Var3;
                    c = c3;
                    int i10 = i2 + 2;
                    int i11 = i2 + 3;
                    int i12 = i2 + 4;
                    int i13 = i2 + 5;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i10], fArr[i11], fArr[i12], fArr[i13]);
                    float f23 = fArr[i12];
                    float f24 = fArr[i13];
                    f13 = fArr[i10];
                    f14 = fArr[i11];
                    f = f24;
                    f2 = f23;
                } else if (c3 == 'H') {
                    fArr = fArr3;
                    i2 = i7;
                    m08Var = m08Var3;
                    c = c3;
                    f = f20;
                    i3 = i5;
                    path2.lineTo(fArr[i2], f);
                    f2 = fArr[i2];
                } else if (c3 == 'Q') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    m08Var = m08Var3;
                    c = c3;
                    int i14 = i2 + 1;
                    int i15 = i2 + 2;
                    int i16 = i2 + 3;
                    path2.quadTo(fArr[i2], fArr[i14], fArr[i15], fArr[i16]);
                    float f25 = fArr[i2];
                    float f26 = fArr[i14];
                    float f27 = fArr[i15];
                    float f28 = fArr[i16];
                    f13 = f25;
                    f14 = f26;
                    f2 = f27;
                    f = f28;
                } else if (c3 == 'V') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    m08Var = m08Var3;
                    f2 = f19;
                    c = c3;
                    path2.lineTo(f2, fArr[i2]);
                    f = fArr[i2];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr = fArr3;
                        i2 = i7;
                        int i17 = i2 + 2;
                        int i18 = i2 + 3;
                        int i19 = i2 + 4;
                        int i20 = i2 + 5;
                        path2.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i17], fArr[i18], fArr[i19], fArr[i20]);
                        float f29 = fArr[i17] + f19;
                        float f30 = fArr[i18] + f20;
                        f19 += fArr[i19];
                        f20 += fArr[i20];
                        f13 = f29;
                        f14 = f30;
                    } else if (c3 != 'h') {
                        if (c3 != 'q') {
                            if (c3 != 'v') {
                                if (c3 == 'L') {
                                    fArr = fArr3;
                                    i2 = i7;
                                    int i21 = i2 + 1;
                                    path2.lineTo(fArr[i2], fArr[i21]);
                                    f2 = fArr[i2];
                                    f = fArr[i21];
                                } else if (c3 == 'M') {
                                    fArr = fArr3;
                                    i2 = i7;
                                    f2 = fArr[i2];
                                    f = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path2.lineTo(f2, f);
                                    } else {
                                        path2.moveTo(f2, f);
                                        f17 = f2;
                                        f18 = f;
                                    }
                                } else if (c3 != 'S') {
                                    if (c3 == 'T') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f19 = (f19 * 2.0f) - f13;
                                            f20 = (f20 * 2.0f) - f14;
                                        }
                                        int i22 = i2 + 1;
                                        path2.quadTo(f19, f20, fArr[i2], fArr[i22]);
                                        f2 = fArr[i2];
                                        f = fArr[i22];
                                        m08Var = m08Var3;
                                        f13 = f19;
                                        f14 = f20;
                                    } else if (c3 == 'l') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        int i23 = i2 + 1;
                                        path2.rLineTo(fArr[i2], fArr[i23]);
                                        f19 += fArr[i2];
                                        f6 = fArr[i23];
                                    } else if (c3 == 'm') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        float f31 = fArr[i2];
                                        f19 += f31;
                                        float f32 = fArr[i2 + 1];
                                        f20 += f32;
                                        if (i2 > 0) {
                                            path2.rLineTo(f31, f32);
                                        } else {
                                            path2.rMoveTo(f31, f32);
                                            m08Var = m08Var3;
                                            f2 = f19;
                                            f17 = f2;
                                            f = f20;
                                            f18 = f;
                                        }
                                    } else if (c3 == 's') {
                                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                            f7 = f20 - f14;
                                            f8 = f19 - f13;
                                        } else {
                                            f8 = 0.0f;
                                            f7 = 0.0f;
                                        }
                                        int i24 = i7;
                                        int i25 = i24 + 1;
                                        int i26 = i24 + 2;
                                        int i27 = i24 + 3;
                                        fArr = fArr3;
                                        i2 = i24;
                                        path2.rCubicTo(f8, f7, fArr3[i24], fArr3[i25], fArr3[i26], fArr3[i27]);
                                        f3 = fArr[i2] + f19;
                                        f4 = fArr[i25] + f20;
                                        f19 += fArr[i26];
                                        f5 = fArr[i27];
                                    } else if (c3 != 't') {
                                        fArr = fArr3;
                                        i2 = i7;
                                    } else {
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f9 = f19 - f13;
                                            f10 = f20 - f14;
                                        } else {
                                            f10 = 0.0f;
                                            f9 = 0.0f;
                                        }
                                        int i28 = i7 + 1;
                                        path2.rQuadTo(f9, f10, fArr3[i7], fArr3[i28]);
                                        float f33 = f9 + f19;
                                        float f34 = f10 + f20;
                                        float f35 = f19 + fArr3[i7];
                                        f20 += fArr3[i28];
                                        f14 = f34;
                                        fArr = fArr3;
                                        i2 = i7;
                                        m08Var = m08Var3;
                                        f2 = f35;
                                        f13 = f33;
                                        f = f20;
                                    }
                                    i3 = i5;
                                    c = c3;
                                } else {
                                    fArr = fArr3;
                                    i2 = i7;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    float f36 = f19;
                                    float f37 = f20;
                                    int i29 = i2 + 1;
                                    int i30 = i2 + 2;
                                    int i31 = i2 + 3;
                                    path2.cubicTo(f36, f37, fArr[i2], fArr[i29], fArr[i30], fArr[i31]);
                                    f13 = fArr[i2];
                                    f14 = fArr[i29];
                                    f2 = fArr[i30];
                                    f = fArr[i31];
                                }
                                i3 = i5;
                                m08Var = m08Var3;
                                c = c3;
                            } else {
                                fArr = fArr3;
                                i2 = i7;
                                path2.rLineTo(0.0f, fArr[i2]);
                                f6 = fArr[i2];
                            }
                            f20 += f6;
                        } else {
                            fArr = fArr3;
                            i2 = i7;
                            int i32 = i2 + 1;
                            int i33 = i2 + 2;
                            int i34 = i2 + 3;
                            path2.rQuadTo(fArr[i2], fArr[i32], fArr[i33], fArr[i34]);
                            f3 = fArr[i2] + f19;
                            f4 = fArr[i32] + f20;
                            f19 += fArr[i33];
                            f5 = fArr[i34];
                        }
                        f20 += f5;
                        f13 = f3;
                        f14 = f4;
                    } else {
                        fArr = fArr3;
                        i2 = i7;
                        path2.rLineTo(fArr[i2], 0.0f);
                        f19 += fArr[i2];
                    }
                    m08Var = m08Var3;
                    f2 = f19;
                    f = f20;
                    i3 = i5;
                    c = c3;
                } else {
                    fArr = fArr3;
                    i2 = i7;
                    int i35 = i2 + 5;
                    float f38 = fArr[i35] + f19;
                    int i36 = i2 + 6;
                    float f39 = fArr[i36] + f20;
                    float f40 = fArr[i2];
                    float f41 = fArr[i2 + 1];
                    float f42 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        m08Var2 = m08Var3;
                        z = 1;
                    } else {
                        m08Var2 = m08Var3;
                        z = i6;
                    }
                    m08Var = m08Var2;
                    float f43 = f19;
                    c = c3;
                    float f44 = f20;
                    i3 = i5;
                    m08.a(path, f43, f44, f38, f39, f40, f41, f42, z, fArr[i2 + 4] != 0.0f ? 1 : i6);
                    f2 = f43 + fArr[i35];
                    f = f44 + fArr[i36];
                    f13 = f2;
                    f14 = f;
                }
                i7 = i2 + i;
                path2 = path;
                m08Var3 = m08Var;
                c3 = c;
                i5 = i3;
                f19 = f2;
                f20 = f;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i6] = f19;
            fArr2[1] = f20;
            fArr2[2] = f13;
            fArr2[3] = f14;
            fArr2[4] = f17;
            fArr2[5] = f18;
            c2 = m08Var3.a;
            i5++;
            m08VarArr2 = m08VarArr;
            path2 = path;
            i4 = i6;
        }
    }
}
