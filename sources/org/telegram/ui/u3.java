package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u3 implements org.telegram.ui.ActionBar.g2, org.telegram.ui.ActionBar.n3 {
    public ValueAnimator D;
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final /* synthetic */ h4 K;
    public final e2.f a = new e2.f(null);
    public org.telegram.ui.ActionBar.k2 b;
    public final t3 c;
    public View d;
    public org.telegram.ui.ActionBar.d3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public th.i2 w;
    public float x;
    public float y;

    public u3(h4 h4Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.K = h4Var;
        this.b = k2Var;
        k2Var.getResourceProvider();
        t3 t3Var = new t3(this, k2Var.getContext());
        this.c = t3Var;
        new vh.r2(t3Var, true, new s3(this, 0));
    }

    public final void A() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.x, this.n ? 0.0f : this.y) * w());
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void a(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z10;
        if (z10) {
            LaunchActivity.I1.y0.b(this);
        } else {
            m(true, new rr0(this, 10));
        }
        u();
        r();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void b(boolean z10) {
        this.J = z10;
        h4 h4Var = this.K;
        h4Var.u0[0].setLastVisible(z10);
        h4Var.u0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.n3
    public final org.telegram.ui.ActionBar.h3 c() {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3();
        h4 h4Var = this.K;
        h3Var.E = h4Var.h0.getTitle();
        h3Var.J = h4Var;
        l3 l3Var = h4Var.u0[0];
        Bitmap bitmap = null;
        h3Var.q = (l3Var == null || !org.telegram.messenger.tz.v0) ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false) : l3Var.getActionBarColor();
        l3 l3Var2 = h4Var.u0[0];
        h3Var.r = (l3Var2 == null || !org.telegram.messenger.tz.v0) ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false) : l3Var2.getBackgroundColor();
        h3Var.n = true;
        h3Var.I = !this.F ? 0.0f : h4Var.u0[0].getProgress();
        l3 l3Var3 = h4Var.u0[0];
        h3Var.c = l3Var3;
        if (l3Var3 != null && l3Var3.getWebView() != null) {
            bitmap = h4Var.u0[0].getWebView().getFavicon();
        }
        h3Var.F = bitmap;
        l3 l3Var4 = h3Var.c;
        if (l3Var4 != null) {
            h3Var.g = l3Var4.getWidth();
            h3Var.h = h3Var.c.getHeight();
        }
        h3Var.i = x();
        h3Var.D = org.telegram.ui.ActionBar.t6.I.q();
        return h3Var;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View d() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.g2, android.content.DialogInterface
    public final void dismiss() {
        a(true);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final int e(int i10) {
        float min = this.n ? 0.0f : Math.min(this.x, 1.0f - this.y) * (1.0f - this.I);
        int v = v();
        m0 m0Var = this.K.h0;
        if (m0Var != null) {
            v = i0.b.f(m0Var.a0, v, m0Var.y);
        }
        return i0.b.f(min, i10, v);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean f() {
        int f7;
        float min = this.n ? 0.0f : (1.0f - this.I) * Math.min(this.x, 1.0f - this.y);
        if (this.F && min > 0.25f) {
            if (org.telegram.messenger.tz.v0) {
                h4 h4Var = this.K;
                f7 = i0.b.f(1.0f - (h4Var.u0[0].getVisibility() == 0 ? 1.0f - (h4Var.u0[0].getTranslationX() / h4Var.u0[0].getWidth()) : 0.0f), h4Var.u0[0].getActionBarColor(), h4Var.u0[1].getActionBarColor());
            } else {
                f7 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
            }
            if (org.telegram.messenger.i0.B(f7) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n3
    public final boolean g() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.n3
    public final boolean i(org.telegram.ui.ActionBar.d3 d3Var) {
        this.e = d3Var;
        if (d3Var != null) {
            this.f = true;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean j() {
        return this.G && this.y <= 0.0f && this.x >= 1.0f && this.I <= 0.0f && !this.n && !this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.cc k() {
        FrameLayout frameLayout;
        h4 h4Var = this.K;
        if (h4Var.u0[0].f()) {
            if (h4Var.u0[0].getWebView() != null) {
                frameLayout = h4Var.u0[0].f;
                return new org.telegram.ui.Components.cc(frameLayout, null);
            }
            return null;
        }
        l3 l3Var = h4Var.u0[0];
        TLRPC.WebPage webPage = l3Var.c.E;
        frameLayout = l3Var;
    }

    public final ValueAnimator l(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new r3(this, 0));
        return ofFloat;
    }

    public final void m(boolean z10, rr0 rr0Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new r3(this, i10));
        this.E.addListener(new androidx.fragment.app.g(this, z10, rr0Var, i10));
        this.E.setInterpolator(org.telegram.ui.Components.gr.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void n() {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, 1.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 1));
        this.D.addListener(new bg.e(this, 25));
        this.D.setInterpolator(org.telegram.ui.Components.gr.h);
        this.D.setDuration(320L);
        this.D.start();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void o(Runnable runnable) {
        this.w = (th.i2) runnable;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void p() {
        h4 h4Var = this.K;
        if (h4Var.o0) {
            org.telegram.messenger.i0.v1(this.c);
            return;
        }
        m0 m0Var = h4Var.h0;
        if (m0Var.T) {
            m0Var.h(false);
            return;
        }
        if (m0Var.W) {
            m0Var.k(false);
            return;
        }
        if (h4Var.H()) {
            l3 l3Var = h4Var.u0[0];
            if (l3Var.s) {
                if (!l3Var.f() || l3Var.getWebView() == null) {
                    return;
                }
                l3Var.getWebView().goBack();
                return;
            }
        }
        if (h4Var.d0.size() > 1) {
            h4Var.E();
        } else {
            a(false);
        }
    }

    public final void q(org.telegram.ui.ActionBar.k2 k2Var) {
        un unVar;
        mk mkVar;
        this.r = false;
        this.b = k2Var;
        k2Var.getResourceProvider();
        if ((k2Var instanceof un) && (mkVar = (unVar = (un) k2Var).Z) != null) {
            mkVar.L();
            unVar.Z.j0(true, false, true);
        }
        org.telegram.ui.ActionBar.d3 d3Var = this.e;
        if (d3Var == null) {
            t3 t3Var = this.c;
            org.telegram.messenger.i0.E2(t3Var);
            if (k2Var.getLayoutContainer() != null) {
                k2Var.getLayoutContainer().addView(t3Var);
            }
        } else if (!d3Var.e) {
            d3Var.e = true;
            try {
                d3Var.show();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        h4 h4Var = this.K;
        l3 l3Var = h4Var.u0[0];
        if (l3Var != null && l3Var.F) {
            if (l3Var.getWebView() != null) {
                l3Var.getWebView().onResume();
            }
            l3Var.F = false;
        }
        l3 l3Var2 = h4Var.u0[1];
        if (l3Var2 != null && l3Var2.F) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onResume();
            }
            l3Var2.F = false;
        }
        h4.c1.add(h4Var);
    }

    public final void r() {
        if (this.s != j()) {
            this.s = j();
            org.telegram.ui.ActionBar.k2 k2Var = this.b;
            if (k2Var == null || !(k2Var.getParentLayout() instanceof ActionBarLayout)) {
                t3 t3Var = this.c;
                if (t3Var.getParent() instanceof View) {
                    ((View) t3Var.getParent()).invalidate();
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

    @Override // org.telegram.ui.ActionBar.n3
    public final void release() {
        this.r = true;
        h4 h4Var = this.K;
        l3 l3Var = h4Var.u0[0];
        if (l3Var != null && l3Var.h) {
            i3 i3Var = l3Var.e;
            i3Var.setSwipeOffsetY((-i3Var.f) + i3Var.e);
            h4Var.u0[0].h = false;
        }
        l3 l3Var2 = h4Var.u0[0];
        if (l3Var2 != null && !l3Var2.F) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onPause();
            }
            l3Var2.F = true;
        }
        l3 l3Var3 = h4Var.u0[1];
        if (l3Var3 != null && !l3Var3.F) {
            if (l3Var3.getWebView() != null) {
                l3Var3.getWebView().onPause();
            }
            l3Var3.F = true;
        }
        org.telegram.ui.ActionBar.d3 d3Var = this.e;
        if (d3Var != null) {
            d3Var.c();
        }
        this.b.removeSheet(this);
        if (this.e == null) {
            org.telegram.messenger.i0.E2(this.c);
        }
        th.i2 i2Var = this.w;
        if (i2Var != null) {
            i2Var.run();
            this.w = null;
        }
        h4.c1.remove(h4Var);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean s() {
        t3 t3Var;
        if (!this.h && !this.r && this.x > 0.5f && (t3Var = this.c) != null && t3Var.isAttachedToWindow()) {
            if (org.telegram.messenger.i0.W1(Utilities.l(t3Var.j0.c), t3Var.q0.x() - org.telegram.messenger.i0.L(20.0f), 0) < t3Var.getHeight() && this.I < 1.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean t(Dialog dialog) {
        return false;
    }

    public final void u() {
        org.telegram.ui.ActionBar.d3 d3Var = this.e;
        t3 t3Var = this.c;
        org.telegram.messenger.i0.q3(d3Var != null ? d3Var.b : t3Var, f());
        org.telegram.ui.ActionBar.d3 d3Var2 = this.e;
        if (d3Var2 == null) {
            LaunchActivity.I1.F(true, true, true);
            org.telegram.messenger.i0.n3(t3Var, org.telegram.messenger.i0.B(e(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false))) >= 0.721f);
            return;
        }
        int e = d3Var2.a.e(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false));
        d3Var2.d.setColor(e);
        d3Var2.c.invalidate();
        org.telegram.messenger.i0.t3(d3Var2, e, true, null);
        org.telegram.messenger.i0.m3(d3Var2, org.telegram.messenger.i0.B(e) >= 0.721f);
        LaunchActivity.I1.F(true, true, true);
    }

    public final int v() {
        if (!org.telegram.messenger.tz.v0) {
            return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gl, false);
        }
        h4 h4Var = this.K;
        return i0.b.f(1.0f - (h4Var.u0[0].getVisibility() != 0 ? 0.0f : 1.0f - (h4Var.u0[0].getTranslationX() / h4Var.u0[0].getWidth())), h4Var.u0[0].getBackgroundColor(), h4Var.u0[1].getBackgroundColor());
    }

    public final int w() {
        int L = org.telegram.messenger.i0.L(16.0f);
        View view = this.d;
        return org.telegram.messenger.m5.B(20.0f, x(), L + (view == null ? org.telegram.messenger.i0.q.y : view.getHeight()));
    }

    public final int x() {
        h4 h4Var = this.K;
        int i10 = 0;
        l3 l3Var = h4Var.u0[0];
        float translationX = (l3Var == null || l3Var.getVisibility() != 0) ? 0.0f : 1.0f - (h4Var.u0[0].getTranslationX() / h4Var.u0[0].getWidth());
        float f7 = 1.0f - translationX;
        l3 l3Var2 = h4Var.u0[0];
        if (l3Var2 != null && l3Var2.getVisibility() == 0) {
            i10 = (int) (h4Var.u0[0].getAlpha() * h4Var.u0[0].getListTop() * translationX);
        }
        l3 l3Var3 = h4Var.u0[1];
        if (l3Var3 == null || l3Var3.getVisibility() != 0) {
            return i10;
        }
        return i10 + ((int) (h4Var.u0[1].getAlpha() * h4Var.u0[1].getListTop() * f7));
    }

    public final void y() {
        h4 h4Var = this.K;
        h4Var.u0[0].setLastVisible(this.J);
        h4Var.u0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean z() {
        return this.c.isAttachedToWindow();
    }

    @Override // org.telegram.ui.ActionBar.n3
    public final org.telegram.ui.ActionBar.o3 d() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void h(int i10) {
    }
}
