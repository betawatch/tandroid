package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ z(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f();
                break;
            default:
                b0 b0Var = this.b;
                b0.a(b0Var, false);
                b0Var.j = 0.0f;
                mj0 mj0Var = b0Var.n;
                mj0Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                mj0Var.setSkipDraw(false);
                b0Var.c.setVisibility(8);
                b0Var.f();
                break;
        }
    }
}
