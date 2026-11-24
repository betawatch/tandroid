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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sw implements zf0, vx0 {
    public ValueAnimator E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public boolean K;
    public final /* synthetic */ o L;
    public final on a = new on(null);
    public d b;
    public final rw c;
    public View d;
    public lx0 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public g28 w;
    public float x;
    public float y;

    public sw(o oVar, d dVar) {
        this.L = oVar;
        this.b = dVar;
        dVar.getResourceProvider();
        rw rwVar = new rw(this, dVar.getContext());
        this.c = rwVar;
        new mv5(rwVar, true, new be2(this, (byte) 4));
    }

    public final void A() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.x, this.n ? 0.0f : this.y) * w());
        this.c.invalidate();
    }

    @Override // zf0
    public final void a(boolean z) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z;
        if (z) {
            LaunchActivity.H1.x0.b(this);
        } else {
            m(true, new b1(this, (byte) 24));
        }
        s();
        r();
    }

    @Override // zf0
    public final void b(boolean z) {
        this.K = z;
        o oVar = this.L;
        oVar.v0[0].setLastVisible(z);
        oVar.v0[1].setLastVisible(false);
    }

    @Override // vx0
    public final px0 c() {
        px0 px0Var = new px0();
        o oVar = this.L;
        px0Var.E = oVar.i0.getTitle();
        px0Var.J = oVar;
        m mVar = oVar.v0[0];
        Bitmap bitmap = null;
        px0Var.q = (mVar == null || !gba.s0) ? bkb.w0(null, bkb.Fl, false) : mVar.getActionBarColor();
        m mVar2 = oVar.v0[0];
        px0Var.r = (mVar2 == null || !gba.s0) ? bkb.w0(null, bkb.Fl, false) : mVar2.getBackgroundColor();
        px0Var.n = true;
        px0Var.I = !this.G ? 0.0f : oVar.v0[0].getProgress();
        m mVar3 = oVar.v0[0];
        px0Var.c = mVar3;
        if (mVar3 != null && mVar3.getWebView() != null) {
            bitmap = oVar.v0[0].getWebView().getFavicon();
        }
        px0Var.F = bitmap;
        m mVar4 = px0Var.c;
        if (mVar4 != null) {
            px0Var.g = mVar4.getWidth();
            px0Var.h = px0Var.c.getHeight();
        }
        px0Var.i = x();
        px0Var.D = bkb.I.o();
        return px0Var;
    }

    @Override // vx0
    public final wx0 d() {
        return this.c;
    }

    @Override // zf0, android.content.DialogInterface
    public final void dismiss() {
        a(true);
    }

    @Override // zf0
    public final int e(int i) {
        float min = this.n ? 0.0f : Math.min(this.x, 1.0f - this.y) * (1.0f - this.J);
        int v = v();
        wt wtVar = this.L.i0;
        if (wtVar != null) {
            v = bm2.f(wtVar.b0, v, wtVar.y);
        }
        return bm2.f(min, i, v);
    }

    @Override // zf0
    public final boolean f() {
        int f;
        float min = this.n ? 0.0f : (1.0f - this.J) * Math.min(this.x, 1.0f - this.y);
        if (this.G && min > 0.25f) {
            if (gba.s0) {
                o oVar = this.L;
                f = bm2.f(1.0f - (oVar.v0[0].getVisibility() == 0 ? 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth()) : 0.0f), oVar.v0[0].getActionBarColor(), oVar.v0[1].getActionBarColor());
            } else {
                f = bkb.w0(null, bkb.Fl, false);
            }
            if (gl.B(f) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // zf0
    public final boolean h() {
        return this.H && this.y <= 0.0f && this.x >= 1.0f && this.J <= 0.0f && !this.n && !this.h;
    }

    @Override // vx0
    public final boolean i() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // zf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u21 j() {
        FrameLayout frameLayout;
        o oVar = this.L;
        boolean e = oVar.v0[0].e();
        m[] mVarArr = oVar.v0;
        if (e) {
            if (mVarArr[0].getWebView() != null) {
                frameLayout = oVar.v0[0].f;
                return new u21(frameLayout, null);
            }
            return null;
        }
        m mVar = mVarArr[0];
        TLRPC.WebPage webPage = mVar.c.F;
        frameLayout = mVar;
    }

    @Override // vx0
    public final boolean k(lx0 lx0Var) {
        this.e = lx0Var;
        if (lx0Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator l(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
        ofFloat.addUpdateListener(new pw(this, (byte) 0));
        return ofFloat;
    }

    public final void m(boolean z, b1 b1Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z ? 1.0f : 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new pw(this, (byte) 2));
        this.F.addListener(new qw((Object) this, z, (Object) b1Var, (byte) 0));
        this.F.setInterpolator(s33.h);
        this.F.setDuration(250L);
        this.F.start();
    }

    @Override // zf0
    public final void n(Runnable runnable) {
        this.w = (g28) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new pw(this, (byte) 1));
        this.E.addListener(new g0(this, (byte) 13));
        this.E.setInterpolator(s33.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void p(d dVar) {
        mu1 mu1Var;
        ar1 ar1Var;
        this.r = false;
        this.b = dVar;
        dVar.getResourceProvider();
        if ((dVar instanceof mu1) && (ar1Var = (mu1Var = (mu1) dVar).a0) != null) {
            ar1Var.S();
            mu1Var.a0.K0(true, false, true);
        }
        lx0 lx0Var = this.e;
        if (lx0Var == null) {
            rw rwVar = this.c;
            gl.B2(rwVar);
            if (dVar.getLayoutContainer() != null) {
                dVar.getLayoutContainer().addView(rwVar);
            }
        } else if (!lx0Var.e) {
            lx0Var.e = true;
            try {
                lx0Var.show();
            } catch (Exception e) {
                fa4.g(e, true);
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

    @Override // zf0
    public final void q() {
        o oVar = this.L;
        if (oVar.p0) {
            gl.t1(this.c);
            return;
        }
        wt wtVar = oVar.i0;
        if (wtVar.U) {
            wtVar.h(false);
            return;
        }
        if (wtVar.a0) {
            wtVar.k(false);
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

    public final void r() {
        if (this.s != h()) {
            this.s = h();
            if (!(this.b.getParentLayout() instanceof ActionBarLayout)) {
                rw rwVar = this.c;
                if (rwVar.getParent() instanceof View) {
                    ((View) rwVar.getParent()).invalidate();
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

    @Override // vx0
    public final void release() {
        this.r = true;
        o oVar = this.L;
        m[] mVarArr = oVar.v0;
        m mVar = mVarArr[0];
        if (mVar != null && mVar.h) {
            iw iwVar = mVar.e;
            iwVar.setSwipeOffsetY((-iwVar.f) + iwVar.e);
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
        lx0 lx0Var = this.e;
        if (lx0Var != null) {
            lx0Var.b();
        }
        this.b.removeSheet(this);
        if (this.e == null) {
            gl.B2(this.c);
        }
        g28 g28Var = this.w;
        if (g28Var != null) {
            g28Var.run();
            this.w = null;
        }
        o.d1.remove(oVar);
    }

    public final void s() {
        lx0 lx0Var = this.e;
        rw rwVar = this.c;
        gl.n3(lx0Var != null ? lx0Var.b : rwVar, f());
        lx0 lx0Var2 = this.e;
        if (lx0Var2 == null) {
            LaunchActivity.H1.H(true, true, true);
            gl.k3(rwVar, gl.B(e(bkb.w0(null, bkb.Z6, false))) >= 0.721f);
            return;
        }
        int e = lx0Var2.a.e(bkb.w0(null, bkb.Z6, false));
        lx0Var2.d.setColor(e);
        lx0Var2.c.invalidate();
        gl.p3(lx0Var2, e, true, null);
        gl.j3(lx0Var2, gl.B(e) >= 0.721f);
        LaunchActivity.H1.H(true, true, true);
    }

    @Override // zf0
    public final boolean t() {
        rw rwVar;
        if (!this.h && !this.r && this.x > 0.5f && (rwVar = this.c) != null && rwVar.isAttachedToWindow()) {
            if (gl.U1(Utilities.l(rwVar.q0.c), rwVar.x0.x() - gl.L(20.0f), 0) < rwVar.getHeight() && this.J < 1.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // zf0
    public final boolean u(Dialog dialog) {
        return false;
    }

    public final int v() {
        if (!gba.s0) {
            return bkb.w0(null, bkb.Il, false);
        }
        o oVar = this.L;
        return bm2.f(1.0f - (oVar.v0[0].getVisibility() != 0 ? 0.0f : 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth())), oVar.v0[0].getBackgroundColor(), oVar.v0[1].getBackgroundColor());
    }

    public final int w() {
        int L = gl.L(16.0f);
        View view = this.d;
        return de9.f(20.0f, x(), L + (view == null ? gl.q.y : view.getHeight()));
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

    @Override // zf0
    public final boolean z() {
        return this.c.isAttachedToWindow();
    }

    @Override // zf0
    public final View d() {
        return this.c;
    }

    @Override // zf0
    public final void g(int i) {
    }
}
