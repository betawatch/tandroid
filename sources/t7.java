// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t7(Object obj, float f, byte b) {
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        byte b2 = 1;
        byte b3 = 2;
        float f = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                w7 w7Var = (w7) obj;
                w7Var.U = null;
                w7Var.a = f;
                w7Var.invalidate();
                break;
            case 1:
                ch0 ch0Var = (ch0) obj;
                ch0Var.g = f;
                ch0Var.invalidateSelf();
                break;
            case 2:
                xx0 xx0Var = (xx0) obj;
                xx0Var.i = f;
                xx0Var.b.invalidate();
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                chatActivityEnterView.C6 = null;
                chatActivityEnterView.D6 = false;
                if (!chatActivityEnterView.O2) {
                    ex1 ex1Var = chatActivityEnterView.F0;
                    if (ex1Var != null) {
                        ex1Var.setText("");
                        chatActivityEnterView.F0.setAlpha(1.0f);
                    }
                    jm3 jm3Var = chatActivityEnterView.j1;
                    if (jm3Var != null) {
                        jm3Var.m();
                    }
                    chatActivityEnterView.R0.invalidate();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new rm1(this, f, b3));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(s33.g);
                    ofFloat.start();
                    break;
                }
                break;
            case 4:
                rf8 rf8Var = (rf8) obj;
                rf8Var.I.e();
                rf8Var.b = f;
                if (f <= 0.0f) {
                    rf8Var.H = -1;
                }
                rf8Var.c(true);
                rf8Var.f = false;
                if (rf8Var.Q != null && Math.abs(f - 1.0f) < 0.01f) {
                    rf8Var.Q.run();
                    break;
                }
                break;
            case 5:
                js8 js8Var = (js8) obj;
                smc smcVar = js8Var.r;
                smcVar.getClass();
                smcVar.setLayerType(0, null);
                if (f != 0.0f) {
                    if (!js8Var.S) {
                        ValueAnimator valueAnimator = js8Var.Q;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(js8Var.R, 1.0f);
                        js8Var.Q = ofFloat2;
                        ofFloat2.setDuration(320L);
                        js8Var.Q.setInterpolator(s33.g);
                        js8Var.Q.addUpdateListener(new gs8(js8Var, b2));
                        js8Var.Q.start();
                        break;
                    }
                } else {
                    js8Var.b();
                    break;
                }
                break;
            case 6:
                qz8 qz8Var = (qz8) obj;
                qz8Var.G = f;
                qz8Var.invalidate();
                break;
            case 7:
                ColorMatrix colorMatrix = new ColorMatrix();
                ija ijaVar = (ija) obj;
                ijaVar.w = f;
                colorMatrix.setSaturation(f);
                if (bkb.I.o()) {
                    gl.h(colorMatrix, (1.0f - ijaVar.w) * (-0.3f));
                }
                ijaVar.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            default:
                hmc hmcVar = (hmc) obj;
                if (hmcVar.n0 == animator) {
                    hmcVar.n0 = null;
                    hmcVar.P0(f);
                    hmcVar.s0.m(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                rf8 rf8Var = (rf8) this.c;
                rf8Var.f = true;
                rf8Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
