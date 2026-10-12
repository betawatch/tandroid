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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class x3 implements org.telegram.ui.ActionBar.i2, org.telegram.ui.ActionBar.s3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final /* synthetic */ k4 K;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.m2 b;
    public final w3 c;
    public View d;
    public org.telegram.ui.ActionBar.h3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public bi.r4 v;
    public float w;
    public float x;
    public ValueAnimator y;

    public x3(k4 k4Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.K = k4Var;
        this.b = m2Var;
        m2Var.getResourceProvider();
        w3 w3Var = new w3(this, m2Var.getContext());
        this.c = w3Var;
        new di.h4(w3Var, true, new v3(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final org.telegram.ui.ActionBar.l3 a() {
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3();
        k4 k4Var = this.K;
        l3Var.E = k4Var.h0.getTitle();
        l3Var.J = k4Var;
        o3 o3Var = k4Var.u0[0];
        Bitmap bitmap = null;
        l3Var.q = (o3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false) : o3Var.getActionBarColor();
        o3 o3Var2 = k4Var.u0[0];
        l3Var.r = (o3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false) : o3Var2.getBackgroundColor();
        l3Var.n = true;
        l3Var.I = !this.F ? 0.0f : k4Var.u0[0].getProgress();
        o3 o3Var3 = k4Var.u0[0];
        l3Var.c = o3Var3;
        if (o3Var3 != null && o3Var3.getWebView() != null) {
            bitmap = k4Var.u0[0].getWebView().getFavicon();
        }
        l3Var.F = bitmap;
        o3 o3Var4 = l3Var.c;
        if (o3Var4 != null) {
            l3Var.g = o3Var4.getWidth();
            l3Var.h = l3Var.c.getHeight();
        }
        l3Var.i = l();
        l3Var.D = org.telegram.ui.ActionBar.g6.I.q();
        return l3Var;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final boolean attachedToParent() {
        return this.c.isAttachedToWindow();
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final boolean b() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final boolean c(org.telegram.ui.ActionBar.h3 h3Var) {
        this.e = h3Var;
        if (h3Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new u3(this, 0));
        return ofFloat;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, tu0 tu0Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new u3(this, 2));
        this.E.addListener(new ah.q0(this, z10, tu0Var, 3));
        this.E.setInterpolator(org.telegram.ui.Components.es.h);
        this.E.setDuration(250L);
        this.E.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, 1.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new u3(this, i10));
        this.y.addListener(new u0(this, i10));
        this.y.setInterpolator(org.telegram.ui.Components.es.h);
        this.y.setDuration(320L);
        this.y.start();
    }

    public final void g(org.telegram.ui.ActionBar.m2 m2Var) {
        fo foVar;
        sk skVar;
        this.r = false;
        this.b = m2Var;
        m2Var.getResourceProvider();
        if ((m2Var instanceof fo) && (skVar = (foVar = (fo) m2Var).Y) != null) {
            skVar.N();
            foVar.Y.l0(true, false, true);
        }
        org.telegram.ui.ActionBar.h3 h3Var = this.e;
        if (h3Var == null) {
            w3 w3Var = this.c;
            AndroidUtilities.removeFromParent(w3Var);
            if (m2Var.getLayoutContainer() != null) {
                m2Var.getLayoutContainer().addView(w3Var);
            }
        } else if (!h3Var.e) {
            h3Var.e = true;
            try {
                h3Var.show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        k4 k4Var = this.K;
        o3 o3Var = k4Var.u0[0];
        if (o3Var != null && o3Var.E) {
            if (o3Var.getWebView() != null) {
                o3Var.getWebView().onResume();
            }
            o3Var.E = false;
        }
        o3 o3Var2 = k4Var.u0[1];
        if (o3Var2 != null && o3Var2.E) {
            if (o3Var2.getWebView() != null) {
                o3Var2.getWebView().onResume();
            }
            o3Var2.E = false;
        }
        k4.b1.add(k4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.i2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.zc getBulletinFactory() {
        FrameLayout frameLayout;
        k4 k4Var = this.K;
        if (k4Var.u0[0].f()) {
            if (k4Var.u0[0].getWebView() != null) {
                frameLayout = k4Var.u0[0].f;
                return new org.telegram.ui.Components.zc(frameLayout, null);
            }
            return null;
        }
        o3 o3Var = k4Var.u0[0];
        TLRPC.WebPage webPage = o3Var.c.E;
        frameLayout = o3Var;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final int getNavigationBarColor(int i10) {
        float min = this.n ? 0.0f : Math.min(this.w, 1.0f - this.x) * (1.0f - this.I);
        int j10 = j();
        m0 m0Var = this.K.h0;
        if (m0Var != null) {
            j10 = i0.a.d(m0Var.a0, j10, m0Var.x);
        }
        return i0.a.d(min, i10, j10);
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final View getWindowView() {
        return this.c;
    }

    public final void h() {
        if (this.s != isFullyVisible()) {
            this.s = isFullyVisible();
            org.telegram.ui.ActionBar.m2 m2Var = this.b;
            if (m2Var == null || !(m2Var.getParentLayout() instanceof ActionBarLayout)) {
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
        org.telegram.ui.ActionBar.h3 h3Var = this.e;
        w3 w3Var = this.c;
        AndroidUtilities.setLightStatusBar(h3Var != null ? h3Var.b : w3Var, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.h3 h3Var2 = this.e;
        if (h3Var2 == null) {
            LaunchActivity.G1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(w3Var, AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.a7, false))) >= 0.721f);
            return;
        }
        int navigationBarColor = h3Var2.a.getNavigationBarColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.a7, false));
        h3Var2.d.setColor(navigationBarColor);
        h3Var2.c.invalidate();
        AndroidUtilities.setNavigationBarColor(h3Var2, navigationBarColor);
        AndroidUtilities.setLightNavigationBar(h3Var2, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
        LaunchActivity.G1.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final boolean isAttachedLightStatusBar() {
        int d;
        float min = this.n ? 0.0f : (1.0f - this.I) * Math.min(this.w, 1.0f - this.x);
        if (this.F && min > 0.25f) {
            if (SharedConfig.adaptableColorInBrowser) {
                k4 k4Var = this.K;
                d = i0.a.d(1.0f - (k4Var.u0[0].getVisibility() == 0 ? 1.0f - (k4Var.u0[0].getTranslationX() / k4Var.u0[0].getWidth()) : 0.0f), k4Var.u0[0].getActionBarColor(), k4Var.u0[1].getActionBarColor());
            } else {
                d = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final boolean isFullyVisible() {
        return this.G && this.x <= 0.0f && this.w >= 1.0f && this.I <= 0.0f && !this.n && !this.h;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final boolean isShown() {
        w3 w3Var;
        return !this.h && !this.r && this.w > 0.5f && (w3Var = this.c) != null && w3Var.isAttachedToWindow() && AndroidUtilities.lerp(w3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(w3Var.A0.c)) < w3Var.getHeight() && this.I < 1.0f;
    }

    public final int j() {
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sk, false);
        }
        k4 k4Var = this.K;
        return i0.a.d(1.0f - (k4Var.u0[0].getVisibility() != 0 ? 0.0f : 1.0f - (k4Var.u0[0].getTranslationX() / k4Var.u0[0].getWidth())), k4Var.u0[0].getBackgroundColor(), k4Var.u0[1].getBackgroundColor());
    }

    public final int k() {
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        return org.telegram.messenger.q.C(20.0f, l(), dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight()));
    }

    public final int l() {
        k4 k4Var = this.K;
        int i10 = 0;
        o3 o3Var = k4Var.u0[0];
        float translationX = (o3Var == null || o3Var.getVisibility() != 0) ? 0.0f : 1.0f - (k4Var.u0[0].getTranslationX() / k4Var.u0[0].getWidth());
        float f7 = 1.0f - translationX;
        o3 o3Var2 = k4Var.u0[0];
        if (o3Var2 != null && o3Var2.getVisibility() == 0) {
            i10 = (int) (k4Var.u0[0].getAlpha() * k4Var.u0[0].getListTop() * translationX);
        }
        o3 o3Var3 = k4Var.u0[1];
        if (o3Var3 == null || o3Var3.getVisibility() != 0) {
            return i10;
        }
        return i10 + ((int) (k4Var.u0[1].getAlpha() * k4Var.u0[1].getListTop() * f7));
    }

    public final void m() {
        k4 k4Var = this.K;
        k4Var.u0[0].setLastVisible(this.J);
        k4Var.u0[1].setLastVisible(false);
    }

    public final void n() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.w, this.n ? 0.0f : this.x) * k());
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final boolean onAttachedBackPressed() {
        k4 k4Var = this.K;
        if (k4Var.o0) {
            AndroidUtilities.hideKeyboard(this.c);
            return true;
        }
        m0 m0Var = k4Var.h0;
        if (m0Var.T) {
            m0Var.h(false);
            return true;
        }
        if (m0Var.W) {
            m0Var.k(false);
            return true;
        }
        if (k4Var.J()) {
            o3 o3Var = k4Var.u0[0];
            if (o3Var.s) {
                if (o3Var.f() && o3Var.getWebView() != null) {
                    o3Var.getWebView().goBack();
                }
                return true;
            }
        }
        if (k4Var.d0.size() > 1) {
            k4Var.G();
            return true;
        }
        dismiss(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final void release() {
        this.r = true;
        k4 k4Var = this.K;
        o3 o3Var = k4Var.u0[0];
        if (o3Var != null && o3Var.h) {
            l3 l3Var = o3Var.e;
            l3Var.setSwipeOffsetY((-l3Var.f) + l3Var.e);
            k4Var.u0[0].h = false;
        }
        o3 o3Var2 = k4Var.u0[0];
        if (o3Var2 != null && !o3Var2.E) {
            if (o3Var2.getWebView() != null) {
                o3Var2.getWebView().onPause();
            }
            o3Var2.E = true;
        }
        o3 o3Var3 = k4Var.u0[1];
        if (o3Var3 != null && !o3Var3.E) {
            if (o3Var3.getWebView() != null) {
                o3Var3.getWebView().onPause();
            }
            o3Var3.E = true;
        }
        org.telegram.ui.ActionBar.h3 h3Var = this.e;
        if (h3Var != null) {
            h3Var.c();
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.b;
        if (m2Var != null) {
            m2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.c);
            }
        }
        bi.r4 r4Var = this.v;
        if (r4Var != null) {
            r4Var.run();
            this.v = null;
        }
        k4.b1.remove(k4Var);
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        k4 k4Var = this.K;
        k4Var.u0[0].setLastVisible(z10);
        k4Var.u0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (bi.r4) runnable;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final boolean showDialog(Dialog dialog) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final void dismiss(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z10;
        if (z10) {
            LaunchActivity.G1.y0.b(this);
        } else {
            e(true, new tu0(this, 10));
        }
        i();
        h();
    }

    @Override // org.telegram.ui.ActionBar.s3
    public final org.telegram.ui.ActionBar.t3 getWindowView() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.i2
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
