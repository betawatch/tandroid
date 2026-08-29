package vd;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l {
    public float a;
    public float b;
    public float c;

    public l(float f9) {
        d(f9);
    }

    public final boolean a(float f9) {
        float f10 = this.b;
        float z10 = com.google.android.recaptcha.internal.a.z(this.c, f10, f9, f10);
        if (this.a == z10) {
            return false;
        }
        this.a = z10;
        return true;
    }

    public final boolean b(float f9) {
        return this.c != f9;
    }

    public final void c(boolean z10) {
        if (!z10) {
            this.b = this.a;
            return;
        }
        float f9 = this.c;
        this.a = f9;
        this.b = f9;
    }

    public final void d(float f9) {
        this.b = f9;
        this.c = f9;
        this.a = f9;
    }
}
