package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class v0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k4 k4Var = (k4) this.c;
                k4Var.u0[1].b();
                k4Var.u0[1].setVisibility(8);
                k4Var.P0.S(k4Var.u0[0].b);
                org.telegram.ui.Cells.o9 o9Var = k4Var.P0;
                n3[] n3VarArr = k4Var.u0;
                o9Var.z0 = n3VarArr[0].d;
                int i10 = this.b;
                n3VarArr[i10].setBackgroundDrawable(null);
                k4Var.u0[i10].setLayerType(0, null);
                k4Var.v0 = null;
                k4Var.f0.f = false;
                break;
            case 1:
                Activity activity = (Activity) this.c;
                int i11 = this.b;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                AndroidUtilities.setLightNavigationBar(activity, AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f);
                break;
            default:
                ((LaunchActivity) this.c).E0(this.b);
                break;
        }
    }
}
