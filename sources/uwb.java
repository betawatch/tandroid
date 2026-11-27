// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uwb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vwb b;

    public /* synthetic */ uwb(vwb vwbVar, byte b) {
        this.a = b;
        this.b = vwbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        vwb vwbVar = this.b;
        switch (b) {
            case 0:
                vwbVar.b.s.setVisibility(8);
                break;
            default:
                vwbVar.b.a.setVisibility(8);
                break;
        }
    }
}
