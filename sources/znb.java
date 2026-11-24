// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class znb extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ rob e;

    /* JADX WARN: Multi-variable type inference failed */
    public znb(rob robVar, boolean z, int i, int i2, boolean z2) {
        this.e = robVar;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rob robVar = this.e;
        robVar.t1 = null;
        FrameLayout[] frameLayoutArr = robVar.N0;
        int i = this.c;
        boolean z = this.b;
        if (!this.a) {
            frameLayoutArr[i].setVisibility(4);
        } else if (frameLayoutArr[z ? 1 : 0].getVisibility() == 0) {
            frameLayoutArr[z ? 1 : 0].setAlpha(1.0f);
            frameLayoutArr[z ? 1 : 0].setVisibility(4);
        }
        byte b = robVar.b;
        if (b == 1 || b == 2) {
            robVar.L0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i == 1) {
            frameLayoutArr[z ? 1 : 0].setAlpha(0.0f);
        }
    }
}
