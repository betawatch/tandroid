package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class vw extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public org.telegram.ui.Components.si0 D;
    public boolean E;
    public qv F;
    public jg.n G;
    public boolean H;
    public final bv I;
    public final bv J;
    public final /* synthetic */ ww K;
    public sw a;
    public a8.wa b;
    public cv c;
    public gv d;
    public v4.y e;
    public uw f;
    public int h;
    public fv n;
    public org.telegram.ui.Components.ri0 r;
    public int s;
    public int w;
    public org.telegram.ui.Components.lz x;
    public av y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(Context context, ww wwVar) {
        super(context);
        this.K = wwVar;
        this.I = new bv(this, 1);
        this.J = new bv(this, 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ((FrameLayout.LayoutParams) this.a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
    }

    public final boolean p() {
        int i7 = this.s;
        return i7 == 0 || i7 == 7 || i7 == 8;
    }

    public final void q(boolean z9) {
        if (((org.telegram.ui.ActionBar.f2) this.K).isPaused) {
            return;
        }
        bv bvVar = this.J;
        if (z9) {
            org.telegram.messenger.g0.r(bvVar);
            this.a.setItemAnimator(this.y);
            bvVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.y.k()) {
                this.a.setItemAnimator(null);
            }
            org.telegram.messenger.g0.i3(bvVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        vw vwVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            ww wwVar = this.K;
            if (wwVar.h3 && (vwVar = wwVar.e0[0]) == this) {
                wwVar.z0.g(Math.abs(vwVar.getTranslationX()) / wwVar.e0[0].getMeasuredWidth(), wwVar.e0[1].h);
            }
            ((org.telegram.ui.ActionBar.f2) wwVar).glassEngine.g();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            ((org.telegram.ui.ActionBar.f2) this.K).glassEngine.g();
        }
        super.setTranslationY(f10);
    }
}
