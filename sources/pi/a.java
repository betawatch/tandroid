package pi;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b8.cd;
import b8.mf;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class a {
    public final q a;
    public final si.c b;
    public final eh.c c;
    public final eh.c d;
    public final si.d e;
    public final eh.c f;
    public final d g;
    public final si.f h;
    public final si.f i;
    public Runnable j;
    public final si.a k;
    public FrameLayout l;
    public ViewGroup m;
    public fh.a n;

    public a(q qVar, org.telegram.ui.ActionBar.n nVar) {
        this.a = qVar;
        qVar.a = new e3(this, 7);
        qVar.d = new ri.b(g0.L(48.0f));
        si.c cVar = new si.c();
        this.b = cVar;
        cVar.a(nVar.e());
        qVar.E.add(new o(cVar, nVar));
        if (Build.VERSION.SDK_INT < 31) {
            this.k = si.e.a;
            this.g = null;
            this.h = null;
            this.i = null;
            eh.c cVar2 = new eh.c(cVar, cVar, cVar);
            this.c = cVar2;
            cVar2.j = qVar;
            this.e = null;
            this.d = cVar2;
            this.f = cVar2;
            return;
        }
        d dVar = new d();
        this.g = dVar;
        si.f fVar = new si.f(cVar);
        fVar.f = cVar;
        fVar.h = dVar.d(2);
        this.h = fVar;
        si.f fVar2 = new si.f(cVar);
        this.i = fVar2;
        fVar2.f = cVar;
        fVar2.h = dVar.d(3);
        eh.c cVar3 = new eh.c(fVar, fVar2, cVar);
        this.c = cVar3;
        cVar3.j = qVar;
        cVar3.k = true;
        si.d dVar2 = new si.d(fVar, fVar2);
        this.e = dVar2;
        eh.c cVar4 = new eh.c(fVar2, fVar2, cVar);
        this.f = cVar4;
        cVar4.j = qVar;
        eh.c cVar5 = new eh.c(dVar2, fVar2, cVar);
        this.d = cVar5;
        cVar5.j = qVar;
        cVar5.k = true;
        this.k = dVar.d(1);
    }

    public static int c(int i3) {
        return Math.max(g0.L(8.0f), g0.L(48.0f) - i3);
    }

    public static int d(int i3) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        return g0.L(7.0f) + ((i3 + currentActionBarHeight) - ((currentActionBarHeight - g0.L(46.0f)) / 2));
    }

    public static void e(ViewGroup viewGroup, int i3, int i10, int i11, int i12) {
        int i13 = -c(i3);
        int i14 = (i3 + i11) - i13;
        int i15 = -c(i10);
        g0.B3(viewGroup, 0, i13, 0, i15);
        viewGroup.setPadding(0, i14, 0, (i10 + i12) - i15);
    }

    public final qi.f a(View view) {
        qi.f fVar = new qi.f(this.k);
        qi.g gVar = new qi.g(g0.L(32.0f));
        qi.g gVar2 = new qi.g(g0.L(56.0f));
        qi.g gVar3 = new qi.g(g0.L(48.0f));
        if (fVar.y != 1) {
            fVar.y = 1;
            fVar.w = true;
            fVar.x = true;
            fVar.invalidateSelf();
        }
        fVar.H = this.b;
        fVar.w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.J = hs.q2;
        si.c cVar = fVar.H;
        if (cVar != null) {
            fVar.I = k6.r1(hs.q2 / 255.0f, cVar.b);
        }
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.E = gVar;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.F = gVar2;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.L = hs.n3;
        si.c cVar2 = fVar.H;
        if (cVar2 != null) {
            fVar.K = k6.r1(hs.n3 / 255.0f, cVar2.b);
        }
        fVar.x = true;
        fVar.invalidateSelf();
        fVar.G = gVar3;
        fVar.x = true;
        fVar.invalidateSelf();
        this.a.c.add(new p(view, fVar));
        return fVar;
    }

    public final qi.f b(View view) {
        qi.f fVar = new qi.f(this.k);
        qi.g gVar = new qi.g(g0.L(28.0f));
        qi.g gVar2 = new qi.g(g0.L(40.0f));
        qi.g gVar3 = new qi.g(g0.L(30.0f));
        if (fVar.y != 4) {
            fVar.y = 4;
            fVar.w = true;
            fVar.x = true;
            fVar.invalidateSelf();
        }
        fVar.H = this.b;
        fVar.w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.J = hs.q2;
        si.c cVar = fVar.H;
        if (cVar != null) {
            fVar.I = k6.r1(hs.q2 / 255.0f, cVar.b);
        }
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.E = gVar;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.F = gVar2;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.L = hs.n3;
        si.c cVar2 = fVar.H;
        if (cVar2 != null) {
            fVar.K = k6.r1(hs.n3 / 255.0f, cVar2.b);
        }
        fVar.x = true;
        fVar.invalidateSelf();
        fVar.G = gVar3;
        fVar.x = true;
        fVar.invalidateSelf();
        this.a.c.add(new p(view, fVar));
        return fVar;
    }

    public final void f(FrameLayout frameLayout, tj0 tj0Var, View view, e6 e6Var) {
        this.l = frameLayout;
        this.m = tj0Var;
        tj0Var.setCaptureSectionsDecoratorAllowed(true);
        this.n = new ci.g(9, tj0Var, frameLayout);
        this.a.b(tj0Var);
        tj0Var.setClipToPadding(false);
        g(frameLayout, view, e6Var);
    }

    public final void g(FrameLayout frameLayout, View view, e6 e6Var) {
        if (view == null) {
            return;
        }
        g0.E2(view);
        frameLayout.addView(view, mf.e(-1, -2, 48));
        boolean z10 = view instanceof y4;
        eh.c cVar = this.c;
        if (z10) {
            y4 y4Var = (y4) view;
            y4Var.setExtraHeight(g0.L(6.0f));
            hh.e m10 = cd.m(e6Var);
            y4Var.M = cVar;
            y4Var.N = m10;
            y4Var.m();
            y4Var.o0 = this.d;
            y4Var.p0 = this.e;
            return;
        }
        if (view instanceof org.telegram.ui.ActionBar.k) {
            org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) view;
            kVar.setAddToContainer(false);
            kVar.setCenterTitleAndGlass(true);
            kVar.setExtraHeight(g0.L(6.0f));
            kVar.U0 = true;
            kVar.M(cVar, cd.m(e6Var), false);
        }
    }
}
