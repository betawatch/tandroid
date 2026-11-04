package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tw extends FrameLayout {
    public static final /* synthetic */ int M = 0;
    public org.telegram.ui.Components.wi0 E;
    public boolean F;
    public nv G;
    public kg.m H;
    public boolean I;
    public final yu J;
    public final yu K;
    public final /* synthetic */ uw L;
    public pw a;
    public b8.kg b;
    public zu c;
    public dv d;
    public u4.y e;
    public sw f;
    public int h;
    public cv n;
    public org.telegram.ui.Components.vi0 r;
    public int s;
    public int w;
    public org.telegram.ui.Components.iz x;
    public xu y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(Context context, uw uwVar) {
        super(context);
        this.L = uwVar;
        this.J = new yu(this, 1);
        this.K = new yu(this, 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        ((FrameLayout.LayoutParams) this.a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i3, i10);
    }

    public final boolean p() {
        int i3 = this.s;
        return i3 == 0 || i3 == 7 || i3 == 8;
    }

    public final void q(boolean z10) {
        if (((org.telegram.ui.ActionBar.d2) this.L).isPaused) {
            return;
        }
        yu yuVar = this.K;
        if (z10) {
            org.telegram.messenger.g0.r(yuVar);
            this.a.setItemAnimator(this.y);
            yuVar.run();
        } else {
            if (this.I) {
                return;
            }
            this.I = true;
            if (!this.y.k()) {
                this.a.setItemAnimator(null);
            }
            org.telegram.messenger.g0.i3(yuVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        tw twVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            uw uwVar = this.L;
            if (uwVar.i3 && (twVar = uwVar.f0[0]) == this) {
                uwVar.A0.g(Math.abs(twVar.getTranslationX()) / uwVar.f0[0].getMeasuredWidth(), uwVar.f0[1].h);
            }
            ((org.telegram.ui.ActionBar.d2) uwVar).glassEngine.g();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            ((org.telegram.ui.ActionBar.d2) this.L).glassEngine.g();
        }
        super.setTranslationY(f10);
    }
}
