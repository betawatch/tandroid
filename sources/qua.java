// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
