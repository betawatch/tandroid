package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t3 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.h3 {
    public ValueAnimator D;
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final /* synthetic */ g4 K;
    public final h2.f a = new h2.f((int[]) null);
    public org.telegram.ui.ActionBar.f2 b;
    public final s3 c;
    public View d;
    public org.telegram.ui.ActionBar.z2 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public di.l3 w;
    public float x;
    public float y;

    public t3(g4 g4Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.K = g4Var;
        this.b = f2Var;
        f2Var.getResourceProvider();
        s3 s3Var = new s3(this, f2Var.getContext());
        this.c = s3Var;
        new fi.q3(s3Var, true, new r3(this, 0));
    }

    public final void A() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.x, this.n ? 0.0f : this.y) * w());
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void a(boolean z9) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z9;
        if (z9) {
            LaunchActivity.G1.w0.b(this);
        } else {
            m(true, new iq0(this, 10));
        }
        u();
        r();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void b(boolean z9) {
        this.J = z9;
        g4 g4Var = this.K;
        g4Var.u0[0].setLastVisible(z9);
        g4Var.u0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final org.telegram.ui.ActionBar.c3 c() {
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3();
        g4 g4Var = this.K;
        c3Var.E = g4Var.h0.getTitle();
        c3Var.J = g4Var;
        k3 k3Var = g4Var.u0[0];
        Bitmap bitmap = null;
        c3Var.q = (k3Var == null || !org.telegram.messenger.iz.v0) ? org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false) : k3Var.getActionBarColor();
        k3 k3Var2 = g4Var.u0[0];
        c3Var.r = (k3Var2 == null || !org.telegram.messenger.iz.v0) ? org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false) : k3Var2.getBackgroundColor();
        c3Var.n = true;
        c3Var.I = !this.F ? 0.0f : g4Var.u0[0].getProgress();
        k3 k3Var3 = g4Var.u0[0];
        c3Var.c = k3Var3;
        if (k3Var3 != null && k3Var3.getWebView() != null) {
            bitmap = g4Var.u0[0].getWebView().getFavicon();
        }
        c3Var.F = bitmap;
        k3 k3Var4 = c3Var.c;
        if (k3Var4 != null) {
            c3Var.g = k3Var4.getWidth();
            c3Var.h = c3Var.c.getHeight();
        }
        c3Var.i = x();
        c3Var.D = org.telegram.ui.ActionBar.l6.I.q();
        return c3Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final View d() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.b2, android.content.DialogInterface
    public final void dismiss() {
        a(true);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final int e(int i7) {
        float min = this.n ? 0.0f : Math.min(this.x, 1.0f - this.y) * (1.0f - this.I);
        int v = v();
        l0 l0Var = this.K.h0;
        if (l0Var != null) {
            v = i0.a.f(l0Var.a0, v, l0Var.y);
        }
        return i0.a.f(min, i7, v);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean f() {
        int f10;
        float min = this.n ? 0.0f : (1.0f - this.I) * Math.min(this.x, 1.0f - this.y);
        if (this.F && min > 0.25f) {
            if (org.telegram.messenger.iz.v0) {
                g4 g4Var = this.K;
                f10 = i0.a.f(1.0f - (g4Var.u0[0].getVisibility() == 0 ? 1.0f - (g4Var.u0[0].getTranslationX() / g4Var.u0[0].getWidth()) : 0.0f), g4Var.u0[0].getActionBarColor(), g4Var.u0[1].getActionBarColor());
            } else {
                f10 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false);
            }
            if (org.telegram.messenger.g0.B(f10) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean g() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean i(org.telegram.ui.ActionBar.z2 z2Var) {
        this.e = z2Var;
        if (z2Var != null) {
            this.f = true;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean j() {
        return this.G && this.y <= 0.0f && this.x >= 1.0f && this.I <= 0.0f && !this.n && !this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.hc k() {
        FrameLayout frameLayout;
        g4 g4Var = this.K;
        if (g4Var.u0[0].f()) {
            if (g4Var.u0[0].getWebView() != null) {
                frameLayout = g4Var.u0[0].f;
                return new org.telegram.ui.Components.hc(frameLayout, null);
            }
            return null;
        }
        k3 k3Var = g4Var.u0[0];
        TLRPC.WebPage webPage = k3Var.c.E;
        frameLayout = k3Var;
    }

    public final ValueAnimator l(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f10);
        ofFloat.addUpdateListener(new q3(this, 0));
        return ofFloat;
    }

    public final void m(boolean z9, iq0 iq0Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z9 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 2));
        this.E.addListener(new ai.g0(this, z9, iq0Var, 5));
        this.E.setInterpolator(org.telegram.ui.Components.xq.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void n(Runnable runnable) {
        this.w = (di.l3) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, 1.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new q3(this, 1));
        this.D.addListener(new m.a(this, 14));
        this.D.setInterpolator(org.telegram.ui.Components.xq.h);
        this.D.setDuration(320L);
        this.D.start();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void p() {
        g4 g4Var = this.K;
        if (g4Var.o0) {
            org.telegram.messenger.g0.v1(this.c);
            return;
        }
        l0 l0Var = g4Var.h0;
        if (l0Var.T) {
            l0Var.h(false);
            return;
        }
        if (l0Var.W) {
            l0Var.k(false);
            return;
        }
        if (g4Var.H()) {
            k3 k3Var = g4Var.u0[0];
            if (k3Var.s) {
                if (!k3Var.f() || k3Var.getWebView() == null) {
                    return;
                }
                k3Var.getWebView().goBack();
                return;
            }
        }
        if (g4Var.d0.size() > 1) {
            g4Var.E();
        } else {
            a(false);
        }
    }

    public final void q(org.telegram.ui.ActionBar.f2 f2Var) {
        cn cnVar;
        sj sjVar;
        this.r = false;
        this.b = f2Var;
        f2Var.getResourceProvider();
        if ((f2Var instanceof cn) && (sjVar = (cnVar = (cn) f2Var).Z) != null) {
            sjVar.L();
            cnVar.Z.j0();
        }
        org.telegram.ui.ActionBar.z2 z2Var = this.e;
        if (z2Var == null) {
            s3 s3Var = this.c;
            org.telegram.messenger.g0.E2(s3Var);
            if (f2Var.getLayoutContainer() != null) {
                f2Var.getLayoutContainer().addView(s3Var);
            }
        } else if (!z2Var.e) {
            z2Var.e = true;
            try {
                z2Var.show();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        g4 g4Var = this.K;
        k3 k3Var = g4Var.u0[0];
        if (k3Var != null && k3Var.F) {
            if (k3Var.getWebView() != null) {
                k3Var.getWebView().onResume();
            }
            k3Var.F = false;
        }
        k3 k3Var2 = g4Var.u0[1];
        if (k3Var2 != null && k3Var2.F) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onResume();
            }
            k3Var2.F = false;
        }
        g4.c1.add(g4Var);
    }

    public final void r() {
        if (this.s != j()) {
            this.s = j();
            org.telegram.ui.ActionBar.f2 f2Var = this.b;
            if (f2Var == null || !(f2Var.getParentLayout() instanceof ActionBarLayout)) {
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

    @Override // org.telegram.ui.ActionBar.h3
    public final void release() {
        this.r = true;
        g4 g4Var = this.K;
        k3 k3Var = g4Var.u0[0];
        if (k3Var != null && k3Var.h) {
            h3 h3Var = k3Var.e;
            h3Var.setSwipeOffsetY((-h3Var.f) + h3Var.e);
            g4Var.u0[0].h = false;
        }
        k3 k3Var2 = g4Var.u0[0];
        if (k3Var2 != null && !k3Var2.F) {
            if (k3Var2.getWebView() != null) {
                k3Var2.getWebView().onPause();
            }
            k3Var2.F = true;
        }
        k3 k3Var3 = g4Var.u0[1];
        if (k3Var3 != null && !k3Var3.F) {
            if (k3Var3.getWebView() != null) {
                k3Var3.getWebView().onPause();
            }
            k3Var3.F = true;
        }
        org.telegram.ui.ActionBar.z2 z2Var = this.e;
        if (z2Var != null) {
            z2Var.c();
        }
        this.b.removeSheet(this);
        if (this.e == null) {
            org.telegram.messenger.g0.E2(this.c);
        }
        di.l3 l3Var = this.w;
        if (l3Var != null) {
            l3Var.run();
            this.w = null;
        }
        g4.c1.remove(g4Var);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean s() {
        s3 s3Var;
        if (!this.h && !this.r && this.x > 0.5f && (s3Var = this.c) != null && s3Var.isAttachedToWindow()) {
            if (org.telegram.messenger.g0.W1(Utilities.l(s3Var.j0.c), s3Var.q0.x() - org.telegram.messenger.g0.L(20.0f), 0) < s3Var.getHeight() && this.I < 1.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean t(Dialog dialog) {
        return false;
    }

    public final void u() {
        org.telegram.ui.ActionBar.z2 z2Var = this.e;
        s3 s3Var = this.c;
        org.telegram.messenger.g0.r3(z2Var != null ? z2Var.b : s3Var, f());
        org.telegram.ui.ActionBar.z2 z2Var2 = this.e;
        if (z2Var2 == null) {
            LaunchActivity.G1.F(true, true, true);
            org.telegram.messenger.g0.o3(s3Var, org.telegram.messenger.g0.B(e(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.a7, false))) >= 0.721f);
            return;
        }
        int e10 = z2Var2.a.e(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.a7, false));
        z2Var2.d.setColor(e10);
        z2Var2.c.invalidate();
        org.telegram.messenger.g0.u3(z2Var2, e10, true, null);
        org.telegram.messenger.g0.n3(z2Var2, org.telegram.messenger.g0.B(e10) >= 0.721f);
        LaunchActivity.G1.F(true, true, true);
    }

    public final int v() {
        if (!org.telegram.messenger.iz.v0) {
            return org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gl, false);
        }
        g4 g4Var = this.K;
        return i0.a.f(1.0f - (g4Var.u0[0].getVisibility() != 0 ? 0.0f : 1.0f - (g4Var.u0[0].getTranslationX() / g4Var.u0[0].getWidth())), g4Var.u0[0].getBackgroundColor(), g4Var.u0[1].getBackgroundColor());
    }

    public final int w() {
        int L = org.telegram.messenger.g0.L(16.0f);
        View view = this.d;
        return org.telegram.messenger.k5.B(20.0f, x(), L + (view == null ? org.telegram.messenger.g0.q.y : view.getHeight()));
    }

    public final int x() {
        g4 g4Var = this.K;
        int i7 = 0;
        k3 k3Var = g4Var.u0[0];
        float translationX = (k3Var == null || k3Var.getVisibility() != 0) ? 0.0f : 1.0f - (g4Var.u0[0].getTranslationX() / g4Var.u0[0].getWidth());
        float f10 = 1.0f - translationX;
        k3 k3Var2 = g4Var.u0[0];
        if (k3Var2 != null && k3Var2.getVisibility() == 0) {
            i7 = (int) (g4Var.u0[0].getAlpha() * g4Var.u0[0].getListTop() * translationX);
        }
        k3 k3Var3 = g4Var.u0[1];
        if (k3Var3 == null || k3Var3.getVisibility() != 0) {
            return i7;
        }
        return i7 + ((int) (g4Var.u0[1].getAlpha() * g4Var.u0[1].getListTop() * f10));
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final boolean y() {
        return this.c.isAttachedToWindow();
    }

    public final void z() {
        g4 g4Var = this.K;
        g4Var.u0[0].setLastVisible(this.J);
        g4Var.u0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final org.telegram.ui.ActionBar.i3 d() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(int i7) {
    }
}
