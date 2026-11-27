// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yq0 extends uia {
    public final /* synthetic */ gr0 v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq0(gr0 gr0Var, Context context) {
        super(context);
        this.v3 = gr0Var;
    }

    @Override // uia
    public final boolean B1() {
        return this.v3.b;
    }

    @Override // uia, d79, android.view.ViewGroup, android.view.View
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
        gr0 gr0Var = this.v3;
        dr0 dr0Var = gr0Var.K;
        if (gr0Var.b) {
            yha yhaVar = gr0Var.r;
            int i3 = 0;
            for (int i4 = 0; i4 < yhaVar.getChildCount(); i4++) {
                int bottom2 = yhaVar.getChildAt(i4).getBottom() - yhaVar.getPaddingTop();
                if (bottom2 > i3) {
                    i3 = bottom2;
                }
            }
            f = hl.R1(f, i3, gr0Var.c);
        }
        dr0Var.setVisibility(gr0Var.w.b() <= 0 ? 8 : 0);
        dr0Var.setTranslationY(f);
    }

    @Override // uia
    public final int getAnimateToColumnsCount() {
        return this.v3.e;
    }

    @Override // uia
    public final float getChangeColumnsProgress() {
        return this.v3.c;
    }

    @Override // uia
    public final int getColumnsCount() {
        return this.v3.d;
    }

    @Override // uia
    public final l69 getMovingAdapter() {
        gr0 gr0Var = this.v3;
        if (gr0Var.H.E != 0 || gr0Var.a0.H.F1) {
            return null;
        }
        return gr0Var.w;
    }

    @Override // uia
    public final l69 getSupportingAdapter() {
        return this.v3.x;
    }

    @Override // uia
    public final yha getSupportingListView() {
        return this.v3.r;
    }
}
