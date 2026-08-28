package tf;

import android.graphics.Matrix;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l {
    public float a;
    public float b;
    public float f;
    public float h;
    public boolean j;
    public final /* synthetic */ n l;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float g = 0;
    public float i = 0.0f;
    public final Matrix k = new Matrix();

    public l(n nVar, int i9, int i10) {
        this.l = nVar;
        this.a = i9;
        this.b = i10;
    }

    public static float a(l lVar) {
        return (lVar.h + lVar.g) % 180.0f != 0.0f ? lVar.b : lVar.a;
    }

    public static float b(l lVar) {
        return (lVar.h + lVar.g) % 180.0f != 0.0f ? lVar.a : lVar.b;
    }

    public static boolean c(l lVar) {
        return Math.abs(lVar.c) > 1.0E-5f || Math.abs(lVar.d) > 1.0E-5f || Math.abs(lVar.e - lVar.f) > 1.0E-5f || Math.abs(lVar.i) > 1.0E-5f || Math.abs(lVar.h) > 1.0E-5f;
    }

    public static void d(l lVar, float f10) {
        Matrix matrix = lVar.k;
        matrix.reset();
        lVar.c = 0.0f;
        lVar.d = 0.0f;
        lVar.i = 0.0f;
        lVar.h = f10;
        lVar.h();
        float f11 = lVar.f;
        lVar.e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(l lVar, float f10) {
        lVar.i += f10;
        lVar.k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(l lVar, float f10, float f11) {
        lVar.c += f10;
        lVar.d += f11;
        lVar.k.postTranslate(f10, f11);
    }

    public static void g(l lVar, float f10, float f11, float f12) {
        lVar.e *= f10;
        lVar.k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10 = this.h;
        float f11 = this.g;
        float f12 = (f10 + f11) % 180.0f != 0.0f ? this.b : this.a;
        float f13 = (f10 + f11) % 180.0f != 0.0f ? this.a : this.b;
        n nVar = this.l;
        if (nVar.x) {
            this.f = nVar.a.getCropWidth() / f12;
        } else {
            this.f = Math.max(nVar.a.getCropWidth() / f12, nVar.a.getCropHeight() / f13);
        }
    }
}
