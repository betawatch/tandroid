package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class j2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j2(Object obj, int i10) {
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
                a3 a3Var = ((k2) this.b).h;
                a3Var.C.setVisibility(8);
                a3Var.d.setVisibility(8);
                break;
            case 1:
                f3 f3Var = (f3) this.b;
                f3Var.l0 = 1.0f;
                f3Var.invalidate();
                break;
            case 2:
                super.onAnimationEnd(animator);
                z4 z4Var = (z4) this.b;
                ImageView imageView = z4Var.c;
                z4Var.c = z4Var.d;
                z4Var.d = imageView;
                imageView.bringToFront();
                z4Var.d.setVisibility(8);
                z4Var.h = null;
                break;
            case 3:
                super.onAnimationEnd(animator);
                ((d5) this.b).w = null;
                break;
            case 4:
                w5 w5Var = (w5) this.b;
                if (w5Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) w5Var.getParent()).removeView(w5Var);
                    break;
                }
                break;
            case 5:
                ((x7) this.b).K = false;
                break;
            case 6:
                v7 v7Var = (v7) this.b;
                v7Var.setTranslationY(0.0f);
                v7Var.d = null;
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

    public j2(r0.n0 n0Var, View view) {
        this.a = 7;
        this.b = n0Var;
    }
}
