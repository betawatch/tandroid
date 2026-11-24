// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v53 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x53 b;

    public /* synthetic */ v53(x53 x53Var, byte b) {
        this.a = b;
        this.b = x53Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        x53 x53Var = this.b;
        switch (b) {
            case 0:
                x53Var.f();
                break;
            default:
                x53Var.a(false);
                x53Var.j = 0.0f;
                v29 v29Var = x53Var.n;
                v29Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                v29Var.setSkipDraw(false);
                x53Var.c.setVisibility(8);
                x53Var.f();
                break;
        }
    }
}
