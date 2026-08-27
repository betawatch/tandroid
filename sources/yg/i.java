package yg;

import android.view.View;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.p1;
import r0.m1;
import ud.k;
import ud.l;
import w3.b0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i implements g, f, d {
    public View A;
    public int B;
    public int C;
    public final ud.c a;
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
    public final c f = new c(new n6(this, 23));
    public int s = 1;
    public final h x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.a = new ud.c(0, new b0(this, runnable), p1.w, 250L);
    }

    @Override // yg.d
    public final void L() {
        View view = this.A;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override // yg.d
    public final View N() {
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

    public final i0.c e(int i10) {
        m1 m1Var = this.r;
        return m1Var != null ? m1Var.a.f(i10) : i0.c.e;
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

    public final void i(m1 m1Var) {
        j(m1Var, this.r != null);
    }

    public final void j(m1 m1Var, boolean z10) {
        int i10;
        ud.c cVar;
        this.r = m1Var;
        i0.c cVar2 = i0.c.e;
        i0.c g10 = m1Var != null ? m1Var.a.g(647) : cVar2;
        if (m1Var != null) {
            cVar2 = m1Var.a.f(8);
        }
        c cVar3 = this.f;
        b bVar = cVar3.c;
        boolean z11 = cVar2.d > 0;
        b bVar2 = !z10 ? z11 ? b.d : b.a : z11 ? b.c : b.b;
        if (bVar != bVar2) {
            cVar3.a(bVar2, false);
        }
        int i11 = this.s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && cVar2.d > 0) {
            this.v = 0;
        }
        i0.c a2 = i0.c.a(cVar2, i0.c.b(0, 0, 0, this.v));
        int i12 = a2.c;
        int i13 = a2.b;
        int i14 = a2.a;
        int i15 = a2.d;
        i0.c a3 = i0.c.a(g10, a2);
        int i16 = a3.d;
        int i17 = a3.c;
        int i18 = a3.b;
        int i19 = a3.a;
        Runnable runnable = this.h;
        ud.c cVar4 = this.a;
        l lVar = this.d;
        l lVar2 = this.c;
        k kVar = this.b;
        if (z10) {
            if (kVar.b(i15 > 0 ? 1.0f : 0.0f)) {
                i10 = i17;
                cVar = cVar4;
            } else {
                cVar = cVar4;
                i10 = i17;
                if (!lVar2.b(i19, i18, i17, i16) && !lVar.b(i14, i13, i12, i15)) {
                    if (bVar != bVar2) {
                        runnable.run();
                    }
                }
            }
            cVar.b();
            kVar.c(false);
            lVar2.c(false);
            lVar.c(false);
            kVar.c = i15 > 0 ? 1.0f : 0.0f;
            lVar2.e(i19, i18, i10, i16);
            lVar.e(i14, i13, i12, i15);
            ud.c cVar5 = cVar;
            cVar5.c(0.0f);
            cVar5.a(1.0f);
        } else {
            cVar4.b();
            kVar.d(i15 > 0 ? 1.0f : 0.0f);
            lVar2.d(i19, i18, i17, i16);
            lVar.d(i14, i13, i12, i15);
            runnable.run();
        }
        a();
    }

    @Override // yg.d
    public final void k(m1 m1Var) {
        this.B = m1Var.a.f(8).d;
        this.h.run();
    }

    @Override // yg.d
    public final void u() {
        this.C++;
    }
}
