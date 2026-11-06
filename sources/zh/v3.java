package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rt0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class v3 extends rt0 {
    public int f0;
    public final /* synthetic */ b4 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(b4 b4Var, Context context) {
        super(context, null);
        this.g0 = b4Var;
        this.f0 = -1;
    }

    @Override // org.telegram.ui.Components.rt0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.rt0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.rt0
    public final void S() {
        this.g0.k1.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.L) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.rt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        b4 b4Var = this.g0;
        b4Var.a2.setTranslationY(((i12 - i10) - r4.getMeasuredHeight()) / 2.0f);
        b4Var.c2.i0(b4Var.c2.getY() + b4Var.a2.getY(), getBackgroundSizeY());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.f0 != -1) {
            super.onMeasure(i7, i10);
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f0;
            if (measuredHeight < i11) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max(i11, getMeasuredHeight()), TLObject.FLAG_31);
            }
        }
        super.onMeasure(i7, i10);
        int i12 = this.f0;
        if (i12 == -1) {
            this.f0 = Math.max(i12, getMeasuredHeight());
        }
    }
}
