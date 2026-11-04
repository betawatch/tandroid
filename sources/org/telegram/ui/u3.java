package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u3 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.g3 {
    public ValueAnimator E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public boolean K;
    public final /* synthetic */ i4 L;
    public final g2.g a = new g2.g((int[]) null);
    public org.telegram.ui.ActionBar.d2 b;
    public final t3 c;
    public View d;
    public org.telegram.ui.ActionBar.x2 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public ei.o3 w;
    public float x;
    public float y;

    public u3(i4 i4Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.L = i4Var;
        this.b = d2Var;
        d2Var.getResourceProvider();
        t3 t3Var = new t3(this, d2Var.getContext());
        this.c = t3Var;
        new gi.p3(t3Var, true, new s3(this, 0));
    }

    public final void A() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.x, this.n ? 0.0f : this.y) * w());
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void a(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z10;
        if (z10) {
            LaunchActivity.K1.z0.b(this);
        } else {
            m(true, new xp0(this, 10));
        }
        u();
        r();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void b(boolean z10) {
        this.K = z10;
        i4 i4Var = this.L;
        i4Var.v0[0].setLastVisible(z10);
        i4Var.v0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final org.telegram.ui.ActionBar.a3 c() {
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3();
        i4 i4Var = this.L;
        a3Var.E = i4Var.i0.getTitle();
        a3Var.J = i4Var;
        l3 l3Var = i4Var.v0[0];
        Bitmap bitmap = null;
        a3Var.q = (l3Var == null || !org.telegram.messenger.az.v0) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false) : l3Var.getActionBarColor();
        l3 l3Var2 = i4Var.v0[0];
        a3Var.r = (l3Var2 == null || !org.telegram.messenger.az.v0) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false) : l3Var2.getBackgroundColor();
        a3Var.n = true;
        a3Var.I = !this.G ? 0.0f : i4Var.v0[0].getProgress();
        l3 l3Var3 = i4Var.v0[0];
        a3Var.c = l3Var3;
        if (l3Var3 != null && l3Var3.getWebView() != null) {
            bitmap = i4Var.v0[0].getWebView().getFavicon();
        }
        a3Var.F = bitmap;
        l3 l3Var4 = a3Var.c;
        if (l3Var4 != null) {
            a3Var.g = l3Var4.getWidth();
            a3Var.h = a3Var.c.getHeight();
        }
        a3Var.i = x();
        a3Var.D = org.telegram.ui.ActionBar.k6.I.q();
        return a3Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final View d() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.z1, android.content.DialogInterface
    public final void dismiss() {
        a(true);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final int e(int i3) {
        float min = this.n ? 0.0f : Math.min(this.x, 1.0f - this.y) * (1.0f - this.J);
        int v = v();
        m0 m0Var = this.L.i0;
        if (m0Var != null) {
            v = i0.a.f(m0Var.b0, v, m0Var.y);
        }
        return i0.a.f(min, i3, v);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean f() {
        int f10;
        float min = this.n ? 0.0f : (1.0f - this.J) * Math.min(this.x, 1.0f - this.y);
        if (this.G && min > 0.25f) {
            if (org.telegram.messenger.az.v0) {
                i4 i4Var = this.L;
                f10 = i0.a.f(1.0f - (i4Var.v0[0].getVisibility() == 0 ? 1.0f - (i4Var.v0[0].getTranslationX() / i4Var.v0[0].getWidth()) : 0.0f), i4Var.v0[0].getActionBarColor(), i4Var.v0[1].getActionBarColor());
            } else {
                f10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
            }
            if (org.telegram.messenger.g0.B(f10) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean g() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean i(org.telegram.ui.ActionBar.x2 x2Var) {
        this.e = x2Var;
        if (x2Var != null) {
            this.f = true;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean j() {
        return this.H && this.y <= 0.0f && this.x >= 1.0f && this.J <= 0.0f && !this.n && !this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.fc k() {
        FrameLayout frameLayout;
        i4 i4Var = this.L;
        if (i4Var.v0[0].f()) {
            if (i4Var.v0[0].getWebView() != null) {
                frameLayout = i4Var.v0[0].f;
                return new org.telegram.ui.Components.fc(frameLayout, null);
            }
            return null;
        }
        l3 l3Var = i4Var.v0[0];
        TLRPC.WebPage webPage = l3Var.c.F;
        frameLayout = l3Var;
    }

    public final ValueAnimator l(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        ofFloat.addUpdateListener(new r3(this, 0));
        return ofFloat;
    }

    public final void m(boolean z10, xp0 xp0Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 2));
        this.F.addListener(new androidx.fragment.app.g(this, z10, xp0Var, 5));
        this.F.setInterpolator(org.telegram.ui.Components.xq.h);
        this.F.setDuration(250L);
        this.F.start();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void n(Runnable runnable) {
        this.w = (ei.o3) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 1));
        this.E.addListener(new ii.v3(this, 15));
        this.E.setInterpolator(org.telegram.ui.Components.xq.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void p() {
        i4 i4Var = this.L;
        if (i4Var.p0) {
            org.telegram.messenger.g0.v1(this.c);
            return;
        }
        m0 m0Var = i4Var.i0;
        if (m0Var.U) {
            m0Var.h(false);
            return;
        }
        if (m0Var.a0) {
            m0Var.k(false);
            return;
        }
        if (i4Var.H()) {
            l3 l3Var = i4Var.v0[0];
            if (l3Var.s) {
                if (!l3Var.f() || l3Var.getWebView() == null) {
                    return;
                }
                l3Var.getWebView().goBack();
                return;
            }
        }
        if (i4Var.e0.size() > 1) {
            i4Var.E();
        } else {
            a(false);
        }
    }

    public final void q(org.telegram.ui.ActionBar.d2 d2Var) {
        wm wmVar;
        mj mjVar;
        this.r = false;
        this.b = d2Var;
        d2Var.getResourceProvider();
        if ((d2Var instanceof wm) && (mjVar = (wmVar = (wm) d2Var).a0) != null) {
            mjVar.L();
            wmVar.a0.k0(true, false, true);
        }
        org.telegram.ui.ActionBar.x2 x2Var = this.e;
        if (x2Var == null) {
            t3 t3Var = this.c;
            org.telegram.messenger.g0.E2(t3Var);
            if (d2Var.getLayoutContainer() != null) {
                d2Var.getLayoutContainer().addView(t3Var);
            }
        } else if (!x2Var.e) {
            x2Var.e = true;
            try {
                x2Var.show();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        i4 i4Var = this.L;
        l3 l3Var = i4Var.v0[0];
        if (l3Var != null && l3Var.G) {
            if (l3Var.getWebView() != null) {
                l3Var.getWebView().onResume();
            }
            l3Var.G = false;
        }
        l3 l3Var2 = i4Var.v0[1];
        if (l3Var2 != null && l3Var2.G) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onResume();
            }
            l3Var2.G = false;
        }
        i4.d1.add(i4Var);
    }

    public final void r() {
        if (this.s != j()) {
            this.s = j();
            org.telegram.ui.ActionBar.d2 d2Var = this.b;
            if (d2Var == null || !(d2Var.getParentLayout() instanceof ActionBarLayout)) {
                t3 t3Var = this.c;
                if (t3Var.getParent() instanceof View) {
                    ((View) t3Var.getParent()).invalidate();
                    return;
                }
                return;
            }
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.b.getParentLayout();
            org.telegram.ui.ActionBar.v vVar = actionBarLayout.s;
            if (vVar != null) {
                vVar.invalidate();
            }
            org.telegram.ui.ActionBar.v vVar2 = actionBarLayout.x;
            if (vVar2 != null) {
                vVar2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void release() {
        this.r = true;
        i4 i4Var = this.L;
        l3 l3Var = i4Var.v0[0];
        if (l3Var != null && l3Var.h) {
            i3 i3Var = l3Var.e;
            i3Var.setSwipeOffsetY((-i3Var.f) + i3Var.e);
            i4Var.v0[0].h = false;
        }
        l3 l3Var2 = i4Var.v0[0];
        if (l3Var2 != null && !l3Var2.G) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onPause();
            }
            l3Var2.G = true;
        }
        l3 l3Var3 = i4Var.v0[1];
        if (l3Var3 != null && !l3Var3.G) {
            if (l3Var3.getWebView() != null) {
                l3Var3.getWebView().onPause();
            }
            l3Var3.G = true;
        }
        org.telegram.ui.ActionBar.x2 x2Var = this.e;
        if (x2Var != null) {
            x2Var.c();
        }
        this.b.removeSheet(this);
        if (this.e == null) {
            org.telegram.messenger.g0.E2(this.c);
        }
        ei.o3 o3Var = this.w;
        if (o3Var != null) {
            o3Var.run();
            this.w = null;
        }
        i4.d1.remove(i4Var);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean s() {
        t3 t3Var;
        if (!this.h && !this.r && this.x > 0.5f && (t3Var = this.c) != null && t3Var.isAttachedToWindow()) {
            if (org.telegram.messenger.g0.W1(Utilities.l(t3Var.k0.c), t3Var.r0.x() - org.telegram.messenger.g0.L(20.0f), 0) < t3Var.getHeight() && this.J < 1.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean t(Dialog dialog) {
        return false;
    }

    public final void u() {
        org.telegram.ui.ActionBar.x2 x2Var = this.e;
        t3 t3Var = this.c;
        org.telegram.messenger.g0.r3(x2Var != null ? x2Var.b : t3Var, f());
        org.telegram.ui.ActionBar.x2 x2Var2 = this.e;
        if (x2Var2 == null) {
            LaunchActivity.K1.F(true, true, true);
            org.telegram.messenger.g0.o3(t3Var, org.telegram.messenger.g0.B(e(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false))) >= 0.721f);
            return;
        }
        int e10 = x2Var2.a.e(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
        x2Var2.d.setColor(e10);
        x2Var2.c.invalidate();
        org.telegram.messenger.g0.u3(x2Var2, e10, true, null);
        org.telegram.messenger.g0.n3(x2Var2, org.telegram.messenger.g0.B(e10) >= 0.721f);
        LaunchActivity.K1.F(true, true, true);
    }

    public final int v() {
        if (!org.telegram.messenger.az.v0) {
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gl, false);
        }
        i4 i4Var = this.L;
        return i0.a.f(1.0f - (i4Var.v0[0].getVisibility() != 0 ? 0.0f : 1.0f - (i4Var.v0[0].getTranslationX() / i4Var.v0[0].getWidth())), i4Var.v0[0].getBackgroundColor(), i4Var.v0[1].getBackgroundColor());
    }

    public final int w() {
        int L = org.telegram.messenger.g0.L(16.0f);
        View view = this.d;
        return org.telegram.messenger.k5.B(20.0f, x(), L + (view == null ? org.telegram.messenger.g0.q.y : view.getHeight()));
    }

    public final int x() {
        i4 i4Var = this.L;
        int i3 = 0;
        l3 l3Var = i4Var.v0[0];
        float translationX = (l3Var == null || l3Var.getVisibility() != 0) ? 0.0f : 1.0f - (i4Var.v0[0].getTranslationX() / i4Var.v0[0].getWidth());
        float f10 = 1.0f - translationX;
        l3 l3Var2 = i4Var.v0[0];
        if (l3Var2 != null && l3Var2.getVisibility() == 0) {
            i3 = (int) (i4Var.v0[0].getAlpha() * i4Var.v0[0].getListTop() * translationX);
        }
        l3 l3Var3 = i4Var.v0[1];
        if (l3Var3 == null || l3Var3.getVisibility() != 0) {
            return i3;
        }
        return i3 + ((int) (i4Var.v0[1].getAlpha() * i4Var.v0[1].getListTop() * f10));
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final boolean y() {
        return this.c.isAttachedToWindow();
    }

    public final void z() {
        i4 i4Var = this.L;
        i4Var.v0[0].setLastVisible(this.K);
        i4Var.v0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final org.telegram.ui.ActionBar.h3 d() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void h(int i3) {
    }
}
