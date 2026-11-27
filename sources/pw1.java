// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pw1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ pw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 5:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.h3 = null;
                    break;
                }
                break;
            case 6:
                if (animator.equals(chatActivityEnterView.g3)) {
                    chatActivityEnterView.g3 = null;
                    break;
                }
                break;
            case 7:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.h3 = null;
                    break;
                }
                break;
            case 8:
                if (animator.equals(chatActivityEnterView.g3)) {
                    chatActivityEnterView.g3 = null;
                    break;
                }
                break;
            case 9:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.h3 = null;
                    break;
                }
                break;
            case 10:
                if (animator.equals(chatActivityEnterView.g3)) {
                    chatActivityEnterView.g3 = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                chatActivityEnterView.W0 = null;
                xy1 xy1Var = chatActivityEnterView.O3;
                if (xy1Var != null) {
                    xy1Var.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                chatActivityEnterView.z4.e();
                break;
            case 1:
                chatActivityEnterView.q4 = null;
                chatActivityEnterView.V0.setLayerType(0, null);
                break;
            case 2:
                chatActivityEnterView.q4 = null;
                chatActivityEnterView.V0.setLayerType(0, null);
                chatActivityEnterView.z4.e();
                break;
            case 3:
                chatActivityEnterView.c0.setVisibility(8);
                break;
            case 4:
                rw1 rw1Var = chatActivityEnterView.f1;
                if (rw1Var != null) {
                    rw1Var.setVisibility(8);
                }
                chatActivityEnterView.A1();
                tx1 tx1Var = chatActivityEnterView.F0;
                if (tx1Var != null) {
                    tx1Var.requestFocus();
                }
                chatActivityEnterView.Y0();
                break;
            case 5:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.e2.setVisibility(8);
                    chatActivityEnterView.h3 = null;
                    break;
                }
                break;
            case 6:
                if (animator.equals(chatActivityEnterView.g3)) {
                    chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView.Q0.setVisibility(8);
                    chatActivityEnterView.a1.setVisibility(8);
                    vw1 vw1Var = chatActivityEnterView.T0;
                    if (vw1Var != null) {
                        vw1Var.setVisibility(8);
                    }
                    chatActivityEnterView.g3 = null;
                    chatActivityEnterView.k3 = (byte) 0;
                    break;
                }
                break;
            case 7:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.h3 = null;
                    break;
                }
                break;
            case 8:
                if (animator.equals(chatActivityEnterView.g3)) {
                    chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    chatActivityEnterView.Q0.setVisibility(8);
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.a1.setVisibility(8);
                    chatActivityEnterView.T0.setVisibility(0);
                    chatActivityEnterView.g3 = null;
                    chatActivityEnterView.k3 = (byte) 0;
                    break;
                }
                break;
            case 9:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.h3 = null;
                    break;
                }
                break;
            case 10:
                if (animator.equals(chatActivityEnterView.g3)) {
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.g3 = null;
                    chatActivityEnterView.k3 = (byte) 0;
                    a aVar = chatActivityEnterView.a1;
                    if (aVar != null) {
                        aVar.setVisibility(0);
                        break;
                    }
                }
                break;
            case 11:
                zw1 zw1Var = chatActivityEnterView.c1;
                if (zw1Var != null) {
                    zw1Var.setScaleX(1.0f);
                    zw1Var.setScaleY(1.0f);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                zw1 zw1Var2 = chatActivityEnterView.c1;
                if (zw1Var2 != null) {
                    zw1Var2.setAlpha(1.0f);
                }
                a aVar2 = chatActivityEnterView.a1;
                if (aVar2 != null) {
                    aVar2.setAlpha(1.0f);
                    break;
                }
                break;
        }
    }
}
