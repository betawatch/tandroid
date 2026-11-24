// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qcb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Switch b;

    public /* synthetic */ qcb(Switch r1, byte b) {
        this.a = b;
        this.b = r1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Switch r1 = this.b;
        switch (b) {
            case 0:
                r1.d = null;
                break;
            default:
                r1.e = null;
                break;
        }
    }
}
