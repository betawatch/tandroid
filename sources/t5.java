// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class t5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a c;

    public /* synthetic */ t5(a aVar, boolean z, byte b) {
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
                aVar.j();
                break;
            default:
                aVar.E1 = z ? 1.0f : 0.0f;
                aVar.j();
                break;
        }
    }
}
