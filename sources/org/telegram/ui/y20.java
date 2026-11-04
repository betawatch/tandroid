package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y20(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                ((nc0) this.b).s = null;
                break;
            case 10:
                ((PhotoViewer) ((org.telegram.ui.Components.ri0) this.b).c).B2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                x30 x30Var = ((z20) obj).o;
                x30 x30Var2 = x30.v5;
                x30Var.d1();
                x30Var.b.invalidate();
                x30Var.I1.invalidate();
                if (x30Var.k2) {
                    x30Var.k2 = false;
                    x30Var.Q0(true);
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                l30 l30Var = (l30) obj;
                l30Var.G = null;
                x30 x30Var3 = l30Var.L;
                x30Var3.I1.invalidate();
                x30Var3.S3.invalidate();
                x30Var3.b.invalidate();
                x30.P0(x30Var3);
                l30Var.H.clear();
                l30Var.I.clear();
                break;
            case 2:
                s50 s50Var = (s50) obj;
                s50Var.a = null;
                s50Var.b = false;
                break;
            case 3:
                la0 la0Var = (la0) obj;
                la0Var.E = false;
                la0Var.y0();
                break;
            case 4:
                nc0 nc0Var = (nc0) obj;
                if (nc0Var.s != null && nc0Var.n != null) {
                    nc0Var.r.setVisibility(4);
                    nc0Var.s = null;
                    break;
                }
                break;
            case 5:
                ((dg0) obj).U.setVisibility(8);
                break;
            case 6:
                xg0 xg0Var = (xg0) obj;
                xg0Var.f = 1.0f;
                xg0Var.invalidate();
                break;
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 8:
                cm0 cm0Var = (cm0) obj;
                ac acVar = cm0Var.Y;
                if (acVar != null) {
                    if (acVar.getParent() != null) {
                        ((ViewGroup) cm0Var.Y.getParent()).removeView(cm0Var.Y);
                    }
                    cm0Var.Y = null;
                }
                cm0Var.a0 = null;
                super.onAnimationEnd(animator);
                break;
            case 9:
                um0 um0Var = (um0) obj;
                vm0 vm0Var = um0Var.n0;
                org.telegram.ui.ActionBar.x4[] x4VarArr = vm0Var.n;
                vm0Var.r = null;
                if (vm0Var.x) {
                    x4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.x4 x4Var = x4VarArr[0];
                    x4VarArr[0] = x4VarArr[1];
                    x4VarArr[1] = x4Var;
                    x4Var.setVisibility(8);
                    vm0Var.e = vm0Var.n[0].b == vm0Var.h.getFirstTabId();
                    vm0Var.h.i(1.0f, vm0Var.n[0].b);
                }
                vm0Var.s = false;
                um0Var.i0 = false;
                um0Var.h0 = false;
                kVar = ((org.telegram.ui.ActionBar.d2) vm0Var).actionBar;
                kVar.setEnabled(true);
                vm0Var.h.setEnabled(true);
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ri0) obj).c;
                if (photoViewer.B2 != null) {
                    sg0 sg0Var = new sg0(this, 20);
                    photoViewer.J2 = sg0Var;
                    org.telegram.messenger.g0.i3(sg0Var, 860L);
                    break;
                }
                break;
            case 11:
                hp0 hp0Var = (hp0) obj;
                PhotoViewer photoViewer2 = hp0Var.b;
                pg.m mVar = photoViewer2.D1.b;
                mVar.q();
                CropAreaView cropAreaView = mVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.b.K = true;
                photoViewer2.q6 = null;
                photoViewer2.v4 = hp0Var.a;
                photoViewer2.h1().M.b(photoViewer2.v4 != 0);
                gi.p3 p3Var = photoViewer2.L1;
                if (p3Var != null) {
                    p3Var.b(photoViewer2.v4 != 3);
                }
                if (photoViewer2.v4 != 3) {
                    photoViewer2.a6 = 0.0f;
                }
                photoViewer2.p6 = -1;
                photoViewer2.f6 = 1.0f;
                photoViewer2.b6 = 1.0f;
                photoViewer2.d6 = 0.0f;
                photoViewer2.e6 = 0.0f;
                photoViewer2.z3(1.0f);
                photoViewer2.u2 = true;
                photoViewer2.f0.invalidate();
                break;
            case 12:
                ip0 ip0Var = (ip0) obj;
                PhotoViewer photoViewer3 = ip0Var.b;
                photoViewer3.J1.j0.setVisibility(0);
                photoViewer3.q6 = null;
                photoViewer3.v4 = ip0Var.a;
                photoViewer3.h1().M.b(photoViewer3.v4 != 0);
                gi.p3 p3Var2 = photoViewer3.L1;
                if (p3Var2 != null) {
                    p3Var2.b(photoViewer3.v4 != 3);
                }
                if (photoViewer3.v4 != 3) {
                    photoViewer3.a6 = 0.0f;
                }
                photoViewer3.p6 = -1;
                photoViewer3.f6 = 1.0f;
                photoViewer3.b6 = 1.0f;
                photoViewer3.d6 = 0.0f;
                photoViewer3.e6 = 0.0f;
                photoViewer3.z3(1.0f);
                photoViewer3.u2 = true;
                photoViewer3.f0.invalidate();
                break;
            case 13:
                ((PhotoViewer) ((mp0) obj).r0).z3[0].setTag(null);
                break;
            case 14:
                ((np0) obj).d.U1.l0 = 1.0f;
                break;
            case 15:
                PhotoViewer photoViewer4 = ((np0) obj).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.l0 = 1.0f;
                break;
            case 16:
                org.telegram.messenger.g0.h3(new sg0(this, 22));
                break;
            case 17:
                ep0 ep0Var = (ep0) obj;
                if (animator.equals(ep0Var.c.V7)) {
                    ep0Var.c.V7 = null;
                    break;
                }
                break;
            case 18:
                jq0 jq0Var = (jq0) obj;
                if (jq0Var.e == animator) {
                    jq0Var.c[1].setVisibility(8);
                    jq0Var.e = null;
                    break;
                }
                break;
            case 19:
                vq0 vq0Var = (vq0) obj;
                if (vq0Var.C != null) {
                    vq0Var.C = null;
                    vq0Var.b();
                    break;
                }
                break;
            case 20:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Z;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Z = null;
                    break;
                }
                break;
            case 21:
                ((uu0) obj).b.Q5 = null;
                break;
            case 22:
                cw0 cw0Var = (cw0) obj;
                if (!cw0Var.F) {
                    cw0Var.setVisibility(8);
                    break;
                }
                break;
            case 23:
                yw0 yw0Var = (yw0) obj;
                if (animator.equals(yw0Var.d)) {
                    yw0Var.d = null;
                    break;
                }
                break;
            case 24:
                ((yy0) obj).d.Z.l0 = 1.0f;
                break;
            case 25:
                SecretMediaViewer secretMediaViewer = ((yy0) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.l0 = 1.0f;
                break;
            case 26:
                g11 g11Var = ((xz0) obj).e;
                g11Var.T0.H = 0.0f;
                g11Var.T0 = null;
                g11Var.i0.invalidate();
                break;
            case 27:
                dh.d0.a();
                g11 g11Var2 = (g11) obj;
                e01 e01Var = g11Var2.i0;
                e01 e01Var2 = g11Var2.i0;
                e01Var.setLayerType(0, null);
                yz0 yz0Var = g11Var2.g0;
                yz0Var.setLayerType(0, null);
                g11Var2.f0.setLayerType(0, null);
                g11Var2.c0.setLayerType(0, null);
                org.telegram.ui.Components.sm smVar = g11Var2.o0;
                if (smVar != null) {
                    smVar.setLayerType(0, null);
                }
                View view = g11Var2.n0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                yz0Var.b();
                g11Var2.e0.m(false);
                org.telegram.messenger.hs.e().k(99, 512);
                g11Var2.Y1.e();
                org.telegram.messenger.g0.h3(new pu0(org.telegram.messenger.hs.e(), 14));
                g11Var2.h();
                g11Var2.E(1.0f);
                for (int i10 = 0; i10 < e01Var2.getChildCount(); i10++) {
                    View childAt = e01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < g11Var2.e0.b.getChildCount(); i11++) {
                    View childAt2 = g11Var2.e0.b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                g11Var2.e0.b.invalidate();
                g11Var2.l0.invalidate();
                e01Var2.invalidate();
                break;
            case 28:
                ((r41) obj).b0.setVisibility(8);
                break;
            default:
                l71 l71Var = ((a71) obj).a;
                if (!l71Var.r1.a()) {
                    l71Var.T1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 11:
                hp0 hp0Var = (hp0) this.b;
                hp0Var.b.V0.setVisibility(0);
                hp0Var.b.D1.setVisibility(0);
                break;
            case 12:
                break;
            case 22:
                ((cw0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
