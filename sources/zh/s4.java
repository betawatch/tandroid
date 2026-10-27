package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ww0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s4 extends ww0 {
    public int l0;
    public final /* synthetic */ y4 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(y4 y4Var, Context context) {
        super(context, null);
        this.m0 = y4Var;
        this.l0 = -1;
    }

    @Override // org.telegram.ui.Components.ww0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ww0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.ww0
    public final void S() {
        this.m0.d.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.L) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.ww0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        y4 y4Var = this.m0;
        y4Var.i0.setTranslationY(((i13 - i11) - r4.getMeasuredHeight()) / 2.0f);
        y4Var.k0.Y(y4Var.k0.getY() + y4Var.i0.getY(), getBackgroundSizeY());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.l0 != -1) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.l0;
            if (measuredHeight < i12) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, getMeasuredHeight()), TLObject.FLAG_31);
            }
        }
        super.onMeasure(i10, i11);
        int i13 = this.l0;
        if (i13 == -1) {
            this.l0 = Math.max(i13, getMeasuredHeight());
        }
    }
}
