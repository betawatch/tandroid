package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.aw0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class t4 extends aw0 {
    public int w0;
    public final /* synthetic */ z4 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(z4 z4Var, Context context) {
        super(context, null);
        this.x0 = z4Var;
        this.w0 = -1;
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.aw0
    public final void T() {
        this.x0.d.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.L) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        z4 z4Var = this.x0;
        z4Var.i0.setTranslationY(((i13 - i11) - r4.getMeasuredHeight()) / 2.0f);
        z4Var.k0.W(z4Var.k0.getY() + z4Var.i0.getY(), getBackgroundSizeY());
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
