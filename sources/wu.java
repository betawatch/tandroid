// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class wu extends puc {
    public final /* synthetic */ o C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(o oVar, Activity activity) {
        super(activity);
        this.C0 = oVar;
    }

    @Override // puc
    public final bvc getInstantViewLoader() {
        byte b = 0;
        m mVar = this.C0.v0[0];
        if (mVar.e()) {
            mw0 webView = mVar.getWebView();
            bvc bvcVar = mVar.F;
            if (webView != null) {
                if (bvcVar != null && (bvcVar.f != mVar.getWebView().b || mVar.F.e != mVar.getWebView().getProgress())) {
                    mVar.F.d(mVar.getWebView());
                    return mVar.F;
                }
                if (mVar.F != null && TextUtils.equals(mVar.getWebView().getUrl(), mVar.F.d)) {
                    return mVar.F;
                }
                bvc bvcVar2 = mVar.F;
                if (bvcVar2 != null) {
                    bvcVar2.a();
                    bvc bvcVar3 = mVar.F;
                    TLRPC.TL_webPage tL_webPage = bvcVar3.j;
                    if (tL_webPage != null) {
                        dvc.o(tL_webPage);
                        bvcVar3.j = null;
                    }
                    mVar.F = null;
                }
                bvc bvcVar4 = new bvc(mVar.M.Y);
                mVar.F = bvcVar4;
                mw0 webView2 = mVar.getWebView();
                if (!bvcVar4.b) {
                    bvcVar4.b = true;
                    bvcVar4.d = webView2.getUrl();
                    bvcVar4.e = webView2.getProgress();
                    bvcVar4.f = webView2.b;
                    bvcVar4.l = dvc.e(webView2, new avc(bvcVar4, b));
                    TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                    tL_messages_getWebPage.url = bvcVar4.d;
                    tL_messages_getWebPage.hash = 0;
                    bvcVar4.k = ConnectionsManager.getInstance(bvcVar4.a).sendRequest(tL_messages_getWebPage, new go9(bvcVar4, (byte) 27));
                }
                return mVar.F;
            }
            if (bvcVar != null) {
                bvcVar.a();
                bvc bvcVar5 = mVar.F;
                TLRPC.TL_webPage tL_webPage2 = bvcVar5.j;
                if (tL_webPage2 != null) {
                    dvc.o(tL_webPage2);
                    bvcVar5.j = null;
                }
                mVar.F = null;
            }
        } else {
            bvc bvcVar6 = mVar.F;
            if (bvcVar6 != null) {
                bvcVar6.a();
                bvc bvcVar7 = mVar.F;
                TLRPC.TL_webPage tL_webPage3 = bvcVar7.j;
                if (tL_webPage3 != null) {
                    dvc.o(tL_webPage3);
                    bvcVar7.j = null;
                }
                mVar.F = null;
                return null;
            }
        }
        return null;
    }

    public final void j(float f) {
        int f2 = on2.f(this.b0, this.x, this.E);
        ee0 ee0Var = this.N;
        ee0Var.a(f2);
        ee0Var.b(on2.f(this.b0, this.x, this.E));
        this.M.invalidate();
        o oVar = this.C0;
        eb ebVar = oVar.j0;
        if (ebVar != null) {
            ebVar.setOpenProgress(f);
        }
        sx sxVar = oVar.L;
        if (sxVar != null) {
            sxVar.u();
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
            vc vcVar = this.c0;
            if (z) {
                int i = this.d0;
                int i2 = gda.m0;
                if (i != i2) {
                    this.d0 = i2;
                    vcVar.setHint(jb6.a0(null, null, 2131754348, ku9.a().a));
                }
            }
            vcVar.setVisibility(0);
            this.N.c(true, (this.v0 || z) ? 0.0f : 1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, z ? 1.0f : 0.0f);
            this.x0 = ofFloat;
            ofFloat.addUpdateListener(new oxb(this, (byte) 22));
            this.x0.addListener(new sw9((byte) 19, this, z));
            this.x0.setInterpolator(d53.h);
            this.x0.setDuration(360L);
            this.x0.start();
            gm.r(new muc(this, b));
            gm.d3(new muc(this, b), this.a0 ? 100L : 0L);
        }
        eb ebVar = this.C0.j0;
        if (ebVar != null) {
            ebVar.setOpened(z);
        }
    }

    @Override // puc, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((ViewGroup.MarginLayoutParams) this.C0.j0.getLayoutParams()).topMargin = getMeasuredHeight();
    }
}
