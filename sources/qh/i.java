package qh;

import android.view.View;
import le.m;
import le.n;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.web.b1;
import r0.l1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class i implements g, f, d {
    public View E;
    public int F;
    public int G;
    public final le.e a;
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
    public final c f = new c(new b1(this, 4));
    public int s = 1;
    public final h x = new h(this, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public i(Runnable runnable) {
        this.h = runnable;
        this.a = new le.e(0, new z0(this, runnable, 0 == true ? 1 : 0, 13), p1.w, 250L);
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

    public final float b() {
        e eVar = this.y;
        n nVar = this.d;
        return (eVar == null || this.G <= 0) ? nVar.d.a : Math.max(this.F, nVar.d.a);
    }

    public final float c() {
        e eVar = this.y;
        n nVar = this.c;
        return (eVar == null || this.G <= 0) ? nVar.d.a : Math.max(this.F, nVar.d.a);
    }

    public final int d() {
        return (this.y == null || this.G <= 0) ? Math.max(e(527).d, this.v) : Math.max(this.F, Math.max(e(527).d, this.v));
    }

    public final i0.c e(int i10) {
        l1 l1Var = this.r;
        return l1Var != null ? l1Var.a.f(i10) : i0.c.e;
    }

    public final void f(int i10) {
        if (this.v == i10 && this.s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.x);
        this.w = Math.max(this.v, i10);
        this.v = i10;
        this.s = 0;
        i(this.r);
    }

    public final void g(int i10) {
        if (i10 > 0) {
            f(i10 + AndroidUtilities.navigationBarHeight);
        } else {
            h(true);
        }
    }

    public final void h(boolean z10) {
        if (this.v == 0) {
            return;
        }
        h hVar = this.x;
        AndroidUtilities.cancelRunOnUIThread(hVar);
        this.s = z10 ? 3 : 2;
        i(this.r);
        if (z10) {
            AndroidUtilities.runOnUIThread(hVar, 1000L);
        }
    }

    public final void i(l1 l1Var) {
        k(l1Var, this.r != null);
    }

    @Override // qh.d
    public final void j(l1 l1Var) {
        this.F = l1Var.a.f(8).d;
        this.h.run();
    }

    public final void k(l1 l1Var, boolean z10) {
        int i10;
        le.e eVar;
        this.r = l1Var;
        i0.c cVar = i0.c.e;
        i0.c g10 = l1Var != null ? l1Var.a.g(647) : cVar;
        if (l1Var != null) {
            cVar = l1Var.a.f(8);
        }
        c cVar2 = this.f;
        b bVar = cVar2.c;
        boolean z11 = cVar.d > 0;
        b bVar2 = !z10 ? z11 ? b.d : b.a : z11 ? b.c : b.b;
        if (bVar != bVar2) {
            cVar2.a(bVar2, false);
        }
        int i11 = this.s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && cVar.d > 0) {
            this.v = 0;
        }
        i0.c a2 = i0.c.a(cVar, i0.c.b(0, 0, 0, this.v));
        int i12 = a2.c;
        int i13 = a2.b;
        int i14 = a2.a;
        int i15 = a2.d;
        i0.c a10 = i0.c.a(g10, a2);
        int i16 = a10.d;
        int i17 = a10.c;
        int i18 = a10.b;
        int i19 = a10.a;
        Runnable runnable = this.h;
        le.e eVar2 = this.a;
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
                    if (bVar != bVar2) {
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
            le.e eVar3 = eVar;
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
    public final void s() {
        this.G++;
    }
}
