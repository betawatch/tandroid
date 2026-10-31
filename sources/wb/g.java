package wb;

import c3.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public g(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.a = f7;
        this.b = f12;
        this.c = f15;
        this.d = f10;
        this.e = f13;
        this.f = f16;
        this.g = f11;
        this.h = f14;
        this.i = f17;
    }

    public static g a(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = ((f7 - f11) + f13) - f15;
        float f18 = ((f10 - f12) + f14) - f16;
        if (f17 == 0.0f && f18 == 0.0f) {
            return new g(f11 - f7, f13 - f11, f7, f12 - f10, f14 - f12, f10, 0.0f, 0.0f, 1.0f);
        }
        float f19 = f11 - f13;
        float f20 = f15 - f13;
        float f21 = f12 - f14;
        float f22 = f16 - f14;
        float f23 = (f19 * f22) - (f20 * f21);
        float g10 = i0.g(f20, f18, f22 * f17, f23);
        float g11 = i0.g(f17, f21, f19 * f18, f23);
        return new g((g10 * f11) + (f11 - f7), (g11 * f15) + (f15 - f7), f7, (g10 * f12) + (f12 - f10), (g11 * f16) + (f16 - f10), f10, g10, g11, 1.0f);
    }
}
