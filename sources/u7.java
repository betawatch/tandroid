// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class u7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u7(Object obj, float f, byte b) {
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 0;
        float f = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                x7 x7Var = (x7) obj;
                x7Var.U = null;
                x7Var.a = f;
                x7Var.invalidate();
                break;
            case 1:
                dh0 dh0Var = (dh0) obj;
                dh0Var.g = f;
                dh0Var.invalidateSelf();
                break;
            case 2:
                fy0 fy0Var = (fy0) obj;
                fy0Var.i = f;
                fy0Var.b.invalidate();
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                chatActivityEnterView.b7 = null;
                chatActivityEnterView.c7 = false;
                if (!chatActivityEnterView.N2) {
                    tx1 tx1Var = chatActivityEnterView.F0;
                    if (tx1Var != null) {
                        tx1Var.setText("");
                        chatActivityEnterView.F0.setAlpha(1.0f);
                    }
                    bn3 bn3Var = chatActivityEnterView.j1;
                    if (bn3Var != null) {
                        bn3Var.o();
                    }
                    chatActivityEnterView.R0.invalidate();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new qm1(this, f, b2));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(k43.g);
                    ofFloat.start();
                    break;
                }
                break;
            case 4:
                fj8 fj8Var = (fj8) obj;
                fj8Var.I.e();
                fj8Var.b = f;
                if (f <= 0.0f) {
                    fj8Var.H = -1;
                }
                fj8Var.c(true);
                fj8Var.f = false;
                if (fj8Var.Q != null && Math.abs(f - 1.0f) < 0.01f) {
                    fj8Var.Q.run();
                    break;
                }
                break;
            case 5:
                sv8 sv8Var = (sv8) obj;
                frc frcVar = sv8Var.r;
                frcVar.getClass();
                frcVar.setLayerType(0, null);
                if (f != 0.0f) {
                    if (!sv8Var.S) {
                        ValueAnimator valueAnimator = sv8Var.Q;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(sv8Var.R, 1.0f);
                        sv8Var.Q = ofFloat2;
                        ofFloat2.setDuration(320L);
                        sv8Var.Q.setInterpolator(k43.g);
                        sv8Var.Q.addUpdateListener(new nv8(sv8Var, b3));
                        sv8Var.Q.start();
                        break;
                    }
                } else {
                    sv8Var.b();
                    break;
                }
                break;
            case 6:
                e39 e39Var = (e39) obj;
                e39Var.G = f;
                e39Var.invalidate();
                break;
            case 7:
                ColorMatrix colorMatrix = new ColorMatrix();
                bna bnaVar = (bna) obj;
                bnaVar.w = f;
                colorMatrix.setSaturation(f);
                if (aob.I.o()) {
                    hl.h(colorMatrix, (1.0f - bnaVar.w) * (-0.3f));
                }
                bnaVar.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            default:
                uqc uqcVar = (uqc) obj;
                if (uqcVar.n0 == animator) {
                    uqcVar.n0 = null;
                    uqcVar.P0(f);
                    uqcVar.s0.m(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                fj8 fj8Var = (fj8) this.c;
                fj8Var.f = true;
                fj8Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
