// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ylb extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qmb e;

    /* JADX WARN: Multi-variable type inference failed */
    public ylb(qmb qmbVar, boolean z, int i, int i2, boolean z2) {
        this.e = qmbVar;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qmb qmbVar = this.e;
        qmbVar.t1 = null;
        FrameLayout[] frameLayoutArr = qmbVar.N0;
        int i = this.c;
        boolean z = this.b;
        if (!this.a) {
            frameLayoutArr[i].setVisibility(4);
        } else if (frameLayoutArr[z ? 1 : 0].getVisibility() == 0) {
            frameLayoutArr[z ? 1 : 0].setAlpha(1.0f);
            frameLayoutArr[z ? 1 : 0].setVisibility(4);
        }
        byte b = qmbVar.b;
        if (b == 1 || b == 2) {
            qmbVar.L0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i == 1) {
            frameLayoutArr[z ? 1 : 0].setAlpha(0.0f);
        }
    }
}
