// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xpb extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ pqb e;

    /* JADX WARN: Multi-variable type inference failed */
    public xpb(pqb pqbVar, boolean z, int i, int i2, boolean z2) {
        this.e = pqbVar;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pqb pqbVar = this.e;
        pqbVar.t1 = null;
        FrameLayout[] frameLayoutArr = pqbVar.N0;
        int i = this.c;
        boolean z = this.b;
        if (!this.a) {
            frameLayoutArr[i].setVisibility(4);
        } else if (frameLayoutArr[z ? 1 : 0].getVisibility() == 0) {
            frameLayoutArr[z ? 1 : 0].setAlpha(1.0f);
            frameLayoutArr[z ? 1 : 0].setVisibility(4);
        }
        byte b = pqbVar.b;
        if (b == 1 || b == 2) {
            pqbVar.L0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i == 1) {
            frameLayoutArr[z ? 1 : 0].setAlpha(0.0f);
        }
    }
}
