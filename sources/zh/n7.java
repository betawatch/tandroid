package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class n7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7 b;

    public /* synthetic */ n7(d7 d7Var, int i10) {
        this.a = i10;
        this.b = d7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                u7 u7Var = this.b.b;
                n5 n5Var = u7Var.u1;
                if (n5Var != null) {
                    n5Var.b();
                    u7Var.v.removeView(u7Var.u1);
                }
                u7Var.u1 = null;
                u7Var.P();
                break;
            default:
                super.onAnimationEnd(animator);
                n5 n5Var2 = this.b.b.u1;
                if (n5Var2 != null) {
                    n5Var2.a(true);
                    break;
                }
                break;
        }
    }
}
