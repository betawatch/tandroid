// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qz3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ t14 c;

    public /* synthetic */ qz3(t14 t14Var, boolean z, byte b) {
        this.a = b;
        this.c = t14Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        t14 t14Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    t14Var.y.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z) {
                    t14Var.E.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
