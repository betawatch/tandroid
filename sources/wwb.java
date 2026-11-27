// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wwb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ axb b;

    public /* synthetic */ wwb(axb axbVar, byte b) {
        this.a = b;
        this.b = axbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        axb axbVar = this.b;
        switch (b) {
            case 0:
                axbVar.w = 0;
                axbVar.n.setVisibility(8);
                break;
            case 1:
                axbVar.w = 0;
                break;
            default:
                axbVar.G.setVisibility(8);
                break;
        }
    }
}
