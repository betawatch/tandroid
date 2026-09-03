package xd;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        float w10 = e2.c.w(this.c, f11, f10, f11);
        if (this.a == w10) {
            return false;
        }
        this.a = w10;
        return true;
    }

    public final boolean b(float f10) {
        return this.c != f10;
    }

    public final void c(boolean z4) {
        if (!z4) {
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
