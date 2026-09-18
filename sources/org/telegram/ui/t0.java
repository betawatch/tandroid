package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h4 h4Var = (h4) this.c;
                h4Var.u0[1].b();
                h4Var.u0[1].setVisibility(8);
                h4Var.O0.T(h4Var.u0[0].b);
                org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
                l3[] l3VarArr = h4Var.u0;
                q9Var.E0 = l3VarArr[0].d;
                int i10 = this.b;
                l3VarArr[i10].setBackgroundDrawable(null);
                h4Var.u0[i10].setLayerType(0, null);
                h4Var.v0 = null;
                h4Var.f0.f = false;
                break;
            case 1:
                ((fv) this.c).c.d.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
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
