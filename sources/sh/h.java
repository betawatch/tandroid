package sh;

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import gi.j8;
import m2.t;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.Components.ez;
import qe.k;
import qe.l;
import r0.k1;
import r4.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class h implements f, e, c {
    public d E;
    public View F;
    public int G;
    public int H;
    public final qe.c a;
    public final k b = new k(0.0f);
    public final l c = new l();
    public final l d = new l();
    public final g2.g e = new g2.g((int[]) null);
    public final ez f;
    public final Runnable h;
    public boolean n;
    public k1 r;
    public int s;
    public int w;
    public int x;
    public final g y;

    public h(Runnable runnable) {
        j8 j8Var = new j8(this, 22);
        ez ezVar = new ez();
        ezVar.c = b.a;
        ezVar.d = new u(ezVar, 2);
        ezVar.b = j8Var;
        Typeface typeface = g0.a;
        float f10 = 1.0f;
        try {
            f10 = Settings.Global.getFloat(t0.b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        ezVar.a = (long) (f10 * 250.0f * 1.1f);
        this.f = ezVar;
        this.s = 1;
        this.y = new g(this, 0);
        this.h = runnable;
        this.a = new qe.c(0, new t(25, this, runnable), h1.w, 250L);
    }

    @Override // sh.c
    public final void P() {
        View view = this.F;
        if (view != null) {
            view.postOnAnimation(new g(this, 1));
        }
    }

    @Override // sh.c
    public final View R() {
        return this.F;
    }

    public final void a() {
        boolean z10 = this.a.h;
        boolean z11 = this.n;
        g2.g gVar = this.e;
        if (!z11 && z10) {
            this.n = true;
            gVar.d();
        }
        if (!this.n || z10) {
            return;
        }
        this.n = false;
        gVar.e();
    }

    public final float c() {
        d dVar = this.E;
        l lVar = this.d;
        return (dVar == null || this.H <= 0) ? lVar.d.a : Math.max(this.G, lVar.d.a);
    }

    public final float d() {
        d dVar = this.E;
        l lVar = this.c;
        return (dVar == null || this.H <= 0) ? lVar.d.a : Math.max(this.G, lVar.d.a);
    }

    public final int e() {
        return (this.E == null || this.H <= 0) ? Math.max(f(527).d, this.w) : Math.max(this.G, Math.max(f(527).d, this.w));
    }

    public final i0.b f(int i3) {
        k1 k1Var = this.r;
        return k1Var != null ? k1Var.a.f(i3) : i0.b.e;
    }

    public final void g(int i3) {
        if (this.w == i3 && this.s == 0) {
            return;
        }
        g0.r(this.y);
        this.x = Math.max(this.w, i3);
        this.w = i3;
        this.s = 0;
        j(this.r);
    }

    public final void h(int i3) {
        if (i3 > 0) {
            g(i3 + g0.n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z10) {
        if (this.w == 0) {
            return;
        }
        g gVar = this.y;
        g0.r(gVar);
        this.s = z10 ? 3 : 2;
        j(this.r);
        if (z10) {
            g0.i3(gVar, 1000L);
        }
    }

    public final void j(k1 k1Var) {
        k(k1Var, this.r != null);
    }

    public final void k(k1 k1Var, boolean z10) {
        i0.b bVar;
        int i3;
        qe.c cVar;
        k1 b10 = b(k1Var);
        this.r = b10;
        i0.b bVar2 = i0.b.e;
        if (b10 != null) {
            r0.h1 h1Var = b10.a;
            bVar = i0.b.a(h1Var.f(647), h1Var.g(647));
        } else {
            bVar = bVar2;
        }
        if (b10 != null) {
            bVar2 = b10.a.f(8);
        }
        ez ezVar = this.f;
        b bVar3 = (b) ezVar.c;
        boolean z11 = bVar2.d > 0;
        b bVar4 = !z10 ? z11 ? b.d : b.a : z11 ? b.c : b.b;
        if (bVar3 != bVar4) {
            ezVar.a(bVar4, false);
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
        qe.c cVar2 = this.a;
        l lVar = this.d;
        l lVar2 = this.c;
        k kVar = this.b;
        if (z10) {
            if (kVar.b(i14 > 0 ? 1.0f : 0.0f)) {
                i3 = i16;
                cVar = cVar2;
            } else {
                cVar = cVar2;
                i3 = i16;
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
            lVar2.e(i18, i17, i3, i15);
            lVar.e(i13, i12, i11, i14);
            qe.c cVar3 = cVar;
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

    @Override // sh.c
    public final void m(k1 k1Var) {
        k1 b10 = b(k1Var);
        this.G = b10 != null ? b10.a.f(8).d : 0;
        this.h.run();
    }

    @Override // sh.c
    public final void w() {
        this.H++;
    }

    public k1 b(k1 k1Var) {
        return k1Var;
    }
}
