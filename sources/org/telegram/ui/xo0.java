package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class xo0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xo0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.al0) this.b).c).A2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                tp0 tp0Var = (tp0) obj;
                kc kcVar = tp0Var.X;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) tp0Var.X.getParent()).removeView(tp0Var.X);
                    }
                    tp0Var.X = null;
                }
                tp0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 1:
                vq0 vq0Var = (vq0) obj;
                yq0 yq0Var = vq0Var.D0;
                wq0[] wq0VarArr = yq0Var.n;
                yq0Var.r = null;
                if (yq0Var.w) {
                    wq0VarArr[1].setVisibility(8);
                } else {
                    wq0 wq0Var = wq0VarArr[0];
                    wq0VarArr[0] = wq0VarArr[1];
                    wq0VarArr[1] = wq0Var;
                    wq0Var.setVisibility(8);
                    yq0Var.e = yq0Var.n[0].e == yq0Var.h.getFirstTabId();
                    yq0Var.h.j(1.0f, yq0Var.n[0].e);
                }
                yq0Var.s = false;
                vq0Var.y0 = false;
                vq0Var.x0 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) yq0Var).actionBar;
                kVar.setEnabled(true);
                yq0Var.h.setEnabled(true);
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.al0) obj).c;
                if (photoViewer.A2 != null) {
                    il0 il0Var = new il0(this, 17);
                    photoViewer.I2 = il0Var;
                    AndroidUtilities.runOnUIThread(il0Var, 860L);
                    break;
                }
                break;
            case 3:
                ot0 ot0Var = (ot0) obj;
                PhotoViewer photoViewer2 = ot0Var.b;
                lg.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = ot0Var.a;
                photoViewer2.f1().L.b(photoViewer2.u4 != 0);
                ci.i4 i4Var = photoViewer2.K1;
                if (i4Var != null) {
                    i4Var.b(photoViewer2.u4 != 3);
                }
                if (photoViewer2.u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.o6 = -1;
                photoViewer2.e6 = 1.0f;
                photoViewer2.a6 = 1.0f;
                photoViewer2.c6 = 0.0f;
                photoViewer2.d6 = 0.0f;
                photoViewer2.v3(1.0f);
                photoViewer2.t2 = true;
                photoViewer2.e0.invalidate();
                break;
            case 4:
                pt0 pt0Var = (pt0) obj;
                PhotoViewer photoViewer3 = pt0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = pt0Var.a;
                photoViewer3.f1().L.b(photoViewer3.u4 != 0);
                ci.i4 i4Var2 = photoViewer3.K1;
                if (i4Var2 != null) {
                    i4Var2.b(photoViewer3.u4 != 3);
                }
                if (photoViewer3.u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.o6 = -1;
                photoViewer3.e6 = 1.0f;
                photoViewer3.a6 = 1.0f;
                photoViewer3.c6 = 0.0f;
                photoViewer3.d6 = 0.0f;
                photoViewer3.v3(1.0f);
                photoViewer3.t2 = true;
                photoViewer3.e0.invalidate();
                break;
            case 5:
                ((PhotoViewer) ((tt0) obj).q0).y3[0].setTag(null);
                break;
            case 6:
                ((ut0) obj).d.T1.k0 = 1.0f;
                break;
            case 7:
                PhotoViewer photoViewer4 = ((ut0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new il0(this, 19));
                break;
            case 9:
                lt0 lt0Var = (lt0) obj;
                if (animator.equals(lt0Var.c.U7)) {
                    lt0Var.c.U7 = null;
                    break;
                }
                break;
            case 10:
                su0 su0Var = (su0) obj;
                if (su0Var.e == animator) {
                    su0Var.c[1].setVisibility(8);
                    su0Var.e = null;
                    break;
                }
                break;
            case 11:
                hv0 hv0Var = (hv0) obj;
                if (hv0Var.C != null) {
                    hv0Var.C = null;
                    hv0Var.b();
                    break;
                }
                break;
            case 12:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    break;
                }
                break;
            case 13:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.removeView(premiumPreviewFragment.r0);
                premiumPreviewFragment.r0 = null;
                super.onAnimationEnd(animator);
                break;
            case 14:
                ((ProfileActivity) ((org.telegram.ui.Components.al0) obj).c).D5 = null;
                break;
            case 15:
                r01 r01Var = (r01) obj;
                if (!r01Var.E) {
                    r01Var.setVisibility(8);
                    break;
                }
                break;
            case 16:
                n11 n11Var = (n11) obj;
                if (animator.equals(n11Var.c)) {
                    n11Var.c = null;
                    break;
                }
                break;
            case 17:
                v21 v21Var = (v21) obj;
                ci.tb tbVar = v21Var.O;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) v21Var.O.getParent()).removeView(v21Var.O);
                    }
                    v21Var.O = null;
                }
                v21Var.N = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                ((q41) obj).d.a0.k0 = 1.0f;
                break;
            case 19:
                SecretMediaViewer secretMediaViewer = ((q41) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 20:
                a71 a71Var = ((q51) obj).e;
                a71Var.S0.G = 0.0f;
                a71Var.S0 = null;
                a71Var.h0.invalidate();
                break;
            case 21:
                zg.e0.a();
                a71 a71Var2 = (a71) obj;
                x51 x51Var = a71Var2.h0;
                x51 x51Var2 = a71Var2.h0;
                x51Var.setLayerType(0, null);
                r51 r51Var = a71Var2.f0;
                r51Var.setLayerType(0, null);
                a71Var2.e0.setLayerType(0, null);
                a71Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.ln lnVar = a71Var2.n0;
                if (lnVar != null) {
                    lnVar.setLayerType(0, null);
                }
                View view = a71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                r51Var.b();
                a71Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                a71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new vz0(globalInstance, 13));
                a71Var2.h();
                a71Var2.E(1.0f);
                for (int i11 = 0; i11 < x51Var2.getChildCount(); i11++) {
                    View childAt = x51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < a71Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = a71Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                a71Var2.d0.b.invalidate();
                a71Var2.k0.invalidate();
                x51Var2.invalidate();
                break;
            case 22:
                ((sa1) obj).b0.setVisibility(8);
                break;
            case 23:
                od1 od1Var = ((cd1) obj).a;
                if (!od1Var.p1.a()) {
                    od1Var.R1.setVisibility(8);
                    break;
                }
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((qe1) obj).a = null;
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((uf1) obj).setScrollEnabled(true);
                break;
            case 26:
                yg1 yg1Var = (yg1) obj;
                if (animator.equals(yg1Var.e.K)) {
                    yg1Var.e.K = null;
                    break;
                }
                break;
            case 27:
                qh1 qh1Var = (qh1) obj;
                qh1Var.d = null;
                qh1Var.a = null;
                qh1Var.b = false;
                qh1Var.f.c.setAllowDrawCursor(true);
                break;
            case 28:
                oi.i iVar = (oi.i) obj;
                ((hj1) iVar.b).getClass();
                ((hj1) iVar.b).c.setVisibility(4);
                break;
            default:
                ((org.telegram.ui.web.b1) obj).s.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 3:
                ot0 ot0Var = (ot0) this.b;
                ot0Var.b.U0.setVisibility(0);
                ot0Var.b.C1.setVisibility(0);
                break;
            case 4:
                break;
            case 15:
                ((r01) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
