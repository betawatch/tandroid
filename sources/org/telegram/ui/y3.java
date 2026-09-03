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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y3 implements org.telegram.ui.ActionBar.l2, org.telegram.ui.ActionBar.u3 {
    public ValueAnimator B;
    public boolean C;
    public boolean D;
    public boolean E;
    public float F;
    public boolean G;
    public final /* synthetic */ l4 H;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.p2 b;
    public final x3 c;
    public View d;
    public org.telegram.ui.ActionBar.k3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public oh.l3 v;
    public float w;
    public float x;
    public ValueAnimator y;

    public y3(l4 l4Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.H = l4Var;
        this.b = p2Var;
        p2Var.getResourceProvider();
        x3 x3Var = new x3(this, p2Var.getContext());
        this.c = x3Var;
        new qh.h3(x3Var, true, new w3(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final org.telegram.ui.ActionBar.n3 a() {
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3();
        l4 l4Var = this.H;
        n3Var.C = l4Var.e0.getTitle();
        n3Var.H = l4Var;
        p3 p3Var = l4Var.r0[0];
        Bitmap bitmap = null;
        n3Var.o = (p3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Pk, false) : p3Var.getActionBarColor();
        p3 p3Var2 = l4Var.r0[0];
        n3Var.p = (p3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Pk, false) : p3Var2.getBackgroundColor();
        n3Var.l = true;
        n3Var.G = !this.C ? 0.0f : l4Var.r0[0].getProgress();
        p3 p3Var3 = l4Var.r0[0];
        n3Var.c = p3Var3;
        if (p3Var3 != null && p3Var3.getWebView() != null) {
            bitmap = l4Var.r0[0].getWebView().getFavicon();
        }
        n3Var.D = bitmap;
        p3 p3Var4 = n3Var.c;
        if (p3Var4 != null) {
            n3Var.e = p3Var4.getWidth();
            n3Var.f = n3Var.c.getHeight();
        }
        n3Var.g = l();
        n3Var.B = org.telegram.ui.ActionBar.k6.I.q();
        return n3Var;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean attachedToParent() {
        return this.c.isAttachedToWindow();
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final boolean b() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final boolean c(org.telegram.ui.ActionBar.k3 k3Var) {
        this.e = k3Var;
        if (k3Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f10);
        ofFloat.addUpdateListener(new v3(this, 0));
        return ofFloat;
    }

    @Override // org.telegram.ui.ActionBar.l2, android.content.DialogInterface
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z4, yt0 yt0Var) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z4 ? 1.0f : 0.0f);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 2));
        this.B.addListener(new androidx.fragment.app.g(this, z4, yt0Var, 3));
        this.B.setInterpolator(org.telegram.ui.Components.pr.h);
        this.B.setDuration(250L);
        this.B.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, 1.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 1));
        this.y.addListener(new dg.l0(this, 27));
        this.y.setInterpolator(org.telegram.ui.Components.pr.h);
        this.y.setDuration(320L);
        this.y.start();
    }

    public final void g(org.telegram.ui.ActionBar.p2 p2Var) {
        xn xnVar;
        jk jkVar;
        this.r = false;
        this.b = p2Var;
        p2Var.getResourceProvider();
        if ((p2Var instanceof xn) && (jkVar = (xnVar = (xn) p2Var).V) != null) {
            jkVar.P();
            xnVar.V.n0(true, false, true);
        }
        org.telegram.ui.ActionBar.k3 k3Var = this.e;
        if (k3Var == null) {
            x3 x3Var = this.c;
            AndroidUtilities.removeFromParent(x3Var);
            if (p2Var.getLayoutContainer() != null) {
                p2Var.getLayoutContainer().addView(x3Var);
            }
        } else if (!k3Var.e) {
            k3Var.e = true;
            try {
                k3Var.show();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        l4 l4Var = this.H;
        p3 p3Var = l4Var.r0[0];
        if (p3Var != null && p3Var.B) {
            if (p3Var.getWebView() != null) {
                p3Var.getWebView().onResume();
            }
            p3Var.B = false;
        }
        p3 p3Var2 = l4Var.r0[1];
        if (p3Var2 != null && p3Var2.B) {
            if (p3Var2.getWebView() != null) {
                p3Var2.getWebView().onResume();
            }
            p3Var2.B = false;
        }
        l4.Y0.add(l4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.qc getBulletinFactory() {
        FrameLayout frameLayout;
        l4 l4Var = this.H;
        if (l4Var.r0[0].f()) {
            if (l4Var.r0[0].getWebView() != null) {
                frameLayout = l4Var.r0[0].f;
                return new org.telegram.ui.Components.qc(frameLayout, null);
            }
            return null;
        }
        p3 p3Var = l4Var.r0[0];
        TLRPC.WebPage webPage = p3Var.c.B;
        frameLayout = p3Var;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final int getNavigationBarColor(int i10) {
        float min = this.n ? 0.0f : Math.min(this.w, 1.0f - this.x) * (1.0f - this.F);
        int j10 = j();
        m0 m0Var = this.H.e0;
        if (m0Var != null) {
            j10 = i0.a.d(m0Var.U, j10, m0Var.x);
        }
        return i0.a.d(min, i10, j10);
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
                x3 x3Var = this.c;
                if (x3Var.getParent() instanceof View) {
                    ((View) x3Var.getParent()).invalidate();
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
        x3 x3Var = this.c;
        AndroidUtilities.setLightStatusBar(k3Var != null ? k3Var.b : x3Var, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.k3 k3Var2 = this.e;
        if (k3Var2 == null) {
            LaunchActivity.D1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(x3Var, AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false))) >= 0.721f);
            return;
        }
        int navigationBarColor = k3Var2.a.getNavigationBarColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        k3Var2.d.setColor(navigationBarColor);
        k3Var2.c.invalidate();
        AndroidUtilities.setNavigationBarColor(k3Var2, navigationBarColor);
        AndroidUtilities.setLightNavigationBar(k3Var2, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
        LaunchActivity.D1.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isAttachedLightStatusBar() {
        int d;
        float min = this.n ? 0.0f : (1.0f - this.F) * Math.min(this.w, 1.0f - this.x);
        if (this.C && min > 0.25f) {
            if (SharedConfig.adaptableColorInBrowser) {
                l4 l4Var = this.H;
                d = i0.a.d(1.0f - (l4Var.r0[0].getVisibility() == 0 ? 1.0f - (l4Var.r0[0].getTranslationX() / l4Var.r0[0].getWidth()) : 0.0f), l4Var.r0[0].getActionBarColor(), l4Var.r0[1].getActionBarColor());
            } else {
                d = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Pk, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isFullyVisible() {
        return this.D && this.x <= 0.0f && this.w >= 1.0f && this.F <= 0.0f && !this.n && !this.h;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isShown() {
        x3 x3Var;
        return !this.h && !this.r && this.w > 0.5f && (x3Var = this.c) != null && x3Var.isAttachedToWindow() && AndroidUtilities.lerp(x3Var.E0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(x3Var.x0.c)) < x3Var.getHeight() && this.F < 1.0f;
    }

    public final int j() {
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sk, false);
        }
        l4 l4Var = this.H;
        return i0.a.d(1.0f - (l4Var.r0[0].getVisibility() != 0 ? 0.0f : 1.0f - (l4Var.r0[0].getTranslationX() / l4Var.r0[0].getWidth())), l4Var.r0[0].getBackgroundColor(), l4Var.r0[1].getBackgroundColor());
    }

    public final int k() {
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        return org.telegram.messenger.y3.z(20.0f, l(), dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight()));
    }

    public final int l() {
        l4 l4Var = this.H;
        int i10 = 0;
        p3 p3Var = l4Var.r0[0];
        float translationX = (p3Var == null || p3Var.getVisibility() != 0) ? 0.0f : 1.0f - (l4Var.r0[0].getTranslationX() / l4Var.r0[0].getWidth());
        float f10 = 1.0f - translationX;
        p3 p3Var2 = l4Var.r0[0];
        if (p3Var2 != null && p3Var2.getVisibility() == 0) {
            i10 = (int) (l4Var.r0[0].getAlpha() * l4Var.r0[0].getListTop() * translationX);
        }
        p3 p3Var3 = l4Var.r0[1];
        if (p3Var3 == null || p3Var3.getVisibility() != 0) {
            return i10;
        }
        return i10 + ((int) (l4Var.r0[1].getAlpha() * l4Var.r0[1].getListTop() * f10));
    }

    public final void m() {
        l4 l4Var = this.H;
        l4Var.r0[0].setLastVisible(this.G);
        l4Var.r0[1].setLastVisible(false);
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
        l4 l4Var = this.H;
        if (l4Var.l0) {
            AndroidUtilities.hideKeyboard(this.c);
            return true;
        }
        m0 m0Var = l4Var.e0;
        if (m0Var.Q) {
            m0Var.h(false);
            return true;
        }
        if (m0Var.T) {
            m0Var.k(false);
            return true;
        }
        if (l4Var.J()) {
            p3 p3Var = l4Var.r0[0];
            if (p3Var.s) {
                if (p3Var.f() && p3Var.getWebView() != null) {
                    p3Var.getWebView().goBack();
                }
                return true;
            }
        }
        if (l4Var.a0.size() > 1) {
            l4Var.G();
            return true;
        }
        dismiss(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final void release() {
        this.r = true;
        l4 l4Var = this.H;
        p3 p3Var = l4Var.r0[0];
        if (p3Var != null && p3Var.h) {
            m3 m3Var = p3Var.e;
            m3Var.setSwipeOffsetY((-m3Var.f) + m3Var.e);
            l4Var.r0[0].h = false;
        }
        p3 p3Var2 = l4Var.r0[0];
        if (p3Var2 != null && !p3Var2.B) {
            if (p3Var2.getWebView() != null) {
                p3Var2.getWebView().onPause();
            }
            p3Var2.B = true;
        }
        p3 p3Var3 = l4Var.r0[1];
        if (p3Var3 != null && !p3Var3.B) {
            if (p3Var3.getWebView() != null) {
                p3Var3.getWebView().onPause();
            }
            p3Var3.B = true;
        }
        org.telegram.ui.ActionBar.k3 k3Var = this.e;
        if (k3Var != null) {
            k3Var.c();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.b;
        if (p2Var != null) {
            p2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.c);
            }
        }
        oh.l3 l3Var = this.v;
        if (l3Var != null) {
            l3Var.run();
            this.v = null;
        }
        l4.Y0.remove(l4Var);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setLastVisible(boolean z4) {
        this.G = z4;
        l4 l4Var = this.H;
        l4Var.r0[0].setLastVisible(z4);
        l4Var.r0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (oh.l3) runnable;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean showDialog(Dialog dialog) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void dismiss(boolean z4) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z4;
        if (z4) {
            LaunchActivity.D1.v0.b(this);
        } else {
            e(true, new yt0(this, 10));
        }
        i();
        h();
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final org.telegram.ui.ActionBar.v3 getWindowView() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
