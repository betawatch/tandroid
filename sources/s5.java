// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
                aVar.j();
                break;
            default:
                aVar.E1 = z ? 1.0f : 0.0f;
                aVar.j();
                break;
        }
    }
}
