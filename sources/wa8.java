// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.PipRoundVideoView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wa8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PipRoundVideoView b;

    public /* synthetic */ wa8(PipRoundVideoView pipRoundVideoView, byte b) {
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
