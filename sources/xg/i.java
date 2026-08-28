package xg;

import android.view.View;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.q1;
import r0.m1;
import td.k;
import td.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i implements g, f, d {
    public View A;
    public int B;
    public int C;
    public final td.c a;
    public final Runnable h;
    public boolean n;
    public m1 r;
    public int v;
    public int w;
    public e y;
    public final k b = new k(0.0f);
    public final l c = new l();
    public final l d = new l();
    public final AnimationNotificationsLocker e = new AnimationNotificationsLocker();
    public final c f = new c(new i9(this, 21));
    public int s = 1;
    public final h x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.a = new td.c(0, new w4.e(this, runnable), q1.w, 250L);
    }

    @Override // xg.d
    public final void K() {
        View view = this.A;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override // xg.d
    public final View M() {
        return this.A;
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
        l lVar = this.d;
        return (eVar == null || this.C <= 0) ? lVar.d.a : Math.max(this.B, lVar.d.a);
    }

    public final float c() {
        e eVar = this.y;
        l lVar = this.c;
        return (eVar == null || this.C <= 0) ? lVar.d.a : Math.max(this.B, lVar.d.a);
    }

    public final int d() {
        return (this.y == null || this.C <= 0) ? Math.max(e(527).d, this.v) : Math.max(this.B, Math.max(e(527).d, this.v));
    }

    public final i0.b e(int i9) {
        m1 m1Var = this.r;
        return m1Var != null ? m1Var.a.f(i9) : i0.b.e;
    }

    public final void f(int i9) {
        if (this.v == i9 && this.s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.x);
        this.w = Math.max(this.v, i9);
        this.v = i9;
        this.s = 0;
        i(this.r);
    }

    public final void g(int i9) {
        if (i9 > 0) {
            f(i9 + AndroidUtilities.navigationBarHeight);
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

    public final void i(m1 m1Var) {
        j(m1Var, this.r != null);
    }

    public final void j(m1 m1Var, boolean z10) {
        int i9;
        td.c cVar;
        this.r = m1Var;
        i0.b bVar = i0.b.e;
        i0.b g10 = m1Var != null ? m1Var.a.g(647) : bVar;
        if (m1Var != null) {
            bVar = m1Var.a.f(8);
        }
        c cVar2 = this.f;
        b bVar2 = cVar2.c;
        boolean z11 = bVar.d > 0;
        b bVar3 = !z10 ? z11 ? b.d : b.a : z11 ? b.c : b.b;
        if (bVar2 != bVar3) {
            cVar2.a(bVar3, false);
        }
        int i10 = this.s;
        if (i10 == 2) {
            this.v = 0;
        }
        if (i10 == 3 && bVar.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar, i0.b.b(0, 0, 0, this.v));
        int i11 = a2.c;
        int i12 = a2.b;
        int i13 = a2.a;
        int i14 = a2.d;
        i0.b a3 = i0.b.a(g10, a2);
        int i15 = a3.d;
        int i16 = a3.c;
        int i17 = a3.b;
        int i18 = a3.a;
        Runnable runnable = this.h;
        td.c cVar3 = this.a;
        l lVar = this.d;
        l lVar2 = this.c;
        k kVar = this.b;
        if (z10) {
            if (kVar.b(i14 > 0 ? 1.0f : 0.0f)) {
                i9 = i16;
                cVar = cVar3;
            } else {
                cVar = cVar3;
                i9 = i16;
                if (!lVar2.b(i18, i17, i16, i15) && !lVar.b(i13, i12, i11, i14)) {
                    if (bVar2 != bVar3) {
                        runnable.run();
                    }
                }
            }
            cVar.b();
            kVar.c(false);
            lVar2.c(false);
            lVar.c(false);
            kVar.c = i14 > 0 ? 1.0f : 0.0f;
            lVar2.e(i18, i17, i9, i15);
            lVar.e(i13, i12, i11, i14);
            td.c cVar4 = cVar;
            cVar4.c(0.0f);
            cVar4.a(1.0f);
        } else {
            cVar3.b();
            kVar.d(i14 > 0 ? 1.0f : 0.0f);
            lVar2.d(i18, i17, i16, i15);
            lVar.d(i13, i12, i11, i14);
            runnable.run();
        }
        a();
    }

    @Override // xg.d
    public final void k(m1 m1Var) {
        this.B = m1Var.a.f(8).d;
        this.h.run();
    }

    @Override // xg.d
    public final void t() {
        this.C++;
    }
}
