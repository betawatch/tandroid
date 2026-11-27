// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ui3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ uj3 c;

    public /* synthetic */ ui3(uj3 uj3Var, float f, byte b) {
        this.a = b;
        this.c = uj3Var;
        this.b = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        int i = 0;
        uj3 uj3Var = this.c;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                uj3Var.x3 = null;
                uj3Var.P = false;
                uj3Var.R = true;
                uj3Var.S = true;
                uj3Var.fragmentView.invalidate();
                uj3Var.A3 = -(hl.L((uj3Var.L ? 81 : 0) + 48) - f);
                uj3Var.f0[0].setTranslationY(0.0f);
                while (true) {
                    tj3[] tj3VarArr = uj3Var.f0;
                    if (i >= tj3VarArr.length) {
                        uj3Var.fragmentView.requestLayout();
                        hj3 hj3Var = uj3Var.Y;
                        if (hj3Var != null && uj3Var.b.f) {
                            hj3Var.r.requestFocus();
                            hl.E3(uj3Var.Y.r);
                            break;
                        }
                    } else {
                        tj3 tj3Var = tj3VarArr[i];
                        if (tj3Var != null) {
                            tj3Var.a.requestLayout();
                        }
                        i++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                uj3Var.x3 = null;
                uj3Var.Q = 0;
                uj3Var.P = true;
                uj3Var.A3 = hl.L((uj3Var.L ? 81 : 0) + 48) - f;
                uj3Var.f0[0].setTranslationY(0.0f);
                int i2 = 0;
                while (true) {
                    tj3[] tj3VarArr2 = uj3Var.f0;
                    if (i2 >= tj3VarArr2.length) {
                        uj3Var.F0.l(false, 1.0f);
                        uj3Var.fragmentView.requestLayout();
                        break;
                    } else {
                        tj3 tj3Var2 = tj3VarArr2[i2];
                        if (tj3Var2 != null) {
                            tj3Var2.a.requestLayout();
                        }
                        i2++;
                    }
                }
        }
    }
}
