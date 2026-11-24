// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ygb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ahb c;

    public /* synthetic */ ygb(ahb ahbVar, int i, byte b) {
        this.a = b;
        this.c = ahbVar;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        int i = this.b;
        ahb ahbVar = this.c;
        switch (b) {
            case 0:
                ahbVar.r = 0;
                ahbVar.setBackgroundColor(i);
                ahbVar.invalidate();
                break;
            default:
                ahbVar.setBackgroundColor(i);
                ahbVar.r = 0;
                ahbVar.invalidate();
                break;
        }
    }
}
