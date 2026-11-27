// default package

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tw implements ag0, dy0 {
    public ValueAnimator E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public boolean K;
    public final /* synthetic */ o L;
    public final pn a = new pn(null);
    public e b;
    public final sw c;
    public View d;
    public tx0 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public x58 w;
    public float x;
    public float y;

    public tw(o oVar, e eVar) {
        this.L = oVar;
        this.b = eVar;
        eVar.getResourceProvider();
        sw swVar = new sw(this, eVar.getContext());
        this.c = swVar;
        new rx5(swVar, true, new te2(this, (byte) 4));
    }

    public final void A() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.x, this.n ? 0.0f : this.y) * w());
        this.c.invalidate();
    }

    @Override // ag0
    public final void a(boolean z) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z;
        if (z) {
            LaunchActivity.H1.x0.b(this);
        } else {
            m(true, new c1(this, (byte) 24));
        }
        t();
        r();
    }

    @Override // ag0
    public final void b(boolean z) {
        this.K = z;
        o oVar = this.L;
        oVar.v0[0].setLastVisible(z);
        oVar.v0[1].setLastVisible(false);
    }

    @Override // dy0
    public final xx0 c() {
        xx0 xx0Var = new xx0();
        o oVar = this.L;
        xx0Var.E = oVar.i0.getTitle();
        xx0Var.J = oVar;
        m mVar = oVar.v0[0];
        Bitmap bitmap = null;
        xx0Var.q = (mVar == null || !xea.s0) ? aob.w0(null, aob.Gl, false) : mVar.getActionBarColor();
        m mVar2 = oVar.v0[0];
        xx0Var.r = (mVar2 == null || !xea.s0) ? aob.w0(null, aob.Gl, false) : mVar2.getBackgroundColor();
        xx0Var.n = true;
        xx0Var.I = !this.G ? 0.0f : oVar.v0[0].getProgress();
        m mVar3 = oVar.v0[0];
        xx0Var.c = mVar3;
        if (mVar3 != null && mVar3.getWebView() != null) {
            bitmap = oVar.v0[0].getWebView().getFavicon();
        }
        xx0Var.F = bitmap;
        m mVar4 = xx0Var.c;
        if (mVar4 != null) {
            xx0Var.g = mVar4.getWidth();
            xx0Var.h = xx0Var.c.getHeight();
        }
        xx0Var.i = x();
        xx0Var.D = aob.I.o();
        return xx0Var;
    }

    @Override // dy0
    public final ey0 d() {
        return this.c;
    }

    @Override // ag0, android.content.DialogInterface
    public final void dismiss() {
        a(true);
    }

    @Override // ag0
    public final int e(int i) {
        float min = this.n ? 0.0f : Math.min(this.x, 1.0f - this.y) * (1.0f - this.J);
        int v = v();
        xt xtVar = this.L.i0;
        if (xtVar != null) {
            v = vm2.f(xtVar.b0, v, xtVar.y);
        }
        return vm2.f(min, i, v);
    }

    @Override // ag0
    public final boolean f() {
        int f;
        float min = this.n ? 0.0f : (1.0f - this.J) * Math.min(this.x, 1.0f - this.y);
        if (this.G && min > 0.25f) {
            if (xea.s0) {
                o oVar = this.L;
                f = vm2.f(1.0f - (oVar.v0[0].getVisibility() == 0 ? 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth()) : 0.0f), oVar.v0[0].getActionBarColor(), oVar.v0[1].getActionBarColor());
            } else {
                f = aob.w0(null, aob.Gl, false);
            }
            if (hl.B(f) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // ag0
    public final boolean h() {
        return this.H && this.y <= 0.0f && this.x >= 1.0f && this.J <= 0.0f && !this.n && !this.h;
    }

    @Override // dy0
    public final boolean i() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // ag0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d31 j() {
        FrameLayout frameLayout;
        o oVar = this.L;
        boolean e = oVar.v0[0].e();
        m[] mVarArr = oVar.v0;
        if (e) {
            if (mVarArr[0].getWebView() != null) {
                frameLayout = oVar.v0[0].f;
                return new d31(frameLayout, null);
            }
            return null;
        }
        m mVar = mVarArr[0];
        TLRPC.WebPage webPage = mVar.c.F;
        frameLayout = mVar;
    }

    @Override // dy0
    public final boolean k(tx0 tx0Var) {
        this.e = tx0Var;
        if (tx0Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator l(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
        ofFloat.addUpdateListener(new qw(this, (byte) 0));
        return ofFloat;
    }

    public final void m(boolean z, c1 c1Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z ? 1.0f : 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new qw(this, (byte) 2));
        this.F.addListener(new rw((Object) this, z, (Object) c1Var, (byte) 0));
        this.F.setInterpolator(k43.h);
        this.F.setDuration(250L);
        this.F.start();
    }

    @Override // ag0
    public final void n(Runnable runnable) {
        this.w = (x58) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new qw(this, (byte) 1));
        this.E.addListener(new h0(this, (byte) 13));
        this.E.setInterpolator(k43.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    @Override // ag0
    public final void p() {
        o oVar = this.L;
        if (oVar.p0) {
            hl.t1(this.c);
            return;
        }
        xt xtVar = oVar.i0;
        if (xtVar.U) {
            xtVar.h(false);
            return;
        }
        if (xtVar.a0) {
            xtVar.k(false);
            return;
        }
        if (oVar.G()) {
            m mVar = oVar.v0[0];
            if (mVar.s) {
                if (!mVar.e() || mVar.getWebView() == null) {
                    return;
                }
                mVar.getWebView().goBack();
                return;
            }
        }
        if (oVar.e0.size() > 1) {
            oVar.D();
        } else {
            a(false);
        }
    }

    public final void q(e eVar) {
        zu1 zu1Var;
        nr1 nr1Var;
        this.r = false;
        this.b = eVar;
        eVar.getResourceProvider();
        if ((eVar instanceof zu1) && (nr1Var = (zu1Var = (zu1) eVar).a0) != null) {
            nr1Var.U();
            zu1Var.a0.O0(true, false, true);
        }
        tx0 tx0Var = this.e;
        if (tx0Var == null) {
            sw swVar = this.c;
            hl.B2(swVar);
            if (eVar.getLayoutContainer() != null) {
                eVar.getLayoutContainer().addView(swVar);
            }
        } else if (!tx0Var.e) {
            tx0Var.e = true;
            try {
                tx0Var.show();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        o oVar = this.L;
        m mVar = oVar.v0[0];
        if (mVar != null && mVar.G) {
            if (mVar.getWebView() != null) {
                mVar.getWebView().onResume();
            }
            mVar.G = false;
        }
        m mVar2 = oVar.v0[1];
        if (mVar2 != null && mVar2.G) {
            if (mVar2.getWebView() != null) {
                mVar2.getWebView().onResume();
            }
            mVar2.G = false;
        }
        o.d1.add(oVar);
    }

    public final void r() {
        if (this.s != h()) {
            this.s = h();
            if (!(this.b.getParentLayout() instanceof ActionBarLayout)) {
                sw swVar = this.c;
                if (swVar.getParent() instanceof View) {
                    ((View) swVar.getParent()).invalidate();
                    return;
                }
                return;
            }
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.b.getParentLayout();
            b bVar = actionBarLayout.s;
            if (bVar != null) {
                bVar.invalidate();
            }
            b bVar2 = actionBarLayout.x;
            if (bVar2 != null) {
                bVar2.invalidate();
            }
        }
    }

    @Override // dy0
    public final void release() {
        this.r = true;
        o oVar = this.L;
        m[] mVarArr = oVar.v0;
        m mVar = mVarArr[0];
        if (mVar != null && mVar.h) {
            jw jwVar = mVar.e;
            jwVar.setSwipeOffsetY((-jwVar.f) + jwVar.e);
            mVarArr = oVar.v0;
            mVarArr[0].h = false;
        }
        m mVar2 = mVarArr[0];
        if (mVar2 != null && !mVar2.G) {
            if (mVar2.getWebView() != null) {
                mVar2.getWebView().onPause();
            }
            mVar2.G = true;
        }
        m mVar3 = oVar.v0[1];
        if (mVar3 != null && !mVar3.G) {
            if (mVar3.getWebView() != null) {
                mVar3.getWebView().onPause();
            }
            mVar3.G = true;
        }
        tx0 tx0Var = this.e;
        if (tx0Var != null) {
            tx0Var.b();
        }
        this.b.removeSheet(this);
        if (this.e == null) {
            hl.B2(this.c);
        }
        x58 x58Var = this.w;
        if (x58Var != null) {
            x58Var.run();
            this.w = null;
        }
        o.d1.remove(oVar);
    }

    @Override // ag0
    public final boolean s() {
        sw swVar;
        if (!this.h && !this.r && this.x > 0.5f && (swVar = this.c) != null && swVar.isAttachedToWindow()) {
            if (hl.U1(Utilities.l(swVar.k0.c), swVar.r0.x() - hl.L(20.0f), 0) < swVar.getHeight() && this.J < 1.0f) {
                return true;
            }
        }
        return false;
    }

    public final void t() {
        tx0 tx0Var = this.e;
        sw swVar = this.c;
        hl.m3(tx0Var != null ? tx0Var.b : swVar, f());
        tx0 tx0Var2 = this.e;
        if (tx0Var2 == null) {
            LaunchActivity.H1.H(true, true, true);
            hl.j3(swVar, hl.B(e(aob.w0(null, aob.a7, false))) >= 0.721f);
            return;
        }
        int e = tx0Var2.a.e(aob.w0(null, aob.a7, false));
        tx0Var2.d.setColor(e);
        tx0Var2.c.invalidate();
        hl.o3(tx0Var2, e, true, null);
        hl.i3(tx0Var2, hl.B(e) >= 0.721f);
        LaunchActivity.H1.H(true, true, true);
    }

    @Override // ag0
    public final boolean u(Dialog dialog) {
        return false;
    }

    public final int v() {
        if (!xea.s0) {
            return aob.w0(null, aob.Jl, false);
        }
        o oVar = this.L;
        return vm2.f(1.0f - (oVar.v0[0].getVisibility() != 0 ? 0.0f : 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth())), oVar.v0[0].getBackgroundColor(), oVar.v0[1].getBackgroundColor());
    }

    public final int w() {
        int L = hl.L(16.0f);
        View view = this.d;
        return uh9.f(20.0f, x(), L + (view == null ? hl.q.y : view.getHeight()));
    }

    public final int x() {
        o oVar = this.L;
        int i = 0;
        m mVar = oVar.v0[0];
        float translationX = (mVar == null || mVar.getVisibility() != 0) ? 0.0f : 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth());
        float f = 1.0f - translationX;
        m mVar2 = oVar.v0[0];
        if (mVar2 != null && mVar2.getVisibility() == 0) {
            i = (int) (oVar.v0[0].getAlpha() * oVar.v0[0].getListTop() * translationX);
        }
        m mVar3 = oVar.v0[1];
        if (mVar3 == null || mVar3.getVisibility() != 0) {
            return i;
        }
        return i + ((int) (oVar.v0[1].getAlpha() * oVar.v0[1].getListTop() * f));
    }

    public final void y() {
        o oVar = this.L;
        oVar.v0[0].setLastVisible(this.K);
        oVar.v0[1].setLastVisible(false);
    }

    @Override // ag0
    public final boolean z() {
        return this.c.isAttachedToWindow();
    }

    @Override // ag0
    public final View d() {
        return this.c;
    }

    @Override // ag0
    public final void g(int i) {
    }
}
