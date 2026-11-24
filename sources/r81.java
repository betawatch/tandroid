// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r81 extends AnimatorListenerAdapter {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ l46 b;
    public final /* synthetic */ String c;

    public r81(AtomicBoolean atomicBoolean, l46 l46Var, String str) {
        this.a = atomicBoolean;
        this.b = l46Var;
        this.c = str;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.b.setText(this.c);
    }
}
