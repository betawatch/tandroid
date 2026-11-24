// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
                ci0 ci0Var = (ci0) obj;
                ci0Var.g = f;
                ci0Var.invalidateSelf();
                break;
            case 2:
                ez0 ez0Var = (ez0) obj;
                ez0Var.i = f;
                ez0Var.b.invalidate();
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                chatActivityEnterView.C6 = null;
                chatActivityEnterView.D6 = false;
                if (!chatActivityEnterView.O2) {
                    sy1 sy1Var = chatActivityEnterView.F0;
                    if (sy1Var != null) {
                        sy1Var.setText("");
                        chatActivityEnterView.F0.setAlpha(1.0f);
                    }
                    un3 un3Var = chatActivityEnterView.j1;
                    if (un3Var != null) {
                        un3Var.m();
                    }
                    chatActivityEnterView.R0.invalidate();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new go1(this, f, b3));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(d53.g);
                    ofFloat.start();
                    break;
                }
                break;
            case 4:
                th8 th8Var = (th8) obj;
                th8Var.I.e();
                th8Var.b = f;
                if (f <= 0.0f) {
                    th8Var.H = -1;
                }
                th8Var.c(true);
                th8Var.f = false;
                if (th8Var.Q != null && Math.abs(f - 1.0f) < 0.01f) {
                    th8Var.Q.run();
                    break;
                }
                break;
            case 5:
                ku8 ku8Var = (ku8) obj;
                soc socVar = ku8Var.r;
                socVar.getClass();
                socVar.setLayerType(0, null);
                if (f != 0.0f) {
                    if (!ku8Var.S) {
                        ValueAnimator valueAnimator = ku8Var.Q;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(ku8Var.R, 1.0f);
                        ku8Var.Q = ofFloat2;
                        ofFloat2.setDuration(320L);
                        ku8Var.Q.setInterpolator(d53.g);
                        ku8Var.Q.addUpdateListener(new hu8(ku8Var, b2));
                        ku8Var.Q.start();
                        break;
                    }
                } else {
                    ku8Var.b();
                    break;
                }
                break;
            case 6:
                r19 r19Var = (r19) obj;
                r19Var.G = f;
                r19Var.invalidate();
                break;
            case 7:
                ColorMatrix colorMatrix = new ColorMatrix();
                jla jlaVar = (jla) obj;
                jlaVar.w = f;
                colorMatrix.setSaturation(f);
                if (cmb.I.o()) {
                    gm.h(colorMatrix, (1.0f - jlaVar.w) * (-0.3f));
                }
                jlaVar.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            default:
                goc gocVar = (goc) obj;
                if (gocVar.n0 == animator) {
                    gocVar.n0 = null;
                    gocVar.Q0(f);
                    gocVar.s0.m(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                th8 th8Var = (th8) this.c;
                th8Var.f = true;
                th8Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
