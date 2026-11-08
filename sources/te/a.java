package te;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.o1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a implements b {
    public final int a;
    public final b b;
    public final Interpolator c;
    public final long d;
    public float e;
    public boolean f;
    public c h;

    public a(View view, Interpolator interpolator, long j3) {
        this(0, new o1(view), interpolator, j3, false);
    }

    @Override // te.b
    public final void F(float f10, int i7) {
        this.b.F(f10, this.a);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, c cVar) {
        if (this.e != f10) {
            this.e = f10;
            this.b.Y(this.a, f10, -1.0f, null);
        }
    }

    public final void a(boolean z9, boolean z10) {
        a aVar;
        if (this.f == z9 && z10) {
            return;
        }
        this.f = z9;
        float f10 = z9 ? 1.0f : 0.0f;
        if (z10) {
            if (this.h == null) {
                aVar = this;
                aVar.h = new c(0, aVar, this.c, this.d, this.e);
            } else {
                aVar = this;
            }
            aVar.h.a(f10);
            return;
        }
        c cVar = this.h;
        if (cVar != null) {
            cVar.c(f10);
        }
        float f11 = this.e;
        if (f11 != f10) {
            int i7 = this.a;
            b bVar = this.b;
            if (f11 != f10) {
                this.e = f10;
                bVar.Y(i7, f10, -1.0f, null);
            }
            bVar.F(f10, i7);
        }
    }

    public a(int i7, b bVar, Interpolator interpolator, long j3) {
        this(i7, bVar, interpolator, j3, false);
    }

    public a(int i7, b bVar, Interpolator interpolator, long j3, boolean z9) {
        this.a = i7;
        this.b = bVar;
        this.c = interpolator;
        this.d = j3;
        this.f = z9;
        this.e = z9 ? 1.0f : 0.0f;
    }
}
