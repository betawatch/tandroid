package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ss0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ss0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((PhotoViewer) ((org.telegram.ui.Components.ex0) this.b).c).x2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ex0) obj).c;
                if (photoViewer.x2 != null) {
                    gl0 gl0Var = new gl0(this, 17);
                    photoViewer.F2 = gl0Var;
                    AndroidUtilities.runOnUIThread(gl0Var, 860L);
                    break;
                }
                break;
            case 1:
                it0 it0Var = (it0) obj;
                PhotoViewer photoViewer2 = it0Var.b;
                yf.n nVar = photoViewer2.z1.b;
                nVar.q();
                CropAreaView cropAreaView = nVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.z1.b.G = true;
                photoViewer2.m6 = null;
                photoViewer2.r4 = it0Var.a;
                photoViewer2.f1().I.b(photoViewer2.r4 != 0);
                ph.i3 i3Var = photoViewer2.H1;
                if (i3Var != null) {
                    i3Var.b(photoViewer2.r4 != 3);
                }
                if (photoViewer2.r4 != 3) {
                    photoViewer2.W5 = 0.0f;
                }
                photoViewer2.l6 = -1;
                photoViewer2.b6 = 1.0f;
                photoViewer2.X5 = 1.0f;
                photoViewer2.Z5 = 0.0f;
                photoViewer2.a6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.q2 = true;
                photoViewer2.b0.invalidate();
                break;
            case 2:
                jt0 jt0Var = (jt0) obj;
                PhotoViewer photoViewer3 = jt0Var.b;
                photoViewer3.F1.f0.setVisibility(0);
                photoViewer3.m6 = null;
                photoViewer3.r4 = jt0Var.a;
                photoViewer3.f1().I.b(photoViewer3.r4 != 0);
                ph.i3 i3Var2 = photoViewer3.H1;
                if (i3Var2 != null) {
                    i3Var2.b(photoViewer3.r4 != 3);
                }
                if (photoViewer3.r4 != 3) {
                    photoViewer3.W5 = 0.0f;
                }
                photoViewer3.l6 = -1;
                photoViewer3.b6 = 1.0f;
                photoViewer3.X5 = 1.0f;
                photoViewer3.Z5 = 0.0f;
                photoViewer3.a6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.q2 = true;
                photoViewer3.b0.invalidate();
                break;
            case 3:
                ((PhotoViewer) ((nt0) obj).n0).v3[0].setTag(null);
                break;
            case 4:
                ((ot0) obj).d.Q1.h0 = 1.0f;
                break;
            case 5:
                PhotoViewer photoViewer4 = ((ot0) obj).d;
                photoViewer4.Q1.setVisibility(4);
                photoViewer4.Q1.h0 = 1.0f;
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new gl0(this, 19));
                break;
            case 7:
                ft0 ft0Var = (ft0) obj;
                if (animator.equals(ft0Var.c.Q7)) {
                    ft0Var.c.Q7 = null;
                    break;
                }
                break;
            case 8:
                nu0 nu0Var = (nu0) obj;
                if (nu0Var.e == animator) {
                    nu0Var.c[1].setVisibility(8);
                    nu0Var.e = null;
                    break;
                }
                break;
            case 9:
                cv0 cv0Var = (cv0) obj;
                if (cv0Var.C != null) {
                    cv0Var.C = null;
                    cv0Var.b();
                    break;
                }
                break;
            case 10:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.V;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.V = null;
                    break;
                }
                break;
            case 11:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.a0.removeView(premiumPreviewFragment.o0);
                premiumPreviewFragment.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 12:
                ((ProfileActivity) ((org.telegram.ui.Components.ex0) obj).c).A5 = null;
                break;
            case 13:
                o01 o01Var = (o01) obj;
                if (!o01Var.B) {
                    o01Var.setVisibility(8);
                    break;
                }
                break;
            case 14:
                l11 l11Var = (l11) obj;
                if (animator.equals(l11Var.c)) {
                    l11Var.c = null;
                    break;
                }
                break;
            case 15:
                t21 t21Var = (t21) obj;
                org.telegram.ui.Components.to toVar = t21Var.L;
                if (toVar != null) {
                    if (toVar.getParent() != null) {
                        ((ViewGroup) t21Var.L.getParent()).removeView(t21Var.L);
                    }
                    t21Var.L = null;
                }
                t21Var.K = null;
                super.onAnimationEnd(animator);
                break;
            case 16:
                ((l41) obj).d.X.h0 = 1.0f;
                break;
            case 17:
                SecretMediaViewer secretMediaViewer = ((l41) obj).d;
                secretMediaViewer.X.setVisibility(4);
                secretMediaViewer.X.h0 = 1.0f;
                break;
            case 18:
                x61 x61Var = ((m51) obj).e;
                x61Var.P0.D = 0.0f;
                x61Var.P0 = null;
                x61Var.e0.invalidate();
                break;
            case 19:
                mg.g0.a();
                x61 x61Var2 = (x61) obj;
                t51 t51Var = x61Var2.e0;
                t51 t51Var2 = x61Var2.e0;
                t51Var.setLayerType(0, null);
                n51 n51Var = x61Var2.c0;
                n51Var.setLayerType(0, null);
                x61Var2.b0.setLayerType(0, null);
                x61Var2.V.setLayerType(0, null);
                org.telegram.ui.Components.gn gnVar = x61Var2.k0;
                if (gnVar != null) {
                    gnVar.setLayerType(0, null);
                }
                View view = x61Var2.j0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                n51Var.b();
                x61Var2.a0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                x61Var2.T1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new sz0(globalInstance, 13));
                x61Var2.h();
                x61Var2.E(1.0f);
                for (int i11 = 0; i11 < t51Var2.getChildCount(); i11++) {
                    View childAt = t51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < x61Var2.a0.b.getChildCount(); i12++) {
                    View childAt2 = x61Var2.a0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                x61Var2.a0.b.invalidate();
                x61Var2.h0.invalidate();
                t51Var2.invalidate();
                break;
            case 20:
                ((oa1) obj).Y.setVisibility(8);
                break;
            case 21:
                jd1 jd1Var = ((xc1) obj).a;
                if (!jd1Var.m1.a()) {
                    jd1Var.O1.setVisibility(8);
                    break;
                }
                break;
            case 22:
                super.onAnimationEnd(animator);
                ((le1) obj).a = null;
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((qf1) obj).setScrollEnabled(true);
                break;
            case 24:
                vg1 vg1Var = (vg1) obj;
                if (animator.equals(vg1Var.e.H)) {
                    vg1Var.e.H = null;
                    break;
                }
                break;
            case 25:
                mh1 mh1Var = (mh1) obj;
                mh1Var.d = null;
                mh1Var.a = null;
                mh1Var.b = false;
                mh1Var.f.c.setAllowDrawCursor(true);
                break;
            case 26:
                org.telegram.ui.Components.sf0 sf0Var = (org.telegram.ui.Components.sf0) obj;
                ((dj1) sf0Var.b).getClass();
                ((dj1) sf0Var.b).c.setVisibility(4);
                break;
            case 27:
                ((org.telegram.ui.web.c1) obj).s.setVisibility(8);
                break;
            case 28:
                ph.k kVar = ((ph.f) obj).W;
                if (kVar.d0 == animator) {
                    kVar.d0 = null;
                    kVar.f.getEditText().setScrollY(kVar.V);
                    break;
                }
                break;
            default:
                ph.x xVar = (ph.x) obj;
                xVar.l = 1.0f;
                ph.y yVar = xVar.p;
                if (yVar.n.contains(xVar)) {
                    xVar.c.onDetachedFromWindow();
                    eg.t2 t2Var = xVar.d;
                    if (t2Var != null) {
                        t2Var.pause();
                        xVar.d.release(null);
                        xVar.d = null;
                    }
                    TextureView textureView = xVar.e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        xVar.e = null;
                    }
                    xVar.f = false;
                    yVar.n.remove(xVar);
                }
                yVar.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                it0 it0Var = (it0) this.b;
                it0Var.b.R0.setVisibility(0);
                it0Var.b.z1.setVisibility(0);
                break;
            case 2:
                break;
            case 13:
                ((o01) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
