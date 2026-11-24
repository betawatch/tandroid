// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class wt extends nsc {
    public final /* synthetic */ o C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(o oVar, Activity activity) {
        super(activity);
        this.C0 = oVar;
    }

    @Override // nsc
    public final atc getInstantViewLoader() {
        byte b = 0;
        m mVar = this.C0.v0[0];
        if (mVar.e()) {
            cv0 webView = mVar.getWebView();
            atc atcVar = mVar.F;
            if (webView != null) {
                if (atcVar != null && (atcVar.f != mVar.getWebView().b || mVar.F.e != mVar.getWebView().getProgress())) {
                    mVar.F.d(mVar.getWebView());
                    return mVar.F;
                }
                if (mVar.F != null && TextUtils.equals(mVar.getWebView().getUrl(), mVar.F.d)) {
                    return mVar.F;
                }
                atc atcVar2 = mVar.F;
                if (atcVar2 != null) {
                    atcVar2.a();
                    atc atcVar3 = mVar.F;
                    TLRPC.TL_webPage tL_webPage = atcVar3.j;
                    if (tL_webPage != null) {
                        ctc.o(tL_webPage);
                        atcVar3.j = null;
                    }
                    mVar.F = null;
                }
                atc atcVar4 = new atc(mVar.M.Y);
                mVar.F = atcVar4;
                cv0 webView2 = mVar.getWebView();
                if (!atcVar4.b) {
                    atcVar4.b = true;
                    atcVar4.d = webView2.getUrl();
                    atcVar4.e = webView2.getProgress();
                    atcVar4.f = webView2.b;
                    atcVar4.l = ctc.e(webView2, new zsc(atcVar4, b));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = atcVar4.d;
                    tL_messages_getWebPage.hash = 0;
                    atcVar4.k = ConnectionsManager.getInstance(atcVar4.a).sendRequest(tL_messages_getWebPage, new wx9(atcVar4, (byte) 26));
                }
                return mVar.F;
            }
            if (atcVar != null) {
                atcVar.a();
                atc atcVar5 = mVar.F;
                TLRPC.TL_webPage tL_webPage2 = atcVar5.j;
                if (tL_webPage2 != null) {
                    ctc.o(tL_webPage2);
                    atcVar5.j = null;
                }
                mVar.F = null;
            }
        } else {
            atc atcVar6 = mVar.F;
            if (atcVar6 != null) {
                atcVar6.a();
                atc atcVar7 = mVar.F;
                TLRPC.TL_webPage tL_webPage3 = atcVar7.j;
                if (tL_webPage3 != null) {
                    ctc.o(tL_webPage3);
                    atcVar7.j = null;
                }
                mVar.F = null;
                return null;
            }
        }
        return null;
    }

    public final void j(float f) {
        int f2 = bm2.f(this.b0, this.x, this.E);
        ed0 ed0Var = this.N;
        ed0Var.a(f2);
        ed0Var.b(bm2.f(this.b0, this.x, this.E));
        this.M.invalidate();
        o oVar = this.C0;
        eb ebVar = oVar.j0;
        if (ebVar != null) {
            ebVar.setOpenProgress(f);
        }
        sw swVar = oVar.L;
        if (swVar != null) {
            swVar.s();
        }
    }

    public final void k(boolean z) {
        if (this.a0 != z) {
            ValueAnimator valueAnimator = this.x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a0 = z;
            byte b = 1;
            ps0 ps0Var = this.c0;
            if (z) {
                int i = this.d0;
                int i2 = gba.m0;
                if (i != i2) {
                    this.d0 = i2;
                    ps0Var.setHint(k96.a0(null, null, 2131754348, is9.a().a));
                }
            }
            ps0Var.setVisibility(0);
            this.N.c(true, (this.v0 || z) ? 0.0f : 1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, z ? 1.0f : 0.0f);
            this.x0 = ofFloat;
            ofFloat.addUpdateListener(new uwb(this, (byte) 20));
            this.x0.addListener(new pu9((byte) 19, this, z));
            this.x0.setInterpolator(s33.h);
            this.x0.setDuration(360L);
            this.x0.start();
            gl.r(new ksc(this, b));
            gl.d3(new ksc(this, b), this.a0 ? 100L : 0L);
        }
        eb ebVar = this.C0.j0;
        if (ebVar != null) {
            ebVar.setOpened(z);
        }
    }

    @Override // nsc, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((ViewGroup.MarginLayoutParams) this.C0.j0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
