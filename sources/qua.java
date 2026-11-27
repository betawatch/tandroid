// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qua extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sua b;

    public /* synthetic */ qua(sua suaVar, byte b) {
        this.a = b;
        this.b = suaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        sua suaVar = this.b;
        switch (b) {
            case 0:
                suaVar.k0 = false;
                break;
            case 1:
                suaVar.k0 = false;
                break;
            case 2:
                suaVar.P.setVisibility(4);
                break;
            case 3:
                suaVar.z0 = suaVar.y0;
                suaVar.d(suaVar.b0);
                break;
            default:
                suaVar.A0 = 1.0f;
                FrameLayout frameLayout = suaVar.b;
                frameLayout.setScaleX(1.0f);
                frameLayout.setScaleY(suaVar.A0);
                suaVar.invalidate();
                break;
        }
    }
}
