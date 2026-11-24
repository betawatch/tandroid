// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yr0 extends dha {
    public final /* synthetic */ gs0 v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr0(gs0 gs0Var, Context context) {
        super(context);
        this.v3 = gs0Var;
    }

    @Override // dha
    public final boolean A1() {
        return this.v3.b;
    }

    @Override // dha, r59, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int bottom = getChildAt(i2).getBottom() - getPaddingTop();
            if (bottom > i) {
                i = bottom;
            }
        }
        float f = i;
        gs0 gs0Var = this.v3;
        ds0 ds0Var = gs0Var.K;
        if (gs0Var.b) {
            hga hgaVar = gs0Var.r;
            int i3 = 0;
            for (int i4 = 0; i4 < hgaVar.getChildCount(); i4++) {
                int bottom2 = hgaVar.getChildAt(i4).getBottom() - hgaVar.getPaddingTop();
                if (bottom2 > i3) {
                    i3 = bottom2;
                }
            }
            f = gm.R1(f, i3, gs0Var.c);
        }
        ds0Var.setVisibility(gs0Var.w.b() <= 0 ? 8 : 0);
        ds0Var.setTranslationY(f);
    }

    @Override // dha
    public final int getAnimateToColumnsCount() {
        return this.v3.e;
    }

    @Override // dha
    public final float getChangeColumnsProgress() {
        return this.v3.c;
    }

    @Override // dha
    public final int getColumnsCount() {
        return this.v3.d;
    }

    @Override // dha
    public final z49 getMovingAdapter() {
        gs0 gs0Var = this.v3;
        if (gs0Var.H.E != 0 || gs0Var.a0.H.F1) {
            return null;
        }
        return gs0Var.w;
    }

    @Override // dha
    public final z49 getSupportingAdapter() {
        return this.v3.x;
    }

    @Override // dha
    public final hga getSupportingListView() {
        return this.v3.r;
    }
}
