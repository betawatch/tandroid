package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fk0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                fk0 fk0Var = c0Var.n;
                fk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                fk0Var.setSkipDraw(false);
                c0Var.c.setVisibility(8);
                c0Var.f();
                break;
        }
    }
}
