package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class p2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ m3 c;

    public /* synthetic */ p2(m3 m3Var, boolean z9, int i7) {
        this.a = i7;
        this.c = m3Var;
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
