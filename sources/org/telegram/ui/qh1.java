package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class qh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.t1 a;
    public final /* synthetic */ org.telegram.ui.Components.si b;
    public final /* synthetic */ rh1 c;

    public qh1(rh1 rh1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.si siVar) {
        this.c = rh1Var;
        this.a = t1Var;
        this.b = siVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.b;
        ArrayList arrayList = (ArrayList) siVar.c;
        rh1 rh1Var = this.c;
        arrayList.remove(rh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = rh1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
