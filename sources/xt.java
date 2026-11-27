// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class xt extends dxc {
    public final /* synthetic */ o C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt(o oVar, Activity activity) {
        super(activity);
        this.C0 = oVar;
    }

    @Override // dxc
    public final pxc getInstantViewLoader() {
        byte b = 0;
        m mVar = this.C0.v0[0];
        if (mVar.e()) {
            nv0 webView = mVar.getWebView();
            pxc pxcVar = mVar.F;
            if (webView != null) {
                if (pxcVar != null && (pxcVar.f != mVar.getWebView().b || mVar.F.e != mVar.getWebView().getProgress())) {
                    mVar.F.d(mVar.getWebView());
                    return mVar.F;
                }
                if (mVar.F != null && TextUtils.equals(mVar.getWebView().getUrl(), mVar.F.d)) {
                    return mVar.F;
                }
                pxc pxcVar2 = mVar.F;
                if (pxcVar2 != null) {
                    pxcVar2.a();
                    pxc pxcVar3 = mVar.F;
                    TLRPC.TL_webPage tL_webPage = pxcVar3.j;
                    if (tL_webPage != null) {
                        rxc.o(tL_webPage);
                        pxcVar3.j = null;
                    }
                    mVar.F = null;
                }
                pxc pxcVar4 = new pxc(mVar.M.Y);
                mVar.F = pxcVar4;
                nv0 webView2 = mVar.getWebView();
                if (!pxcVar4.b) {
                    pxcVar4.b = true;
                    pxcVar4.d = webView2.getUrl();
                    pxcVar4.e = webView2.getProgress();
                    pxcVar4.f = webView2.b;
                    pxcVar4.l = rxc.e(webView2, new oxc(pxcVar4, b));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = pxcVar4.d;
                    tL_messages_getWebPage.hash = 0;
                    pxcVar4.k = ConnectionsManager.getInstance(pxcVar4.a).sendRequest(tL_messages_getWebPage, new yp9(pxcVar4, (byte) 27));
                }
                return mVar.F;
            }
            if (pxcVar != null) {
                pxcVar.a();
                pxc pxcVar5 = mVar.F;
                TLRPC.TL_webPage tL_webPage2 = pxcVar5.j;
                if (tL_webPage2 != null) {
                    rxc.o(tL_webPage2);
                    pxcVar5.j = null;
                }
                mVar.F = null;
            }
        } else {
            pxc pxcVar6 = mVar.F;
            if (pxcVar6 != null) {
                pxcVar6.a();
                pxc pxcVar7 = mVar.F;
                TLRPC.TL_webPage tL_webPage3 = pxcVar7.j;
                if (tL_webPage3 != null) {
                    rxc.o(tL_webPage3);
                    pxcVar7.j = null;
                }
                mVar.F = null;
                return null;
            }
        }
        return null;
    }

    public final void j(float f) {
        int f2 = vm2.f(this.b0, this.x, this.E);
        gd0 gd0Var = this.N;
        gd0Var.a(f2);
        gd0Var.b(vm2.f(this.b0, this.x, this.E));
        this.M.invalidate();
        o oVar = this.C0;
        fb fbVar = oVar.j0;
        if (fbVar != null) {
            fbVar.setOpenProgress(f);
        }
        tw twVar = oVar.L;
        if (twVar != null) {
            twVar.t();
        }
    }

    public final void k(boolean z) {
        if (this.a0 != z) {
            ValueAnimator valueAnimator = this.x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a0 = z;
            byte b = 0;
            xs0 xs0Var = this.c0;
            if (z) {
                int i = this.d0;
                int i2 = xea.m0;
                if (i != i2) {
                    this.d0 = i2;
                    xs0Var.setHint(ob6.a0(null, null, 2131754344, bw9.a().a));
                }
            }
            xs0Var.setVisibility(0);
            this.N.c(true, (this.v0 || z) ? 0.0f : 1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, z ? 1.0f : 0.0f);
            this.x0 = ofFloat;
            ofFloat.addUpdateListener(new pzb(this, (byte) 22));
            this.x0.addListener(new i1a((byte) 18, this, z));
            this.x0.setInterpolator(k43.h);
            this.x0.setDuration(360L);
            this.x0.start();
            hl.r(new ywc(this, b));
            hl.d3(new ywc(this, b), this.a0 ? 100L : 0L);
        }
        fb fbVar = this.C0.j0;
        if (fbVar != null) {
            fbVar.setOpened(z);
        }
    }

    @Override // dxc, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((ViewGroup.MarginLayoutParams) this.C0.j0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
