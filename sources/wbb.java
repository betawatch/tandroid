// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class wbb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ybb b;

    public /* synthetic */ wbb(ybb ybbVar, byte b) {
        this.a = b;
        this.b = ybbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ybb ybbVar = this.b;
        switch (b) {
            case 0:
                lcb lcbVar = ybbVar.s0;
                lcbVar.Y = 0.0f;
                lcbVar.V();
                break;
            default:
                lcb lcbVar2 = ybbVar.s0;
                lcbVar2.X = 0.0f;
                lcbVar2.a0 = 0.0f;
                lcbVar2.V();
                break;
        }
    }
}
