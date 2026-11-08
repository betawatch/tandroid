package te;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class k {
    public float a;
    public float b;
    public float c;

    public k(float f10) {
        d(f10);
    }

    public final boolean a(float f10) {
        float f11 = this.b;
        float z9 = com.google.android.recaptcha.internal.a.z(this.c, f11, f10, f11);
        if (this.a == z9) {
            return false;
        }
        this.a = z9;
        return true;
    }

    public final boolean b(float f10) {
        return this.c != f10;
    }

    public final void c(boolean z9) {
        if (!z9) {
            this.b = this.a;
            return;
        }
        float f10 = this.c;
        this.a = f10;
        this.b = f10;
    }

    public final void d(float f10) {
        this.b = f10;
        this.c = f10;
        this.a = f10;
    }
}
