package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w0(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.c;
                l4Var.q0[1].b();
                l4Var.q0[1].setVisibility(8);
                l4Var.K0.T(l4Var.q0[0].b);
                org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
                p3[] p3VarArr = l4Var.q0;
                n9Var.E0 = p3VarArr[0].d;
                int i9 = this.b;
                p3VarArr[i9].setBackgroundDrawable(null);
                l4Var.q0[i9].setLayerType(0, null);
                l4Var.r0 = null;
                l4Var.b0.f = false;
                break;
            case 1:
                ((su) this.c).c.d.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                break;
            case 2:
                Activity activity = (Activity) this.c;
                int i10 = this.b;
                AndroidUtilities.setNavigationBarColor(activity, i10, false);
                AndroidUtilities.setLightNavigationBar(activity, AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f);
                break;
            default:
                ((LaunchActivity) this.c).z0(this.b);
                break;
        }
    }
}
