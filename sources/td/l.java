package td;

import android.graphics.RectF;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l {
    public final RectF e = new RectF();
    public final k a = new k(0.0f);
    public final k b = new k(0.0f);
    public final k c = new k(0.0f);
    public final k d = new k(0.0f);

    public final boolean a(float f10) {
        return this.d.a(f10) || (this.c.a(f10) || (this.b.a(f10) || this.a.a(f10)));
    }

    public final boolean b(float f10, float f11, float f12, float f13) {
        return this.a.b(f10) || this.b.b(f11) || this.c.b(f12) || this.d.b(f13);
    }

    public final void c(boolean z10) {
        this.a.c(z10);
        this.b.c(z10);
        this.c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.a.d(f10);
        this.b.d(f11);
        this.c.d(f12);
        this.d.d(f13);
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.a.c = f10;
        this.b.c = f11;
        this.c.c = f12;
        this.d.c = f13;
    }
}
