package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class b3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ h4 c;

    public /* synthetic */ b3(h4 h4Var, boolean z10, int i10) {
        this.a = i10;
        this.c = h4Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    this.c.y.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!this.b) {
                    this.c.w.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
