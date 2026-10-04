package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class vc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd1 b;

    public /* synthetic */ vc1(rd1 rd1Var, int i10) {
        this.a = i10;
        this.b = rd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                rd1 rd1Var = this.b;
                rd1Var.x0.invalidate();
                rd1Var.w0[1].setVisibility(8);
                rd1Var.c2 = null;
                break;
            case 1:
                this.b.B0 = null;
                break;
            case 2:
                rd1 rd1Var2 = this.b;
                if (rd1Var2.D0.getTag() == null) {
                    rd1Var2.D0.setVisibility(4);
                }
                rd1Var2.H0 = null;
                break;
            case 3:
                rd1 rd1Var3 = this.b;
                if (rd1Var3.E0.getTag() == null) {
                    rd1Var3.E0.setVisibility(4);
                }
                rd1Var3.I0 = null;
                break;
            case 4:
                rd1 rd1Var4 = this.b;
                mc mcVar = rd1Var4.h2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) rd1Var4.h2.getParent()).removeView(rd1Var4.h2);
                    }
                    rd1Var4.h2 = null;
                }
                rd1Var4.j2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                rd1 rd1Var5 = this.b;
                if (!rd1Var5.p1.a()) {
                    rd1Var5.R1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
