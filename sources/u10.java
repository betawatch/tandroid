// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class u10 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i20 b;

    public /* synthetic */ u10(i20 i20Var, byte b) {
        this.a = b;
        this.b = i20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.v2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                i20Var.f2 = false;
                break;
            case 1:
                i20Var.b2.setVisibility(4);
                i20Var.c2.setImageBitmap(null);
                i20Var.f2 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
