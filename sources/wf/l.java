package wf;

import android.graphics.Matrix;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public l(n nVar, int i10, int i11) {
        this.l = nVar;
        this.a = i10;
        this.b = i11;
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

    public static void d(l lVar, float f9) {
        Matrix matrix = lVar.k;
        matrix.reset();
        lVar.c = 0.0f;
        lVar.d = 0.0f;
        lVar.i = 0.0f;
        lVar.h = f9;
        lVar.h();
        float f10 = lVar.f;
        lVar.e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(l lVar, float f9) {
        lVar.i += f9;
        lVar.k.postRotate(f9, 0.0f, 0.0f);
    }

    public static void f(l lVar, float f9, float f10) {
        lVar.c += f9;
        lVar.d += f10;
        lVar.k.postTranslate(f9, f10);
    }

    public static void g(l lVar, float f9, float f10, float f11) {
        lVar.e *= f9;
        lVar.k.postScale(f9, f9, f10, f11);
    }

    public final void h() {
        float f9 = this.h;
        float f10 = this.g;
        float f11 = (f9 + f10) % 180.0f != 0.0f ? this.b : this.a;
        float f12 = (f9 + f10) % 180.0f != 0.0f ? this.a : this.b;
        n nVar = this.l;
        if (nVar.x) {
            this.f = nVar.a.getCropWidth() / f11;
        } else {
            this.f = Math.max(nVar.a.getCropWidth() / f11, nVar.a.getCropHeight() / f12);
        }
    }
}
