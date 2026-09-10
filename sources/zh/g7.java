package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;

    public /* synthetic */ g7(i7 i7Var, int i10) {
        this.a = i10;
        this.b = i7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u7 u7Var = this.b.I0;
                u7Var.X = 0.0f;
                u7.k(u7Var);
                break;
            default:
                u7 u7Var2 = this.b.I0;
                u7Var2.W = 0.0f;
                u7Var2.Z = 0.0f;
                u7.k(u7Var2);
                break;
        }
    }
}
