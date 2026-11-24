// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pqa extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rqa b;

    public /* synthetic */ pqa(rqa rqaVar, byte b) {
        this.a = b;
        this.b = rqaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rqa rqaVar = this.b;
        switch (b) {
            case 0:
                rqaVar.k0 = false;
                break;
            case 1:
                rqaVar.k0 = false;
                break;
            case 2:
                rqaVar.P.setVisibility(4);
                break;
            case 3:
                rqaVar.z0 = rqaVar.y0;
                rqaVar.d(rqaVar.b0);
                break;
            default:
                rqaVar.A0 = 1.0f;
                FrameLayout frameLayout = rqaVar.b;
                frameLayout.setScaleX(1.0f);
                frameLayout.setScaleY(rqaVar.A0);
                rqaVar.invalidate();
                break;
        }
    }
}
