package ti;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class j {
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

    public j(float[] fArr, float[] fArr2, float f10, float f11, float f12) {
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

    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int[] iArr, int[] iArr2, float f10, k kVar, boolean z9) {
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
        float f14;
        float f15;
        int i15;
        int i16;
        j jVar = this;
        int length = iArr.length;
        int length2 = iArr2.length;
        int i17 = 0;
        int i18 = 0;
        float f16 = 0.0f;
        while (true) {
            fArr = jVar.h;
            fArr2 = jVar.a;
            fArr3 = jVar.g;
            if (i17 >= length2) {
                break;
            }
            int i19 = iArr2[i17];
            int i20 = 0;
            int i21 = 0;
            double d = 0.0d;
            while (i21 < i19) {
                float[] fArr5 = fArr3;
                float f17 = fArr2[iArr[i18 + i21]];
                if (f17 > 0.0f) {
                    i15 = i17;
                    i16 = i18;
                    i20++;
                    d = Math.log(f17) + d;
                } else {
                    i15 = i17;
                    i16 = i18;
                }
                i21++;
                i17 = i15;
                fArr3 = fArr5;
                i18 = i16;
            }
            float[] fArr6 = fArr3;
            int i22 = i17;
            int i23 = i18;
            float exp = i20 > 0 ? (float) Math.exp(d / i20) : 1.0f;
            float f18 = 0.0f;
            int i24 = 0;
            while (i24 < i19) {
                int i25 = i23 + i24;
                float f19 = fArr2[iArr[i25]];
                if (f19 > 0.0f) {
                    f14 = exp;
                    f15 = Math.max(0.8196721f, Math.min(1.22f, f19 / exp));
                } else {
                    f14 = exp;
                    f15 = 1.0f;
                }
                fArr6[i25] = f15;
                f18 += f15;
                i24++;
                exp = f14;
            }
            float f20 = exp;
            for (int i26 = 0; i26 < i19; i26++) {
                int i27 = i23 + i26;
                fArr6[i27] = fArr6[i27] / f18;
            }
            float f21 = 1.0f / (f20 * f18);
            fArr[i22] = f21;
            f16 += f21;
            i18 = i23 + iArr2[i22];
            i17 = i22 + 1;
        }
        float f22 = 1.0f;
        int i28 = 0;
        while (i28 <= 8) {
            float f23 = 8.0f;
            float f24 = i28 / 8.0f;
            float f25 = 0.0f;
            int i29 = 0;
            while (true) {
                fArr4 = jVar.i;
                if (i29 >= length2) {
                    break;
                }
                float f26 = f23;
                int i30 = i29;
                int i31 = length;
                float pow = (float) (Math.pow(iArr2[i29] / length, f24) * Math.pow(fArr[i29] / f16, f22 - f24));
                fArr4[i30] = pow;
                f25 += pow;
                i29 = i30 + 1;
                i28 = i28;
                f23 = f26;
                length = i31;
                f16 = f16;
                fArr = fArr;
            }
            int i32 = length;
            int i33 = i28;
            float f27 = f23;
            float f28 = f16;
            float[] fArr7 = fArr;
            for (int i34 = 0; i34 < length2; i34++) {
                fArr4[i34] = fArr4[i34] / f25;
            }
            float f29 = jVar.e;
            float[] fArr8 = jVar.b;
            boolean z10 = jVar.f;
            float f30 = jVar.c;
            float[] fArr9 = jVar.j;
            if (z10) {
                int i35 = 0;
                double d2 = 0.0d;
                double d10 = 0.0d;
                i10 = 1;
                for (int i36 = 0; i36 < iArr2.length; i36++) {
                    int i37 = 0;
                    while (i37 < iArr2[i36]) {
                        int i38 = iArr[i35];
                        float f31 = fArr2[i38];
                        int i39 = length2;
                        double d11 = f31 > 0.0f ? fArr8[i38] : 0.3f;
                        if (f31 <= 0.0f) {
                            f31 = f22;
                        }
                        d2 = (Math.log((f31 * fArr4[i36]) / fArr3[i35]) * d11) + d2;
                        d10 += d11;
                        i37++;
                        i35++;
                        length2 = i39;
                    }
                }
                i7 = length2;
                f11 = 0.3f;
                float exp2 = (float) Math.exp(d2 / d10);
                float f32 = jVar.d;
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
                        if (z10) {
                            f12 = com.google.android.recaptcha.internal.a.x(log, 0.4f, log, f12);
                        }
                        float f34 = f10 + f12;
                        int length3 = iArr.length;
                        float f35 = Float.MAX_VALUE;
                        float f36 = f29;
                        float f37 = 0.0f;
                        float f38 = 0.0f;
                        int i40 = 0;
                        int i41 = 0;
                        while (i40 < iArr2.length) {
                            float f39 = fArr4[i40];
                            int i42 = i41;
                            int i43 = i40;
                            float f40 = f37;
                            int i44 = i42;
                            float f41 = f34;
                            int i45 = 0;
                            while (i45 < iArr2[i43]) {
                                float f42 = fArr3[i44] * f39;
                                f35 = Math.min(f35, f42);
                                float max = Math.max(f40, f42);
                                float f43 = fArr2[iArr[i44]];
                                int i46 = i45;
                                float f44 = (fArr3[i44] * f33) / f39;
                                if (f43 > 0.0f) {
                                    float min2 = f22 - (Math.min(f43, f44) / Math.max(f43, f44));
                                    min = (((min2 * 1.5f * min2) + min2) * fArr8[iArr[i44]]) + f38;
                                } else {
                                    float f45 = f22;
                                    min = ((f45 - (Math.min(f45, f44) / Math.max(f45, f44))) * f11) + f38;
                                }
                                float f46 = min;
                                float log2 = (float) Math.log(f42 * length3);
                                f38 = com.google.android.recaptcha.internal.a.x(log2, f11, log2, f46);
                                i45 = i46 + 1;
                                i44++;
                                f40 = max;
                                f22 = 1.0f;
                            }
                            int i47 = i43 + 1;
                            i41 = i44;
                            f34 = f41;
                            f22 = 1.0f;
                            f37 = f40;
                            i40 = i47;
                        }
                        float f47 = f34;
                        float log3 = (float) Math.log((f37 / f35) / 1.5f);
                        if (log3 > 0.0f) {
                            f38 = (log3 * f27) + f38;
                        }
                        float f48 = f47 + f38;
                        if (f48 < kVar.f - 1.0E-5f) {
                            int length4 = iArr.length;
                            kVar.f = f48;
                            kVar.d = z9;
                            kVar.c = (int[]) iArr.clone();
                            kVar.e = (int[]) iArr2.clone();
                            f22 = 1.0f;
                            if (z9) {
                                f33 = 1.0f / f33;
                            }
                            kVar.a = f33;
                            kVar.b = new float[length4 * 4];
                            float f49 = 0.0f;
                            int i48 = 0;
                            int i49 = 0;
                            while (i48 < iArr2.length) {
                                float f50 = i48 == iArr2.length + (-1) ? 1.0f : fArr4[i48] + f49;
                                int i50 = i48;
                                float f51 = 0.0f;
                                int i51 = 0;
                                while (true) {
                                    int i52 = iArr2[i50];
                                    if (i51 < i52) {
                                        float f52 = i51 == i52 + (-1) ? 1.0f : fArr3[i49] + f51;
                                        int i53 = iArr[i49];
                                        if (z9) {
                                            f13 = f52;
                                            float[] fArr10 = kVar.b;
                                            int i54 = i53 * 4;
                                            fArr10[i54] = f49;
                                            fArr10[i54 + 1] = f51;
                                            fArr10[i54 + 2] = f50;
                                            fArr10[i54 + 3] = f13;
                                        } else {
                                            f13 = f52;
                                            float[] fArr11 = kVar.b;
                                            int i55 = i53 * 4;
                                            fArr11[i55] = f51;
                                            fArr11[i55 + 1] = f49;
                                            fArr11[i55 + 2] = f13;
                                            fArr11[i55 + 3] = f50;
                                        }
                                        i51++;
                                        i49++;
                                        f51 = f13;
                                    }
                                }
                                i48 = i50 + 1;
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
                    i28 = i33 + 1;
                    jVar = this;
                    length = i32;
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
            i28 = i33 + 1;
            jVar = this;
            length = i32;
            f16 = f28;
            fArr = fArr7;
            length2 = i7;
        }
    }
}
