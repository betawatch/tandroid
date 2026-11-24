// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class y7b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a8b b;

    public /* synthetic */ y7b(a8b a8bVar, byte b) {
        this.a = b;
        this.b = a8bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a8b a8bVar = this.b;
        switch (b) {
            case 0:
                m8b m8bVar = a8bVar.y0;
                m8bVar.Y = 0.0f;
                m8bVar.V();
                break;
            default:
                m8b m8bVar2 = a8bVar.y0;
                m8bVar2.X = 0.0f;
                m8bVar2.a0 = 0.0f;
                m8bVar2.V();
                break;
        }
    }
}
