package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 7:
                ((r0.n0) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                nc1 nc1Var = ((bc1) this.b).a;
                if (!nc1Var.l1.a()) {
                    nc1Var.N1.setVisibility(8);
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((qd1) this.b).a = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                ((ue1) this.b).setScrollEnabled(true);
                break;
            case 3:
                yf1 yf1Var = (yf1) this.b;
                if (animator.equals(yf1Var.e.G)) {
                    yf1Var.e.G = null;
                    break;
                }
                break;
            case 4:
                pg1 pg1Var = (pg1) this.b;
                pg1Var.d = null;
                pg1Var.a = null;
                pg1Var.b = false;
                pg1Var.f.c.setAllowDrawCursor(true);
                break;
            case 5:
                org.telegram.ui.Components.ze0 ze0Var = (org.telegram.ui.Components.ze0) this.b;
                ((hi1) ze0Var.b).getClass();
                ((hi1) ze0Var.b).c.setVisibility(4);
                break;
            case 6:
                ((org.telegram.ui.web.z0) this.b).s.setVisibility(8);
                break;
            case 7:
                ((r0.n0) this.b).c();
                break;
            case 8:
                super.onAnimationEnd(animator);
                rf.g gVar = (rf.g) this.b;
                if (!gVar.e1) {
                    gVar.q0 = false;
                    gVar.p0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.b0 = false;
                break;
            case 9:
                ((tf.e) this.b).h.setVisibility(8);
                break;
            case 10:
                ((CropAreaView) this.b).V = null;
                break;
            case 11:
                yf.d0 d0Var = (yf.d0) this.b;
                d0Var.a.getPainting().c(null, d0Var.a.getCurrentColor(), true, null);
                d0Var.r = null;
                break;
            case 12:
                super.onAnimationEnd(animator);
                zf.k0 k0Var = (zf.k0) this.b;
                ImageView imageView = k0Var.c;
                k0Var.c = k0Var.d;
                k0Var.d = imageView;
                imageView.bringToFront();
                k0Var.d.setVisibility(8);
                k0Var.h = null;
                break;
            default:
                zf.r1 r1Var = (zf.r1) this.b;
                if (animator == r1Var.r) {
                    r1Var.f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.r = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 7:
                ((r0.n0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public zb1(r0.n0 n0Var, View view) {
        this.a = 7;
        this.b = n0Var;
    }
}
