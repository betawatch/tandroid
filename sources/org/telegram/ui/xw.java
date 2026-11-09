package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xw extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public org.telegram.ui.Components.ti0 D;
    public boolean E;
    public sv F;
    public jg.n G;
    public boolean H;
    public final dv I;
    public final dv J;
    public final /* synthetic */ yw K;
    public uw a;
    public a8.wa b;
    public ev c;
    public iv d;
    public v4.y e;
    public ww f;
    public int h;
    public hv n;
    public org.telegram.ui.Components.si0 r;
    public int s;
    public int w;
    public org.telegram.ui.Components.mz x;
    public cv y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(Context context, yw ywVar) {
        super(context);
        this.K = ywVar;
        this.I = new dv(this, 1);
        this.J = new dv(this, 2);
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
        dv dvVar = this.J;
        if (z9) {
            org.telegram.messenger.g0.r(dvVar);
            this.a.setItemAnimator(this.y);
            dvVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.y.k()) {
                this.a.setItemAnimator(null);
            }
            org.telegram.messenger.g0.i3(dvVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        xw xwVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            yw ywVar = this.K;
            if (ywVar.i3 && (xwVar = ywVar.e0[0]) == this) {
                ywVar.z0.g(Math.abs(xwVar.getTranslationX()) / ywVar.e0[0].getMeasuredWidth(), ywVar.e0[1].h);
            }
            ((org.telegram.ui.ActionBar.f2) ywVar).glassEngine.g();
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
