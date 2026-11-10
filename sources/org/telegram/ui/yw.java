package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yw extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public org.telegram.ui.Components.si0 D;
    public boolean E;
    public tv F;
    public jg.n G;
    public boolean H;
    public final ev I;
    public final ev J;
    public final /* synthetic */ zw K;
    public vw a;
    public a8.wa b;
    public fv c;
    public jv d;
    public v4.y e;
    public xw f;
    public int h;
    public iv n;
    public org.telegram.ui.Components.ri0 r;
    public int s;
    public int w;
    public org.telegram.ui.Components.lz x;
    public dv y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(Context context, zw zwVar) {
        super(context);
        this.K = zwVar;
        this.I = new ev(this, 1);
        this.J = new ev(this, 2);
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
        ev evVar = this.J;
        if (z9) {
            org.telegram.messenger.g0.r(evVar);
            this.a.setItemAnimator(this.y);
            evVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.y.k()) {
                this.a.setItemAnimator(null);
            }
            org.telegram.messenger.g0.i3(evVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        yw ywVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            zw zwVar = this.K;
            if (zwVar.i3 && (ywVar = zwVar.e0[0]) == this) {
                zwVar.z0.g(Math.abs(ywVar.getTranslationX()) / zwVar.e0[0].getMeasuredWidth(), zwVar.e0[1].h);
            }
            ((org.telegram.ui.ActionBar.f2) zwVar).glassEngine.g();
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
