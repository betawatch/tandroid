package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ub0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ vb0 c;

    public /* synthetic */ ub0(vb0 vb0Var, float f10, int i10) {
        this.a = i10;
        this.c = vb0Var;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                vb0 vb0Var = this.c;
                TextView textView = vb0Var.f;
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false);
                int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n6, false);
                float f10 = this.b;
                vb0Var.s = f10;
                textView.setTextColor(i0.b.d(f10, w02, w03));
                break;
            default:
                vb0 vb0Var2 = this.c;
                TextView textView2 = vb0Var2.d;
                int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false);
                int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n6, false);
                float f11 = this.b;
                vb0Var2.w = f11;
                textView2.setTextColor(i0.b.d(f11, w04, w05));
                break;
        }
    }
}
