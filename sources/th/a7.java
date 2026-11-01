package th;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;

    public /* synthetic */ a7(c7 c7Var, int i10) {
        this.a = i10;
        this.b = c7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o7 o7Var = this.b.r0;
                o7Var.X = 0.0f;
                o7.w(o7Var);
                break;
            default:
                o7 o7Var2 = this.b.r0;
                o7Var2.W = 0.0f;
                o7Var2.Z = 0.0f;
                o7.w(o7Var2);
                break;
        }
    }
}
