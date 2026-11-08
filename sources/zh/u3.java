package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rt0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class u3 extends rt0 {
    public int f0;
    public final /* synthetic */ a4 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(a4 a4Var, Context context) {
        super(context, null);
        this.g0 = a4Var;
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
        a4 a4Var = this.g0;
        a4Var.a2.setTranslationY(((i12 - i10) - r4.getMeasuredHeight()) / 2.0f);
        a4Var.c2.i0(a4Var.c2.getY() + a4Var.a2.getY(), getBackgroundSizeY());
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
