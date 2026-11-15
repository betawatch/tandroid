package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.voip.z b;
    public final /* synthetic */ c40 c;

    public /* synthetic */ u20(c40 c40Var, org.telegram.ui.Components.voip.z zVar, int i7) {
        this.a = i7;
        this.c = c40Var;
        this.b = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.voip.z zVar = this.b;
                if (zVar.getParent() != null) {
                    this.c.b.removeView(zVar);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.voip.z zVar2 = this.b;
                if (zVar2.getParent() != null) {
                    this.c.b.removeView(zVar2);
                    break;
                }
                break;
        }
    }
}
