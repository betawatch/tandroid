package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class tb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ub0 c;

    public /* synthetic */ tb0(ub0 ub0Var, float f7, int i10) {
        this.a = i10;
        this.c = ub0Var;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ub0 ub0Var = this.c;
                TextView textView = ub0Var.f;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                float f7 = this.b;
                ub0Var.s = f7;
                textView.setTextColor(i0.a.f(f7, x02, x03));
                break;
            default:
                ub0 ub0Var2 = this.c;
                TextView textView2 = ub0Var2.d;
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                float f10 = this.b;
                ub0Var2.w = f10;
                textView2.setTextColor(i0.a.f(f10, x04, x05));
                break;
        }
    }
}
