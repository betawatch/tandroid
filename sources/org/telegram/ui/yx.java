package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yx extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public org.telegram.ui.Components.xj0 D;
    public boolean E;
    public uw F;
    public zf.m G;
    public boolean H;
    public final fw I;
    public final fw J;
    public final /* synthetic */ zx K;
    public vx a;
    public a5.a b;
    public gw c;
    public kw d;
    public s4.x e;
    public xx f;
    public int h;
    public jw n;
    public org.telegram.ui.Components.wj0 r;
    public int s;
    public int w;
    public org.telegram.ui.Components.zz x;
    public ew y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(Context context, zx zxVar) {
        super(context);
        this.K = zxVar;
        this.I = new fw(this, 1);
        this.J = new fw(this, 2);
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
        fw fwVar = this.J;
        if (z10) {
            org.telegram.messenger.i0.r(fwVar);
            this.a.setItemAnimator(this.y);
            fwVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.y.k()) {
                this.a.setItemAnimator(null);
            }
            org.telegram.messenger.i0.h3(fwVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        yx yxVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            zx zxVar = this.K;
            if (zxVar.h3 && (yxVar = zxVar.e0[0]) == this) {
                zxVar.z0.g(Math.abs(yxVar.getTranslationX()) / zxVar.e0[0].getMeasuredWidth(), zxVar.e0[1].h);
            }
            ((org.telegram.ui.ActionBar.k2) zxVar).glassEngine.g();
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
