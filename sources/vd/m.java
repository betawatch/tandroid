package vd;

import android.graphics.RectF;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m {
    public final RectF e = new RectF();
    public final l a = new l(0.0f);
    public final l b = new l(0.0f);
    public final l c = new l(0.0f);
    public final l d = new l(0.0f);

    public final boolean a(float f9) {
        return this.d.a(f9) || (this.c.a(f9) || (this.b.a(f9) || this.a.a(f9)));
    }

    public final boolean b(float f9, float f10, float f11, float f12) {
        return this.a.b(f9) || this.b.b(f10) || this.c.b(f11) || this.d.b(f12);
    }

    public final void c(boolean z10) {
        this.a.c(z10);
        this.b.c(z10);
        this.c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f9, float f10, float f11, float f12) {
        this.a.d(f9);
        this.b.d(f10);
        this.c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f9, float f10, float f11, float f12) {
        this.a.c = f9;
        this.b.c = f10;
        this.c.c = f11;
        this.d.c = f12;
    }
}
