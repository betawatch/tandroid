// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rlc extends AnimatorListenerAdapter {
    public final /* synthetic */ slc a;

    public rlc(slc slcVar) {
        this.a = slcVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        slc slcVar = this.a;
        slcVar.e = slcVar.c;
        slcVar.f = slcVar.d;
        SecureRandom secureRandom = Utilities.b;
        slcVar.c = gm.L(12.0f) + secureRandom.nextInt(gm.L(16.0f));
        slcVar.d = gm.L(12.0f) + secureRandom.nextInt(gm.L(16.0f));
        ValueAnimator valueAnimator = slcVar.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
