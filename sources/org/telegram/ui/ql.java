package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ql extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qn d;

    public ql(qn qnVar, boolean z10, boolean z11, boolean z12) {
        this.d = qnVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qn qnVar = this.d;
        qnVar.M2 = null;
        qnVar.J2.setVisibility(this.a ? 0 : 4);
        qnVar.L2.setVisibility(this.b ? 0 : 4);
        qnVar.K2.setVisibility(this.c ? 0 : 4);
    }
}
