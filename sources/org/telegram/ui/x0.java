package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                m4 m4Var = (m4) this.c;
                m4Var.q0[1].b();
                m4Var.q0[1].setVisibility(8);
                m4Var.K0.T(m4Var.q0[0].b);
                org.telegram.ui.Cells.k9 k9Var = m4Var.K0;
                q3[] q3VarArr = m4Var.q0;
                k9Var.E0 = q3VarArr[0].d;
                int i10 = this.b;
                q3VarArr[i10].setBackgroundDrawable(null);
                m4Var.q0[i10].setLayerType(0, null);
                m4Var.r0 = null;
                m4Var.b0.f = false;
                break;
            case 1:
                ((tu) this.c).c.d.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
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
