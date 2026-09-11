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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class v3 implements org.telegram.ui.ActionBar.j2, org.telegram.ui.ActionBar.u3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final /* synthetic */ i4 K;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.n2 b;
    public final u3 c;
    public View d;
    public org.telegram.ui.ActionBar.i3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public bi.p4 v;
    public float w;
    public float x;
    public ValueAnimator y;

    public v3(i4 i4Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.K = i4Var;
        this.b = n2Var;
        n2Var.getResourceProvider();
        u3 u3Var = new u3(this, n2Var.getContext());
        this.c = u3Var;
        new di.j4(u3Var, true, new t3(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final org.telegram.ui.ActionBar.n3 a() {
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3();
        i4 i4Var = this.K;
        n3Var.E = i4Var.h0.getTitle();
        n3Var.J = i4Var;
        m3 m3Var = i4Var.u0[0];
        Bitmap bitmap = null;
        n3Var.q = (m3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : m3Var.getActionBarColor();
        m3 m3Var2 = i4Var.u0[0];
        n3Var.r = (m3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : m3Var2.getBackgroundColor();
        n3Var.n = true;
        n3Var.I = !this.F ? 0.0f : i4Var.u0[0].getProgress();
        m3 m3Var3 = i4Var.u0[0];
        n3Var.c = m3Var3;
        if (m3Var3 != null && m3Var3.getWebView() != null) {
            bitmap = i4Var.u0[0].getWebView().getFavicon();
        }
        n3Var.F = bitmap;
        m3 m3Var4 = n3Var.c;
        if (m3Var4 != null) {
            n3Var.g = m3Var4.getWidth();
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
        ofFloat.addUpdateListener(new s3(this, 0));
        return ofFloat;
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, lu0 lu0Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new s3(this, 2));
        this.E.addListener(new ah.r0(this, z10, lu0Var, 3));
        this.E.setInterpolator(org.telegram.ui.Components.pr.h);
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
        ofFloat.addUpdateListener(new s3(this, i10));
        this.y.addListener(new s0(this, i10));
        this.y.setInterpolator(org.telegram.ui.Components.pr.h);
        this.y.setDuration(320L);
        this.y.start();
    }

    public final void g(org.telegram.ui.ActionBar.n2 n2Var) {
        co coVar;
        mk mkVar;
        this.r = false;
        this.b = n2Var;
        n2Var.getResourceProvider();
        if ((n2Var instanceof co) && (mkVar = (coVar = (co) n2Var).Y) != null) {
            mkVar.P();
            coVar.Y.n0(true, false, true);
        }
        org.telegram.ui.ActionBar.i3 i3Var = this.e;
        if (i3Var == null) {
            u3 u3Var = this.c;
            AndroidUtilities.removeFromParent(u3Var);
            if (n2Var.getLayoutContainer() != null) {
                n2Var.getLayoutContainer().addView(u3Var);
            }
        } else if (!i3Var.e) {
            i3Var.e = true;
            try {
                i3Var.show();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        i4 i4Var = this.K;
        m3 m3Var = i4Var.u0[0];
        if (m3Var != null && m3Var.E) {
            if (m3Var.getWebView() != null) {
                m3Var.getWebView().onResume();
            }
            m3Var.E = false;
        }
        m3 m3Var2 = i4Var.u0[1];
        if (m3Var2 != null && m3Var2.E) {
            if (m3Var2.getWebView() != null) {
                m3Var2.getWebView().onResume();
            }
            m3Var2.E = false;
        }
        i4.b1.add(i4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.j2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.yc getBulletinFactory() {
        FrameLayout frameLayout;
        i4 i4Var = this.K;
        if (i4Var.u0[0].f()) {
            if (i4Var.u0[0].getWebView() != null) {
                frameLayout = i4Var.u0[0].f;
                return new org.telegram.ui.Components.yc(frameLayout, null);
            }
            return null;
        }
        m3 m3Var = i4Var.u0[0];
        TLRPC.WebPage webPage = m3Var.c.E;
        frameLayout = m3Var;
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
                u3 u3Var = this.c;
                if (u3Var.getParent() instanceof View) {
                    ((View) u3Var.getParent()).invalidate();
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
        u3 u3Var = this.c;
        AndroidUtilities.setLightStatusBar(i3Var != null ? i3Var.b : u3Var, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.i3 i3Var2 = this.e;
        if (i3Var2 == null) {
            LaunchActivity.G1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(u3Var, AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false))) >= 0.721f);
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
                i4 i4Var = this.K;
                d = i0.a.d(1.0f - (i4Var.u0[0].getVisibility() == 0 ? 1.0f - (i4Var.u0[0].getTranslationX() / i4Var.u0[0].getWidth()) : 0.0f), i4Var.u0[0].getActionBarColor(), i4Var.u0[1].getActionBarColor());
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
        u3 u3Var;
        return !this.h && !this.r && this.w > 0.5f && (u3Var = this.c) != null && u3Var.isAttachedToWindow() && AndroidUtilities.lerp(u3Var.H0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(u3Var.A0.c)) < u3Var.getHeight() && this.I < 1.0f;
    }

    public final int j() {
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sk, false);
        }
        i4 i4Var = this.K;
        return i0.a.d(1.0f - (i4Var.u0[0].getVisibility() != 0 ? 0.0f : 1.0f - (i4Var.u0[0].getTranslationX() / i4Var.u0[0].getWidth())), i4Var.u0[0].getBackgroundColor(), i4Var.u0[1].getBackgroundColor());
    }

    public final int k() {
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        return org.telegram.messenger.w1.z(20.0f, l(), dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight()));
    }

    public final int l() {
        i4 i4Var = this.K;
        int i10 = 0;
        m3 m3Var = i4Var.u0[0];
        float translationX = (m3Var == null || m3Var.getVisibility() != 0) ? 0.0f : 1.0f - (i4Var.u0[0].getTranslationX() / i4Var.u0[0].getWidth());
        float f7 = 1.0f - translationX;
        m3 m3Var2 = i4Var.u0[0];
        if (m3Var2 != null && m3Var2.getVisibility() == 0) {
            i10 = (int) (i4Var.u0[0].getAlpha() * i4Var.u0[0].getListTop() * translationX);
        }
        m3 m3Var3 = i4Var.u0[1];
        if (m3Var3 == null || m3Var3.getVisibility() != 0) {
            return i10;
        }
        return i10 + ((int) (i4Var.u0[1].getAlpha() * i4Var.u0[1].getListTop() * f7));
    }

    public final void m() {
        i4 i4Var = this.K;
        i4Var.u0[0].setLastVisible(this.J);
        i4Var.u0[1].setLastVisible(false);
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
        i4 i4Var = this.K;
        if (i4Var.o0) {
            AndroidUtilities.hideKeyboard(this.c);
            return true;
        }
        k0 k0Var = i4Var.h0;
        if (k0Var.T) {
            k0Var.h(false);
            return true;
        }
        if (k0Var.W) {
            k0Var.k(false);
            return true;
        }
        if (i4Var.J()) {
            m3 m3Var = i4Var.u0[0];
            if (m3Var.s) {
                if (m3Var.f() && m3Var.getWebView() != null) {
                    m3Var.getWebView().goBack();
                }
                return true;
            }
        }
        if (i4Var.d0.size() > 1) {
            i4Var.G();
            return true;
        }
        dismiss(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u3
    public final void release() {
        this.r = true;
        i4 i4Var = this.K;
        m3 m3Var = i4Var.u0[0];
        if (m3Var != null && m3Var.h) {
            j3 j3Var = m3Var.e;
            j3Var.setSwipeOffsetY((-j3Var.f) + j3Var.e);
            i4Var.u0[0].h = false;
        }
        m3 m3Var2 = i4Var.u0[0];
        if (m3Var2 != null && !m3Var2.E) {
            if (m3Var2.getWebView() != null) {
                m3Var2.getWebView().onPause();
            }
            m3Var2.E = true;
        }
        m3 m3Var3 = i4Var.u0[1];
        if (m3Var3 != null && !m3Var3.E) {
            if (m3Var3.getWebView() != null) {
                m3Var3.getWebView().onPause();
            }
            m3Var3.E = true;
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
        bi.p4 p4Var = this.v;
        if (p4Var != null) {
            p4Var.run();
            this.v = null;
        }
        i4.b1.remove(i4Var);
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        i4 i4Var = this.K;
        i4Var.u0[0].setLastVisible(z10);
        i4Var.u0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.j2
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (bi.p4) runnable;
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
            e(true, new lu0(this, 10));
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
