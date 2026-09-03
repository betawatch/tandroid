package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class i2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i2(Object obj, int i10) {
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
                z2 z2Var = ((j2) this.b).h;
                z2Var.C.setVisibility(8);
                z2Var.d.setVisibility(8);
                break;
            case 1:
                e3 e3Var = (e3) this.b;
                e3Var.l0 = 1.0f;
                e3Var.invalidate();
                break;
            case 2:
                super.onAnimationEnd(animator);
                y4 y4Var = (y4) this.b;
                ImageView imageView = y4Var.c;
                y4Var.c = y4Var.d;
                y4Var.d = imageView;
                imageView.bringToFront();
                y4Var.d.setVisibility(8);
                y4Var.h = null;
                break;
            case 3:
                super.onAnimationEnd(animator);
                ((c5) this.b).w = null;
                break;
            case 4:
                v5 v5Var = (v5) this.b;
                if (v5Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) v5Var.getParent()).removeView(v5Var);
                    break;
                }
                break;
            case 5:
                ((w7) this.b).K = false;
                break;
            case 6:
                u7 u7Var = (u7) this.b;
                u7Var.setTranslationY(0.0f);
                u7Var.d = null;
                break;
            case 7:
                ((r0.n0) this.b).c();
                break;
            case 8:
                sh.v vVar = (sh.v) this.b;
                vVar.setVisibility(8);
                vVar.a = null;
                break;
            case 9:
                ((sh.p2) this.b).y.setVisibility(8);
                break;
            case 10:
                ((sh.n3) this.b).F.setVisibility(8);
                break;
            case 11:
                super.onAnimationEnd(animator);
                wf.g gVar = (wf.g) this.b;
                if (!gVar.f1) {
                    gVar.r0 = false;
                    gVar.q0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.c0 = false;
                break;
            case 12:
                ((yf.e) this.b).h.setVisibility(8);
                break;
            default:
                ((CropAreaView) this.b).W = null;
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

    public i2(r0.n0 n0Var, View view) {
        this.a = 7;
        this.b = n0Var;
    }
}
