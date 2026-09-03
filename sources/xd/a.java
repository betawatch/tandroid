package xd;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.voip.u1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    @Override // xd.b
    public final void L(int i10, float f10, float f11, c cVar) {
        if (this.e != f10) {
            this.e = f10;
            this.b.L(this.a, f10, -1.0f, null);
        }
    }

    public final void a(boolean z4, boolean z10) {
        a aVar;
        if (this.f == z4 && z10) {
            return;
        }
        this.f = z4;
        float f10 = z4 ? 1.0f : 0.0f;
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
            int i10 = this.a;
            b bVar = this.b;
            if (f11 != f10) {
                this.e = f10;
                bVar.L(i10, f10, -1.0f, null);
            }
            bVar.z(f10, i10);
        }
    }

    @Override // xd.b
    public final void z(float f10, int i10) {
        this.b.z(f10, this.a);
    }

    public a(int i10, b bVar, Interpolator interpolator, long j10) {
        this(i10, bVar, interpolator, j10, false);
    }

    public a(int i10, b bVar, Interpolator interpolator, long j10, boolean z4) {
        this.a = i10;
        this.b = bVar;
        this.c = interpolator;
        this.d = j10;
        this.f = z4;
        this.e = z4 ? 1.0f : 0.0f;
    }
}
