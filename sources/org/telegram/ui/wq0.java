package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class wq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wq0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((PhotoViewer) ((org.telegram.ui.Components.qk0) this.b).c).A2 = null;
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
                xq0 xq0Var = (xq0) obj;
                ar0 ar0Var = xq0Var.D0;
                yq0[] yq0VarArr = ar0Var.n;
                ar0Var.r = null;
                if (ar0Var.w) {
                    yq0VarArr[1].setVisibility(8);
                } else {
                    yq0 yq0Var = yq0VarArr[0];
                    yq0VarArr[0] = yq0VarArr[1];
                    yq0VarArr[1] = yq0Var;
                    yq0Var.setVisibility(8);
                    ar0Var.e = ar0Var.n[0].e == ar0Var.h.getFirstTabId();
                    ar0Var.h.j(1.0f, ar0Var.n[0].e);
                }
                ar0Var.s = false;
                xq0Var.y0 = false;
                xq0Var.x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) ar0Var).actionBar;
                kVar.setEnabled(true);
                ar0Var.h.setEnabled(true);
                break;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.qk0) obj).c;
                if (photoViewer.A2 != null) {
                    jl0 jl0Var = new jl0(this, 17);
                    photoViewer.I2 = jl0Var;
                    AndroidUtilities.runOnUIThread(jl0Var, 860L);
                    break;
                }
                break;
            case 2:
                pt0 pt0Var = (pt0) obj;
                PhotoViewer photoViewer2 = pt0Var.b;
                lg.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = pt0Var.a;
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
            case 3:
                qt0 qt0Var = (qt0) obj;
                PhotoViewer photoViewer3 = qt0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = qt0Var.a;
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
            case 4:
                ((PhotoViewer) ((ut0) obj).q0).y3[0].setTag(null);
                break;
            case 5:
                ((vt0) obj).d.T1.k0 = 1.0f;
                break;
            case 6:
                PhotoViewer photoViewer4 = ((vt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new jl0(this, 19));
                break;
            case 8:
                mt0 mt0Var = (mt0) obj;
                if (animator.equals(mt0Var.c.U7)) {
                    mt0Var.c.U7 = null;
                    break;
                }
                break;
            case 9:
                tu0 tu0Var = (tu0) obj;
                if (tu0Var.e == animator) {
                    tu0Var.c[1].setVisibility(8);
                    tu0Var.e = null;
                    break;
                }
                break;
            case 10:
                iv0 iv0Var = (iv0) obj;
                if (iv0Var.C != null) {
                    iv0Var.C = null;
                    iv0Var.b();
                    break;
                }
                break;
            case 11:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    break;
                }
                break;
            case 12:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.removeView(premiumPreviewFragment.r0);
                premiumPreviewFragment.r0 = null;
                super.onAnimationEnd(animator);
                break;
            case 13:
                ((ProfileActivity) ((org.telegram.ui.Components.qk0) obj).c).D5 = null;
                break;
            case 14:
                t01 t01Var = (t01) obj;
                if (!t01Var.E) {
                    t01Var.setVisibility(8);
                    break;
                }
                break;
            case 15:
                p11 p11Var = (p11) obj;
                if (animator.equals(p11Var.c)) {
                    p11Var.c = null;
                    break;
                }
                break;
            case 16:
                w21 w21Var = (w21) obj;
                ci.tb tbVar = w21Var.O;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) w21Var.O.getParent()).removeView(w21Var.O);
                    }
                    w21Var.O = null;
                }
                w21Var.N = null;
                super.onAnimationEnd(animator);
                break;
            case 17:
                ((p41) obj).d.a0.k0 = 1.0f;
                break;
            case 18:
                SecretMediaViewer secretMediaViewer = ((p41) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 19:
                z61 z61Var = ((p51) obj).e;
                z61Var.S0.G = 0.0f;
                z61Var.S0 = null;
                z61Var.h0.invalidate();
                break;
            case 20:
                zg.f0.a();
                z61 z61Var2 = (z61) obj;
                w51 w51Var = z61Var2.h0;
                w51 w51Var2 = z61Var2.h0;
                w51Var.setLayerType(0, null);
                q51 q51Var = z61Var2.f0;
                q51Var.setLayerType(0, null);
                z61Var2.e0.setLayerType(0, null);
                z61Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.ln lnVar = z61Var2.n0;
                if (lnVar != null) {
                    lnVar.setLayerType(0, null);
                }
                View view = z61Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                q51Var.b();
                z61Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                z61Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new xz0(globalInstance, 13));
                z61Var2.h();
                z61Var2.E(1.0f);
                for (int i11 = 0; i11 < w51Var2.getChildCount(); i11++) {
                    View childAt = w51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < z61Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = z61Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                z61Var2.d0.b.invalidate();
                z61Var2.k0.invalidate();
                w51Var2.invalidate();
                break;
            case 21:
                ((ra1) obj).b0.setVisibility(8);
                break;
            case 22:
                od1 od1Var = ((cd1) obj).a;
                if (!od1Var.p1.a()) {
                    od1Var.R1.setVisibility(8);
                    break;
                }
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((qe1) obj).a = null;
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((uf1) obj).setScrollEnabled(true);
                break;
            case 25:
                yg1 yg1Var = (yg1) obj;
                if (animator.equals(yg1Var.e.K)) {
                    yg1Var.e.K = null;
                    break;
                }
                break;
            case 26:
                qh1 qh1Var = (qh1) obj;
                qh1Var.d = null;
                qh1Var.a = null;
                qh1Var.b = false;
                qh1Var.f.c.setAllowDrawCursor(true);
                break;
            case 27:
                ni.i iVar = (ni.i) obj;
                ((hj1) iVar.b).getClass();
                ((hj1) iVar.b).c.setVisibility(4);
                break;
            case 28:
                ((org.telegram.ui.web.b1) obj).s.setVisibility(8);
                break;
            default:
                pg.d0 d0Var = (pg.d0) obj;
                d0Var.a.getPainting().c(null, d0Var.a.getCurrentColor(), true, null);
                d0Var.r = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                pt0 pt0Var = (pt0) this.b;
                pt0Var.b.U0.setVisibility(0);
                pt0Var.b.C1.setVisibility(0);
                break;
            case 3:
                break;
            case 14:
                ((t01) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
