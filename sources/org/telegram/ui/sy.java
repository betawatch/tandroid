package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sy extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public boolean E;
    public lx F;
    public gg.m G;
    public boolean H;
    public final vw I;
    public final vw J;
    public final /* synthetic */ ty K;
    public py a;
    public a5.a b;
    public ww c;
    public ax d;
    public s4.z e;
    public ry f;
    public int h;
    public zw n;
    public org.telegram.ui.Components.tl0 r;
    public int s;
    public int v;
    public org.telegram.ui.Components.j10 w;
    public uw x;
    public org.telegram.ui.Components.vl0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy(Context context, ty tyVar) {
        super(context);
        this.K = tyVar;
        this.I = new vw(this, 1);
        this.J = new vw(this, 2);
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
        vw vwVar = this.J;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(vwVar);
            this.a.setItemAnimator(this.x);
            vwVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(vwVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        sy syVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            ty tyVar = this.K;
            if (tyVar.g3 && (syVar = tyVar.e0[0]) == this) {
                tyVar.z0.g(Math.abs(syVar.getTranslationX()) / tyVar.e0[0].getMeasuredWidth(), tyVar.e0[1].h);
            }
            tyVar.j3();
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
