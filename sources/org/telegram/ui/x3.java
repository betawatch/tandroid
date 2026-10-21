package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class x3 implements org.telegram.ui.ActionBar.j2, org.telegram.ui.ActionBar.t3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final /* synthetic */ l4 K;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.n2 b;
    public final w3 c;
    public View d;
    public org.telegram.ui.ActionBar.i3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public ci.t3 v;
    public float w;
    public float x;
    public ValueAnimator y;

    public x3(l4 l4Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.K = l4Var;
        this.b = n2Var;
        n2Var.getResourceProvider();
        w3 w3Var = new w3(this, n2Var.getContext());
        this.c = w3Var;
        new ei.b4(w3Var, true, new v3(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final org.telegram.ui.ActionBar.m3 a() {
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3();
        l4 l4Var = this.K;
        m3Var.E = l4Var.h0.getTitle();
        m3Var.J = l4Var;
        o3 o3Var = l4Var.u0[0];
        Bitmap bitmap = null;
        m3Var.q = (o3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false) : o3Var.getActionBarColor();
        o3 o3Var2 = l4Var.u0[0];
        m3Var.r = (o3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false) : o3Var2.getBackgroundColor();
        m3Var.n = true;
        m3Var.I = !this.F ? 0.0f : l4Var.u0[0].getProgress();
        o3 o3Var3 = l4Var.u0[0];
        m3Var.c = o3Var3;
        if (o3Var3 != null && o3Var3.getWebView() != null) {
            bitmap = l4Var.u0[0].getWebView().getFavicon();
        }
        m3Var.F = bitmap;
        o3 o3Var4 = m3Var.c;
        if (o3Var4 != null) {
            m3Var.g = o3Var4.getWidth();
            m3Var.h = m3Var.c.getHeight();
        }
        m3Var.i = l();
        m3Var.D = org.telegram.ui.ActionBar.h6.I.q();
        return m3Var;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean attachedToParent() {
        return this.c.isAttachedToWindow();
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final boolean b() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final boolean c(org.telegram.ui.ActionBar.i3 i3Var) {
        this.e = i3Var;
        if (i3Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new u3(this, 0));
        return ofFloat;
    }

    @Override // org.telegram.ui.ActionBar.j2, android.content.DialogInterface
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, st0 st0Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new u3(this, 2));
        this.E.addListener(new ah.q0(this, z10, st0Var, 3));
        this.E.setInterpolator(org.telegram.ui.Components.bs.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, 1.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new u3(this, 1));
        this.y.addListener(new m.a(this, 3));
        this.y.setInterpolator(org.telegram.ui.Components.bs.h);
        this.y.setDuration(320L);
        this.y.start();
    }

    public final void g(org.telegram.ui.ActionBar.n2 n2Var) {
        qn qnVar;
        fk fkVar;
        this.r = false;
        this.b = n2Var;
        n2Var.getResourceProvider();
        if ((n2Var instanceof qn) && (fkVar = (qnVar = (qn) n2Var).Y) != null) {
            fkVar.N();
            qnVar.Y.l0(true, false, true);
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        if (i3Var == null) {
            w3 w3Var = this.c;
            AndroidUtilities.removeFromParent(w3Var);
            if (n2Var.getLayoutContainer() != null) {
                n2Var.getLayoutContainer().addView(w3Var);
            }
        } else if (!i3Var.e) {
            i3Var.e = true;
            try {
                i3Var.show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        l4 l4Var = this.K;
        o3 o3Var = l4Var.u0[0];
        if (o3Var != null && o3Var.E) {
            if (o3Var.getWebView() != null) {
                o3Var.getWebView().onResume();
            }
            o3Var.E = false;
        }
        o3 o3Var2 = l4Var.u0[1];
        if (o3Var2 != null && o3Var2.E) {
            if (o3Var2.getWebView() != null) {
                o3Var2.getWebView().onResume();
            }
            o3Var2.E = false;
        }
        l4.b1.add(l4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.j2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.xc getBulletinFactory() {
        FrameLayout frameLayout;
        l4 l4Var = this.K;
        if (l4Var.u0[0].f()) {
            if (l4Var.u0[0].getWebView() != null) {
                frameLayout = l4Var.u0[0].f;
                return new org.telegram.ui.Components.xc(frameLayout, null);
            }
            return null;
        }
        o3 o3Var = l4Var.u0[0];
        TLRPC.WebPage webPage = o3Var.c.E;
        frameLayout = o3Var;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final int getNavigationBarColor(int i10) {
        float min = this.n ? 0.0f : Math.min(this.w, 1.0f - this.x) * (1.0f - this.I);
        int j10 = j();
        n0 n0Var = this.K.h0;
        if (n0Var != null) {
            j10 = i0.a.f(n0Var.a0, j10, n0Var.x);
        }
        return i0.a.f(min, i10, j10);
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final View getWindowView() {
        return this.c;
    }

    public final void h() {
        if (this.s != isFullyVisible()) {
            this.s = isFullyVisible();
            org.telegram.ui.ActionBar.n2 n2Var = this.b;
            if (n2Var == null || !(n2Var.getParentLayout() instanceof ActionBarLayout)) {
                w3 w3Var = this.c;
                if (w3Var.getParent() instanceof View) {
                    ((View) w3Var.getParent()).invalidate();
                    return;
                }
                return;
            }
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.b.getParentLayout();
            org.telegram.ui.ActionBar.v vVar = actionBarLayout.s;
            if (vVar != null) {
                vVar.invalidate();
            }
            org.telegram.ui.ActionBar.v vVar2 = actionBarLayout.w;
            if (vVar2 != null) {
                vVar2.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        w3 w3Var = this.c;
        AndroidUtilities.setLightStatusBar(i3Var != null ? i3Var.b : w3Var, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.i3 i3Var2 = this.e;
        if (i3Var2 == null) {
            LaunchActivity.H1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(w3Var, AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false))) >= 0.721f);
            return;
        }
        int navigationBarColor = i3Var2.a.getNavigationBarColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        i3Var2.d.setColor(navigationBarColor);
        i3Var2.c.invalidate();
        AndroidUtilities.setNavigationBarColor(i3Var2, navigationBarColor);
        AndroidUtilities.setLightNavigationBar(i3Var2, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
        LaunchActivity.H1.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean isAttachedLightStatusBar() {
        int f7;
        float min = this.n ? 0.0f : (1.0f - this.I) * Math.min(this.w, 1.0f - this.x);
        if (this.F && min > 0.25f) {
            if (SharedConfig.adaptableColorInBrowser) {
                l4 l4Var = this.K;
                f7 = i0.a.f(1.0f - (l4Var.u0[0].getVisibility() == 0 ? 1.0f - (l4Var.u0[0].getTranslationX() / l4Var.u0[0].getWidth()) : 0.0f), l4Var.u0[0].getActionBarColor(), l4Var.u0[1].getActionBarColor());
            } else {
                f7 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(f7) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean isFullyVisible() {
        return this.G && this.x <= 0.0f && this.w >= 1.0f && this.I <= 0.0f && !this.n && !this.h;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean isShown() {
        w3 w3Var;
        return !this.h && !this.r && this.w > 0.5f && (w3Var = this.c) != null && w3Var.isAttachedToWindow() && AndroidUtilities.lerp(w3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(w3Var.A0.c)) < w3Var.getHeight() && this.I < 1.0f;
    }

    public final int j() {
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sk, false);
        }
        l4 l4Var = this.K;
        return i0.a.f(1.0f - (l4Var.u0[0].getVisibility() != 0 ? 0.0f : 1.0f - (l4Var.u0[0].getTranslationX() / l4Var.u0[0].getWidth())), l4Var.u0[0].getBackgroundColor(), l4Var.u0[1].getBackgroundColor());
    }

    public final int k() {
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        return org.telegram.messenger.g0.A(20.0f, l(), dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight()));
    }

    public final int l() {
        l4 l4Var = this.K;
        int i10 = 0;
        o3 o3Var = l4Var.u0[0];
        float translationX = (o3Var == null || o3Var.getVisibility() != 0) ? 0.0f : 1.0f - (l4Var.u0[0].getTranslationX() / l4Var.u0[0].getWidth());
        float f7 = 1.0f - translationX;
        o3 o3Var2 = l4Var.u0[0];
        if (o3Var2 != null && o3Var2.getVisibility() == 0) {
            i10 = (int) (l4Var.u0[0].getAlpha() * l4Var.u0[0].getListTop() * translationX);
        }
        o3 o3Var3 = l4Var.u0[1];
        if (o3Var3 == null || o3Var3.getVisibility() != 0) {
            return i10;
        }
        return i10 + ((int) (l4Var.u0[1].getAlpha() * l4Var.u0[1].getListTop() * f7));
    }

    public final void m() {
        l4 l4Var = this.K;
        l4Var.u0[0].setLastVisible(this.J);
        l4Var.u0[1].setLastVisible(false);
    }

    public final void n() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.w, this.n ? 0.0f : this.x) * k());
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean onAttachedBackPressed() {
        l4 l4Var = this.K;
        if (l4Var.o0) {
            AndroidUtilities.hideKeyboard(this.c);
            return true;
        }
        n0 n0Var = l4Var.h0;
        if (n0Var.T) {
            n0Var.h(false);
            return true;
        }
        if (n0Var.W) {
            n0Var.k(false);
            return true;
        }
        if (l4Var.J()) {
            o3 o3Var = l4Var.u0[0];
            if (o3Var.s) {
                if (o3Var.f() && o3Var.getWebView() != null) {
                    o3Var.getWebView().goBack();
                }
                return true;
            }
        }
        if (l4Var.d0.size() > 1) {
            l4Var.G();
            return true;
        }
        dismiss(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final void release() {
        this.r = true;
        l4 l4Var = this.K;
        o3 o3Var = l4Var.u0[0];
        if (o3Var != null && o3Var.h) {
            l3 l3Var = o3Var.e;
            l3Var.setSwipeOffsetY((-l3Var.f) + l3Var.e);
            l4Var.u0[0].h = false;
        }
        o3 o3Var2 = l4Var.u0[0];
        if (o3Var2 != null && !o3Var2.E) {
            if (o3Var2.getWebView() != null) {
                o3Var2.getWebView().onPause();
            }
            o3Var2.E = true;
        }
        o3 o3Var3 = l4Var.u0[1];
        if (o3Var3 != null && !o3Var3.E) {
            if (o3Var3.getWebView() != null) {
                o3Var3.getWebView().onPause();
            }
            o3Var3.E = true;
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        if (i3Var != null) {
            i3Var.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.b;
        if (n2Var != null) {
            n2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.c);
            }
        }
        ci.t3 t3Var = this.v;
        if (t3Var != null) {
            t3Var.run();
            this.v = null;
        }
        l4.b1.remove(l4Var);
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        l4 l4Var = this.K;
        l4Var.u0[0].setLastVisible(z10);
        l4Var.u0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (ci.t3) runnable;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean showDialog(Dialog dialog) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void dismiss(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z10;
        if (z10) {
            LaunchActivity.H1.y0.b(this);
        } else {
            e(true, new st0(this, 10));
        }
        i();
        h();
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final org.telegram.ui.ActionBar.u3 getWindowView() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
