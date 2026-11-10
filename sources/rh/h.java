package rh;

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import m4.d0;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.Components.hz;
import r0.h1;
import r0.k1;
import te.k;
import te.l;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class h implements f, e, c {
    public d D;
    public View E;
    public int F;
    public int G;
    public final te.c a;
    public final k b = new k(0.0f);
    public final l c = new l();
    public final l d = new l();
    public final h2.f e = new h2.f((int[]) null);
    public final hz f;
    public final Runnable h;
    public boolean n;
    public k1 r;
    public int s;
    public int w;
    public int x;
    public final g y;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Runnable runnable) {
        ii.c cVar = new ii.c(this, 19);
        hz hzVar = new hz();
        hzVar.c = b.a;
        hzVar.d = new p5(hzVar, 22);
        hzVar.b = cVar;
        Typeface typeface = g0.a;
        float f10 = 1.0f;
        try {
            f10 = Settings.Global.getFloat(t0.b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        hzVar.a = (long) (f10 * 250.0f * 1.1f);
        this.f = hzVar;
        this.s = 1;
        this.y = new g(this, 0);
        this.h = runnable;
        this.a = new te.c(0, new d0(this, runnable, 0 == true ? 1 : 0), i1.w, 250L);
    }

    @Override // rh.c
    public final void P() {
        View view = this.E;
        if (view != null) {
            view.postOnAnimation(new g(this, 1));
        }
    }

    @Override // rh.c
    public final View R() {
        return this.E;
    }

    public final void a() {
        boolean z9 = this.a.h;
        boolean z10 = this.n;
        h2.f fVar = this.e;
        if (!z10 && z9) {
            this.n = true;
            fVar.d();
        }
        if (!this.n || z9) {
            return;
        }
        this.n = false;
        fVar.e();
    }

    public final float c() {
        d dVar = this.D;
        l lVar = this.d;
        return (dVar == null || this.G <= 0) ? lVar.d.a : Math.max(this.F, lVar.d.a);
    }

    public final float d() {
        d dVar = this.D;
        l lVar = this.c;
        return (dVar == null || this.G <= 0) ? lVar.d.a : Math.max(this.F, lVar.d.a);
    }

    public final int e() {
        return (this.D == null || this.G <= 0) ? Math.max(f(527).d, this.w) : Math.max(this.F, Math.max(f(527).d, this.w));
    }

    public final i0.b f(int i7) {
        k1 k1Var = this.r;
        return k1Var != null ? k1Var.a.f(i7) : i0.b.e;
    }

    public final void g(int i7) {
        if (this.w == i7 && this.s == 0) {
            return;
        }
        g0.r(this.y);
        this.x = Math.max(this.w, i7);
        this.w = i7;
        this.s = 0;
        j(this.r);
    }

    public final void h(int i7) {
        if (i7 > 0) {
            g(i7 + g0.n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z9) {
        if (this.w == 0) {
            return;
        }
        g gVar = this.y;
        g0.r(gVar);
        this.s = z9 ? 3 : 2;
        j(this.r);
        if (z9) {
            g0.i3(gVar, 1000L);
        }
    }

    public final void j(k1 k1Var) {
        k(k1Var, this.r != null);
    }

    public final void k(k1 k1Var, boolean z9) {
        i0.b bVar;
        int i7;
        te.c cVar;
        k1 b10 = b(k1Var);
        this.r = b10;
        i0.b bVar2 = i0.b.e;
        if (b10 != null) {
            h1 h1Var = b10.a;
            bVar = i0.b.a(h1Var.f(647), h1Var.g(647));
        } else {
            bVar = bVar2;
        }
        if (b10 != null) {
            bVar2 = b10.a.f(8);
        }
        hz hzVar = this.f;
        b bVar3 = (b) hzVar.c;
        boolean z10 = bVar2.d > 0;
        b bVar4 = !z9 ? z10 ? b.d : b.a : z10 ? b.c : b.b;
        if (bVar3 != bVar4) {
            hzVar.a(bVar4, false);
        }
        int i10 = this.s;
        if (i10 == 2) {
            this.w = 0;
        }
        if (i10 == 3 && bVar2.d > 0) {
            this.w = 0;
        }
        i0.b a10 = i0.b.a(bVar2, i0.b.b(0, 0, 0, this.w));
        int i11 = a10.c;
        int i12 = a10.b;
        int i13 = a10.a;
        int i14 = a10.d;
        i0.b a11 = i0.b.a(bVar, a10);
        int i15 = a11.d;
        int i16 = a11.c;
        int i17 = a11.b;
        int i18 = a11.a;
        Runnable runnable = this.h;
        te.c cVar2 = this.a;
        l lVar = this.d;
        l lVar2 = this.c;
        k kVar = this.b;
        if (z9) {
            if (kVar.b(i14 > 0 ? 1.0f : 0.0f)) {
                i7 = i16;
                cVar = cVar2;
            } else {
                cVar = cVar2;
                i7 = i16;
                if (!lVar2.b(i18, i17, i16, i15) && !lVar.b(i13, i12, i11, i14)) {
                    if (bVar3 != bVar4) {
                        runnable.run();
                    }
                }
            }
            cVar.b();
            kVar.c(false);
            lVar2.c(false);
            lVar.c(false);
            kVar.c = i14 > 0 ? 1.0f : 0.0f;
            lVar2.e(i18, i17, i7, i15);
            lVar.e(i13, i12, i11, i14);
            te.c cVar3 = cVar;
            cVar3.c(0.0f);
            cVar3.a(1.0f);
        } else {
            cVar2.b();
            kVar.d(i14 > 0 ? 1.0f : 0.0f);
            lVar2.d(i18, i17, i16, i15);
            lVar.d(i13, i12, i11, i14);
            runnable.run();
        }
        a();
    }

    @Override // rh.c
    public final void m(k1 k1Var) {
        k1 b10 = b(k1Var);
        this.F = b10 != null ? b10.a.f(8).d : 0;
        this.h.run();
    }

    @Override // rh.c
    public final void w() {
        this.G++;
    }

    public k1 b(k1 k1Var) {
        return k1Var;
    }
}
