// default package

import android.graphics.Color;
import android.util.SparseIntArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ynb {
    public int a;
    public znb b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public long m;
    public float p;
    public boolean q;
    public TLRPC.TL_theme r;
    public TLRPC.TL_wallPaper s;
    public int t;
    public String u;
    public String v;
    public TLRPC.InputFile w;
    public TLRPC.InputFile x;
    public unb y;
    public boolean z;
    public int n = 45;
    public String o = "";
    public final float[] A = new float[3];

    public static int a(SparseIntArray sparseIntArray, int... iArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (sparseIntArray.indexOfKey(iArr[i5]) >= 0) {
                try {
                    int i6 = sparseIntArray.get(iArr[i5]);
                    i2 += Color.red(i6);
                    i3 += Color.green(i6);
                    i4 += Color.blue(i6);
                    i++;
                } catch (Exception unused) {
                }
            }
        }
        if (i == 0) {
            return 0;
        }
        return Color.argb(jn7.d4, i2 / i, i3 / i, i4 / i);
    }

    public static int c(SparseIntArray sparseIntArray, int i) {
        int i2;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey < 0 && (i2 = aob.im.get(i, -1)) >= 0) {
            indexOfKey = sparseIntArray.indexOfKey(i2);
        }
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : aob.hm[i];
    }

    public static void g(SparseIntArray sparseIntArray) {
        for (int i = aob.qb; i < aob.xb; i++) {
            sparseIntArray.delete(i);
            sparseIntArray.put(i, aob.hm[i]);
        }
        for (int i2 = aob.yb; i2 < aob.Kc; i2++) {
            sparseIntArray.delete(i2);
            sparseIntArray.put(i2, aob.hm[i2]);
        }
        for (int i3 = aob.Lc; i3 < aob.Tc; i3++) {
            sparseIntArray.delete(i3);
            sparseIntArray.put(i3, aob.hm[i3]);
        }
    }

    public final int b(int i, int i2) {
        float[] fArr = this.A;
        Color.colorToHSV(i2, fArr);
        float f = fArr[0];
        Color.colorToHSV(i, fArr);
        float f2 = fArr[1];
        if (f2 <= 0.0f) {
            fArr[0] = f;
        }
        fArr[1] = xnb.f(f2, 0.6f, 1.0f, 0.0f);
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
        return Color.HSVToColor(30, fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x052c, code lost:
    
        if (r14 < 85.0f) goto L210;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0547  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        int valueAt;
        int i;
        float f;
        int i2;
        boolean M1;
        int i3;
        char c;
        int valueAt2;
        int valueAt3;
        TLRPC.TL_theme tL_theme;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float[] N0 = aob.N0(1);
        float[] N02 = aob.N0(2);
        Color.colorToHSV(this.b.Y, N0);
        Color.colorToHSV(this.c, N02);
        boolean o = this.b.o();
        if (this.c != this.b.Y || this.d != 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = aob.hm;
                if (i11 >= iArr.length) {
                    break;
                }
                if (!aob.jm.contains(Integer.valueOf(i11))) {
                    int indexOfKey = sparseIntArray.indexOfKey(i11);
                    if (indexOfKey < 0) {
                        int i12 = aob.im.get(i11, -1);
                        if (i12 < 0 || sparseIntArray.indexOfKey(i12) < 0) {
                            valueAt = iArr[i11];
                        }
                    } else {
                        valueAt = sparseIntArray.valueAt(indexOfKey);
                    }
                    int D = aob.D(N0, N02, valueAt, o, valueAt);
                    if (D != valueAt) {
                        sparseIntArray2.put(i11, D);
                    }
                }
                i11++;
            }
        }
        int i13 = this.e;
        if ((i13 == 0 && this.c == 0) || this.f == 0) {
            i = 1;
            c = 2;
            f = 0.705f;
            i2 = 0;
            i3 = 0;
        } else {
            if (i13 == 0) {
                i13 = this.c;
            }
            int i14 = aob.rb;
            int i15 = sparseIntArray.get(i14);
            if (i15 == 0) {
                i15 = aob.hm[i14];
            }
            int E0 = hl.E0(i13, aob.D(N0, N02, i15, o, i15));
            i = 1;
            int E02 = hl.E0(i13, this.f);
            char c2 = 2;
            int i16 = this.g;
            f = 0.705f;
            int i17 = this.e;
            i2 = 0;
            int i18 = this.f;
            if (i16 != 0) {
                int w0 = hl.w0(hl.w0(i17, i18), this.g);
                int i19 = this.h;
                if (i19 != 0) {
                    w0 = hl.w0(w0, i19);
                }
                M1 = hl.B(w0) > 0.705f;
            } else {
                M1 = aob.M1(i17, i18);
            }
            i3 = (!M1 || E0 > 35000 || E02 > 35000) ? 0 : 1;
            float[] N03 = aob.N0(3);
            float[] N04 = aob.N0(4);
            Color.colorToHSV(i15, N03);
            Color.colorToHSV(i13, N04);
            float min = Math.min((N03[1] * 1.5f) / N0[1], 1.0f);
            N03[0] = (N04[0] - N03[0]) + N0[0];
            N03[1] = (N04[1] * N0[1]) / N03[1];
            float f2 = ((((N04[2] / N03[2]) + min) - 1.0f) * N0[2]) / min;
            N03[2] = f2;
            c = c2;
            if (f2 >= 0.3f) {
                i13 = Color.HSVToColor(jn7.d4, N03);
                c = c2;
            }
        }
        int i20 = (i13 == 0 || (((i9 = this.b.Y) == 0 || i13 == i9) && ((i10 = this.c) == 0 || i10 == i13))) ? i2 : i;
        if (i20 != 0 || this.d != 0) {
            int i21 = this.d;
            if (i21 != 0) {
                Color.colorToHSV(i21, N02);
            } else {
                Color.colorToHSV(i13, N02);
            }
            for (int i22 = aob.yb; i22 < aob.Kc; i22++) {
                int indexOfKey2 = sparseIntArray.indexOfKey(i22);
                if (indexOfKey2 < 0) {
                    int i23 = aob.im.get(i22, -1);
                    if (i23 < 0 || sparseIntArray.get(i23, -1) < 0) {
                        valueAt3 = aob.hm[i22];
                    }
                } else {
                    valueAt3 = sparseIntArray.valueAt(indexOfKey2);
                }
                int D2 = aob.D(N0, N02, valueAt3, o, valueAt3);
                if (D2 != valueAt3) {
                    sparseIntArray2.put(i22, D2);
                }
            }
            int[] iArr2 = aob.yl;
            int length = iArr2.length;
            for (int i24 = i2; i24 < length; i24++) {
                int i25 = iArr2[i24];
                int indexOfKey3 = sparseIntArray.indexOfKey(i25);
                int valueAt4 = indexOfKey3 < 0 ? aob.hm[i25] : sparseIntArray.valueAt(indexOfKey3);
                int D3 = aob.D(N0, N02, valueAt4, o, valueAt4);
                if (D3 != valueAt4) {
                    sparseIntArray2.put(i25, D3);
                }
            }
            if (i20 != 0) {
                Color.colorToHSV(i13, N02);
                for (int i26 = aob.qb; i26 < aob.xb; i26++) {
                    int indexOfKey4 = sparseIntArray.indexOfKey(i26);
                    if (indexOfKey4 < 0) {
                        int i27 = aob.im.get(i26, -1);
                        if (i27 < 0 || sparseIntArray.get(i27, -1) < 0) {
                            valueAt2 = aob.hm[i26];
                        }
                    } else {
                        valueAt2 = sparseIntArray.valueAt(indexOfKey4);
                    }
                    int D4 = aob.D(N0, N02, valueAt2, o, valueAt2);
                    if (D4 != valueAt2) {
                        sparseIntArray2.put(i26, D4);
                    }
                }
            }
        }
        if (i3 == 0 && (i4 = this.f) != 0) {
            int i28 = this.g;
            int i29 = this.e;
            if (i28 != 0) {
                int w02 = hl.w0(hl.w0(i29, i4), this.g);
                int i30 = this.h;
                if (i30 != 0) {
                    w02 = hl.w0(w02, i30);
                }
                i5 = hl.B(w02) > f ? i : i2;
            } else {
                i5 = aob.M1(i29, i4);
            }
            if (i5 != 0) {
                i8 = -14606047;
                i6 = -11184811;
                i7 = 1291845632;
            } else {
                i6 = -1118482;
                i7 = 1308622847;
                i8 = -1;
            }
            if (this.d == 0) {
                sparseIntArray2.put(aob.hc, i7);
                sparseIntArray2.put(aob.ic, i7);
                sparseIntArray2.put(aob.nc, i7);
                sparseIntArray2.put(aob.oc, i7);
                sparseIntArray2.put(aob.pc, i7);
                sparseIntArray2.put(aob.qc, i8);
                sparseIntArray2.put(aob.rc, i7);
                sparseIntArray2.put(aob.sc, i7);
                sparseIntArray2.put(aob.tc, i8);
                sparseIntArray2.put(aob.Yc, i8);
                sparseIntArray2.put(aob.Pb, i8);
                sparseIntArray2.put(aob.Qb, i8);
                sparseIntArray2.put(aob.Rb, i8);
                sparseIntArray2.put(aob.Sb, i8);
                sparseIntArray2.put(aob.Tb, i8);
                sparseIntArray2.put(aob.Xb, i8);
                sparseIntArray2.put(aob.Yb, i8);
                sparseIntArray2.put(aob.Mb, i8);
                sparseIntArray2.put(aob.Nb, i8);
                sparseIntArray2.put(aob.Ob, i8);
                sparseIntArray2.put(aob.Ib, i8);
                sparseIntArray2.put(aob.Jb, i8);
                sparseIntArray2.put(aob.kc, i8);
                sparseIntArray2.put(aob.wc, i8);
                sparseIntArray2.put(aob.Zb, i8);
                sparseIntArray2.put(aob.cc, i8);
                sparseIntArray2.put(aob.dc, i8);
                sparseIntArray2.put(aob.Ab, i8);
                sparseIntArray2.put(aob.Bb, i8);
                sparseIntArray2.put(aob.Cb, i8);
                sparseIntArray2.put(aob.Db, i8);
                sparseIntArray2.put(aob.Eb, i8);
                sparseIntArray2.put(aob.Fb, i8);
                sparseIntArray2.put(aob.Kb, i8);
                sparseIntArray2.put(aob.Lb, i8);
                sparseIntArray2.put(aob.jc, i8);
                sparseIntArray2.put(aob.ec, i8);
                sparseIntArray2.put(aob.lc, i6);
                sparseIntArray2.put(aob.mc, i6);
                sparseIntArray2.put(aob.ac, i6);
                sparseIntArray2.put(aob.bc, i6);
                sparseIntArray2.put(aob.xc, i6);
                sparseIntArray2.put(aob.yc, i6);
                sparseIntArray2.put(aob.Bc, i6);
                sparseIntArray2.put(aob.Cc, i6);
                sparseIntArray2.put(aob.Ec, i8);
                sparseIntArray2.put(aob.Fc, i8);
                sparseIntArray2.put(aob.uc, this.e);
                sparseIntArray2.put(aob.vc, this.e);
                sparseIntArray2.put(aob.Gb, this.e);
                sparseIntArray2.put(aob.Hb, this.e);
            }
            sparseIntArray2.put(aob.Ub, i8);
            sparseIntArray2.put(aob.Vb, i8);
            sparseIntArray2.put(aob.Wb, i8);
            sparseIntArray2.put(aob.Wc, i8);
        }
        if (i3 != 0) {
            int i31 = aob.Ec;
            if (hl.E0(-1, sparseIntArray2.indexOfKey(i31) >= 0 ? sparseIntArray2.get(i31) : i2) < 5000) {
                i3 = i2;
            }
        }
        int i32 = this.e;
        if (i32 != 0 && this.f != 0) {
            sparseIntArray2.put(aob.rb, i32);
            sparseIntArray2.put(aob.ub, this.f);
            int i33 = this.g;
            if (i33 != 0) {
                sparseIntArray2.put(aob.vb, i33);
                int i34 = this.h;
                if (i34 != 0) {
                    sparseIntArray2.put(aob.wb, i34);
                }
            }
            sparseIntArray2.put(aob.Rc, this.i ? 1 : 0);
        }
        long j = this.j;
        int i35 = (int) j;
        if (i35 != 0) {
            sparseIntArray2.put(aob.Ee, i35);
        } else if (j != 0) {
            sparseIntArray2.delete(aob.Ee);
        }
        long j2 = this.k;
        int i36 = (int) j2;
        if (i36 != 0) {
            sparseIntArray2.put(aob.Fe, i36);
        } else if (j2 != 0) {
            sparseIntArray2.delete(aob.Fe);
        }
        long j3 = this.l;
        int i37 = (int) j3;
        if (i37 != 0) {
            sparseIntArray2.put(aob.Ge, i37);
        } else if (j3 != 0) {
            sparseIntArray2.delete(aob.Ge);
        }
        long j4 = this.m;
        int i38 = (int) j4;
        if (i38 != 0) {
            sparseIntArray2.put(aob.He, i38);
        } else if (j4 != 0) {
            sparseIntArray2.delete(aob.He);
        }
        int i39 = this.n;
        if (i39 != 45) {
            sparseIntArray2.put(aob.Ie, i39);
        }
        int i40 = aob.rb;
        int i41 = sparseIntArray2.get(i40);
        if (i41 == 0) {
            i41 = aob.x0(sparseIntArray2, i40, null);
        }
        int i42 = aob.ra;
        int i43 = sparseIntArray2.get(i42);
        if (i43 == 0) {
            i43 = aob.x0(sparseIntArray2, i42, null);
        }
        if (this.c != this.b.Y || this.e != 0 || ((tL_theme = this.r) != null && tL_theme.emoticon != null)) {
            int c3 = c(sparseIntArray2, aob.Rb);
            sparseIntArray2.put(aob.La, (-16777216) | i41);
            sparseIntArray2.put(aob.Ma, c(sparseIntArray2, aob.jc));
            sparseIntArray2.put(aob.Na, c(sparseIntArray2, aob.Cb));
            sparseIntArray2.put(aob.Pa, c3);
            sparseIntArray2.put(aob.Qa, c(sparseIntArray2, aob.Tb));
            sparseIntArray2.put(aob.Oa, aob.p1(0.1f, c3));
            sparseIntArray2.put(aob.bb, c(sparseIntArray2, aob.wc));
            sparseIntArray2.put(aob.cb, c(sparseIntArray2, aob.Ec));
            sparseIntArray2.put(aob.db, c(sparseIntArray2, aob.Gb));
            sparseIntArray2.put(aob.eb, c(sparseIntArray2, aob.xc));
            sparseIntArray2.put(aob.fb, c(sparseIntArray2, aob.zc));
            sparseIntArray2.put(aob.gb, c(sparseIntArray2, aob.ll));
            sparseIntArray2.put(aob.Ya, c(sparseIntArray2, aob.Jc));
        }
        TLRPC.TL_theme tL_theme2 = this.r;
        if (tL_theme2 != null && tL_theme2.emoticon != null && !o) {
            sparseIntArray2.delete(aob.yd);
            int a = a(sparseIntArray2, aob.Fe, aob.Ge, aob.He);
            if (a == 0) {
                a = a(sparseIntArray2, aob.Ee);
            }
            if (a == 0) {
                a = this.c;
            }
            int b = b(i41, a);
            sparseIntArray2.put(aob.Pc, b);
            sparseIntArray2.put(aob.Sc, b);
            sparseIntArray2.put(aob.sb, aob.v(i41, b));
            int b2 = b(i43, this.c);
            sparseIntArray2.put(aob.sa, b2);
            sparseIntArray2.put(aob.Uc, aob.v(i43, b2));
        }
        float[] fArr = this.A;
        if (!o) {
            sparseIntArray2.put(aob.lg, h(i43, this.c));
            sparseIntArray2.put(aob.Mc, h(i41, this.c));
            int i44 = aob.Nc;
            Color.colorToHSV(this.c, fArr);
            float f3 = fArr[i2];
            Color.colorToHSV(i41, fArr);
            float f4 = fArr[i];
            if (f4 > 0.0f) {
                float f5 = fArr[i2];
                if (f5 > 45.0f) {
                }
                fArr[i] = xnb.f(f4, 0.6f, 1.0f, 0.0f);
                float f6 = fArr[c];
                fArr[c] = Math.max(0.0f, Math.min(1.0f, f6 - (f6 <= 0.7f ? 0.25f : 0.125f)));
                sparseIntArray2.put(i44, aob.v(i41, Color.HSVToColor(jn7.d4, fArr)));
            }
            fArr[i2] = f3;
            fArr[i] = xnb.f(f4, 0.6f, 1.0f, 0.0f);
            float f62 = fArr[c];
            fArr[c] = Math.max(0.0f, Math.min(1.0f, f62 - (f62 <= 0.7f ? 0.25f : 0.125f)));
            sparseIntArray2.put(i44, aob.v(i41, Color.HSVToColor(jn7.d4, fArr)));
        }
        Color.colorToHSV(aob.x0(sparseIntArray2, aob.n6, null), fArr);
        float f7 = fArr[i2];
        sparseIntArray2.put(aob.Oc, f(i41, f7, o));
        sparseIntArray2.put(aob.ng, f(i43, f7, o));
        int i45 = aob.Xc;
        int i46 = sparseIntArray2.get(i45);
        if (i46 == 0) {
            i46 = aob.x0(sparseIntArray2, i45, null);
        }
        int i47 = aob.Yc;
        int i48 = sparseIntArray2.get(i47);
        if (i48 == 0) {
            i48 = aob.x0(sparseIntArray2, i47, null);
        }
        sparseIntArray2.put(aob.Ce, e(i46, i43, o));
        sparseIntArray2.put(aob.Dc, e(i48, i41, o));
        int i49 = aob.G8;
        int i50 = sparseIntArray2.get(i49);
        if (i50 == 0) {
            i50 = aob.x0(sparseIntArray2, i49, null);
        }
        int i51 = i2;
        sparseIntArray2.put(aob.H8, Color.argb(Color.alpha(i50), Math.max(i51, Color.red(i50) - 10), Math.max(i51, Color.green(i50) - 10), Math.max(i51, Color.blue(i50) - 10)));
        int i52 = 64;
        if (o) {
            int i53 = aob.ub;
            if (sparseIntArray2.get(i53) != 0) {
                Color.colorToHSV(a(sparseIntArray2, i53, aob.vb, aob.wb), fArr);
                fArr[i] = Utilities.i(fArr[i] + 0.1f, 1.0f, 0.0f);
                fArr[c] = Utilities.i(fArr[c] - 0.8f, 1.0f, 0.0f);
                sparseIntArray2.put(aob.hl, Color.HSVToColor(64, fArr));
                aob.f(sparseIntArray, sparseIntArray2, o);
                aob.e(sparseIntArray, sparseIntArray2, o);
                return i3 ^ 1;
            }
        }
        int i54 = aob.hl;
        Color.colorToHSV(i41, fArr);
        if (o) {
            fArr[i] = Utilities.i(fArr[i] - 0.08f, 1.0f, 0.0f);
            fArr[c] = 0.03f;
        } else {
            float f8 = fArr[i];
            if (f8 > 0.0f) {
                float f9 = fArr[c];
                if (f9 < 1.0f && f9 > 0.0f) {
                    fArr[i] = xnb.f(f8, 0.28f, 1.0f, 0.0f);
                    fArr[c] = xnb.f(fArr[c], -0.1f, 1.0f, 0.0f);
                    i52 = 32;
                }
            }
            fArr[c] = xnb.f(fArr[c], -0.2f, 1.0f, 0.0f);
            i52 = 32;
        }
        sparseIntArray2.put(i54, Color.HSVToColor(i52, fArr));
        aob.f(sparseIntArray, sparseIntArray2, o);
        aob.e(sparseIntArray, sparseIntArray2, o);
        return i3 ^ 1;
    }

    public final int e(int i, int i2, boolean z) {
        int f = vm2.f(0.25f, i, i2);
        float[] fArr = this.A;
        Color.colorToHSV(f, fArr);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        fArr[2] = xnb.f(fArr[2], z ? 0.1f : 0.0f, 1.0f, 0.0f);
        return Color.HSVToColor(51, fArr);
    }

    public final int f(int i, float f, boolean z) {
        if (z) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i, fArr);
        if (fArr[1] > 0.0f) {
            float f2 = fArr[2];
            if (f2 < 1.0f && f2 > 0.0f) {
                fArr[0] = ete.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = ete.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = ete.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f;
        fArr[1] = 0.2f;
        fArr[2] = ete.a(fArr[2] - 0.65f, 0.0f, 1.0f);
        return Color.HSVToColor(90, fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r3 < 85.0f) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(int i, int i2) {
        float[] fArr = this.A;
        Color.colorToHSV(i2, fArr);
        float f = fArr[0];
        Color.colorToHSV(i, fArr);
        float f2 = fArr[1];
        if (f2 > 0.0f) {
            float f3 = fArr[0];
            if (f3 > 45.0f) {
            }
            fArr[1] = xnb.f(f2, fArr[2] <= 0.85f ? 0.25f : 0.45f, 1.0f, 0.0f);
            fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
            return Color.HSVToColor(80, fArr);
        }
        fArr[0] = f;
        fArr[1] = xnb.f(f2, fArr[2] <= 0.85f ? 0.25f : 0.45f, 1.0f, 0.0f);
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
        return Color.HSVToColor(80, fArr);
    }
}
