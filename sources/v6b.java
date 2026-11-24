// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class v6b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t7b b;

    public /* synthetic */ v6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.k2 = null;
                t7bVar.r.setTranslationY(0.0f);
                t7bVar.r.b(0.0f);
                break;
            case 1:
                t7bVar.n.removeView(t7bVar.N0);
                t7bVar.N0 = null;
                t7bVar.o2 = null;
                t7bVar.q2 = null;
                t7bVar.d1.M.b(t7bVar.g0 != 1);
                break;
            default:
                d7b d7bVar = t7bVar.D2;
                if (d7bVar != null) {
                    if (d7bVar.getParent() != null) {
                        ((ViewGroup) t7bVar.D2.getParent()).removeView(t7bVar.D2);
                    }
                    t7bVar.D2 = null;
                }
                t7bVar.F2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
