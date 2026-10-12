package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ ra(sa saVar, int i10) {
        this.a = i10;
        this.b = saVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sa saVar = this.b;
                saVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                saVar.n = floatValue;
                saVar.f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                saVar.d.setAlpha(saVar.n);
                break;
            default:
                sa saVar2 = this.b;
                saVar2.getClass();
                saVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.g6.z6;
                org.telegram.ui.ActionBar.c6 c6Var = saVar2.b;
                int d = i0.a.d(saVar2.E, org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.n6, c6Var));
                saVar2.e.b(d);
                saVar2.f.setTextColor(d);
                break;
        }
    }
}
