package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ty extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public boolean E;
    public kx F;
    public gg.m G;
    public boolean H;
    public final uw I;
    public final uw J;
    public final /* synthetic */ uy K;
    public qy a;
    public a5.a b;
    public vw c;
    public zw d;
    public s4.y e;
    public sy f;
    public int h;
    public yw n;
    public org.telegram.ui.Components.bl0 r;
    public int s;
    public int v;
    public org.telegram.ui.Components.w00 w;
    public tw x;
    public org.telegram.ui.Components.dl0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty(Context context, uy uyVar) {
        super(context);
        this.K = uyVar;
        this.I = new uw(this, 1);
        this.J = new uw(this, 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.s;
        return i10 == 0 || i10 == 7 || i10 == 8;
    }

    public final void q(boolean z10) {
        if (((org.telegram.ui.ActionBar.n2) this.K).isPaused) {
            return;
        }
        uw uwVar = this.J;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(uwVar);
            this.a.setItemAnimator(this.x);
            uwVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(uwVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        ty tyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            uy uyVar = this.K;
            if (uyVar.g3 && (tyVar = uyVar.e0[0]) == this) {
                uyVar.z0.g(Math.abs(tyVar.getTranslationX()) / uyVar.e0[0].getMeasuredWidth(), uyVar.e0[1].h);
            }
            ((org.telegram.ui.ActionBar.n2) uyVar).glassEngine.g();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            ((org.telegram.ui.ActionBar.n2) this.K).glassEngine.g();
        }
        super.setTranslationY(f7);
    }
}
