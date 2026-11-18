package te;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        float z10 = e2.z(this.c, f11, f10, f11);
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
