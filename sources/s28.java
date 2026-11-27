// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.p;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s28 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ p c;

    public /* synthetic */ s28(p pVar, boolean z, byte b) {
        this.a = b;
        this.c = pVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        p pVar = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = pVar.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    pVar.w = null;
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet2 = pVar.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    pVar.w = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        p pVar = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = pVar.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        pVar.r.setVisibility(4);
                        break;
                    } else {
                        pVar.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                AnimatorSet animatorSet2 = pVar.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        pVar.s.setVisibility(4);
                        break;
                    } else {
                        pVar.V.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
