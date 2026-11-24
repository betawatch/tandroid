// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qsa extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ssa b;

    public /* synthetic */ qsa(ssa ssaVar, byte b) {
        this.a = b;
        this.b = ssaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ssa ssaVar = this.b;
        switch (b) {
            case 0:
                ssaVar.k0 = false;
                break;
            case 1:
                ssaVar.k0 = false;
                break;
            case 2:
                ssaVar.P.setVisibility(4);
                break;
            case 3:
                ssaVar.z0 = ssaVar.y0;
                ssaVar.d(ssaVar.b0);
                break;
            default:
                ssaVar.A0 = 1.0f;
                FrameLayout frameLayout = ssaVar.b;
                frameLayout.setScaleX(1.0f);
                frameLayout.setScaleY(ssaVar.A0);
                ssaVar.invalidate();
                break;
        }
    }
}
