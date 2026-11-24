// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tsb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ usb b;

    public /* synthetic */ tsb(usb usbVar, byte b) {
        this.a = b;
        this.b = usbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        usb usbVar = this.b;
        switch (b) {
            case 0:
                usbVar.b.s.setVisibility(8);
                break;
            default:
                usbVar.b.a.setVisibility(8);
                break;
        }
    }
}
