package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ux extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ry c;

    public /* synthetic */ ux(ry ryVar, float f7, int i10) {
        this.a = i10;
        this.c = ryVar;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                ry ryVar = this.c;
                ryVar.u3 = null;
                int i10 = 0;
                ryVar.O = false;
                ryVar.Q = true;
                ryVar.R = true;
                ryVar.fragmentView.invalidate();
                ryVar.x3 = -(AndroidUtilities.dp((ryVar.K ? 81 : 0) + 48) - this.b);
                ryVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    qy[] qyVarArr = ryVar.e0;
                    if (i10 >= qyVarArr.length) {
                        ryVar.fragmentView.requestLayout();
                        hy hyVar = ryVar.X;
                        if (hyVar != null && ryVar.b.f) {
                            hyVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(ryVar.X.r);
                            break;
                        }
                    } else {
                        qy qyVar = qyVarArr[i10];
                        if (qyVar != null) {
                            qyVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ry ryVar2 = this.c;
                ryVar2.u3 = null;
                ryVar2.P = 0;
                ryVar2.O = true;
                ryVar2.x3 = AndroidUtilities.dp((ryVar2.K ? 81 : 0) + 48) - this.b;
                ryVar2.e0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    qy[] qyVarArr2 = ryVar2.e0;
                    if (i11 >= qyVarArr2.length) {
                        ryVar2.E0.l(1.0f, false);
                        ryVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        qy qyVar2 = qyVarArr2[i11];
                        if (qyVar2 != null) {
                            qyVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
