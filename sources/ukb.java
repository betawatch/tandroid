// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ukb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wkb c;

    public /* synthetic */ ukb(wkb wkbVar, int i, byte b) {
        this.a = b;
        this.c = wkbVar;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        int i = this.b;
        wkb wkbVar = this.c;
        switch (b) {
            case 0:
                wkbVar.r = 0;
                wkbVar.setBackgroundColor(i);
                wkbVar.invalidate();
                break;
            default:
                wkbVar.setBackgroundColor(i);
                wkbVar.r = 0;
                wkbVar.invalidate();
                break;
        }
    }
}
