package zh;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class w0 extends ViewGroup {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (x0.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        x0 x0Var = x0.Z;
        if (x0Var.e.getParent() == this) {
            x0Var.e.layout(0, 0, x0Var.J, x0Var.K);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        x0 x0Var = x0.Z;
        if (x0Var.e.getParent() == this) {
            x0Var.e.measure(View.MeasureSpec.makeMeasureSpec(x0Var.J, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(x0Var.K, TLObject.FLAG_30));
        }
    }
}
