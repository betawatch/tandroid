// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yq0 extends dfa {
    public final /* synthetic */ gr0 v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq0(gr0 gr0Var, Context context) {
        super(context);
        this.v3 = gr0Var;
    }

    @Override // dfa
    public final boolean A1() {
        return this.v3.b;
    }

    @Override // dfa, o39, android.view.ViewGroup, android.view.View
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
            hea heaVar = gr0Var.r;
            int i3 = 0;
            for (int i4 = 0; i4 < heaVar.getChildCount(); i4++) {
                int bottom2 = heaVar.getChildAt(i4).getBottom() - heaVar.getPaddingTop();
                if (bottom2 > i3) {
                    i3 = bottom2;
                }
            }
            f = gl.R1(f, i3, gr0Var.c);
        }
        dr0Var.setVisibility(gr0Var.w.b() <= 0 ? 8 : 0);
        dr0Var.setTranslationY(f);
    }

    @Override // dfa
    public final int getAnimateToColumnsCount() {
        return this.v3.e;
    }

    @Override // dfa
    public final float getChangeColumnsProgress() {
        return this.v3.c;
    }

    @Override // dfa
    public final int getColumnsCount() {
        return this.v3.d;
    }

    @Override // dfa
    public final w29 getMovingAdapter() {
        gr0 gr0Var = this.v3;
        if (gr0Var.H.E != 0 || gr0Var.a0.H.F1) {
            return null;
        }
        return gr0Var.w;
    }

    @Override // dfa
    public final w29 getSupportingAdapter() {
        return this.v3.x;
    }

    @Override // dfa
    public final hea getSupportingListView() {
        return this.v3.r;
    }
}
