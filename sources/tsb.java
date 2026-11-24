// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
