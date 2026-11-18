package te;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.r1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        this(0, new r1(view), interpolator, j3, false);
    }

    @Override // te.b
    public final void D(float f10, int i7) {
        this.b.D(f10, this.a);
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, c cVar) {
        if (this.e != f10) {
            this.e = f10;
            this.b.H(this.a, f10, -1.0f, null);
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
                bVar.H(i7, f10, -1.0f, null);
            }
            bVar.D(f10, i7);
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
