package uh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.m10;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c extends pt0 {
    public final /* synthetic */ i u3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, Context context) {
        super(context);
        this.u3 = iVar;
    }

    @Override // org.telegram.ui.Components.pt0
    public final boolean A1() {
        return this.u3.b;
    }

    @Override // org.telegram.ui.Components.pt0
    public final boolean B1() {
        return true;
    }

    @Override // org.telegram.ui.Components.pt0, org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int bottom = getChildAt(i11).getBottom() - getPaddingTop();
            if (bottom > i10) {
                i10 = bottom;
            }
        }
        float f7 = i10;
        i iVar = this.u3;
        m10 m10Var = iVar.J;
        if (iVar.b) {
            rs0 rs0Var = iVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < rs0Var.getChildCount(); i13++) {
                int bottom2 = rs0Var.getChildAt(i13).getBottom() - rs0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = i0.T1(f7, i12, iVar.c);
        }
        m10Var.setVisibility(iVar.w.b() <= 0 ? 8 : 0);
        m10Var.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.pt0
    public final int getAnimateToColumnsCount() {
        return this.u3.e;
    }

    @Override // org.telegram.ui.Components.pt0
    public final float getChangeColumnsProgress() {
        return this.u3.c;
    }

    @Override // org.telegram.ui.Components.pt0
    public final int getColumnsCount() {
        return this.u3.d;
    }

    @Override // org.telegram.ui.Components.pt0
    public final ak0 getMovingAdapter() {
        i iVar = this.u3;
        if (iVar.G.D != 0 || iVar.W.G.E1) {
            return null;
        }
        return iVar.w;
    }

    @Override // org.telegram.ui.Components.pt0
    public final ak0 getSupportingAdapter() {
        return this.u3.x;
    }

    @Override // org.telegram.ui.Components.pt0
    public final rs0 getSupportingListView() {
        return this.u3.r;
    }
}
