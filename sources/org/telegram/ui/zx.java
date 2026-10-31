package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zx extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public org.telegram.ui.Components.wj0 D;
    public boolean E;
    public vw F;
    public zf.m G;
    public boolean H;
    public final gw I;
    public final gw J;
    public final /* synthetic */ ay K;
    public wx a;
    public a5.a b;
    public hw c;
    public lw d;
    public s4.x e;
    public yx f;
    public int h;
    public kw n;
    public org.telegram.ui.Components.vj0 r;
    public int s;
    public int w;
    public org.telegram.ui.Components.zz x;
    public fw y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(Context context, ay ayVar) {
        super(context);
        this.K = ayVar;
        this.I = new gw(this, 1);
        this.J = new gw(this, 2);
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
        if (((org.telegram.ui.ActionBar.k2) this.K).isPaused) {
            return;
        }
        gw gwVar = this.J;
        if (z10) {
            org.telegram.messenger.i0.r(gwVar);
            this.a.setItemAnimator(this.y);
            gwVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.y.k()) {
                this.a.setItemAnimator(null);
            }
            org.telegram.messenger.i0.h3(gwVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        zx zxVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            ay ayVar = this.K;
            if (ayVar.h3 && (zxVar = ayVar.e0[0]) == this) {
                ayVar.z0.g(Math.abs(zxVar.getTranslationX()) / ayVar.e0[0].getMeasuredWidth(), ayVar.e0[1].h);
            }
            ((org.telegram.ui.ActionBar.k2) ayVar).glassEngine.g();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            ((org.telegram.ui.ActionBar.k2) this.K).glassEngine.g();
        }
        super.setTranslationY(f7);
    }
}
