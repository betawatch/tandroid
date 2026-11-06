package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class u20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.voip.y b;
    public final /* synthetic */ c40 c;

    public /* synthetic */ u20(c40 c40Var, org.telegram.ui.Components.voip.y yVar, int i7) {
        this.a = i7;
        this.c = c40Var;
        this.b = yVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.voip.y yVar = this.b;
                if (yVar.getParent() != null) {
                    this.c.b.removeView(yVar);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.voip.y yVar2 = this.b;
                if (yVar2.getParent() != null) {
                    this.c.b.removeView(yVar2);
                    break;
                }
                break;
        }
    }
}
