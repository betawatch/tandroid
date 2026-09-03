package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n4 n4Var = (n4) this.c;
                n4Var.r0[1].b();
                n4Var.r0[1].setVisibility(8);
                n4Var.L0.T(n4Var.r0[0].b);
                org.telegram.ui.Cells.l9 l9Var = n4Var.L0;
                r3[] r3VarArr = n4Var.r0;
                l9Var.E0 = r3VarArr[0].d;
                int i10 = this.b;
                r3VarArr[i10].setBackgroundDrawable(null);
                n4Var.r0[i10].setLayerType(0, null);
                n4Var.s0 = null;
                n4Var.c0.f = false;
                break;
            case 1:
                ((dv) this.c).c.d.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
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
