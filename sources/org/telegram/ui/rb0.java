package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ sb0 c;

    public /* synthetic */ rb0(sb0 sb0Var, float f9, int i10) {
        this.a = i10;
        this.c = sb0Var;
        this.b = f9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sb0 sb0Var = this.c;
                TextView textView = sb0Var.f;
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false);
                int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n6, false);
                float f9 = this.b;
                sb0Var.s = f9;
                textView.setTextColor(i0.a.d(f9, w02, w03));
                break;
            default:
                sb0 sb0Var2 = this.c;
                TextView textView2 = sb0Var2.d;
                int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false);
                int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n6, false);
                float f10 = this.b;
                sb0Var2.w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                break;
        }
    }
}
