package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uk extends org.telegram.ui.Components.fk0 {
    public final int[] h1;
    public ValueAnimator i1;
    public boolean j1;
    public final /* synthetic */ tn k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(tn tnVar, tn tnVar2, Activity activity, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(3, i10, activity, tnVar2, c6Var);
        this.k1 = tnVar;
        this.h1 = new int[2];
        this.j1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        super.onLayout(z10, i10, i11, i12, i13);
        lVar = ((org.telegram.ui.ActionBar.o2) this.k1).actionBar;
        org.telegram.ui.ActionBar.w0 k9 = lVar.j(null).k(28);
        if (k9 != null) {
            int[] iArr = this.h1;
            getLocationInWindow(iArr);
            float x4 = getX();
            float width = getWidth() + x4;
            k9.getLocationInWindow(iArr);
            float width2 = (k9.getWidth() / 2.0f) + iArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            boolean z11 = LocaleController.isRTL;
            float f9 = width2 + (dp * (z11 ? -1 : 1));
            if (z11) {
                s(f9 - x4, !this.j1);
            } else {
                s(f9 - width, !this.j1);
            }
            this.j1 = false;
        }
    }

    public final void s(float f9, boolean z10) {
        ValueAnimator valueAnimator = this.i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i1 = null;
        }
        if (!z10) {
            setBubbleOffset(f9);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q0, f9);
        this.i1 = ofFloat;
        ofFloat.addUpdateListener(new g3(this, 6));
        this.i1.setInterpolator(org.telegram.ui.Components.jr.h);
        this.i1.setDuration(420L);
        this.i1.start();
    }
}
