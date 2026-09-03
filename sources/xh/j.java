package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.m1;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.t1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ m1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ n d;

    public j(n nVar, m1 m1Var, int i10, View view) {
        this.d = nVar;
        this.a = m1Var;
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
        m1 m1Var = this.a;
        View view = m1Var.a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = m1Var.a;
        if (view2 instanceof t1) {
            t1 t1Var = (t1) view2;
            if (t1Var.cd) {
                t1Var.cd = false;
                t1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.z.remove(m1Var)) {
            nVar.v(m1Var);
            nVar.G();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
