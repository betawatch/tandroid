package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vi1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.t1 a;
    public final /* synthetic */ org.telegram.ui.Components.ui b;
    public final /* synthetic */ wi1 c;

    public vi1(wi1 wi1Var, org.telegram.ui.Cells.t1 t1Var, org.telegram.ui.Components.ui uiVar) {
        this.c = wi1Var;
        this.a = t1Var;
        this.b = uiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.ui uiVar = this.b;
        ArrayList arrayList = (ArrayList) uiVar.c;
        wi1 wi1Var = this.c;
        arrayList.remove(wi1Var);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = wi1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
