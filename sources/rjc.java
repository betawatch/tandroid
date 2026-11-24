// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rjc extends AnimatorListenerAdapter {
    public final /* synthetic */ sjc a;

    public rjc(sjc sjcVar) {
        this.a = sjcVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        sjc sjcVar = this.a;
        sjcVar.e = sjcVar.c;
        sjcVar.f = sjcVar.d;
        SecureRandom secureRandom = Utilities.b;
        sjcVar.c = gl.L(12.0f) + secureRandom.nextInt(gl.L(16.0f));
        sjcVar.d = gl.L(12.0f) + secureRandom.nextInt(gl.L(16.0f));
        ValueAnimator valueAnimator = sjcVar.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
