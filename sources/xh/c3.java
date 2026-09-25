package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class c3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i4 c;

    public /* synthetic */ c3(i4 i4Var, boolean z10, int i10) {
        this.a = i10;
        this.c = i4Var;
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
