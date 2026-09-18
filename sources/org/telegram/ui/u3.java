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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class u3 implements org.telegram.ui.ActionBar.j2, org.telegram.ui.ActionBar.u3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final /* synthetic */ h4 K;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.n2 b;
    public final t3 c;
    public View d;
    public org.telegram.ui.ActionBar.i3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public ai.e5 v;
    public float w;
    public float x;
    public ValueAnimator y;

    public u3(h4 h4Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.K = h4Var;
        this.b = n2Var;
        n2Var.getResourceProvider();
        t3 t3Var = new t3(this, n2Var.getContext());
        this.c = t3Var;
        new ci.j4(t3Var, true, new s3(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final org.telegram.ui.ActionBar.n3 a() {
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3();
        h4 h4Var = this.K;
        n3Var.E = h4Var.h0.getTitle();
        n3Var.J = h4Var;
        l3 l3Var = h4Var.u0[0];
        Bitmap bitmap = null;
        n3Var.q = (l3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : l3Var.getActionBarColor();
        l3 l3Var2 = h4Var.u0[0];
        n3Var.r = (l3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : l3Var2.getBackgroundColor();
        n3Var.n = true;
        n3Var.I = !this.F ? 0.0f : h4Var.u0[0].getProgress();
        l3 l3Var3 = h4Var.u0[0];
        n3Var.c = l3Var3;
        if (l3Var3 != null && l3Var3.getWebView() != null) {
            bitmap = h4Var.u0[0].getWebView().getFavicon();
        }
        n3Var.F = bitmap;
        l3 l3Var4 = n3Var.c;
        if (l3Var4 != null) {
            n3Var.g = l3Var4.getWidth();
            n3Var.h = n3Var.c.getHeight();
        }
        n3Var.i = l();
        n3Var.D = org.telegram.ui.ActionBar.j6.I.q();
        return n3Var;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean attachedToParent() {
        return this.c.isAttachedToWindow();
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final boolean b() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final boolean c(org.telegram.ui.ActionBar.i3 i3Var) {
        this.e = i3Var;
        if (i3Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new r3(this, 0));
        return ofFloat;
    }

    @Override // org.telegram.ui.ActionBar.j2
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
        ofFloat.addUpdateListener(new r3(this, i10));
        this.E.addListener(new androidx.fragment.app.g(this, z10, mu0Var, i10));
        this.E.setInterpolator(org.telegram.ui.Components.qr.h);
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
        ofFloat.addUpdateListener(new r3(this, 1));
        this.y.addListener(new ai.b(this, 28));
        this.y.setInterpolator(org.telegram.ui.Components.qr.h);
        this.y.setDuration(320L);
        this.y.start();
    }

    public final void g(org.telegram.ui.ActionBar.n2 n2Var) {
        zn znVar;
        lk lkVar;
        this.r = false;
        this.b = n2Var;
        n2Var.getResourceProvider();
        if ((n2Var instanceof zn) && (lkVar = (znVar = (zn) n2Var).Y) != null) {
            lkVar.P();
            znVar.Y.n0(true, false, true);
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        if (i3Var == null) {
            t3 t3Var = this.c;
            AndroidUtilities.removeFromParent(t3Var);
            if (n2Var.getLayoutContainer() != null) {
                n2Var.getLayoutContainer().addView(t3Var);
            }
        } else if (!i3Var.e) {
            i3Var.e = true;
            try {
                i3Var.show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        h4 h4Var = this.K;
        l3 l3Var = h4Var.u0[0];
        if (l3Var != null && l3Var.E) {
            if (l3Var.getWebView() != null) {
                l3Var.getWebView().onResume();
            }
            l3Var.E = false;
        }
        l3 l3Var2 = h4Var.u0[1];
        if (l3Var2 != null && l3Var2.E) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onResume();
            }
            l3Var2.E = false;
        }
        h4.b1.add(h4Var);
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
        h4 h4Var = this.K;
        if (h4Var.u0[0].f()) {
            if (h4Var.u0[0].getWebView() != null) {
                frameLayout = h4Var.u0[0].f;
                return new org.telegram.ui.Components.xc(frameLayout, null);
            }
            return null;
        }
        l3 l3Var = h4Var.u0[0];
        TLRPC.WebPage webPage = l3Var.c.E;
        frameLayout = l3Var;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final int getNavigationBarColor(int i10) {
        float min = this.n ? 0.0f : Math.min(this.w, 1.0f - this.x) * (1.0f - this.I);
        int j3 = j();
        k0 k0Var = this.K.h0;
        if (k0Var != null) {
            j3 = i0.a.d(k0Var.a0, j3, k0Var.x);
        }
        return i0.a.d(min, i10, j3);
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
            org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.w;
            if (wVar2 != null) {
                wVar2.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        t3 t3Var = this.c;
        AndroidUtilities.setLightStatusBar(i3Var != null ? i3Var.b : t3Var, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.i3 i3Var2 = this.e;
        if (i3Var2 == null) {
            LaunchActivity.G1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(t3Var, AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false))) >= 0.721f);
            return;
        }
        int navigationBarColor = i3Var2.a.getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        i3Var2.d.setColor(navigationBarColor);
        i3Var2.c.invalidate();
        AndroidUtilities.setNavigationBarColor(i3Var2, navigationBarColor);
        AndroidUtilities.setLightNavigationBar(i3Var2, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
        LaunchActivity.G1.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final boolean isAttachedLightStatusBar() {
        int d;
        float min = this.n ? 0.0f : (1.0f - this.I) * Math.min(this.w, 1.0f - this.x);
        if (this.F && min > 0.25f) {
            if (SharedConfig.adaptableColorInBrowser) {
                h4 h4Var = this.K;
                d = i0.a.d(1.0f - (h4Var.u0[0].getVisibility() == 0 ? 1.0f - (h4Var.u0[0].getTranslationX() / h4Var.u0[0].getWidth()) : 0.0f), h4Var.u0[0].getActionBarColor(), h4Var.u0[1].getActionBarColor());
            } else {
                d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
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
        t3 t3Var;
        return !this.h && !this.r && this.w > 0.5f && (t3Var = this.c) != null && t3Var.isAttachedToWindow() && AndroidUtilities.lerp(t3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(t3Var.A0.c)) < t3Var.getHeight() && this.I < 1.0f;
    }

    public final int j() {
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sk, false);
        }
        h4 h4Var = this.K;
        return i0.a.d(1.0f - (h4Var.u0[0].getVisibility() != 0 ? 0.0f : 1.0f - (h4Var.u0[0].getTranslationX() / h4Var.u0[0].getWidth())), h4Var.u0[0].getBackgroundColor(), h4Var.u0[1].getBackgroundColor());
    }

    public final int k() {
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        return org.telegram.messenger.q.B(20.0f, l(), dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight()));
    }

    public final int l() {
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

    public final void m() {
        h4 h4Var = this.K;
        h4Var.u0[0].setLastVisible(this.J);
        h4Var.u0[1].setLastVisible(false);
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
        h4 h4Var = this.K;
        if (h4Var.o0) {
            AndroidUtilities.hideKeyboard(this.c);
            return true;
        }
        k0 k0Var = h4Var.h0;
        if (k0Var.T) {
            k0Var.h(false);
            return true;
        }
        if (k0Var.W) {
            k0Var.k(false);
            return true;
        }
        if (h4Var.J()) {
            l3 l3Var = h4Var.u0[0];
            if (l3Var.s) {
                if (l3Var.f() && l3Var.getWebView() != null) {
                    l3Var.getWebView().goBack();
                }
                return true;
            }
        }
        if (h4Var.d0.size() > 1) {
            h4Var.G();
            return true;
        }
        dismiss(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u3
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
        if (l3Var2 != null && !l3Var2.E) {
            if (l3Var2.getWebView() != null) {
                l3Var2.getWebView().onPause();
            }
            l3Var2.E = true;
        }
        l3 l3Var3 = h4Var.u0[1];
        if (l3Var3 != null && !l3Var3.E) {
            if (l3Var3.getWebView() != null) {
                l3Var3.getWebView().onPause();
            }
            l3Var3.E = true;
        }
        org.telegram.ui.ActionBar.i3 i3Var2 = this.e;
        if (i3Var2 != null) {
            i3Var2.c();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.b;
        if (n2Var != null) {
            n2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.c);
            }
        }
        ai.e5 e5Var = this.v;
        if (e5Var != null) {
            e5Var.run();
            this.v = null;
        }
        h4.b1.remove(h4Var);
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        h4 h4Var = this.K;
        h4Var.u0[0].setLastVisible(z10);
        h4Var.u0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (ai.e5) runnable;
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
            LaunchActivity.G1.y0.b(this);
        } else {
            e(true, new mu0(this, 10));
        }
        i();
        h();
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final org.telegram.ui.ActionBar.v3 getWindowView() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
