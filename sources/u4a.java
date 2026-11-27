// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class u4a extends wma {
    public int g0;
    public final /* synthetic */ a5a h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4a(a5a a5aVar, Context context) {
        super(context, null);
        this.h0 = a5aVar;
        this.g0 = -1;
    }

    @Override // wma
    public final boolean O() {
        return false;
    }

    @Override // wma
    public final boolean P() {
        return false;
    }

    @Override // wma
    public final void S() {
        this.h0.n1.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.M) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a5a a5aVar = this.h0;
        LinearLayout linearLayout = a5aVar.d2;
        linearLayout.setTranslationY(((i4 - i2) - linearLayout.getMeasuredHeight()) / 2.0f);
        dl1 dl1Var = a5aVar.f2;
        dl1Var.j0(dl1Var.getY() + linearLayout.getY(), getBackgroundSizeY());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.g0 != -1) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight();
            int i3 = this.g0;
            if (measuredHeight < i3) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max(i3, getMeasuredHeight()), TLObject.FLAG_31);
            }
        }
        super.onMeasure(i, i2);
        int i4 = this.g0;
        if (i4 == -1) {
            this.g0 = Math.max(i4, getMeasuredHeight());
        }
    }
}
