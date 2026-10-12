package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class xy extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public boolean E;
    public qx F;
    public hg.m G;
    public boolean H;
    public final ax I;
    public final ax J;
    public final /* synthetic */ yy K;
    public uy a;
    public a5.a b;
    public bx c;
    public fx d;
    public s4.y e;
    public wy f;
    public int h;
    public ex n;
    public org.telegram.ui.Components.pl0 r;
    public int s;
    public int v;
    public org.telegram.ui.Components.f10 w;
    public zw x;
    public org.telegram.ui.Components.rl0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy(Context context, yy yyVar) {
        super(context);
        this.K = yyVar;
        this.I = new ax(this, 1);
        this.J = new ax(this, 2);
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
        if (((org.telegram.ui.ActionBar.m2) this.K).isPaused) {
            return;
        }
        ax axVar = this.J;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(axVar);
            this.a.setItemAnimator(this.x);
            axVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(axVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        xy xyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            yy yyVar = this.K;
            if (yyVar.g3 && (xyVar = yyVar.e0[0]) == this) {
                yyVar.z0.g(Math.abs(xyVar.getTranslationX()) / yyVar.e0[0].getMeasuredWidth(), yyVar.e0[1].h);
            }
            yyVar.j3();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            this.K.j3();
        }
        super.setTranslationY(f7);
    }
}
