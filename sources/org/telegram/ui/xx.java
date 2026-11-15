package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class xx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xx(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                ((oc0) this.b).s = null;
                break;
            case 11:
                ((PhotoViewer) ((org.telegram.ui.Components.y50) this.b).c).B2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.p70 p70Var = (org.telegram.ui.Components.p70) obj;
                FrameLayout frameLayout = p70Var.b;
                hi.n5 n5Var = (hi.n5) p70Var.c;
                if (n5Var.getParent() != null) {
                    frameLayout.removeView(n5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) p70Var.d);
                break;
            case 1:
                c40 c40Var = ((e30) obj).o;
                c40 c40Var2 = c40.C5;
                c40Var.d1();
                c40Var.b.invalidate();
                c40Var.L1.invalidate();
                if (c40Var.n2) {
                    c40Var.n2 = false;
                    c40Var.Q0(true);
                    break;
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                q30 q30Var = (q30) obj;
                q30Var.G = null;
                c40 c40Var3 = q30Var.L;
                c40Var3.L1.invalidate();
                c40Var3.Z3.invalidate();
                c40Var3.b.invalidate();
                c40.P0(c40Var3);
                q30Var.H.clear();
                q30Var.I.clear();
                break;
            case 3:
                x50 x50Var = (x50) obj;
                x50Var.a = null;
                x50Var.b = false;
                break;
            case 4:
                pa0 pa0Var = (pa0) obj;
                pa0Var.E = false;
                pa0Var.y0();
                break;
            case 5:
                oc0 oc0Var = (oc0) obj;
                if (oc0Var.s != null && oc0Var.n != null) {
                    oc0Var.r.setVisibility(4);
                    oc0Var.s = null;
                    break;
                }
                break;
            case 6:
                ((jg0) obj).U.setVisibility(8);
                break;
            case 7:
                dh0 dh0Var = (dh0) obj;
                dh0Var.f = 1.0f;
                dh0Var.invalidate();
                break;
            case 8:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 9:
                im0 im0Var = (im0) obj;
                bc bcVar = im0Var.Y;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) im0Var.Y.getParent()).removeView(im0Var.Y);
                    }
                    im0Var.Y = null;
                }
                im0Var.a0 = null;
                super.onAnimationEnd(animator);
                break;
            case 10:
                an0 an0Var = (an0) obj;
                bn0 bn0Var = an0Var.n0;
                org.telegram.ui.ActionBar.v4[] v4VarArr = bn0Var.n;
                bn0Var.r = null;
                if (bn0Var.x) {
                    v4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.v4 v4Var = v4VarArr[0];
                    v4VarArr[0] = v4VarArr[1];
                    v4VarArr[1] = v4Var;
                    v4Var.setVisibility(8);
                    bn0Var.e = bn0Var.n[0].b == bn0Var.h.getFirstTabId();
                    bn0Var.h.i(1.0f, bn0Var.n[0].b);
                }
                bn0Var.s = false;
                an0Var.i0 = false;
                an0Var.h0 = false;
                kVar = ((org.telegram.ui.ActionBar.e2) bn0Var).actionBar;
                kVar.setEnabled(true);
                bn0Var.h.setEnabled(true);
                break;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.y50) obj).c;
                if (photoViewer.B2 != null) {
                    ef0 ef0Var = new ef0(this, 21);
                    photoViewer.I2 = ef0Var;
                    org.telegram.messenger.g0.i3(ef0Var, 860L);
                    break;
                }
                break;
            case 12:
                pp0 pp0Var = (pp0) obj;
                PhotoViewer photoViewer2 = pp0Var.b;
                og.o oVar = photoViewer2.D1.b;
                oVar.q();
                CropAreaView cropAreaView = oVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.b.K = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = pp0Var.a;
                photoViewer2.b1().M.b(photoViewer2.u4 != 0);
                hi.p3 p3Var = photoViewer2.L1;
                if (p3Var != null) {
                    p3Var.b(photoViewer2.u4 != 3);
                }
                if (photoViewer2.u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.o6 = -1;
                photoViewer2.e6 = 1.0f;
                photoViewer2.a6 = 1.0f;
                photoViewer2.c6 = 0.0f;
                photoViewer2.d6 = 0.0f;
                photoViewer2.u3(1.0f);
                photoViewer2.u2 = true;
                photoViewer2.f0.invalidate();
                break;
            case 13:
                qp0 qp0Var = (qp0) obj;
                PhotoViewer photoViewer3 = qp0Var.b;
                photoViewer3.J1.j0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = qp0Var.a;
                photoViewer3.b1().M.b(photoViewer3.u4 != 0);
                hi.p3 p3Var2 = photoViewer3.L1;
                if (p3Var2 != null) {
                    p3Var2.b(photoViewer3.u4 != 3);
                }
                if (photoViewer3.u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.o6 = -1;
                photoViewer3.e6 = 1.0f;
                photoViewer3.a6 = 1.0f;
                photoViewer3.c6 = 0.0f;
                photoViewer3.d6 = 0.0f;
                photoViewer3.u3(1.0f);
                photoViewer3.u2 = true;
                photoViewer3.f0.invalidate();
                break;
            case 14:
                ((PhotoViewer) ((up0) obj).r0).y3[0].setTag(null);
                break;
            case 15:
                ((vp0) obj).d.U1.l0 = 1.0f;
                break;
            case 16:
                PhotoViewer photoViewer4 = ((vp0) obj).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.l0 = 1.0f;
                break;
            case 17:
                org.telegram.messenger.g0.h3(new ef0(this, 23));
                break;
            case 18:
                lp0 lp0Var = (lp0) obj;
                if (animator.equals(lp0Var.c.U7)) {
                    lp0Var.c.U7 = null;
                    break;
                }
                break;
            case 19:
                rq0 rq0Var = (rq0) obj;
                if (rq0Var.e == animator) {
                    rq0Var.c[1].setVisibility(8);
                    rq0Var.e = null;
                    break;
                }
                break;
            case 20:
                dr0 dr0Var = (dr0) obj;
                if (dr0Var.C != null) {
                    dr0Var.C = null;
                    dr0Var.b();
                    break;
                }
                break;
            case 21:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Z;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Z = null;
                    break;
                }
                break;
            case 22:
                ((bv0) obj).b.T5 = null;
                break;
            case 23:
                jw0 jw0Var = (jw0) obj;
                if (!jw0Var.F) {
                    jw0Var.setVisibility(8);
                    break;
                }
                break;
            case 24:
                fx0 fx0Var = (fx0) obj;
                if (animator.equals(fx0Var.d)) {
                    fx0Var.d = null;
                    break;
                }
                break;
            case 25:
                ((fz0) obj).d.Z.l0 = 1.0f;
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = ((fz0) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.l0 = 1.0f;
                break;
            case 27:
                n11 n11Var = ((e01) obj).e;
                n11Var.T0.H = 0.0f;
                n11Var.T0 = null;
                n11Var.i0.invalidate();
                break;
            case 28:
                ch.f0.a();
                n11 n11Var2 = (n11) obj;
                l01 l01Var = n11Var2.i0;
                l01 l01Var2 = n11Var2.i0;
                l01Var.setLayerType(0, null);
                f01 f01Var = n11Var2.g0;
                f01Var.setLayerType(0, null);
                n11Var2.f0.setLayerType(0, null);
                n11Var2.c0.setLayerType(0, null);
                org.telegram.ui.Components.bn bnVar = n11Var2.o0;
                if (bnVar != null) {
                    bnVar.setLayerType(0, null);
                }
                View view = n11Var2.n0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                f01Var.b();
                n11Var2.e0.m(false);
                org.telegram.messenger.ns.e().k(99, 512);
                n11Var2.Y1.e();
                org.telegram.messenger.g0.h3(new pu0(org.telegram.messenger.ns.e(), 15));
                n11Var2.h();
                n11Var2.E(1.0f);
                for (int i10 = 0; i10 < l01Var2.getChildCount(); i10++) {
                    View childAt = l01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < n11Var2.e0.b.getChildCount(); i11++) {
                    View childAt2 = n11Var2.e0.b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                n11Var2.e0.b.invalidate();
                n11Var2.l0.invalidate();
                l01Var2.invalidate();
                break;
            default:
                ((z41) obj).b0.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 12:
                pp0 pp0Var = (pp0) this.b;
                pp0Var.b.V0.setVisibility(0);
                pp0Var.b.D1.setVisibility(0);
                break;
            case 13:
                break;
            case 23:
                ((jw0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
