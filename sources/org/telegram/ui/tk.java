package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tk extends org.telegram.ui.Components.wj0 {
    public final int[] h1;
    public ValueAnimator i1;
    public boolean j1;
    public final /* synthetic */ rn k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(rn rnVar, rn rnVar2, Activity activity, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(3, i10, activity, rnVar2, c6Var);
        this.k1 = rnVar;
        this.h1 = new int[2];
        this.j1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        super.onLayout(z10, i10, i11, i12, i13);
        kVar = ((org.telegram.ui.ActionBar.n2) this.k1).actionBar;
        org.telegram.ui.ActionBar.v0 k10 = kVar.j(null).k(28);
        if (k10 != null) {
            int[] iArr = this.h1;
            getLocationInWindow(iArr);
            float x8 = getX();
            float width = getWidth() + x8;
            k10.getLocationInWindow(iArr);
            float width2 = (k10.getWidth() / 2.0f) + iArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            boolean z11 = LocaleController.isRTL;
            float f10 = width2 + (dp * (z11 ? -1 : 1));
            if (z11) {
                s(f10 - x8, !this.j1);
            } else {
                s(f10 - width, !this.j1);
            }
            this.j1 = false;
        }
    }

    public final void s(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i1 = null;
        }
        if (!z10) {
            setBubbleOffset(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q0, f10);
        this.i1 = ofFloat;
        ofFloat.addUpdateListener(new g3(this, 6));
        this.i1.setInterpolator(org.telegram.ui.Components.er.h);
        this.i1.setDuration(420L);
        this.i1.start();
    }
}
