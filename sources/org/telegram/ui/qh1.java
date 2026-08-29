package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.s1 a;
    public final /* synthetic */ org.telegram.ui.Components.mi b;
    public final /* synthetic */ rh1 c;

    public qh1(rh1 rh1Var, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Components.mi miVar) {
        this.c = rh1Var;
        this.a = s1Var;
        this.b = miVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.mi miVar = this.b;
        ArrayList arrayList = (ArrayList) miVar.c;
        rh1 rh1Var = this.c;
        arrayList.remove(rh1Var);
        miVar.a();
        ((ViewGroup) miVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = rh1Var.g;
        if (recordCircle != null) {
            recordCircle.J = false;
        }
    }
}
