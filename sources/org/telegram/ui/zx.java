package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zx(Object obj, int i7) {
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
                ((PhotoViewer) ((org.telegram.ui.Components.f10) this.b).c).B2 = null;
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
                org.telegram.ui.Components.z70 z70Var = (org.telegram.ui.Components.z70) obj;
                FrameLayout frameLayout = z70Var.b;
                hi.w5 w5Var = (hi.w5) z70Var.c;
                if (w5Var.getParent() != null) {
                    frameLayout.removeView(w5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) z70Var.d);
                break;
            case 1:
                e40 e40Var = ((g30) obj).o;
                e40 e40Var2 = e40.C5;
                e40Var.e1();
                e40Var.b.invalidate();
                e40Var.L1.invalidate();
                if (e40Var.n2) {
                    e40Var.n2 = false;
                    e40Var.R0(true);
                    break;
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                s30 s30Var = (s30) obj;
                s30Var.G = null;
                e40 e40Var3 = s30Var.L;
                e40Var3.L1.invalidate();
                e40Var3.Z3.invalidate();
                e40Var3.b.invalidate();
                e40.Q0(e40Var3);
                s30Var.H.clear();
                s30Var.I.clear();
                break;
            case 3:
                z50 z50Var = (z50) obj;
                z50Var.a = null;
                z50Var.b = false;
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
                ((mg0) obj).U.setVisibility(8);
                break;
            case 7:
                fh0 fh0Var = (fh0) obj;
                fh0Var.f = 1.0f;
                fh0Var.invalidate();
                break;
            case 8:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 9:
                jm0 jm0Var = (jm0) obj;
                bc bcVar = jm0Var.Y;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) jm0Var.Y.getParent()).removeView(jm0Var.Y);
                    }
                    jm0Var.Y = null;
                }
                jm0Var.a0 = null;
                super.onAnimationEnd(animator);
                break;
            case 10:
                cn0 cn0Var = (cn0) obj;
                dn0 dn0Var = cn0Var.n0;
                org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.n;
                dn0Var.r = null;
                if (dn0Var.x) {
                    y4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.y4 y4Var = y4VarArr[0];
                    y4VarArr[0] = y4VarArr[1];
                    y4VarArr[1] = y4Var;
                    y4Var.setVisibility(8);
                    dn0Var.e = dn0Var.n[0].b == dn0Var.h.getFirstTabId();
                    dn0Var.h.i(1.0f, dn0Var.n[0].b);
                }
                dn0Var.s = false;
                cn0Var.i0 = false;
                cn0Var.h0 = false;
                kVar = ((org.telegram.ui.ActionBar.g2) dn0Var).actionBar;
                kVar.setEnabled(true);
                dn0Var.h.setEnabled(true);
                break;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.f10) obj).c;
                if (photoViewer.B2 != null) {
                    gf0 gf0Var = new gf0(this, 21);
                    photoViewer.I2 = gf0Var;
                    org.telegram.messenger.g0.h3(gf0Var, 860L);
                    break;
                }
                break;
            case 12:
                rp0 rp0Var = (rp0) obj;
                PhotoViewer photoViewer2 = rp0Var.b;
                og.o oVar = photoViewer2.D1.b;
                oVar.q();
                CropAreaView cropAreaView = oVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.b.K = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = rp0Var.a;
                photoViewer2.b1().M.b(photoViewer2.u4 != 0);
                hi.x3 x3Var = photoViewer2.L1;
                if (x3Var != null) {
                    x3Var.b(photoViewer2.u4 != 3);
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
                photoViewer2.u2 = true;
                photoViewer2.f0.invalidate();
                break;
            case 13:
                sp0 sp0Var = (sp0) obj;
                PhotoViewer photoViewer3 = sp0Var.b;
                photoViewer3.J1.j0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = sp0Var.a;
                photoViewer3.b1().M.b(photoViewer3.u4 != 0);
                hi.x3 x3Var2 = photoViewer3.L1;
                if (x3Var2 != null) {
                    x3Var2.b(photoViewer3.u4 != 3);
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
                photoViewer3.u2 = true;
                photoViewer3.f0.invalidate();
                break;
            case 14:
                ((PhotoViewer) ((wp0) obj).r0).y3[0].setTag(null);
                break;
            case 15:
                ((xp0) obj).d.U1.l0 = 1.0f;
                break;
            case 16:
                PhotoViewer photoViewer4 = ((xp0) obj).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.l0 = 1.0f;
                break;
            case 17:
                org.telegram.messenger.g0.g3(new gf0(this, 23));
                break;
            case 18:
                op0 op0Var = (op0) obj;
                if (animator.equals(op0Var.c.a8)) {
                    op0Var.c.a8 = null;
                    break;
                }
                break;
            case 19:
                tq0 tq0Var = (tq0) obj;
                if (tq0Var.e == animator) {
                    tq0Var.c[1].setVisibility(8);
                    tq0Var.e = null;
                    break;
                }
                break;
            case 20:
                fr0 fr0Var = (fr0) obj;
                if (fr0Var.C != null) {
                    fr0Var.C = null;
                    fr0Var.b();
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
                ((cv0) obj).b.V5 = null;
                break;
            case 23:
                kw0 kw0Var = (kw0) obj;
                if (!kw0Var.F) {
                    kw0Var.setVisibility(8);
                    break;
                }
                break;
            case 24:
                hx0 hx0Var = (hx0) obj;
                if (animator.equals(hx0Var.d)) {
                    hx0Var.d = null;
                    break;
                }
                break;
            case 25:
                ((iz0) obj).d.Z.l0 = 1.0f;
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = ((iz0) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.l0 = 1.0f;
                break;
            case 27:
                q11 q11Var = ((h01) obj).e;
                q11Var.T0.H = 0.0f;
                q11Var.T0 = null;
                q11Var.i0.invalidate();
                break;
            case 28:
                ch.f0.a();
                q11 q11Var2 = (q11) obj;
                o01 o01Var = q11Var2.i0;
                o01 o01Var2 = q11Var2.i0;
                o01Var.setLayerType(0, null);
                i01 i01Var = q11Var2.g0;
                i01Var.setLayerType(0, null);
                q11Var2.f0.setLayerType(0, null);
                q11Var2.c0.setLayerType(0, null);
                org.telegram.ui.Components.in inVar = q11Var2.o0;
                if (inVar != null) {
                    inVar.setLayerType(0, null);
                }
                View view = q11Var2.n0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                i01Var.b();
                q11Var2.e0.m(false);
                org.telegram.messenger.ks.e().k(99, 512);
                q11Var2.Y1.e();
                org.telegram.messenger.g0.g3(new qu0(org.telegram.messenger.ks.e(), 15));
                q11Var2.h();
                q11Var2.E(1.0f);
                for (int i10 = 0; i10 < o01Var2.getChildCount(); i10++) {
                    View childAt = o01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < q11Var2.e0.b.getChildCount(); i11++) {
                    View childAt2 = q11Var2.e0.b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                q11Var2.e0.b.invalidate();
                q11Var2.l0.invalidate();
                o01Var2.invalidate();
                break;
            default:
                ((b51) obj).b0.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 12:
                rp0 rp0Var = (rp0) this.b;
                rp0Var.b.V0.setVisibility(0);
                rp0Var.b.D1.setVisibility(0);
                break;
            case 13:
                break;
            case 23:
                ((kw0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
