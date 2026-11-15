package te;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.s1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        this(0, new s1(view), interpolator, j3, false);
    }

    @Override // te.b
    public final void E(float f10, int i7) {
        this.b.E(f10, this.a);
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, c cVar) {
        if (this.e != f10) {
            this.e = f10;
            this.b.G(this.a, f10, -1.0f, null);
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
            int i7 = this.a;
            b bVar = this.b;
            if (f11 != f10) {
                this.e = f10;
                bVar.G(i7, f10, -1.0f, null);
            }
            bVar.E(f10, i7);
        }
    }

    public a(int i7, b bVar, Interpolator interpolator, long j3) {
        this(i7, bVar, interpolator, j3, false);
    }

    public a(int i7, b bVar, Interpolator interpolator, long j3, boolean z10) {
        this.a = i7;
        this.b = bVar;
        this.c = interpolator;
        this.d = j3;
        this.f = z10;
        this.e = z10 ? 1.0f : 0.0f;
    }
}
