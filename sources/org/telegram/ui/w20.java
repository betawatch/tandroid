package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.voip.z b;
    public final /* synthetic */ e40 c;

    public /* synthetic */ w20(e40 e40Var, org.telegram.ui.Components.voip.z zVar, int i7) {
        this.a = i7;
        this.c = e40Var;
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
