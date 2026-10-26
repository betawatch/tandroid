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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v3 implements org.telegram.ui.ActionBar.n2, org.telegram.ui.ActionBar.y3 {
    public ValueAnimator E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public final /* synthetic */ j4 K;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.r2 b;
    public final u3 c;
    public View d;
    public org.telegram.ui.ActionBar.o3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public di.s3 v;
    public float w;
    public float x;
    public ValueAnimator y;

    public v3(j4 j4Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.K = j4Var;
        this.b = r2Var;
        r2Var.getResourceProvider();
        u3 u3Var = new u3(this, r2Var.getContext());
        this.c = u3Var;
        new fi.z3(u3Var, true, new t3(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.y3
    public final org.telegram.ui.ActionBar.r3 a() {
        org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3();
        j4 j4Var = this.K;
        r3Var.E = j4Var.h0.getTitle();
        r3Var.J = j4Var;
        m3 m3Var = j4Var.u0[0];
        Bitmap bitmap = null;
        r3Var.q = (m3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false) : m3Var.getActionBarColor();
        m3 m3Var2 = j4Var.u0[0];
        r3Var.r = (m3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false) : m3Var2.getBackgroundColor();
        r3Var.n = true;
        r3Var.I = !this.F ? 0.0f : j4Var.u0[0].getProgress();
        m3 m3Var3 = j4Var.u0[0];
        r3Var.c = m3Var3;
        if (m3Var3 != null && m3Var3.getWebView() != null) {
            bitmap = j4Var.u0[0].getWebView().getFavicon();
        }
        r3Var.F = bitmap;
        m3 m3Var4 = r3Var.c;
        if (m3Var4 != null) {
            r3Var.g = m3Var4.getWidth();
            r3Var.h = r3Var.c.getHeight();
        }
        r3Var.i = l();
        r3Var.D = org.telegram.ui.ActionBar.y6.I.q();
        return r3Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean attachedToParent() {
        return this.c.isAttachedToWindow();
    }

    @Override // org.telegram.ui.ActionBar.y3
    public final boolean b() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.y3
    public final boolean c(org.telegram.ui.ActionBar.o3 o3Var) {
        this.e = o3Var;
        if (o3Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        ofFloat.addUpdateListener(new s3(this, 0));
        return ofFloat;
    }

    @Override // org.telegram.ui.ActionBar.n2, android.content.DialogInterface
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z10, zt0 zt0Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new s3(this, 2));
        this.E.addListener(new ai.l0(this, z10, zt0Var, 5));
        this.E.setInterpolator(org.telegram.ui.Components.ds.h);
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
        ofFloat.addUpdateListener(new s3(this, 1));
        this.y.addListener(new kg.e(this, 5));
        this.y.setInterpolator(org.telegram.ui.Components.ds.h);
        this.y.setDuration(320L);
        this.y.start();
    }

    public final void g(org.telegram.ui.ActionBar.r2 r2Var) {
        un unVar;
        hk hkVar;
        this.r = false;
        this.b = r2Var;
        r2Var.getResourceProvider();
        if ((r2Var instanceof un) && (hkVar = (unVar = (un) r2Var).Y) != null) {
            hkVar.M();
            unVar.Y.k0(true, false, true);
        }
        org.telegram.ui.ActionBar.o3 o3Var = this.e;
        if (o3Var == null) {
            u3 u3Var = this.c;
            AndroidUtilities.removeFromParent(u3Var);
            if (r2Var.getLayoutContainer() != null) {
                r2Var.getLayoutContainer().addView(u3Var);
            }
        } else if (!o3Var.e) {
            o3Var.e = true;
            try {
                o3Var.show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        j4 j4Var = this.K;
        m3 m3Var = j4Var.u0[0];
        if (m3Var != null && m3Var.F) {
            if (m3Var.getWebView() != null) {
                m3Var.getWebView().onResume();
            }
            m3Var.F = false;
        }
        m3 m3Var2 = j4Var.u0[1];
        if (m3Var2 != null && m3Var2.F) {
            if (m3Var2.getWebView() != null) {
                m3Var2.getWebView().onResume();
            }
            m3Var2.F = false;
        }
        j4.c1.add(j4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.n2
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
        m3 m3Var = j4Var.u0[0];
        TLRPC.WebPage webPage = m3Var.c.E;
        frameLayout = m3Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final int getNavigationBarColor(int i10) {
        float min = this.n ? 0.0f : Math.min(this.w, 1.0f - this.x) * (1.0f - this.I);
        int j10 = j();
        l0 l0Var = this.K.h0;
        if (l0Var != null) {
            j10 = i0.a.f(l0Var.a0, j10, l0Var.x);
        }
        return i0.a.f(min, i10, j10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View getWindowView() {
        return this.c;
    }

    public final void h() {
        if (this.s != isFullyVisible()) {
            this.s = isFullyVisible();
            org.telegram.ui.ActionBar.r2 r2Var = this.b;
            if (r2Var == null || !(r2Var.getParentLayout() instanceof ActionBarLayout)) {
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
        org.telegram.ui.ActionBar.o3 o3Var = this.e;
        u3 u3Var = this.c;
        AndroidUtilities.setLightStatusBar(o3Var != null ? o3Var.b : u3Var, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.o3 o3Var2 = this.e;
        if (o3Var2 == null) {
            LaunchActivity.I1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(u3Var, AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.a7, false))) >= 0.721f);
            return;
        }
        int navigationBarColor = o3Var2.a.getNavigationBarColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.a7, false));
        o3Var2.d.setColor(navigationBarColor);
        o3Var2.c.invalidate();
        AndroidUtilities.setNavigationBarColor(o3Var2, navigationBarColor);
        AndroidUtilities.setLightNavigationBar(o3Var2, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
        LaunchActivity.I1.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isAttachedLightStatusBar() {
        int f7;
        float min = this.n ? 0.0f : (1.0f - this.I) * Math.min(this.w, 1.0f - this.x);
        if (this.F && min > 0.25f) {
            if (SharedConfig.adaptableColorInBrowser) {
                j4 j4Var = this.K;
                f7 = i0.a.f(1.0f - (j4Var.u0[0].getVisibility() == 0 ? 1.0f - (j4Var.u0[0].getTranslationX() / j4Var.u0[0].getWidth()) : 0.0f), j4Var.u0[0].getActionBarColor(), j4Var.u0[1].getActionBarColor());
            } else {
                f7 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(f7) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isFullyVisible() {
        return this.G && this.x <= 0.0f && this.w >= 1.0f && this.I <= 0.0f && !this.n && !this.h;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isShown() {
        u3 u3Var;
        return !this.h && !this.r && this.w > 0.5f && (u3Var = this.c) != null && u3Var.isAttachedToWindow() && AndroidUtilities.lerp(u3Var.w0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(u3Var.p0.c)) < u3Var.getHeight() && this.I < 1.0f;
    }

    public final int j() {
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sk, false);
        }
        j4 j4Var = this.K;
        return i0.a.f(1.0f - (j4Var.u0[0].getVisibility() != 0 ? 0.0f : 1.0f - (j4Var.u0[0].getTranslationX() / j4Var.u0[0].getWidth())), j4Var.u0[0].getBackgroundColor(), j4Var.u0[1].getBackgroundColor());
    }

    public final int k() {
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        return org.telegram.messenger.t.B(20.0f, l(), dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight()));
    }

    public final int l() {
        j4 j4Var = this.K;
        int i10 = 0;
        m3 m3Var = j4Var.u0[0];
        float translationX = (m3Var == null || m3Var.getVisibility() != 0) ? 0.0f : 1.0f - (j4Var.u0[0].getTranslationX() / j4Var.u0[0].getWidth());
        float f7 = 1.0f - translationX;
        m3 m3Var2 = j4Var.u0[0];
        if (m3Var2 != null && m3Var2.getVisibility() == 0) {
            i10 = (int) (j4Var.u0[0].getAlpha() * j4Var.u0[0].getListTop() * translationX);
        }
        m3 m3Var3 = j4Var.u0[1];
        if (m3Var3 == null || m3Var3.getVisibility() != 0) {
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

    @Override // org.telegram.ui.ActionBar.n2
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
            m3 m3Var = j4Var.u0[0];
            if (m3Var.s) {
                if (m3Var.f() && m3Var.getWebView() != null) {
                    m3Var.getWebView().goBack();
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

    @Override // org.telegram.ui.ActionBar.y3
    public final void release() {
        this.r = true;
        j4 j4Var = this.K;
        m3 m3Var = j4Var.u0[0];
        if (m3Var != null && m3Var.h) {
            j3 j3Var = m3Var.e;
            j3Var.setSwipeOffsetY((-j3Var.f) + j3Var.e);
            j4Var.u0[0].h = false;
        }
        m3 m3Var2 = j4Var.u0[0];
        if (m3Var2 != null && !m3Var2.F) {
            if (m3Var2.getWebView() != null) {
                m3Var2.getWebView().onPause();
            }
            m3Var2.F = true;
        }
        m3 m3Var3 = j4Var.u0[1];
        if (m3Var3 != null && !m3Var3.F) {
            if (m3Var3.getWebView() != null) {
                m3Var3.getWebView().onPause();
            }
            m3Var3.F = true;
        }
        org.telegram.ui.ActionBar.o3 o3Var = this.e;
        if (o3Var != null) {
            o3Var.c();
        }
        org.telegram.ui.ActionBar.r2 r2Var = this.b;
        if (r2Var != null) {
            r2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.c);
            }
        }
        di.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.run();
            this.v = null;
        }
        j4.c1.remove(j4Var);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setLastVisible(boolean z10) {
        this.J = z10;
        j4 j4Var = this.K;
        j4Var.u0[0].setLastVisible(z10);
        j4Var.u0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (di.s3) runnable;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean showDialog(Dialog dialog) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void dismiss(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z10;
        if (z10) {
            LaunchActivity.I1.y0.b(this);
        } else {
            e(true, new zt0(this, 10));
        }
        i();
        h();
    }

    @Override // org.telegram.ui.ActionBar.y3
    public final org.telegram.ui.ActionBar.z3 getWindowView() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
