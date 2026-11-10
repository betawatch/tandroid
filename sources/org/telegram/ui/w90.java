package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w90 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ x90 c;

    public /* synthetic */ w90(x90 x90Var, float f10, int i7) {
        this.a = i7;
        this.c = x90Var;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x90 x90Var = this.c;
                TextView textView = x90Var.f;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.y6, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.n6, false);
                float f10 = this.b;
                x90Var.s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                break;
            default:
                x90 x90Var2 = this.c;
                TextView textView2 = x90Var2.d;
                int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.y6, false);
                int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.n6, false);
                float f11 = this.b;
                x90Var2.x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                break;
        }
    }
}
