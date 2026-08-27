package ud;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.t1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // ud.b
    public final void A(float f10, int i10) {
        this.b.A(f10, this.a);
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
            int i10 = this.a;
            b bVar = this.b;
            if (f11 != f10) {
                this.e = f10;
                bVar.o(i10, f10, -1.0f, null);
            }
            bVar.A(f10, i10);
        }
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, c cVar) {
        if (this.e != f10) {
            this.e = f10;
            this.b.o(this.a, f10, -1.0f, null);
        }
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
