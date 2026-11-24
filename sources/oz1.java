// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oz1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ FrameLayout c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ oz1(FrameLayout frameLayout, int i, byte b) {
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
                    chatActivityEnterView.q3 = 0;
                }
                chatActivityEnterView.W0 = null;
                chatActivityEnterView.x2.setTranslationY(0.0f);
                chatActivityEnterView.x2.setVisibility(8);
                chatActivityEnterView.A4.e();
                uz1 uz1Var = chatActivityEnterView.P3;
                if (uz1Var != null) {
                    uz1Var.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 1:
                w14 w14Var = (w14) frameLayout;
                w14Var.r.setVisibility(b2 == 1 ? 0 : 8);
                w14Var.h.setVisibility(b2 == 2 ? 0 : 8);
                w14Var.n.setVisibility(b2 != 3 ? 8 : 0);
                break;
            default:
                wb5 wb5Var = (wb5) frameLayout;
                if (!wb5Var.c()) {
                    wb5Var.b(b2);
                }
                wb5Var.e0 = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                w14 w14Var = (w14) this.c;
                w14Var.r.setVisibility(0);
                w14Var.h.setVisibility(0);
                w14Var.n.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
