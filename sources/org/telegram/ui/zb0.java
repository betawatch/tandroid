package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((ne0) this.b).s = null;
                break;
            case 7:
                ((PhotoViewer) ((org.telegram.ui.Components.ml0) this.b).c).A2 = null;
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
                nc0 nc0Var = (nc0) obj;
                nc0Var.H = false;
                nc0Var.n0();
                break;
            case 1:
                ne0 ne0Var = (ne0) obj;
                if (ne0Var.s != null && ne0Var.n != null) {
                    ne0Var.r.setVisibility(4);
                    ne0Var.s = null;
                    break;
                }
                break;
            case 2:
                ((ui0) obj).T.setVisibility(8);
                break;
            case 3:
                oj0 oj0Var = (oj0) obj;
                oj0Var.f = 1.0f;
                oj0Var.invalidate();
                break;
            case 4:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 5:
                ip0 ip0Var = (ip0) obj;
                lc lcVar = ip0Var.X;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) ip0Var.X.getParent()).removeView(ip0Var.X);
                    }
                    ip0Var.X = null;
                }
                ip0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 6:
                lq0 lq0Var = (lq0) obj;
                oq0 oq0Var = lq0Var.D0;
                mq0[] mq0VarArr = oq0Var.n;
                oq0Var.r = null;
                if (oq0Var.w) {
                    mq0VarArr[1].setVisibility(8);
                } else {
                    mq0 mq0Var = mq0VarArr[0];
                    mq0VarArr[0] = mq0VarArr[1];
                    mq0VarArr[1] = mq0Var;
                    mq0Var.setVisibility(8);
                    oq0Var.e = oq0Var.n[0].e == oq0Var.h.getFirstTabId();
                    oq0Var.h.j(1.0f, oq0Var.n[0].e);
                }
                oq0Var.s = false;
                lq0Var.y0 = false;
                lq0Var.x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) oq0Var).actionBar;
                kVar.setEnabled(true);
                oq0Var.h.setEnabled(true);
                break;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ml0) obj).c;
                if (photoViewer.A2 != null) {
                    ck0 ck0Var = new ck0(this, 18);
                    photoViewer.I2 = ck0Var;
                    AndroidUtilities.runOnUIThread(ck0Var, 860L);
                    break;
                }
                break;
            case 8:
                ct0 ct0Var = (ct0) obj;
                PhotoViewer photoViewer2 = ct0Var.b;
                mg.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = ct0Var.a;
                photoViewer2.f1().L.b(photoViewer2.u4 != 0);
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
                photoViewer2.w3(1.0f);
                photoViewer2.t2 = true;
                photoViewer2.e0.invalidate();
                break;
            case 9:
                dt0 dt0Var = (dt0) obj;
                PhotoViewer photoViewer3 = dt0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = dt0Var.a;
                photoViewer3.f1().L.b(photoViewer3.u4 != 0);
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
                photoViewer3.w3(1.0f);
                photoViewer3.t2 = true;
                photoViewer3.e0.invalidate();
                break;
            case 10:
                ((PhotoViewer) ((ht0) obj).q0).y3[0].setTag(null);
                break;
            case 11:
                ((it0) obj).d.T1.k0 = 1.0f;
                break;
            case 12:
                PhotoViewer photoViewer4 = ((it0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ck0(this, 20));
                break;
            case 14:
                zs0 zs0Var = (zs0) obj;
                if (animator.equals(zs0Var.c.U7)) {
                    zs0Var.c.U7 = null;
                    break;
                }
                break;
            case 15:
                gu0 gu0Var = (gu0) obj;
                if (gu0Var.e == animator) {
                    gu0Var.c[1].setVisibility(8);
                    gu0Var.e = null;
                    break;
                }
                break;
            case 16:
                vu0 vu0Var = (vu0) obj;
                if (vu0Var.C != null) {
                    vu0Var.C = null;
                    vu0Var.b();
                    break;
                }
                break;
            case 17:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    break;
                }
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.removeView(premiumPreviewFragment.r0);
                premiumPreviewFragment.r0 = null;
                super.onAnimationEnd(animator);
                break;
            case 19:
                ((ProfileActivity) ((org.telegram.ui.Components.ml0) obj).c).F5 = null;
                break;
            case 20:
                c01 c01Var = (c01) obj;
                if (!c01Var.E) {
                    c01Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                z01 z01Var = (z01) obj;
                if (animator.equals(z01Var.c)) {
                    z01Var.c = null;
                    break;
                }
                break;
            case 22:
                ((m31) obj).d.a0.k0 = 1.0f;
                break;
            case 23:
                SecretMediaViewer secretMediaViewer = ((m31) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 24:
                x51 x51Var = ((n41) obj).e;
                x51Var.S0.G = 0.0f;
                x51Var.S0 = null;
                x51Var.h0.invalidate();
                break;
            case 25:
                ah.x0.a();
                x51 x51Var2 = (x51) obj;
                u41 u41Var = x51Var2.h0;
                u41 u41Var2 = x51Var2.h0;
                u41Var.setLayerType(0, null);
                o41 o41Var = x51Var2.f0;
                o41Var.setLayerType(0, null);
                x51Var2.e0.setLayerType(0, null);
                x51Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.un unVar = x51Var2.n0;
                if (unVar != null) {
                    unVar.setLayerType(0, null);
                }
                View view = x51Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                o41Var.b();
                x51Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                x51Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new qy0(globalInstance, 14));
                x51Var2.h();
                x51Var2.E(1.0f);
                for (int i11 = 0; i11 < u41Var2.getChildCount(); i11++) {
                    View childAt = u41Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < x51Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = x51Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                x51Var2.d0.b.invalidate();
                x51Var2.k0.invalidate();
                u41Var2.invalidate();
                break;
            case 26:
                ((p91) obj).b0.setVisibility(8);
                break;
            case 27:
                kc1 kc1Var = ((yb1) obj).a;
                if (!kc1Var.p1.a()) {
                    kc1Var.R1.setVisibility(8);
                    break;
                }
                break;
            case 28:
                super.onAnimationEnd(animator);
                ((ld1) obj).a = null;
                break;
            default:
                super.onAnimationEnd(animator);
                ((pe1) obj).setScrollEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                ct0 ct0Var = (ct0) this.b;
                ct0Var.b.U0.setVisibility(0);
                ct0Var.b.C1.setVisibility(0);
                break;
            case 9:
                break;
            case 20:
                ((c01) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
