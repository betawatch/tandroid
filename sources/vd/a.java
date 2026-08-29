package vd;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.u1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        this(0, new u1(view), interpolator, j10, false);
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, c cVar) {
        if (this.e != f9) {
            this.e = f9;
            this.b.N(this.a, f9, -1.0f, null);
        }
    }

    public final void a(boolean z10, boolean z11) {
        a aVar;
        if (this.f == z10 && z11) {
            return;
        }
        this.f = z10;
        float f9 = z10 ? 1.0f : 0.0f;
        if (z11) {
            if (this.h == null) {
                aVar = this;
                aVar.h = new c(0, aVar, this.c, this.d, this.e);
            } else {
                aVar = this;
            }
            aVar.h.a(f9);
            return;
        }
        c cVar = this.h;
        if (cVar != null) {
            cVar.c(f9);
        }
        float f10 = this.e;
        if (f10 != f9) {
            int i10 = this.a;
            b bVar = this.b;
            if (f10 != f9) {
                this.e = f9;
                bVar.N(i10, f9, -1.0f, null);
            }
            bVar.z(f9, i10);
        }
    }

    @Override // vd.b
    public final void z(float f9, int i10) {
        this.b.z(f9, this.a);
    }

    public a(int i10, b bVar, Interpolator interpolator, long j10) {
        this(i10, bVar, interpolator, j10, false);
    }

    public a(int i10, b bVar, Interpolator interpolator, long j10, boolean z10) {
        this.a = i10;
        this.b = bVar;
        this.c = interpolator;
        this.d = j10;
        this.f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
