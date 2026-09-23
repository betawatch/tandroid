package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class u0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.c;
                i4Var.u0[1].b();
                i4Var.u0[1].setVisibility(8);
                i4Var.O0.T(i4Var.u0[0].b);
                org.telegram.ui.Cells.r9 r9Var = i4Var.O0;
                m3[] m3VarArr = i4Var.u0;
                r9Var.E0 = m3VarArr[0].d;
                int i10 = this.b;
                m3VarArr[i10].setBackgroundDrawable(null);
                i4Var.u0[i10].setLayerType(0, null);
                i4Var.v0 = null;
                i4Var.f0.f = false;
                break;
            case 1:
                ((av) this.c).c.d.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                break;
            case 2:
                Activity activity = (Activity) this.c;
                int i11 = this.b;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                AndroidUtilities.setLightNavigationBar(activity, AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f);
                break;
            default:
                ((LaunchActivity) this.c).z0(this.b);
                break;
        }
    }
}
