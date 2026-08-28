package td;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.t1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements b {
    public final int a;
    public final b b;
    public final Interpolator c;
    public final long d;
    public float e;
    public boolean f;
    public c h;

    public a(View view, Interpolator interpolator, long j10) {
        this(0, new t1(view), interpolator, j10, false);
    }

    @Override // td.b
    public final void B(float f10, int i9) {
        this.b.B(f10, this.a);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, c cVar) {
        if (this.e != f10) {
            this.e = f10;
            this.b.J0(this.a, f10, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        a aVar;
        if (this.f == z10 && z11) {
            return;
        }
        this.f = z10;
        float f10 = z10 ? 1.0f : 0.0f;
        if (z11) {
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
            int i9 = this.a;
            b bVar = this.b;
            if (f11 != f10) {
                this.e = f10;
                bVar.J0(i9, f10, -1.0f, null);
            }
            bVar.B(f10, i9);
        }
    }

    public a(int i9, b bVar, Interpolator interpolator, long j10) {
        this(i9, bVar, interpolator, j10, false);
    }

    public a(int i9, b bVar, Interpolator interpolator, long j10, boolean z10) {
        this.a = i9;
        this.b = bVar;
        this.c = interpolator;
        this.d = j10;
        this.f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
