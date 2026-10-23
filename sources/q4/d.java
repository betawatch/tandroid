package q4;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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

    public d(int i10, int i11) {
        this.a = Color.red(i10);
        this.b = Color.green(i10);
        this.c = Color.blue(i10);
        this.d = i10;
        this.e = i11;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        int i10 = this.d;
        int i11 = i0.a.i(4.5f, -1, i10);
        int i12 = i0.a.i(3.0f, -1, i10);
        if (i11 != -1 && i12 != -1) {
            this.h = i0.a.o(-1, i11);
            this.g = i0.a.o(-1, i12);
            this.f = true;
            return;
        }
        int i13 = i0.a.i(4.5f, -16777216, i10);
        int i14 = i0.a.i(3.0f, -16777216, i10);
        if (i13 == -1 || i14 == -1) {
            this.h = i11 != -1 ? i0.a.o(-1, i11) : i0.a.o(-16777216, i13);
            this.g = i12 != -1 ? i0.a.o(-1, i12) : i0.a.o(-16777216, i14);
            this.f = true;
        } else {
            this.h = i0.a.o(-16777216, i13);
            this.g = i0.a.o(-16777216, i14);
            this.f = true;
        }
    }

    public final float[] b() {
        if (this.i == null) {
            this.i = new float[3];
        }
        i0.a.c(this.i, this.a, this.b, this.c);
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
