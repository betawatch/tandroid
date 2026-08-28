package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class te1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ te1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 6:
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
                super.onAnimationEnd(animator);
                ((ue1) this.b).setScrollEnabled(true);
                break;
            case 1:
                zf1 zf1Var = (zf1) this.b;
                if (animator.equals(zf1Var.e.G)) {
                    zf1Var.e.G = null;
                    break;
                }
                break;
            case 2:
                qg1 qg1Var = (qg1) this.b;
                qg1Var.d = null;
                qg1Var.a = null;
                qg1Var.b = false;
                qg1Var.f.c.setAllowDrawCursor(true);
                break;
            case 3:
                org.telegram.ui.Components.ve0 ve0Var = (org.telegram.ui.Components.ve0) this.b;
                ((ii1) ve0Var.b).getClass();
                ((ii1) ve0Var.b).c.setVisibility(4);
                break;
            case 4:
                ((org.telegram.ui.web.y0) this.b).s.setVisibility(8);
                break;
            case 5:
                super.onAnimationEnd(animator);
                qf.g gVar = (qf.g) this.b;
                if (!gVar.e1) {
                    gVar.q0 = false;
                    gVar.p0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.b0 = false;
                break;
            case 6:
                ((r0.n0) this.b).c();
                break;
            case 7:
                ((sf.e) this.b).h.setVisibility(8);
                break;
            case 8:
                ((CropAreaView) this.b).V = null;
                break;
            case 9:
                xf.d0 d0Var = (xf.d0) this.b;
                d0Var.a.getPainting().c(null, d0Var.a.getCurrentColor(), true, null);
                d0Var.r = null;
                break;
            case 10:
                super.onAnimationEnd(animator);
                yf.k0 k0Var = (yf.k0) this.b;
                ImageView imageView = k0Var.c;
                k0Var.c = k0Var.d;
                k0Var.d = imageView;
                imageView.bringToFront();
                k0Var.d.setVisibility(8);
                k0Var.h = null;
                break;
            case 11:
                yf.r1 r1Var = (yf.r1) this.b;
                if (animator == r1Var.r) {
                    r1Var.f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.r = null;
                    break;
                }
                break;
            case 12:
                zf.p0 p0Var = (zf.p0) this.b;
                p0Var.n = p0Var.h ? 1.0f : 0.0f;
                p0Var.e();
                break;
            default:
                zf.z1 z1Var = (zf.z1) ((kh.d0) this.b).b;
                z1Var.B = true;
                z1Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 6:
                ((r0.n0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public te1(r0.n0 n0Var, View view) {
        this.a = 6;
        this.b = n0Var;
    }
}
