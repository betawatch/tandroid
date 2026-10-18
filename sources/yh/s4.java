package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jw0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class s4 extends jw0 {
    public int w0;
    public final /* synthetic */ y4 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(y4 y4Var, Context context) {
        super(context, null);
        this.x0 = y4Var;
        this.w0 = -1;
    }

    @Override // org.telegram.ui.Components.jw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.jw0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.jw0
    public final void T() {
        this.x0.d.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.L) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.jw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        y4 y4Var = this.x0;
        y4Var.i0.setTranslationY(((i13 - i11) - r4.getMeasuredHeight()) / 2.0f);
        y4Var.k0.a0(y4Var.k0.getY() + y4Var.i0.getY(), getBackgroundSizeY());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.w0 != -1) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.w0;
            if (measuredHeight < i12) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, getMeasuredHeight()), TLObject.FLAG_31);
            }
        }
        super.onMeasure(i10, i11);
        int i13 = this.w0;
        if (i13 == -1) {
            this.w0 = Math.max(i13, getMeasuredHeight());
        }
    }
}
