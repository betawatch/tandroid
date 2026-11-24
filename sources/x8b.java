// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class x8b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v9b b;

    public /* synthetic */ x8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9bVar.k2 = null;
                v9bVar.r.setTranslationY(0.0f);
                v9bVar.r.b(0.0f);
                break;
            case 1:
                v9bVar.n.removeView(v9bVar.N0);
                v9bVar.N0 = null;
                v9bVar.o2 = null;
                v9bVar.q2 = null;
                v9bVar.d1.M.b(v9bVar.g0 != 1);
                break;
            default:
                f9b f9bVar = v9bVar.D2;
                if (f9bVar != null) {
                    if (f9bVar.getParent() != null) {
                        ((ViewGroup) v9bVar.D2.getParent()).removeView(v9bVar.D2);
                    }
                    v9bVar.D2 = null;
                }
                v9bVar.F2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
