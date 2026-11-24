// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class whc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xhc b;

    public /* synthetic */ whc(xhc xhcVar, byte b) {
        this.a = b;
        this.b = xhcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        xhc xhcVar = this.b;
        switch (b) {
            case 0:
                xhcVar.b.setVisibility(8);
                break;
            default:
                xhcVar.c.setVisibility(8);
                break;
        }
    }
}
