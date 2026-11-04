package qe;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        this(0, new d1(view), interpolator, j10, false);
    }

    @Override // qe.b
    public final void F(float f10, int i3) {
        this.b.F(f10, this.a);
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, c cVar) {
        if (this.e != f10) {
            this.e = f10;
            this.b.Y(this.a, f10, -1.0f, null);
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
            int i3 = this.a;
            b bVar = this.b;
            if (f11 != f10) {
                this.e = f10;
                bVar.Y(i3, f10, -1.0f, null);
            }
            bVar.F(f10, i3);
        }
    }

    public a(int i3, b bVar, Interpolator interpolator, long j10) {
        this(i3, bVar, interpolator, j10, false);
    }

    public a(int i3, b bVar, Interpolator interpolator, long j10, boolean z10) {
        this.a = i3;
        this.b = bVar;
        this.c = interpolator;
        this.d = j10;
        this.f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
