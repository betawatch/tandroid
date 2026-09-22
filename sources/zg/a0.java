package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                sk0 sk0Var = c0Var.n;
                sk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                sk0Var.setSkipDraw(false);
                c0Var.c.setVisibility(8);
                c0Var.f();
                break;
        }
    }
}
