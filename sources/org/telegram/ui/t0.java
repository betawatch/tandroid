package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                j4 j4Var = (j4) this.c;
                j4Var.u0[1].b();
                j4Var.u0[1].setVisibility(8);
                j4Var.P0.S(j4Var.u0[0].b);
                org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
                m3[] m3VarArr = j4Var.u0;
                s9Var.z0 = m3VarArr[0].d;
                int i10 = this.b;
                m3VarArr[i10].setBackgroundDrawable(null);
                j4Var.u0[i10].setLayerType(0, null);
                j4Var.v0 = null;
                j4Var.f0.f = false;
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
