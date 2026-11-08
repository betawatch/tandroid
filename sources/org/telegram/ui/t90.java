package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t90 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ u90 c;

    public /* synthetic */ t90(u90 u90Var, float f10, int i7) {
        this.a = i7;
        this.c = u90Var;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u90 u90Var = this.c;
                TextView textView = u90Var.f;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                float f10 = this.b;
                u90Var.s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                break;
            default:
                u90 u90Var2 = this.c;
                TextView textView2 = u90Var2.d;
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                float f11 = this.b;
                u90Var2.x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                break;
        }
    }
}
