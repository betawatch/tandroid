package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yi1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.u1 a;
    public final /* synthetic */ org.telegram.ui.Components.xi b;
    public final /* synthetic */ zi1 c;

    public yi1(zi1 zi1Var, org.telegram.ui.Cells.u1 u1Var, org.telegram.ui.Components.xi xiVar) {
        this.c = zi1Var;
        this.a = u1Var;
        this.b = xiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.xi xiVar = this.b;
        ArrayList arrayList = (ArrayList) xiVar.c;
        zi1 zi1Var = this.c;
        arrayList.remove(zi1Var);
        xiVar.a();
        ((ViewGroup) xiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = zi1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
