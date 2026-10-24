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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class w3 implements org.telegram.ui.ActionBar.k2, org.telegram.ui.ActionBar.w3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final /* synthetic */ k4 K;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.o2 b;
    public final v3 c;
    public View d;
    public org.telegram.ui.ActionBar.l3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public ci.s3 v;
    public float w;
    public float x;
    public ValueAnimator y;

    public w3(k4 k4Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.K = k4Var;
        this.b = o2Var;
        o2Var.getResourceProvider();
        v3 v3Var = new v3(this, o2Var.getContext());
        this.c = v3Var;
        new ei.b4(v3Var, true, new u3(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.w3
    public final org.telegram.ui.ActionBar.p3 a() {
        org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3();
        k4 k4Var = this.K;
        p3Var.E = k4Var.h0.getTitle();
        p3Var.J = k4Var;
        n3 n3Var = k4Var.u0[0];
        Bitmap bitmap = null;
        p3Var.q = (n3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pk, false) : n3Var.getActionBarColor();
        n3 n3Var2 = k4Var.u0[0];
        p3Var.r = (n3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pk, false) : n3Var2.getBackgroundColor();
        p3Var.n = true;
        p3Var.I = !this.F ? 0.0f : k4Var.u0[0].getProgress();
        n3 n3Var3 = k4Var.u0[0];
        p3Var.c = n3Var3;
        if (n3Var3 != null && n3Var3.getWebView() != null) {
            bitmap = k4Var.u0[0].getWebView().getFavicon();
        }
        p3Var.F = bitmap;
        n3 n3Var4 = p3Var.c;
        if (n3Var4 != null) {
            p3Var.g = n3Var4.getWidth();
            p3Var.h = p3Var.c.getHeight();
        }
        p3Var.i = l();
        p3Var.D = org.telegram.ui.ActionBar.k6.I.q();
        return p3Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean attachedToParent() {
        return this.c.isAttachedToWindow();
    }

    @Override // org.telegram.ui.ActionBar.w3
    public final boolean b() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.w3
    public final boolean c(org.telegram.ui.ActionBar.l3 l3Var) {
        this.e = l3Var;
        if (l3Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new t3(this, 0));
        return ofFloat;
    }

    @Override // org.telegram.ui.ActionBar.k2, android.content.DialogInterface
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, vt0 vt0Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new t3(this, 2));
        this.E.addListener(new ah.q0(this, z10, vt0Var, 3));
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
        ofFloat.addUpdateListener(new t3(this, 1));
        this.y.addListener(new m.a(this, 3));
        this.y.setInterpolator(org.telegram.ui.Components.bs.h);
        this.y.setDuration(320L);
        this.y.start();
    }

    public final void g(org.telegram.ui.ActionBar.o2 o2Var) {
        sn snVar;
        gk gkVar;
        this.r = false;
        this.b = o2Var;
        o2Var.getResourceProvider();
        if ((o2Var instanceof sn) && (gkVar = (snVar = (sn) o2Var).Y) != null) {
            gkVar.M();
            snVar.Y.k0(true, false, true);
        }
        org.telegram.ui.ActionBar.l3 l3Var = this.e;
        if (l3Var == null) {
            v3 v3Var = this.c;
            AndroidUtilities.removeFromParent(v3Var);
            if (o2Var.getLayoutContainer() != null) {
                o2Var.getLayoutContainer().addView(v3Var);
            }
        } else if (!l3Var.e) {
            l3Var.e = true;
            try {
                l3Var.show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        k4 k4Var = this.K;
        n3 n3Var = k4Var.u0[0];
        if (n3Var != null && n3Var.F) {
            if (n3Var.getWebView() != null) {
                n3Var.getWebView().onResume();
            }
            n3Var.F = false;
        }
        n3 n3Var2 = k4Var.u0[1];
        if (n3Var2 != null && n3Var2.F) {
            if (n3Var2.getWebView() != null) {
                n3Var2.getWebView().onResume();
            }
            n3Var2.F = false;
        }
        k4.c1.add(k4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.xc getBulletinFactory() {
        FrameLayout frameLayout;
        k4 k4Var = this.K;
        if (k4Var.u0[0].f()) {
            if (k4Var.u0[0].getWebView() != null) {
                frameLayout = k4Var.u0[0].f;
                return new org.telegram.ui.Components.xc(frameLayout, null);
            }
            return null;
        }
        n3 n3Var = k4Var.u0[0];
        TLRPC.WebPage webPage = n3Var.c.E;
        frameLayout = n3Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final int getNavigationBarColor(int i10) {
        float min = this.n ? 0.0f : Math.min(this.w, 1.0f - this.x) * (1.0f - this.I);
        int j10 = j();
        m0 m0Var = this.K.h0;
        if (m0Var != null) {
            j10 = i0.a.f(m0Var.a0, j10, m0Var.x);
        }
        return i0.a.f(min, i10, j10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View getWindowView() {
        return this.c;
    }

    public final void h() {
        if (this.s != isFullyVisible()) {
            this.s = isFullyVisible();
            org.telegram.ui.ActionBar.o2 o2Var = this.b;
            if (o2Var == null || !(o2Var.getParentLayout() instanceof ActionBarLayout)) {
                v3 v3Var = this.c;
                if (v3Var.getParent() instanceof View) {
                    ((View) v3Var.getParent()).invalidate();
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
        org.telegram.ui.ActionBar.l3 l3Var = this.e;
        v3 v3Var = this.c;
        AndroidUtilities.setLightStatusBar(l3Var != null ? l3Var.b : v3Var, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.l3 l3Var2 = this.e;
        if (l3Var2 == null) {
            LaunchActivity.J1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(v3Var, AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false))) >= 0.721f);
            return;
        }
        int navigationBarColor = l3Var2.a.getNavigationBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
        l3Var2.d.setColor(navigationBarColor);
        l3Var2.c.invalidate();
        AndroidUtilities.setNavigationBarColor(l3Var2, navigationBarColor);
        AndroidUtilities.setLightNavigationBar(l3Var2, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
        LaunchActivity.J1.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isAttachedLightStatusBar() {
        int f7;
        float min = this.n ? 0.0f : (1.0f - this.I) * Math.min(this.w, 1.0f - this.x);
        if (this.F && min > 0.25f) {
            if (SharedConfig.adaptableColorInBrowser) {
                k4 k4Var = this.K;
                f7 = i0.a.f(1.0f - (k4Var.u0[0].getVisibility() == 0 ? 1.0f - (k4Var.u0[0].getTranslationX() / k4Var.u0[0].getWidth()) : 0.0f), k4Var.u0[0].getActionBarColor(), k4Var.u0[1].getActionBarColor());
            } else {
                f7 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pk, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(f7) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isFullyVisible() {
        return this.G && this.x <= 0.0f && this.w >= 1.0f && this.I <= 0.0f && !this.n && !this.h;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isShown() {
        v3 v3Var;
        return !this.h && !this.r && this.w > 0.5f && (v3Var = this.c) != null && v3Var.isAttachedToWindow() && AndroidUtilities.lerp(v3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(v3Var.A0.c)) < v3Var.getHeight() && this.I < 1.0f;
    }

    public final int j() {
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sk, false);
        }
        k4 k4Var = this.K;
        return i0.a.f(1.0f - (k4Var.u0[0].getVisibility() != 0 ? 0.0f : 1.0f - (k4Var.u0[0].getTranslationX() / k4Var.u0[0].getWidth())), k4Var.u0[0].getBackgroundColor(), k4Var.u0[1].getBackgroundColor());
    }

    public final int k() {
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        return org.telegram.messenger.v0.z(20.0f, l(), dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight()));
    }

    public final int l() {
        k4 k4Var = this.K;
        int i10 = 0;
        n3 n3Var = k4Var.u0[0];
        float translationX = (n3Var == null || n3Var.getVisibility() != 0) ? 0.0f : 1.0f - (k4Var.u0[0].getTranslationX() / k4Var.u0[0].getWidth());
        float f7 = 1.0f - translationX;
        n3 n3Var2 = k4Var.u0[0];
        if (n3Var2 != null && n3Var2.getVisibility() == 0) {
            i10 = (int) (k4Var.u0[0].getAlpha() * k4Var.u0[0].getListTop() * translationX);
        }
        n3 n3Var3 = k4Var.u0[1];
        if (n3Var3 == null || n3Var3.getVisibility() != 0) {
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

    @Override // org.telegram.ui.ActionBar.k2
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
            n3 n3Var = k4Var.u0[0];
            if (n3Var.s) {
                if (n3Var.f() && n3Var.getWebView() != null) {
                    n3Var.getWebView().goBack();
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

    @Override // org.telegram.ui.ActionBar.w3
    public final void release() {
        this.r = true;
        k4 k4Var = this.K;
        n3 n3Var = k4Var.u0[0];
        if (n3Var != null && n3Var.h) {
            k3 k3Var = n3Var.e;
            k3Var.setSwipeOffsetY((-k3Var.f) + k3Var.e);
            k4Var.u0[0].h = false;
        }
        n3 n3Var2 = k4Var.u0[0];
        if (n3Var2 != null && !n3Var2.F) {
            if (n3Var2.getWebView() != null) {
                n3Var2.getWebView().onPause();
            }
            n3Var2.F = true;
        }
        n3 n3Var3 = k4Var.u0[1];
        if (n3Var3 != null && !n3Var3.F) {
            if (n3Var3.getWebView() != null) {
                n3Var3.getWebView().onPause();
            }
            n3Var3.F = true;
        }
        org.telegram.ui.ActionBar.l3 l3Var = this.e;
        if (l3Var != null) {
            l3Var.c();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.b;
        if (o2Var != null) {
            o2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.c);
            }
        }
        ci.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.run();
            this.v = null;
        }
        k4.c1.remove(k4Var);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        k4 k4Var = this.K;
        k4Var.u0[0].setLastVisible(z10);
        k4Var.u0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (ci.s3) runnable;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean showDialog(Dialog dialog) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void dismiss(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z10;
        if (z10) {
            LaunchActivity.J1.y0.b(this);
        } else {
            e(true, new vt0(this, 10));
        }
        i();
        h();
    }

    @Override // org.telegram.ui.ActionBar.w3
    public final org.telegram.ui.ActionBar.x3 getWindowView() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
