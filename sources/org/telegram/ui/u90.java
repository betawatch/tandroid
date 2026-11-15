package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u90 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ v90 c;

    public /* synthetic */ u90(v90 v90Var, float f10, int i7) {
        this.a = i7;
        this.c = v90Var;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v90 v90Var = this.c;
                TextView textView = v90Var.f;
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.y6, false);
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.n6, false);
                float f10 = this.b;
                v90Var.s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                break;
            default:
                v90 v90Var2 = this.c;
                TextView textView2 = v90Var2.d;
                int x04 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.y6, false);
                int x05 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.n6, false);
                float f11 = this.b;
                v90Var2.x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                break;
        }
    }
}
