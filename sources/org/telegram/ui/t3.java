package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t3 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.j3 {
    public ValueAnimator E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public boolean K;
    public final /* synthetic */ g4 L;
    public final h2.f a = new h2.f((int[]) null);
    public org.telegram.ui.ActionBar.g2 b;
    public final s3 c;
    public View d;
    public org.telegram.ui.ActionBar.a3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public fi.e3 w;
    public float x;
    public float y;

    public t3(g4 g4Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.L = g4Var;
        this.b = g2Var;
        g2Var.getResourceProvider();
        s3 s3Var = new s3(this, g2Var.getContext());
        this.c = s3Var;
        new hi.x3(s3Var, true, new r3(this, 0));
    }

    public final void A() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.x, this.n ? 0.0f : this.y) * w());
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void a(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z10;
        if (z10) {
            LaunchActivity.H1.x0.b(this);
        } else {
            m(true, new hq0(this, 10));
        }
        u();
        r();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void b(boolean z10) {
        this.K = z10;
        g4 g4Var = this.L;
        g4Var.v0[0].setLastVisible(z10);
        g4Var.v0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final org.telegram.ui.ActionBar.e3 c() {
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3();
        g4 g4Var = this.L;
        e3Var.E = g4Var.i0.getTitle();
        e3Var.J = g4Var;
        k3 k3Var = g4Var.v0[0];
        Bitmap bitmap = null;
        e3Var.q = (k3Var == null || !org.telegram.messenger.bz.v0) ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false) : k3Var.getActionBarColor();
        k3 k3Var2 = g4Var.v0[0];
        e3Var.r = (k3Var2 == null || !org.telegram.messenger.bz.v0) ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false) : k3Var2.getBackgroundColor();
        e3Var.n = true;
        e3Var.I = !this.G ? 0.0f : g4Var.v0[0].getProgress();
        k3 k3Var3 = g4Var.v0[0];
        e3Var.c = k3Var3;
        if (k3Var3 != null && k3Var3.getWebView() != null) {
            bitmap = g4Var.v0[0].getWebView().getFavicon();
        }
        e3Var.F = bitmap;
        k3 k3Var4 = e3Var.c;
        if (k3Var4 != null) {
            e3Var.g = k3Var4.getWidth();
            e3Var.h = e3Var.c.getHeight();
        }
        e3Var.i = x();
        e3Var.D = org.telegram.ui.ActionBar.n6.I.q();
        return e3Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final View d() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.c2, android.content.DialogInterface
    public final void dismiss() {
        a(true);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final int e(int i7) {
        float min = this.n ? 0.0f : Math.min(this.x, 1.0f - this.y) * (1.0f - this.J);
        int v = v();
        l0 l0Var = this.L.i0;
        if (l0Var != null) {
            v = i0.a.f(l0Var.b0, v, l0Var.y);
        }
        return i0.a.f(min, i7, v);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final boolean f() {
        int f10;
        float min = this.n ? 0.0f : (1.0f - this.J) * Math.min(this.x, 1.0f - this.y);
        if (this.G && min > 0.25f) {
            if (org.telegram.messenger.bz.v0) {
                g4 g4Var = this.L;
                f10 = i0.a.f(1.0f - (g4Var.v0[0].getVisibility() == 0 ? 1.0f - (g4Var.v0[0].getTranslationX() / g4Var.v0[0].getWidth()) : 0.0f), g4Var.v0[0].getActionBarColor(), g4Var.v0[1].getActionBarColor());
            } else {
                f10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
            }
            if (org.telegram.messenger.g0.B(f10) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final boolean g() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final boolean i(org.telegram.ui.ActionBar.a3 a3Var) {
        this.e = a3Var;
        if (a3Var != null) {
            this.f = true;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final boolean j() {
        return this.H && this.y <= 0.0f && this.x >= 1.0f && this.J <= 0.0f && !this.n && !this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.kc k() {
        FrameLayout frameLayout;
        g4 g4Var = this.L;
        if (g4Var.v0[0].f()) {
            if (g4Var.v0[0].getWebView() != null) {
                frameLayout = g4Var.v0[0].f;
                return new org.telegram.ui.Components.kc(frameLayout, null);
            }
            return null;
        }
        k3 k3Var = g4Var.v0[0];
        TLRPC.WebPage webPage = k3Var.c.F;
        frameLayout = k3Var;
    }

    public final ValueAnimator l(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        ofFloat.addUpdateListener(new q3(this, 0));
        return ofFloat;
    }

    public final void m(boolean z10, hq0 hq0Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 2));
        this.F.addListener(new androidx.fragment.app.g(this, z10, hq0Var, 5));
        this.F.setInterpolator(org.telegram.ui.Components.kr.h);
        this.F.setDuration(250L);
        this.F.start();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void n(Runnable runnable) {
        this.w = (fi.e3) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 1));
        this.E.addListener(new ki.n3(this, 15));
        this.E.setInterpolator(org.telegram.ui.Components.kr.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void p() {
        g4 g4Var = this.L;
        if (g4Var.p0) {
            org.telegram.messenger.g0.v1(this.c);
            return;
        }
        l0 l0Var = g4Var.i0;
        if (l0Var.U) {
            l0Var.h(false);
            return;
        }
        if (l0Var.a0) {
            l0Var.k(false);
            return;
        }
        if (g4Var.H()) {
            k3 k3Var = g4Var.v0[0];
            if (k3Var.s) {
                if (!k3Var.f() || k3Var.getWebView() == null) {
                    return;
                }
                k3Var.getWebView().goBack();
                return;
            }
        }
        if (g4Var.e0.size() > 1) {
            g4Var.E();
        } else {
            a(false);
        }
    }

    public final void q(org.telegram.ui.ActionBar.g2 g2Var) {
        bn bnVar;
        rj rjVar;
        this.r = false;
        this.b = g2Var;
        g2Var.getResourceProvider();
        if ((g2Var instanceof bn) && (rjVar = (bnVar = (bn) g2Var).a0) != null) {
            rjVar.U();
            bnVar.a0.K0();
        }
        org.telegram.ui.ActionBar.a3 a3Var = this.e;
        if (a3Var == null) {
            s3 s3Var = this.c;
            org.telegram.messenger.g0.E2(s3Var);
            if (g2Var.getLayoutContainer() != null) {
                g2Var.getLayoutContainer().addView(s3Var);
            }
        } else if (!a3Var.e) {
            a3Var.e = true;
            try {
                a3Var.show();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        g4 g4Var = this.L;
        k3 k3Var = g4Var.v0[0];
        if (k3Var != null && k3Var.G) {
            if (k3Var.getWebView() != null) {
                k3Var.getWebView().onResume();
            }
            k3Var.G = false;
        }
        k3 k3Var2 = g4Var.v0[1];
        if (k3Var2 != null && k3Var2.G) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onResume();
            }
            k3Var2.G = false;
        }
        g4.d1.add(g4Var);
    }

    public final void r() {
        if (this.s != j()) {
            this.s = j();
            org.telegram.ui.ActionBar.g2 g2Var = this.b;
            if (g2Var == null || !(g2Var.getParentLayout() instanceof ActionBarLayout)) {
                s3 s3Var = this.c;
                if (s3Var.getParent() instanceof View) {
                    ((View) s3Var.getParent()).invalidate();
                    return;
                }
                return;
            }
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.b.getParentLayout();
            org.telegram.ui.ActionBar.w wVar = actionBarLayout.s;
            if (wVar != null) {
                wVar.invalidate();
            }
            org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.x;
            if (wVar2 != null) {
                wVar2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final void release() {
        this.r = true;
        g4 g4Var = this.L;
        k3 k3Var = g4Var.v0[0];
        if (k3Var != null && k3Var.h) {
            h3 h3Var = k3Var.e;
            h3Var.setSwipeOffsetY((-h3Var.f) + h3Var.e);
            g4Var.v0[0].h = false;
        }
        k3 k3Var2 = g4Var.v0[0];
        if (k3Var2 != null && !k3Var2.G) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onPause();
            }
            k3Var2.G = true;
        }
        k3 k3Var3 = g4Var.v0[1];
        if (k3Var3 != null && !k3Var3.G) {
            if (k3Var3.getWebView() != null) {
                k3Var3.getWebView().onPause();
            }
            k3Var3.G = true;
        }
        org.telegram.ui.ActionBar.a3 a3Var = this.e;
        if (a3Var != null) {
            a3Var.c();
        }
        this.b.removeSheet(this);
        if (this.e == null) {
            org.telegram.messenger.g0.E2(this.c);
        }
        fi.e3 e3Var = this.w;
        if (e3Var != null) {
            e3Var.run();
            this.w = null;
        }
        g4.d1.remove(g4Var);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final boolean s() {
        s3 s3Var;
        if (!this.h && !this.r && this.x > 0.5f && (s3Var = this.c) != null && s3Var.isAttachedToWindow()) {
            if (org.telegram.messenger.g0.W1(Utilities.l(s3Var.k0.c), s3Var.r0.x() - org.telegram.messenger.g0.L(20.0f), 0) < s3Var.getHeight() && this.J < 1.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final boolean t(Dialog dialog) {
        return false;
    }

    public final void u() {
        org.telegram.ui.ActionBar.a3 a3Var = this.e;
        s3 s3Var = this.c;
        org.telegram.messenger.g0.q3(a3Var != null ? a3Var.b : s3Var, f());
        org.telegram.ui.ActionBar.a3 a3Var2 = this.e;
        if (a3Var2 == null) {
            LaunchActivity.H1.G(true, true, true);
            org.telegram.messenger.g0.n3(s3Var, org.telegram.messenger.g0.B(e(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.a7, false))) >= 0.721f);
            return;
        }
        int e10 = a3Var2.a.e(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.a7, false));
        a3Var2.d.setColor(e10);
        a3Var2.c.invalidate();
        org.telegram.messenger.g0.s3(a3Var2, e10, true, null);
        org.telegram.messenger.g0.m3(a3Var2, org.telegram.messenger.g0.B(e10) >= 0.721f);
        LaunchActivity.H1.G(true, true, true);
    }

    public final int v() {
        if (!org.telegram.messenger.bz.v0) {
            return org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Jl, false);
        }
        g4 g4Var = this.L;
        return i0.a.f(1.0f - (g4Var.v0[0].getVisibility() != 0 ? 0.0f : 1.0f - (g4Var.v0[0].getTranslationX() / g4Var.v0[0].getWidth())), g4Var.v0[0].getBackgroundColor(), g4Var.v0[1].getBackgroundColor());
    }

    public final int w() {
        int L = org.telegram.messenger.g0.L(16.0f);
        View view = this.d;
        return org.telegram.messenger.f3.B(20.0f, x(), L + (view == null ? org.telegram.messenger.g0.q.y : view.getHeight()));
    }

    public final int x() {
        g4 g4Var = this.L;
        int i7 = 0;
        k3 k3Var = g4Var.v0[0];
        float translationX = (k3Var == null || k3Var.getVisibility() != 0) ? 0.0f : 1.0f - (g4Var.v0[0].getTranslationX() / g4Var.v0[0].getWidth());
        float f10 = 1.0f - translationX;
        k3 k3Var2 = g4Var.v0[0];
        if (k3Var2 != null && k3Var2.getVisibility() == 0) {
            i7 = (int) (g4Var.v0[0].getAlpha() * g4Var.v0[0].getListTop() * translationX);
        }
        k3 k3Var3 = g4Var.v0[1];
        if (k3Var3 == null || k3Var3.getVisibility() != 0) {
            return i7;
        }
        return i7 + ((int) (g4Var.v0[1].getAlpha() * g4Var.v0[1].getListTop() * f10));
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final boolean y() {
        return this.c.isAttachedToWindow();
    }

    public final void z() {
        g4 g4Var = this.L;
        g4Var.v0[0].setLastVisible(this.K);
        g4Var.v0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.j3
    public final org.telegram.ui.ActionBar.k3 d() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void h(int i7) {
    }
}
