package pg;

import android.graphics.Matrix;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k {
    public float a;
    public float b;
    public float f;
    public float h;
    public boolean j;
    public final /* synthetic */ m l;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float g = 0;
    public float i = 0.0f;
    public final Matrix k = new Matrix();

    public k(m mVar, int i3, int i10) {
        this.l = mVar;
        this.a = i3;
        this.b = i10;
    }

    public static float a(k kVar) {
        return (kVar.h + kVar.g) % 180.0f != 0.0f ? kVar.b : kVar.a;
    }

    public static float b(k kVar) {
        return (kVar.h + kVar.g) % 180.0f != 0.0f ? kVar.a : kVar.b;
    }

    public static boolean c(k kVar) {
        return Math.abs(kVar.c) > 1.0E-5f || Math.abs(kVar.d) > 1.0E-5f || Math.abs(kVar.e - kVar.f) > 1.0E-5f || Math.abs(kVar.i) > 1.0E-5f || Math.abs(kVar.h) > 1.0E-5f;
    }

    public static void d(k kVar, float f10) {
        Matrix matrix = kVar.k;
        matrix.reset();
        kVar.c = 0.0f;
        kVar.d = 0.0f;
        kVar.i = 0.0f;
        kVar.h = f10;
        kVar.h();
        float f11 = kVar.f;
        kVar.e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(k kVar, float f10) {
        kVar.i += f10;
        kVar.k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(k kVar, float f10, float f11) {
        kVar.c += f10;
        kVar.d += f11;
        kVar.k.postTranslate(f10, f11);
    }

    public static void g(k kVar, float f10, float f11, float f12) {
        kVar.e *= f10;
        kVar.k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10 = this.h;
        float f11 = this.g;
        float f12 = (f10 + f11) % 180.0f != 0.0f ? this.b : this.a;
        float f13 = (f10 + f11) % 180.0f != 0.0f ? this.a : this.b;
        m mVar = this.l;
        if (mVar.y) {
            this.f = mVar.a.getCropWidth() / f12;
        } else {
            this.f = Math.max(mVar.a.getCropWidth() / f12, mVar.a.getCropHeight() / f13);
        }
    }
}
