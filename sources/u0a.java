// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class u0a extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w0a b;

    public /* synthetic */ u0a(w0a w0aVar, byte b) {
        this.a = b;
        this.b = w0aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        w0a w0aVar = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                w0aVar.J = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                w0aVar.J = null;
                break;
            default:
                super.onAnimationEnd(animator);
                w0aVar.O = 0.0f;
                w0aVar.J = null;
                w0aVar.N = false;
                w0aVar.d(true, false);
                break;
        }
    }
}
