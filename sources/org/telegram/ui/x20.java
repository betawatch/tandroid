package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class x20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.voip.y b;
    public final /* synthetic */ f40 c;

    public /* synthetic */ x20(f40 f40Var, org.telegram.ui.Components.voip.y yVar, int i7) {
        this.a = i7;
        this.c = f40Var;
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
