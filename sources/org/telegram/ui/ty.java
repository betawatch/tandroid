package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ty extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public boolean E;
    public mx F;
    public hg.m G;
    public boolean H;
    public final ww I;
    public final ww J;
    public final /* synthetic */ uy K;
    public qy a;
    public a5.a b;
    public xw c;
    public bx d;
    public s4.y e;
    public sy f;
    public int h;
    public ax n;
    public org.telegram.ui.Components.ok0 r;
    public int s;
    public int v;
    public org.telegram.ui.Components.t00 w;
    public vw x;
    public org.telegram.ui.Components.qk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty(Context context, uy uyVar) {
        super(context);
        this.K = uyVar;
        this.I = new ww(this, 1);
        this.J = new ww(this, 2);
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
        ww wwVar = this.J;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(wwVar);
            this.a.setItemAnimator(this.x);
            wwVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(wwVar, 36L);
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
            uyVar.m3();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            this.K.m3();
        }
        super.setTranslationY(f7);
    }
}
