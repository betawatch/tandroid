package t4;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public d(int i7, int i10) {
        this.a = Color.red(i7);
        this.b = Color.green(i7);
        this.c = Color.blue(i7);
        this.d = i7;
        this.e = i10;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        int i7 = this.d;
        int i10 = i0.a.i(4.5f, -1, i7);
        int i11 = i0.a.i(3.0f, -1, i7);
        if (i10 != -1 && i11 != -1) {
            this.h = i0.a.o(-1, i10);
            this.g = i0.a.o(-1, i11);
            this.f = true;
            return;
        }
        int i12 = i0.a.i(4.5f, -16777216, i7);
        int i13 = i0.a.i(3.0f, -16777216, i7);
        if (i12 == -1 || i13 == -1) {
            this.h = i10 != -1 ? i0.a.o(-1, i10) : i0.a.o(-16777216, i12);
            this.g = i11 != -1 ? i0.a.o(-1, i11) : i0.a.o(-16777216, i13);
            this.f = true;
        } else {
            this.h = i0.a.o(-16777216, i12);
            this.g = i0.a.o(-16777216, i13);
            this.f = true;
        }
    }

    public final float[] b() {
        if (this.i == null) {
            this.i = new float[3];
        }
        i0.a.c(this.a, this.b, this.c, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.e == dVar.e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
