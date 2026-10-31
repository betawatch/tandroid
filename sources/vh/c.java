package vh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i10) {
        this.a = i10;
        this.b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                dVar.M = false;
                dVar.e.t(null, false, true);
                break;
            default:
                d dVar2 = this.b;
                dVar2.S = 1.0f;
                dVar2.invalidate();
                break;
        }
    }
}
