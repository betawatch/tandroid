package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class wi1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.t1 a;
    public final /* synthetic */ org.telegram.ui.Components.ui b;
    public final /* synthetic */ xi1 c;

    public wi1(xi1 xi1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.ui uiVar) {
        this.c = xi1Var;
        this.a = t1Var;
        this.b = uiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.b;
        ArrayList arrayList = (ArrayList) uiVar.c;
        xi1 xi1Var = this.c;
        arrayList.remove(xi1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = xi1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
