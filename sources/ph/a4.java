package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.uu0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a4 extends uu0 {
    public int f0;
    public final /* synthetic */ g4 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(g4 g4Var, Context context) {
        super(context, null);
        this.g0 = g4Var;
        this.f0 = -1;
    }

    @Override // org.telegram.ui.Components.uu0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.uu0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.uu0
    public final void S() {
        this.g0.k1.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.L) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g4 g4Var = this.g0;
        g4Var.a2.setTranslationY(((i13 - i11) - r4.getMeasuredHeight()) / 2.0f);
        g4Var.c2.g0(g4Var.c2.getY() + g4Var.a2.getY(), getBackgroundSizeY());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f0 != -1) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f0;
            if (measuredHeight < i12) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, getMeasuredHeight()), TLObject.FLAG_31);
            }
        }
        super.onMeasure(i10, i11);
        int i13 = this.f0;
        if (i13 == -1) {
            this.f0 = Math.max(i13, getMeasuredHeight());
        }
    }
}
