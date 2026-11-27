// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class xbb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zbb b;

    public /* synthetic */ xbb(zbb zbbVar, byte b) {
        this.a = b;
        this.b = zbbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        zbb zbbVar = this.b;
        switch (b) {
            case 0:
                lcb lcbVar = zbbVar.s0;
                lcbVar.Y = 0.0f;
                lcbVar.V();
                break;
            default:
                lcb lcbVar2 = zbbVar.s0;
                lcbVar2.X = 0.0f;
                lcbVar2.a0 = 0.0f;
                lcbVar2.V();
                break;
        }
    }
}
