// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zib extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ bjb c;

    public /* synthetic */ zib(bjb bjbVar, int i, byte b) {
        this.a = b;
        this.c = bjbVar;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        int i = this.b;
        bjb bjbVar = this.c;
        switch (b) {
            case 0:
                bjbVar.r = 0;
                bjbVar.setBackgroundColor(i);
                bjbVar.invalidate();
                break;
            default:
                bjbVar.setBackgroundColor(i);
                bjbVar.r = 0;
                bjbVar.invalidate();
                break;
        }
    }
}
