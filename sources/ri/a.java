package ri;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.w4;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class a {
    public final q a;
    public final ui.c b;
    public final dh.c c;
    public final dh.c d;
    public final ui.d e;
    public final dh.c f;
    public final d g;
    public final ui.f h;
    public final ui.f i;
    public Runnable j;
    public final ui.a k;
    public boolean l;
    public FrameLayout m;
    public ViewGroup n;
    public eh.a o;

    public a(q qVar, n nVar) {
        this.a = qVar;
        qVar.a = new z(this, 19);
        qVar.d = new ti.b(g0.L(48.0f));
        ui.c cVar = new ui.c();
        this.b = cVar;
        cVar.a(nVar.e());
        qVar.E.add(new o(cVar, nVar));
        if (Build.VERSION.SDK_INT < 31) {
            this.k = ui.e.a;
            this.g = null;
            this.h = null;
            this.i = null;
            dh.c cVar2 = new dh.c(cVar, cVar, cVar);
            this.c = cVar2;
            cVar2.j = qVar;
            this.e = null;
            this.d = cVar2;
            this.f = cVar2;
            return;
        }
        d dVar = new d();
        this.g = dVar;
        ui.f fVar = new ui.f(cVar);
        fVar.f = cVar;
        fVar.h = dVar.d(2);
        this.h = fVar;
        ui.f fVar2 = new ui.f(cVar);
        this.i = fVar2;
        fVar2.f = cVar;
        fVar2.h = dVar.d(3);
        dh.c cVar3 = new dh.c(fVar, fVar2, cVar);
        this.c = cVar3;
        cVar3.j = qVar;
        cVar3.k = true;
        ui.d dVar2 = new ui.d(fVar, fVar2);
        this.e = dVar2;
        dh.c cVar4 = new dh.c(fVar2, fVar2, cVar);
        this.f = cVar4;
        cVar4.j = qVar;
        dh.c cVar5 = new dh.c(dVar2, fVar2, cVar);
        this.d = cVar5;
        cVar5.j = qVar;
        cVar5.k = true;
        this.k = dVar.d(1);
    }

    public static int c(int i7) {
        return Math.max(g0.L(8.0f), g0.L(48.0f) - i7);
    }

    public static int d(int i7) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        return g0.L(7.0f) + ((i7 + currentActionBarHeight) - ((currentActionBarHeight - g0.L(46.0f)) / 2));
    }

    public static void e(ViewGroup viewGroup, int i7, int i10, int i11, int i12) {
        int i13 = -c(i7);
        int i14 = (i7 + i11) - i13;
        int i15 = -c(i10);
        g0.A3(viewGroup, 0, i13, 0, i15);
        viewGroup.setPadding(0, i14, 0, (i10 + i12) - i15);
    }

    public final si.f a(View view) {
        si.f fVar = new si.f(this.k);
        si.g gVar = new si.g(g0.L(32.0f));
        si.g gVar2 = new si.g(g0.L(56.0f));
        si.g gVar3 = new si.g(g0.L(48.0f));
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
        fVar.J = ns.q2;
        ui.c cVar = fVar.H;
        if (cVar != null) {
            fVar.I = j6.r1(ns.q2 / 255.0f, cVar.b);
        }
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.E = gVar;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.F = gVar2;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.L = ns.n3;
        ui.c cVar2 = fVar.H;
        if (cVar2 != null) {
            fVar.K = j6.r1(ns.n3 / 255.0f, cVar2.b);
        }
        fVar.x = true;
        fVar.invalidateSelf();
        fVar.G = gVar3;
        fVar.x = true;
        fVar.invalidateSelf();
        this.a.c.add(new p(view, fVar));
        return fVar;
    }

    public final si.f b(View view) {
        si.f fVar = new si.f(this.k);
        si.g gVar = new si.g(g0.L(28.0f));
        si.g gVar2 = new si.g(g0.L(40.0f));
        si.g gVar3 = new si.g(g0.L(30.0f));
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
        fVar.J = ns.q2;
        ui.c cVar = fVar.H;
        if (cVar != null) {
            fVar.I = j6.r1(ns.q2 / 255.0f, cVar.b);
        }
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.E = gVar;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.F = gVar2;
        fVar.w = true;
        fVar.invalidateSelf();
        fVar.L = ns.n3;
        ui.c cVar2 = fVar.H;
        if (cVar2 != null) {
            fVar.K = j6.r1(ns.n3 / 255.0f, cVar2.b);
        }
        fVar.x = true;
        fVar.invalidateSelf();
        fVar.G = gVar3;
        fVar.x = true;
        fVar.invalidateSelf();
        this.a.c.add(new p(view, fVar));
        return fVar;
    }

    public final void f(FrameLayout frameLayout, uj0 uj0Var, View view, e6 e6Var) {
        this.m = frameLayout;
        this.n = uj0Var;
        uj0Var.setCaptureSectionsDecoratorAllowed(true);
        this.o = new di.f(9, uj0Var, frameLayout);
        this.a.b(uj0Var);
        uj0Var.setClipToPadding(false);
        g(frameLayout, view, e6Var);
    }

    public final void g(FrameLayout frameLayout, View view, e6 e6Var) {
        if (view == null) {
            return;
        }
        g0.E2(view);
        frameLayout.addView(view, ja.e(-1, -2, 48));
        boolean z10 = view instanceof w4;
        dh.c cVar = this.c;
        if (z10) {
            w4 w4Var = (w4) view;
            w4Var.setExtraHeight(g0.L(6.0f));
            gh.e l10 = c8.g0.l(e6Var);
            w4Var.M = cVar;
            w4Var.N = l10;
            w4Var.p();
            w4Var.o0 = this.d;
            w4Var.p0 = this.e;
            return;
        }
        if (view instanceof org.telegram.ui.ActionBar.k) {
            org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) view;
            kVar.setAddToContainer(false);
            kVar.setCenterTitleAndGlass(true);
            kVar.setExtraHeight(g0.L(6.0f));
            kVar.U0 = true;
            kVar.P(cVar, c8.g0.l(e6Var), false);
        }
    }
}
