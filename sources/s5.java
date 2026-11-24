// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class s5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a c;

    public /* synthetic */ s5(a aVar, boolean z, byte b) {
        this.a = b;
        this.c = aVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        a aVar = this.c;
        switch (b) {
            case 0:
                aVar.E1 = z ? 1.0f : 0.0f;
                aVar.i();
                break;
            default:
                aVar.E1 = z ? 1.0f : 0.0f;
                aVar.i();
                break;
        }
    }
}
