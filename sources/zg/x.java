package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class x extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ x(z zVar, int i10) {
        this.a = i10;
        this.b = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f();
                break;
            default:
                z zVar = this.b;
                z.a(zVar, false);
                zVar.j = 0.0f;
                sk0 sk0Var = zVar.n;
                sk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                sk0Var.setSkipDraw(false);
                zVar.c.setVisibility(8);
                zVar.f();
                break;
        }
    }
}
