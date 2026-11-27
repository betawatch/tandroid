// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ry1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ FrameLayout c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ry1(FrameLayout frameLayout, int i, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        byte b2 = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) frameLayout;
                if (b2 == 0) {
                    chatActivityEnterView.p3 = 0;
                }
                chatActivityEnterView.W0 = null;
                chatActivityEnterView.w2.setTranslationY(0.0f);
                chatActivityEnterView.w2.setVisibility(8);
                chatActivityEnterView.z4.e();
                xy1 xy1Var = chatActivityEnterView.O3;
                if (xy1Var != null) {
                    xy1Var.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 1:
                g14 g14Var = (g14) frameLayout;
                g14Var.r.setVisibility(b2 == 1 ? 0 : 8);
                g14Var.h.setVisibility(b2 == 2 ? 0 : 8);
                g14Var.n.setVisibility(b2 != 3 ? 8 : 0);
                break;
            default:
                zb5 zb5Var = (zb5) frameLayout;
                if (!zb5Var.c()) {
                    zb5Var.b(b2);
                }
                zb5Var.e0 = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                g14 g14Var = (g14) this.c;
                g14Var.r.setVisibility(0);
                g14Var.h.setVisibility(0);
                g14Var.n.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
