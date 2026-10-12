package qh;

import android.view.View;
import ji.p1;
import n6.o;
import ne.m;
import ne.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.o1;
import r0.i1;
import r0.l1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class i implements g, f, d {
    public View E;
    public int F;
    public int G;
    public final ne.e a;
    public final Runnable h;
    public boolean n;
    public l1 r;
    public int v;
    public int w;
    public e y;
    public final m b = new m(0.0f);
    public final n c = new n();
    public final n d = new n();
    public final AnimationNotificationsLocker e = new AnimationNotificationsLocker();
    public final c f = new c(new p1(this, 7));
    public int s = 1;
    public final h x = new h(this, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public i(Runnable runnable) {
        this.h = runnable;
        this.a = new ne.e(0, new o(this, runnable, 0 == true ? 1 : 0, 13), o1.w, 250L);
    }

    @Override // qh.d
    public final void J() {
        View view = this.E;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override // qh.d
    public final View N() {
        return this.E;
    }

    public final void a() {
        boolean z10 = this.a.g;
        boolean z11 = this.n;
        AnimationNotificationsLocker animationNotificationsLocker = this.e;
        if (!z11 && z10) {
            this.n = true;
            animationNotificationsLocker.lock();
        }
        if (!this.n || z10) {
            return;
        }
        this.n = false;
        animationNotificationsLocker.unlock();
    }

    public final float c() {
        e eVar = this.y;
        n nVar = this.d;
        return (eVar == null || this.G <= 0) ? nVar.d.a : Math.max(this.F, nVar.d.a);
    }

    public final float d() {
        e eVar = this.y;
        n nVar = this.c;
        return (eVar == null || this.G <= 0) ? nVar.d.a : Math.max(this.F, nVar.d.a);
    }

    public final int e() {
        return (this.y == null || this.G <= 0) ? Math.max(f(527).d, this.v) : Math.max(this.F, Math.max(f(527).d, this.v));
    }

    public final i0.b f(int i10) {
        l1 l1Var = this.r;
        return l1Var != null ? l1Var.a.f(i10) : i0.b.e;
    }

    public final void g(int i10) {
        if (this.v == i10 && this.s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.x);
        this.w = Math.max(this.v, i10);
        this.v = i10;
        this.s = 0;
        j(this.r);
    }

    public final void h(int i10) {
        if (i10 > 0) {
            g(i10 + AndroidUtilities.navigationBarHeight);
        } else {
            i(true);
        }
    }

    public final void i(boolean z10) {
        if (this.v == 0) {
            return;
        }
        h hVar = this.x;
        AndroidUtilities.cancelRunOnUIThread(hVar);
        this.s = z10 ? 3 : 2;
        j(this.r);
        if (z10) {
            AndroidUtilities.runOnUIThread(hVar, 1000L);
        }
    }

    public final void j(l1 l1Var) {
        l(l1Var, this.r != null);
    }

    @Override // qh.d
    public final void k(l1 l1Var) {
        l1 b10 = b(l1Var);
        this.F = b10 != null ? b10.a.f(8).d : 0;
        this.h.run();
    }

    public final void l(l1 l1Var, boolean z10) {
        i0.b bVar;
        int i10;
        ne.e eVar;
        l1 b10 = b(l1Var);
        this.r = b10;
        i0.b bVar2 = i0.b.e;
        if (b10 != null) {
            i1 i1Var = b10.a;
            bVar = i0.b.a(i1Var.f(647), i1Var.g(647));
        } else {
            bVar = bVar2;
        }
        if (b10 != null) {
            bVar2 = b10.a.f(8);
        }
        c cVar = this.f;
        b bVar3 = cVar.c;
        boolean z11 = bVar2.d > 0;
        b bVar4 = !z10 ? z11 ? b.d : b.a : z11 ? b.c : b.b;
        if (bVar3 != bVar4) {
            cVar.a(bVar4, false);
        }
        int i11 = this.s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && bVar2.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar2, i0.b.b(0, 0, 0, this.v));
        int i12 = a2.c;
        int i13 = a2.b;
        int i14 = a2.a;
        int i15 = a2.d;
        i0.b a10 = i0.b.a(bVar, a2);
        int i16 = a10.d;
        int i17 = a10.c;
        int i18 = a10.b;
        int i19 = a10.a;
        Runnable runnable = this.h;
        ne.e eVar2 = this.a;
        n nVar = this.d;
        n nVar2 = this.c;
        m mVar = this.b;
        if (z10) {
            if (mVar.b(i15 > 0 ? 1.0f : 0.0f)) {
                i10 = i17;
                eVar = eVar2;
            } else {
                eVar = eVar2;
                i10 = i17;
                if (!nVar2.b(i19, i18, i17, i16) && !nVar.b(i14, i13, i12, i15)) {
                    if (bVar3 != bVar4) {
                        runnable.run();
                    }
                }
            }
            eVar.b();
            mVar.c(false);
            nVar2.c(false);
            nVar.c(false);
            mVar.c = i15 > 0 ? 1.0f : 0.0f;
            nVar2.e(i19, i18, i10, i16);
            nVar.e(i14, i13, i12, i15);
            ne.e eVar3 = eVar;
            eVar3.c(0.0f);
            eVar3.a(1.0f);
        } else {
            eVar2.b();
            mVar.d(i15 > 0 ? 1.0f : 0.0f);
            nVar2.d(i19, i18, i17, i16);
            nVar.d(i14, i13, i12, i15);
            runnable.run();
        }
        a();
    }

    @Override // qh.d
    public final void u() {
        this.G++;
    }

    public l1 b(l1 l1Var) {
        return l1Var;
    }
}
