// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ql3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u69 b;
    public final /* synthetic */ hg3 c;
    public final /* synthetic */ ki3 d;

    public /* synthetic */ ql3(ki3 ki3Var, u69 u69Var, hg3 hg3Var, byte b) {
        this.a = b;
        this.d = ki3Var;
        this.b = u69Var;
        this.c = hg3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        u69 u69Var = this.b;
        ki3 ki3Var = this.d;
        hg3 hg3Var = this.c;
        switch (b) {
            case 0:
                animator.removeAllListeners();
                hg3Var.setClipProgress(0.0f);
                hg3Var.setElevation(0.0f);
                ki3Var.d(u69Var);
                ki3Var.x.remove(u69Var);
                ki3Var.A();
                break;
            default:
                animator.removeAllListeners();
                hg3Var.setClipProgress(0.0f);
                hg3Var.setElevation(0.0f);
                ki3Var.d(u69Var);
                ki3Var.x.remove(u69Var);
                ki3Var.A();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        ki3 ki3Var = this.d;
        switch (b) {
            case 0:
                ki3Var.y();
                break;
            default:
                ki3Var.y();
                break;
        }
    }
}
