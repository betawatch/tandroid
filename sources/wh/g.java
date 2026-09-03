package wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.l1;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ l1 c;
    public final /* synthetic */ n d;

    public g(n nVar, l1 l1Var, View view) {
        this.d = nVar;
        this.c = l1Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                animator.removeAllListeners();
                View view = this.b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                n nVar = this.d;
                ArrayList arrayList = nVar.y;
                l1 l1Var = this.c;
                if (arrayList.remove(l1Var)) {
                    nVar.u(l1Var);
                    nVar.G();
                    break;
                }
                break;
            default:
                animator.removeAllListeners();
                View view2 = this.b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                n nVar2 = this.d;
                ArrayList arrayList2 = nVar2.A;
                l1 l1Var2 = this.c;
                if (arrayList2.remove(l1Var2)) {
                    nVar2.d(l1Var2);
                    nVar2.G();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public g(n nVar, View view, l1 l1Var) {
        this.d = nVar;
        this.b = view;
        this.c = l1Var;
    }
}
