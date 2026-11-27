// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class y2b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z2b b;

    public /* synthetic */ y2b(z2b z2bVar, byte b) {
        this.a = b;
        this.b = z2bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        z2b z2bVar = this.b;
        switch (b) {
            case 0:
                z2bVar.s.setVisibility(8);
                break;
            case 1:
                z2bVar.s.setVisibility(8);
                break;
            default:
                z2bVar.s.setVisibility(8);
                break;
        }
    }
}
