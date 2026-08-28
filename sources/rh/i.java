package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import f2.q1;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.t1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i extends AnimatorListenerAdapter {
    public final /* synthetic */ q1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ m d;

    public i(m mVar, q1 q1Var, int i9, View view) {
        this.d = mVar;
        this.a = q1Var;
        this.b = i9;
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
        q1 q1Var = this.a;
        View view = q1Var.a;
        m mVar = this.d;
        mVar.X(view);
        View view2 = q1Var.a;
        if (view2 instanceof t1) {
            t1 t1Var = (t1) view2;
            if (t1Var.bd) {
                t1Var.bd = false;
                t1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (mVar.z.remove(q1Var)) {
            mVar.v(q1Var);
            mVar.G();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
