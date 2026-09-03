package wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.l1;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.s1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ l1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ n d;

    public j(n nVar, l1 l1Var, int i10, View view) {
        this.d = nVar;
        this.a = l1Var;
        this.b = i10;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        l1 l1Var = this.a;
        View view = l1Var.a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = l1Var.a;
        if (view2 instanceof s1) {
            s1 s1Var = (s1) view2;
            if (s1Var.cd) {
                s1Var.cd = false;
                s1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.z.remove(l1Var)) {
            nVar.v(l1Var);
            nVar.G();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
