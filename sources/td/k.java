package td;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        float z10 = e2.c.z(this.c, f11, f10, f11);
        if (this.a == z10) {
            return false;
        }
        this.a = z10;
        return true;
    }

    public final boolean b(float f10) {
        return this.c != f10;
    }

    public final void c(boolean z10) {
        if (!z10) {
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
