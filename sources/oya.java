// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class oya extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pya b;

    public /* synthetic */ oya(pya pyaVar, byte b) {
        this.a = b;
        this.b = pyaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        pya pyaVar = this.b;
        switch (b) {
            case 0:
                pyaVar.E = 1.0f;
                pyaVar.invalidate();
                pyaVar.H = null;
                break;
            case 1:
                pyaVar.m(((Float) pyaVar.w.getAnimatedValue()).floatValue());
                pyaVar.w = null;
                break;
            default:
                super.onAnimationEnd(animator);
                pyaVar.G = null;
                break;
        }
    }
}
