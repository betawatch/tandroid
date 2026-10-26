package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Cells.s1 a;
    public final /* synthetic */ org.telegram.ui.Components.si b;
    public final /* synthetic */ sh1 c;

    public rh1(sh1 sh1Var, org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Components.si siVar) {
        this.c = sh1Var;
        this.a = s1Var;
        this.b = siVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        org.telegram.ui.Components.si siVar = this.b;
        ArrayList arrayList = (ArrayList) siVar.c;
        sh1 sh1Var = this.c;
        arrayList.remove(sh1Var);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = sh1Var.g;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
    }
}
