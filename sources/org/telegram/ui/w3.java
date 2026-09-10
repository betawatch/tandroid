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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class w3 implements org.telegram.ui.ActionBar.l2, org.telegram.ui.ActionBar.w3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final /* synthetic */ j4 K;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.p2 b;
    public final v3 c;
    public View d;
    public org.telegram.ui.ActionBar.k3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public zh.j2 v;
    public float w;
    public float x;
    public ValueAnimator y;

    public w3(j4 j4Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.K = j4Var;
        this.b = p2Var;
        p2Var.getResourceProvider();
        v3 v3Var = new v3(this, p2Var.getContext());
        this.c = v3Var;
        new bi.b5(v3Var, true, new u3(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.w3
    public final org.telegram.ui.ActionBar.p3 a() {
        org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3();
        j4 j4Var = this.K;
        p3Var.E = j4Var.h0.getTitle();
        p3Var.J = j4Var;
        n3 n3Var = j4Var.u0[0];
        Bitmap bitmap = null;
        p3Var.q = (n3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : n3Var.getActionBarColor();
        n3 n3Var2 = j4Var.u0[0];
        p3Var.r = (n3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : n3Var2.getBackgroundColor();
        p3Var.n = true;
        p3Var.I = !this.F ? 0.0f : j4Var.u0[0].getProgress();
        n3 n3Var3 = j4Var.u0[0];
        p3Var.c = n3Var3;
        if (n3Var3 != null && n3Var3.getWebView() != null) {
            bitmap = j4Var.u0[0].getWebView().getFavicon();
        }
        p3Var.F = bitmap;
        n3 n3Var4 = p3Var.c;
        if (n3Var4 != null) {
            p3Var.g = n3Var4.getWidth();
            p3Var.h = p3Var.c.getHeight();
        }
        p3Var.i = l();
        p3Var.D = org.telegram.ui.ActionBar.j6.I.q();
        return p3Var;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean attachedToParent() {
        return this.c.isAttachedToWindow();
    }

    @Override // org.telegram.ui.ActionBar.w3
    public final boolean b() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.w3
    public final boolean c(org.telegram.ui.ActionBar.k3 k3Var) {
        this.e = k3Var;
        if (k3Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new t3(this, 0));
        return ofFloat;
    }

    @Override // org.telegram.ui.ActionBar.l2, android.content.DialogInterface
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, mu0 mu0Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new t3(this, i10));
        this.E.addListener(new androidx.fragment.app.g(this, z10, mu0Var, i10));
        this.E.setInterpolator(org.telegram.ui.Components.wr.h);
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
        this.y.addListener(new bi.h(this, 18));
        this.y.setInterpolator(org.telegram.ui.Components.wr.h);
        this.y.setDuration(320L);
        this.y.start();
    }

    public final void g(org.telegram.ui.ActionBar.p2 p2Var) {
        eo eoVar;
        ok okVar;
        this.r = false;
        this.b = p2Var;
        p2Var.getResourceProvider();
        if ((p2Var instanceof eo) && (okVar = (eoVar = (eo) p2Var).Y) != null) {
            okVar.P();
            eoVar.Y.n0(true, false, true);
        }
        org.telegram.ui.ActionBar.k3 k3Var = this.e;
        if (k3Var == null) {
            v3 v3Var = this.c;
            AndroidUtilities.removeFromParent(v3Var);
            if (p2Var.getLayoutContainer() != null) {
                p2Var.getLayoutContainer().addView(v3Var);
            }
        } else if (!k3Var.e) {
            k3Var.e = true;
            try {
                k3Var.show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        j4 j4Var = this.K;
        n3 n3Var = j4Var.u0[0];
        if (n3Var != null && n3Var.E) {
            if (n3Var.getWebView() != null) {
                n3Var.getWebView().onResume();
            }
            n3Var.E = false;
        }
        n3 n3Var2 = j4Var.u0[1];
        if (n3Var2 != null && n3Var2.E) {
            if (n3Var2.getWebView() != null) {
                n3Var2.getWebView().onResume();
            }
            n3Var2.E = false;
        }
        j4.b1.add(j4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.wc getBulletinFactory() {
        FrameLayout frameLayout;
        j4 j4Var = this.K;
        if (j4Var.u0[0].f()) {
            if (j4Var.u0[0].getWebView() != null) {
                frameLayout = j4Var.u0[0].f;
                return new org.telegram.ui.Components.wc(frameLayout, null);
            }
            return null;
        }
        n3 n3Var = j4Var.u0[0];
        TLRPC.WebPage webPage = n3Var.c.E;
        frameLayout = n3Var;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final int getNavigationBarColor(int i10) {
        float min = this.n ? 0.0f : Math.min(this.w, 1.0f - this.x) * (1.0f - this.I);
        int j3 = j();
        l0 l0Var = this.K.h0;
        if (l0Var != null) {
            j3 = i0.a.d(l0Var.a0, j3, l0Var.x);
        }
        return i0.a.d(min, i10, j3);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final View getWindowView() {
        return this.c;
    }

    public final void h() {
        if (this.s != isFullyVisible()) {
            this.s = isFullyVisible();
            org.telegram.ui.ActionBar.p2 p2Var = this.b;
            if (p2Var == null || !(p2Var.getParentLayout() instanceof ActionBarLayout)) {
                v3 v3Var = this.c;
                if (v3Var.getParent() instanceof View) {
                    ((View) v3Var.getParent()).invalidate();
                    return;
                }
                return;
            }
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.b.getParentLayout();
            org.telegram.ui.ActionBar.w wVar = actionBarLayout.s;
            if (wVar != null) {
                wVar.invalidate();
            }
            org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.w;
            if (wVar2 != null) {
                wVar2.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.ui.ActionBar.k3 k3Var = this.e;
        v3 v3Var = this.c;
        AndroidUtilities.setLightStatusBar(k3Var != null ? k3Var.b : v3Var, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.k3 k3Var2 = this.e;
        if (k3Var2 == null) {
            LaunchActivity.G1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(v3Var, AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false))) >= 0.721f);
            return;
        }
        int navigationBarColor = k3Var2.a.getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        k3Var2.d.setColor(navigationBarColor);
        k3Var2.c.invalidate();
        AndroidUtilities.setNavigationBarColor(k3Var2, navigationBarColor);
        AndroidUtilities.setLightNavigationBar(k3Var2, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
        LaunchActivity.G1.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isAttachedLightStatusBar() {
        int d;
        float min = this.n ? 0.0f : (1.0f - this.I) * Math.min(this.w, 1.0f - this.x);
        if (this.F && min > 0.25f) {
            if (SharedConfig.adaptableColorInBrowser) {
                j4 j4Var = this.K;
                d = i0.a.d(1.0f - (j4Var.u0[0].getVisibility() == 0 ? 1.0f - (j4Var.u0[0].getTranslationX() / j4Var.u0[0].getWidth()) : 0.0f), j4Var.u0[0].getActionBarColor(), j4Var.u0[1].getActionBarColor());
            } else {
                d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isFullyVisible() {
        return this.G && this.x <= 0.0f && this.w >= 1.0f && this.I <= 0.0f && !this.n && !this.h;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isShown() {
        v3 v3Var;
        return !this.h && !this.r && this.w > 0.5f && (v3Var = this.c) != null && v3Var.isAttachedToWindow() && AndroidUtilities.lerp(v3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(v3Var.A0.c)) < v3Var.getHeight() && this.I < 1.0f;
    }

    public final int j() {
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sk, false);
        }
        j4 j4Var = this.K;
        return i0.a.d(1.0f - (j4Var.u0[0].getVisibility() != 0 ? 0.0f : 1.0f - (j4Var.u0[0].getTranslationX() / j4Var.u0[0].getWidth())), j4Var.u0[0].getBackgroundColor(), j4Var.u0[1].getBackgroundColor());
    }

    public final int k() {
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        return org.telegram.messenger.a2.z(20.0f, l(), dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight()));
    }

    public final int l() {
        j4 j4Var = this.K;
        int i10 = 0;
        n3 n3Var = j4Var.u0[0];
        float translationX = (n3Var == null || n3Var.getVisibility() != 0) ? 0.0f : 1.0f - (j4Var.u0[0].getTranslationX() / j4Var.u0[0].getWidth());
        float f7 = 1.0f - translationX;
        n3 n3Var2 = j4Var.u0[0];
        if (n3Var2 != null && n3Var2.getVisibility() == 0) {
            i10 = (int) (j4Var.u0[0].getAlpha() * j4Var.u0[0].getListTop() * translationX);
        }
        n3 n3Var3 = j4Var.u0[1];
        if (n3Var3 == null || n3Var3.getVisibility() != 0) {
            return i10;
        }
        return i10 + ((int) (j4Var.u0[1].getAlpha() * j4Var.u0[1].getListTop() * f7));
    }

    public final void m() {
        j4 j4Var = this.K;
        j4Var.u0[0].setLastVisible(this.J);
        j4Var.u0[1].setLastVisible(false);
    }

    public final void n() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.w, this.n ? 0.0f : this.x) * k());
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean onAttachedBackPressed() {
        j4 j4Var = this.K;
        if (j4Var.o0) {
            AndroidUtilities.hideKeyboard(this.c);
            return true;
        }
        l0 l0Var = j4Var.h0;
        if (l0Var.T) {
            l0Var.h(false);
            return true;
        }
        if (l0Var.W) {
            l0Var.k(false);
            return true;
        }
        if (j4Var.J()) {
            n3 n3Var = j4Var.u0[0];
            if (n3Var.s) {
                if (n3Var.f() && n3Var.getWebView() != null) {
                    n3Var.getWebView().goBack();
                }
                return true;
            }
        }
        if (j4Var.d0.size() > 1) {
            j4Var.G();
            return true;
        }
        dismiss(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.w3
    public final void release() {
        this.r = true;
        j4 j4Var = this.K;
        n3 n3Var = j4Var.u0[0];
        if (n3Var != null && n3Var.h) {
            k3 k3Var = n3Var.e;
            k3Var.setSwipeOffsetY((-k3Var.f) + k3Var.e);
            j4Var.u0[0].h = false;
        }
        n3 n3Var2 = j4Var.u0[0];
        if (n3Var2 != null && !n3Var2.E) {
            if (n3Var2.getWebView() != null) {
                n3Var2.getWebView().onPause();
            }
            n3Var2.E = true;
        }
        n3 n3Var3 = j4Var.u0[1];
        if (n3Var3 != null && !n3Var3.E) {
            if (n3Var3.getWebView() != null) {
                n3Var3.getWebView().onPause();
            }
            n3Var3.E = true;
        }
        org.telegram.ui.ActionBar.k3 k3Var2 = this.e;
        if (k3Var2 != null) {
            k3Var2.c();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.b;
        if (p2Var != null) {
            p2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.c);
            }
        }
        zh.j2 j2Var = this.v;
        if (j2Var != null) {
            j2Var.run();
            this.v = null;
        }
        j4.b1.remove(j4Var);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        j4 j4Var = this.K;
        j4Var.u0[0].setLastVisible(z10);
        j4Var.u0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (zh.j2) runnable;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean showDialog(Dialog dialog) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void dismiss(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z10;
        if (z10) {
            LaunchActivity.G1.y0.b(this);
        } else {
            e(true, new mu0(this, 10));
        }
        i();
        h();
    }

    @Override // org.telegram.ui.ActionBar.w3
    public final org.telegram.ui.ActionBar.x3 getWindowView() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
