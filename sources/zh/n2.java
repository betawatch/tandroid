package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class n2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l3 c;

    public /* synthetic */ n2(l3 l3Var, boolean z9, int i7) {
        this.a = i7;
        this.c = l3Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    this.c.D.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!this.b) {
                    this.c.x.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
