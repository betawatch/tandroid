package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xa0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ya0 c;

    public /* synthetic */ xa0(ya0 ya0Var, float f7, int i10) {
        this.a = i10;
        this.c = ya0Var;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ya0 ya0Var = this.c;
                TextView textView = ya0Var.f;
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.n6, false);
                float f7 = this.b;
                ya0Var.s = f7;
                textView.setTextColor(i0.b.f(f7, x02, x03));
                break;
            default:
                ya0 ya0Var2 = this.c;
                TextView textView2 = ya0Var2.d;
                int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.n6, false);
                float f10 = this.b;
                ya0Var2.x = f10;
                textView2.setTextColor(i0.b.f(f10, x04, x05));
                break;
        }
    }
}
