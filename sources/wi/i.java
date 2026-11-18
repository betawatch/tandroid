package wi;

import a8.p0;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class i {
    public final float[] a;
    public final float[] b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final float[] g;
    public final float[] h;
    public final float[] i;
    public final float[] j = new float[3];

    public i(float[] fArr, float[] fArr2, float f10, float f11, float f12) {
        this.a = fArr;
        this.b = fArr2;
        this.c = f10;
        this.d = f11;
        this.e = f12;
        this.f = f11 > f10;
        this.g = new float[fArr.length];
        this.h = new float[fArr.length];
        this.i = new float[fArr.length];
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int[] iArr, int[] iArr2, float f10, j jVar, boolean z10) {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        int i7;
        int i10;
        float f11;
        int i11;
        int i12;
        int i13;
        int i14;
        float f12;
        float f13;
        float min;
        int i15;
        float f14;
        float f15;
        int i16;
        int i17;
        i iVar = this;
        int length = iArr.length;
        int length2 = iArr2.length;
        int i18 = 0;
        int i19 = 0;
        float f16 = 0.0f;
        while (true) {
            fArr = iVar.h;
            fArr2 = iVar.a;
            fArr3 = iVar.g;
            if (i18 >= length2) {
                break;
            }
            int i20 = iArr2[i18];
            int i21 = 0;
            int i22 = 0;
            double d = 0.0d;
            while (i22 < i20) {
                float[] fArr5 = fArr3;
                float f17 = fArr2[iArr[i19 + i22]];
                if (f17 > 0.0f) {
                    i16 = i18;
                    i17 = i19;
                    i21++;
                    d = Math.log(f17) + d;
                } else {
                    i16 = i18;
                    i17 = i19;
                }
                i22++;
                i18 = i16;
                fArr3 = fArr5;
                i19 = i17;
            }
            float[] fArr6 = fArr3;
            int i23 = i18;
            int i24 = i19;
            float exp = i21 > 0 ? (float) Math.exp(d / i21) : 1.0f;
            float f18 = 0.0f;
            int i25 = 0;
            while (i25 < i20) {
                int i26 = i24 + i25;
                float f19 = fArr2[iArr[i26]];
                if (f19 > 0.0f) {
                    i15 = i25;
                    f14 = f18;
                    f15 = p0.C(f19, exp, 1.22f, 0.8196721f);
                } else {
                    i15 = i25;
                    f14 = f18;
                    f15 = 1.0f;
                }
                fArr6[i26] = f15;
                f18 = f14 + f15;
                i25 = i15 + 1;
            }
            float f20 = f18;
            for (int i27 = 0; i27 < i20; i27++) {
                int i28 = i24 + i27;
                fArr6[i28] = fArr6[i28] / f20;
            }
            float f21 = 1.0f / (exp * f20);
            fArr[i23] = f21;
            f16 += f21;
            i19 = i24 + iArr2[i23];
            i18 = i23 + 1;
        }
        float f22 = 1.0f;
        int i29 = 0;
        while (i29 <= 8) {
            float f23 = 8.0f;
            float f24 = i29 / 8.0f;
            float f25 = 0.0f;
            int i30 = 0;
            while (true) {
                fArr4 = iVar.i;
                if (i30 >= length2) {
                    break;
                }
                float f26 = f23;
                int i31 = i30;
                int i32 = length;
                float pow = (float) (Math.pow(iArr2[i30] / length, f24) * Math.pow(fArr[i30] / f16, f22 - f24));
                fArr4[i31] = pow;
                f25 += pow;
                i30 = i31 + 1;
                i29 = i29;
                f23 = f26;
                length = i32;
                f16 = f16;
                fArr = fArr;
            }
            int i33 = length;
            int i34 = i29;
            float f27 = f23;
            float f28 = f16;
            float[] fArr7 = fArr;
            for (int i35 = 0; i35 < length2; i35++) {
                fArr4[i35] = fArr4[i35] / f25;
            }
            float f29 = iVar.e;
            float[] fArr8 = iVar.b;
            boolean z11 = iVar.f;
            float f30 = iVar.c;
            float[] fArr9 = iVar.j;
            if (z11) {
                int i36 = 0;
                double d2 = 0.0d;
                double d10 = 0.0d;
                i10 = 1;
                for (int i37 = 0; i37 < iArr2.length; i37++) {
                    int i38 = 0;
                    while (i38 < iArr2[i37]) {
                        int i39 = iArr[i36];
                        float f31 = fArr2[i39];
                        int i40 = length2;
                        double d11 = f31 > 0.0f ? fArr8[i39] : 0.3f;
                        if (f31 <= 0.0f) {
                            f31 = f22;
                        }
                        d2 = (Math.log((f31 * fArr4[i37]) / fArr3[i36]) * d11) + d2;
                        d10 += d11;
                        i38++;
                        i36++;
                        length2 = i40;
                    }
                }
                i7 = length2;
                f11 = 0.3f;
                float exp2 = (float) Math.exp(d2 / d10);
                float f32 = iVar.d;
                fArr9[0] = Math.max(f30, Math.min(f32, exp2));
                if (f29 >= f30 && f29 <= f32) {
                    fArr9[1] = f29;
                    i11 = 2;
                    i12 = 0;
                    while (i12 < i11) {
                        float f33 = fArr9[i12];
                        float log = (float) Math.log(f33);
                        if (f29 > 0.0f) {
                            i13 = i11;
                            i14 = i12;
                            f12 = (Math.abs(log - ((float) Math.log(f29))) * 0.08f) + 0.0f;
                        } else {
                            i13 = i11;
                            i14 = i12;
                            f12 = 0.0f;
                        }
                        if (z11) {
                            f12 = e2.x(log, 0.4f, log, f12);
                        }
                        float f34 = f10 + f12;
                        int length3 = iArr.length;
                        float f35 = Float.MAX_VALUE;
                        float f36 = f29;
                        float f37 = 0.0f;
                        float f38 = 0.0f;
                        int i41 = 0;
                        int i42 = 0;
                        while (i41 < iArr2.length) {
                            float f39 = fArr4[i41];
                            int i43 = i42;
                            int i44 = i41;
                            float f40 = f37;
                            int i45 = i43;
                            float f41 = f34;
                            int i46 = 0;
                            while (i46 < iArr2[i44]) {
                                float f42 = fArr3[i45] * f39;
                                f35 = Math.min(f35, f42);
                                float max = Math.max(f40, f42);
                                float f43 = fArr2[iArr[i45]];
                                int i47 = i46;
                                float f44 = (fArr3[i45] * f33) / f39;
                                if (f43 > 0.0f) {
                                    float min2 = f22 - (Math.min(f43, f44) / Math.max(f43, f44));
                                    min = (((min2 * 1.5f * min2) + min2) * fArr8[iArr[i45]]) + f38;
                                } else {
                                    float f45 = f22;
                                    min = ((f45 - (Math.min(f45, f44) / Math.max(f45, f44))) * f11) + f38;
                                }
                                float f46 = min;
                                float log2 = (float) Math.log(f42 * length3);
                                f38 = e2.x(log2, f11, log2, f46);
                                i46 = i47 + 1;
                                i45++;
                                f40 = max;
                                f22 = 1.0f;
                            }
                            int i48 = i44 + 1;
                            i42 = i45;
                            f34 = f41;
                            f22 = 1.0f;
                            f37 = f40;
                            i41 = i48;
                        }
                        float f47 = f34;
                        float log3 = (float) Math.log((f37 / f35) / 1.5f);
                        if (log3 > 0.0f) {
                            f38 = (log3 * f27) + f38;
                        }
                        float f48 = f47 + f38;
                        if (f48 < jVar.f - 1.0E-5f) {
                            int length4 = iArr.length;
                            jVar.f = f48;
                            jVar.d = z10;
                            jVar.c = (int[]) iArr.clone();
                            jVar.e = (int[]) iArr2.clone();
                            f22 = 1.0f;
                            if (z10) {
                                f33 = 1.0f / f33;
                            }
                            jVar.a = f33;
                            jVar.b = new float[length4 * 4];
                            float f49 = 0.0f;
                            int i49 = 0;
                            int i50 = 0;
                            while (i49 < iArr2.length) {
                                float f50 = i49 == iArr2.length + (-1) ? 1.0f : fArr4[i49] + f49;
                                int i51 = i49;
                                float f51 = 0.0f;
                                int i52 = 0;
                                while (true) {
                                    int i53 = iArr2[i51];
                                    if (i52 < i53) {
                                        float f52 = i52 == i53 + (-1) ? 1.0f : fArr3[i50] + f51;
                                        int i54 = iArr[i50];
                                        if (z10) {
                                            f13 = f52;
                                            float[] fArr10 = jVar.b;
                                            int i55 = i54 * 4;
                                            fArr10[i55] = f49;
                                            fArr10[i55 + 1] = f51;
                                            fArr10[i55 + 2] = f50;
                                            fArr10[i55 + 3] = f13;
                                        } else {
                                            f13 = f52;
                                            float[] fArr11 = jVar.b;
                                            int i56 = i54 * 4;
                                            fArr11[i56] = f51;
                                            fArr11[i56 + 1] = f49;
                                            fArr11[i56 + 2] = f13;
                                            fArr11[i56 + 3] = f50;
                                        }
                                        i52++;
                                        i50++;
                                        f51 = f13;
                                    }
                                }
                                i49 = i51 + 1;
                                f49 = f50;
                            }
                        } else {
                            f22 = 1.0f;
                        }
                        i12 = i14 + 1;
                        f11 = 0.3f;
                        i11 = i13;
                        f29 = f36;
                    }
                    i29 = i34 + 1;
                    iVar = this;
                    length = i33;
                    f16 = f28;
                    fArr = fArr7;
                    length2 = i7;
                }
            } else {
                i7 = length2;
                i10 = 1;
                f11 = 0.3f;
                fArr9[0] = f30;
            }
            i11 = i10;
            i12 = 0;
            while (i12 < i11) {
            }
            i29 = i34 + 1;
            iVar = this;
            length = i33;
            f16 = f28;
            fArr = fArr7;
            length2 = i7;
        }
    }
}
