package th;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v0 extends ViewGroup {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (w0.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        w0 w0Var = w0.Z;
        if (w0Var.e.getParent() == this) {
            w0Var.e.layout(0, 0, w0Var.J, w0Var.K);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        w0 w0Var = w0.Z;
        if (w0Var.e.getParent() == this) {
            w0Var.e.measure(View.MeasureSpec.makeMeasureSpec(w0Var.J, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(w0Var.K, TLObject.FLAG_30));
        }
    }
}
