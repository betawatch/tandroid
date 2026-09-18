package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gk0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class a0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ a0(c0 c0Var, int i10) {
        this.a = i10;
        this.b = c0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f();
                break;
            default:
                c0 c0Var = this.b;
                c0.a(c0Var, false);
                c0Var.j = 0.0f;
                gk0 gk0Var = c0Var.n;
                gk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                gk0Var.setSkipDraw(false);
                c0Var.c.setVisibility(8);
                c0Var.f();
                break;
        }
    }
}
