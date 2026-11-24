// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.PipRoundVideoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zc8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PipRoundVideoView b;

    public /* synthetic */ zc8(PipRoundVideoView pipRoundVideoView, byte b) {
        this.a = b;
        this.b = pipRoundVideoView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        PipRoundVideoView pipRoundVideoView = this.b;
        switch (b) {
            case 0:
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            default:
                pipRoundVideoView.a(false);
                Runnable runnable = pipRoundVideoView.s;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
