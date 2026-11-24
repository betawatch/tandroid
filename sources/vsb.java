// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vsb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zsb b;

    public /* synthetic */ vsb(zsb zsbVar, byte b) {
        this.a = b;
        this.b = zsbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        zsb zsbVar = this.b;
        switch (b) {
            case 0:
                zsbVar.w = 0;
                zsbVar.n.setVisibility(8);
                break;
            case 1:
                zsbVar.w = 0;
                break;
            default:
                zsbVar.G.setVisibility(8);
                break;
        }
    }
}
