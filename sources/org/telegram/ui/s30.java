package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.voip.r b;
    public final /* synthetic */ a50 c;

    public /* synthetic */ s30(a50 a50Var, org.telegram.ui.Components.voip.r rVar, int i10) {
        this.a = i10;
        this.c = a50Var;
        this.b = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.voip.r rVar = this.b;
                if (rVar.getParent() != null) {
                    this.c.b.removeView(rVar);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.voip.r rVar2 = this.b;
                if (rVar2.getParent() != null) {
                    this.c.b.removeView(rVar2);
                    break;
                }
                break;
        }
    }
}
