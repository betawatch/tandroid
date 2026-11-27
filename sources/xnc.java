// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xnc extends AnimatorListenerAdapter {
    public final /* synthetic */ wb2 a;
    public final /* synthetic */ m12 b;
    public final /* synthetic */ ync c;

    public xnc(ync yncVar, wb2 wb2Var, m12 m12Var) {
        this.c = yncVar;
        this.a = wb2Var;
        this.b = m12Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setEnterTransitionInProgress(false);
        m12 m12Var = this.b;
        ArrayList arrayList = (ArrayList) m12Var.c;
        ync yncVar = this.c;
        arrayList.remove(yncVar);
        m12Var.a();
        ((ViewGroup) m12Var.d).invalidate();
        ChatActivityEnterView.RecordCircle recordCircle = yncVar.g;
        if (recordCircle != null) {
            recordCircle.O = false;
        }
    }
}
