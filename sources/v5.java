// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a b;

    public /* synthetic */ v5(a aVar, byte b) {
        this.a = b;
        this.b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                a aVar = this.b;
                AnimatorSet animatorSet = aVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    aVar.Q = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a aVar = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = aVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    aVar.Q = null;
                    aVar.G.setVisibility(4);
                    break;
                }
                break;
            default:
                jia jiaVar = aVar.n[1];
                if (jiaVar != null && jiaVar.getParent() != null) {
                    ((ViewGroup) aVar.n[1].getParent()).removeView(aVar.n[1]);
                }
                aVar.P0.F(aVar.n[1]);
                aVar.n[1] = null;
                aVar.j1 = false;
                Object[] objArr = aVar.h0;
                aVar.O((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) aVar.h0[2]);
                break;
        }
    }
}
