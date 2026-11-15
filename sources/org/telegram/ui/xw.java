package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xw extends FrameLayout {
    public static final /* synthetic */ int M = 0;
    public org.telegram.ui.Components.xi0 E;
    public boolean F;
    public sv G;
    public jg.m H;
    public boolean I;
    public final cv J;
    public final cv K;
    public final /* synthetic */ yw L;
    public uw a;
    public a8.xa b;
    public dv c;
    public hv d;
    public v4.y e;
    public ww f;
    public int h;
    public gv n;
    public org.telegram.ui.Components.wi0 r;
    public int s;
    public int w;
    public org.telegram.ui.Components.pz x;
    public bv y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(Context context, yw ywVar) {
        super(context);
        this.L = ywVar;
        this.J = new cv(this, 1);
        this.K = new cv(this, 2);
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

    public final void q(boolean z10) {
        if (((org.telegram.ui.ActionBar.e2) this.L).isPaused) {
            return;
        }
        cv cvVar = this.K;
        if (z10) {
            org.telegram.messenger.g0.r(cvVar);
            this.a.setItemAnimator(this.y);
            cvVar.run();
        } else {
            if (this.I) {
                return;
            }
            this.I = true;
            if (!this.y.k()) {
                this.a.setItemAnimator(null);
            }
            org.telegram.messenger.g0.i3(cvVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        xw xwVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            yw ywVar = this.L;
            if (ywVar.j3 && (xwVar = ywVar.f0[0]) == this) {
                ywVar.A0.g(Math.abs(xwVar.getTranslationX()) / ywVar.f0[0].getMeasuredWidth(), ywVar.f0[1].h);
            }
            ((org.telegram.ui.ActionBar.e2) ywVar).glassEngine.g();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            ((org.telegram.ui.ActionBar.e2) this.L).glassEngine.g();
        }
        super.setTranslationY(f10);
    }
}
