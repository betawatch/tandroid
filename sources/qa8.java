// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qa8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ PhotoViewer c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qa8(PhotoViewer photoViewer, int i, byte b) {
        this.a = b;
        this.c = photoViewer;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        byte b2 = this.b;
        PhotoViewer photoViewer = this.c;
        switch (b) {
            case 0:
                ra8 ra8Var = photoViewer.O1;
                ra8Var.e.setVisibility(0);
                FrameLayout frameLayout = ra8Var.r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(gm.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                d53 d53Var = d53.h;
                wi8.t(translationY, d53Var, 320L);
                ra8Var.x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(d53Var).setDuration(320L).start();
                photoViewer.t4 = b2;
                photoViewer.p6 = null;
                photoViewer.n6 = -1;
                break;
            default:
                photoViewer.t4 = b2;
                photoViewer.p6 = null;
                photoViewer.n6 = -1;
                break;
        }
    }
}
