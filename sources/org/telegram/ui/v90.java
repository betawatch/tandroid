package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v90 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ w90 c;

    public /* synthetic */ v90(w90 w90Var, float f10, int i7) {
        this.a = i7;
        this.c = w90Var;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w90 w90Var = this.c;
                TextView textView = w90Var.f;
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.n6, false);
                float f10 = this.b;
                w90Var.s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                break;
            default:
                w90 w90Var2 = this.c;
                TextView textView2 = w90Var2.d;
                int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.n6, false);
                float f11 = this.b;
                w90Var2.x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                break;
        }
    }
}
