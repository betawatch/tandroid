// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yya extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zya b;

    public /* synthetic */ yya(zya zyaVar, byte b) {
        this.a = b;
        this.b = zyaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        zya zyaVar = this.b;
        switch (b) {
            case 0:
                zyaVar.s.setVisibility(8);
                break;
            case 1:
                zyaVar.s.setVisibility(8);
                break;
            default:
                zyaVar.s.setVisibility(8);
                break;
        }
    }
}
