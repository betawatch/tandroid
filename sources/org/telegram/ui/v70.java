package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class v70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ((ue0) this.b).s = null;
                break;
            case 8:
                ((PhotoViewer) ((org.telegram.ui.Components.ql0) this.b).c).A2 = null;
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
                w70 w70Var = (w70) obj;
                w70Var.d = null;
                w70Var.a = null;
                w70Var.b = false;
                break;
            case 1:
                sc0 sc0Var = (sc0) obj;
                sc0Var.H = false;
                sc0Var.o0();
                break;
            case 2:
                ue0 ue0Var = (ue0) obj;
                if (ue0Var.s != null && ue0Var.n != null) {
                    ue0Var.r.setVisibility(4);
                    ue0Var.s = null;
                    break;
                }
                break;
            case 3:
                ((yi0) obj).T.setVisibility(8);
                break;
            case 4:
                tj0 tj0Var = (tj0) obj;
                tj0Var.f = 1.0f;
                tj0Var.invalidate();
                break;
            case 5:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 6:
                lp0 lp0Var = (lp0) obj;
                lc lcVar = lp0Var.X;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) lp0Var.X.getParent()).removeView(lp0Var.X);
                    }
                    lp0Var.X = null;
                }
                lp0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 7:
                oq0 oq0Var = (oq0) obj;
                rq0 rq0Var = oq0Var.D0;
                pq0[] pq0VarArr = rq0Var.n;
                rq0Var.r = null;
                if (rq0Var.w) {
                    pq0VarArr[1].setVisibility(8);
                } else {
                    pq0 pq0Var = pq0VarArr[0];
                    pq0VarArr[0] = pq0VarArr[1];
                    pq0VarArr[1] = pq0Var;
                    pq0Var.setVisibility(8);
                    rq0Var.e = rq0Var.n[0].e == rq0Var.h.getFirstTabId();
                    rq0Var.h.i(1.0f, rq0Var.n[0].e);
                }
                rq0Var.s = false;
                oq0Var.y0 = false;
                oq0Var.x0 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) rq0Var).actionBar;
                kVar.setEnabled(true);
                rq0Var.h.setEnabled(true);
                break;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ql0) obj).c;
                if (photoViewer.A2 != null) {
                    oj0 oj0Var = new oj0(this, 19);
                    photoViewer.I2 = oj0Var;
                    AndroidUtilities.runOnUIThread(oj0Var, 860L);
                    break;
                }
                break;
            case 9:
                ft0 ft0Var = (ft0) obj;
                PhotoViewer photoViewer2 = ft0Var.b;
                mg.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = ft0Var.a;
                photoViewer2.g1().L.b(photoViewer2.u4 != 0);
                ei.b4 b4Var = photoViewer2.K1;
                if (b4Var != null) {
                    b4Var.b(photoViewer2.u4 != 3);
                }
                if (photoViewer2.u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.o6 = -1;
                photoViewer2.e6 = 1.0f;
                photoViewer2.a6 = 1.0f;
                photoViewer2.c6 = 0.0f;
                photoViewer2.d6 = 0.0f;
                photoViewer2.y3(1.0f);
                photoViewer2.t2 = true;
                photoViewer2.e0.invalidate();
                break;
            case 10:
                gt0 gt0Var = (gt0) obj;
                PhotoViewer photoViewer3 = gt0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = gt0Var.a;
                photoViewer3.g1().L.b(photoViewer3.u4 != 0);
                ei.b4 b4Var2 = photoViewer3.K1;
                if (b4Var2 != null) {
                    b4Var2.b(photoViewer3.u4 != 3);
                }
                if (photoViewer3.u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.o6 = -1;
                photoViewer3.e6 = 1.0f;
                photoViewer3.a6 = 1.0f;
                photoViewer3.c6 = 0.0f;
                photoViewer3.d6 = 0.0f;
                photoViewer3.y3(1.0f);
                photoViewer3.t2 = true;
                photoViewer3.e0.invalidate();
                break;
            case 11:
                ((PhotoViewer) ((kt0) obj).q0).y3[0].setTag(null);
                break;
            case 12:
                ((lt0) obj).d.T1.k0 = 1.0f;
                break;
            case 13:
                PhotoViewer photoViewer4 = ((lt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new oj0(this, 21));
                break;
            case 15:
                ct0 ct0Var = (ct0) obj;
                if (animator.equals(ct0Var.c.U7)) {
                    ct0Var.c.U7 = null;
                    break;
                }
                break;
            case 16:
                ju0 ju0Var = (ju0) obj;
                if (ju0Var.e == animator) {
                    ju0Var.c[1].setVisibility(8);
                    ju0Var.e = null;
                    break;
                }
                break;
            case 17:
                yu0 yu0Var = (yu0) obj;
                if (yu0Var.C != null) {
                    yu0Var.C = null;
                    yu0Var.b();
                    break;
                }
                break;
            case 18:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    break;
                }
                break;
            case 19:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.removeView(premiumPreviewFragment.t0);
                premiumPreviewFragment.t0 = null;
                super.onAnimationEnd(animator);
                break;
            case 20:
                ((ProfileActivity) ((org.telegram.ui.Components.ql0) obj).c).F5 = null;
                break;
            case 21:
                g01 g01Var = (g01) obj;
                if (!g01Var.E) {
                    g01Var.setVisibility(8);
                    break;
                }
                break;
            case 22:
                d11 d11Var = (d11) obj;
                if (animator.equals(d11Var.c)) {
                    d11Var.c = null;
                    break;
                }
                break;
            case 23:
                ((q31) obj).d.a0.k0 = 1.0f;
                break;
            case 24:
                SecretMediaViewer secretMediaViewer = ((q31) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 25:
                b61 b61Var = ((r41) obj).e;
                b61Var.S0.G = 0.0f;
                b61Var.S0 = null;
                b61Var.h0.invalidate();
                break;
            case 26:
                ah.x0.a();
                b61 b61Var2 = (b61) obj;
                y41 y41Var = b61Var2.h0;
                y41 y41Var2 = b61Var2.h0;
                y41Var.setLayerType(0, null);
                s41 s41Var = b61Var2.f0;
                s41Var.setLayerType(0, null);
                b61Var2.e0.setLayerType(0, null);
                b61Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.un unVar = b61Var2.n0;
                if (unVar != null) {
                    unVar.setLayerType(0, null);
                }
                View view = b61Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                s41Var.b();
                b61Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                b61Var2.X1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new my0(globalInstance, 15));
                b61Var2.h();
                b61Var2.E(1.0f);
                for (int i11 = 0; i11 < y41Var2.getChildCount(); i11++) {
                    View childAt = y41Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < b61Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = b61Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                b61Var2.d0.b.invalidate();
                b61Var2.k0.invalidate();
                y41Var2.invalidate();
                break;
            case 27:
                ((u91) obj).b0.setVisibility(8);
                break;
            case 28:
                qc1 qc1Var = ((ec1) obj).a;
                if (!qc1Var.q1.a()) {
                    qc1Var.S1.setVisibility(8);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ((rd1) obj).a = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                ft0 ft0Var = (ft0) this.b;
                ft0Var.b.U0.setVisibility(0);
                ft0Var.b.C1.setVisibility(0);
                break;
            case 10:
                break;
            case 21:
                ((g01) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
