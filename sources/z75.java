// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z75 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ha5 b;
    public final /* synthetic */ g95 c;

    public /* synthetic */ z75(g95 g95Var, ha5 ha5Var, byte b) {
        this.a = b;
        this.c = g95Var;
        this.b = ha5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        g95 g95Var = this.c;
        ha5 ha5Var = this.b;
        switch (b) {
            case 0:
                if (ha5Var.getParent() != null) {
                    g95Var.b.removeView(ha5Var);
                    break;
                }
                break;
            default:
                if (ha5Var.getParent() != null) {
                    g95Var.b.removeView(ha5Var);
                    break;
                }
                break;
        }
    }
}
