package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class th1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.s1 a;
    public final /* synthetic */ org.telegram.ui.Components.si b;
    public final /* synthetic */ uh1 c;

    public th1(uh1 uh1Var, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Components.si siVar) {
        this.c = uh1Var;
        this.a = s1Var;
        this.b = siVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.b;
        ArrayList arrayList = (ArrayList) siVar.c;
        uh1 uh1Var = this.c;
        arrayList.remove(uh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = uh1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
