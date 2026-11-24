// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zqa extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n28 b;
    public final /* synthetic */ wsa c;

    /* JADX WARN: Multi-variable type inference failed */
    public zqa(wsa wsaVar, int i, n28 n28Var) {
        this.c = wsaVar;
        this.a = i;
        this.b = n28Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wsa wsaVar = this.c;
        wsaVar.O1();
        gra graVar = wsaVar.b2;
        byte b = this.a;
        graVar.setVisibility(b == 0 ? 0 : 8);
        wsaVar.n2.setVisibility(b == 1 ? 0 : 8);
        wsaVar.w2.setVisibility(b == 2 ? 0 : 8);
        wsaVar.y2.setVisibility(b == 3 ? 0 : 8);
        wsaVar.B2();
        wsaVar.X2 = null;
        n28 n28Var = this.b;
        if (n28Var != null) {
            n28Var.run();
        }
    }
}
