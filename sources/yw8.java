// default package

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yw8 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ bx8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw8(bx8 bx8Var, Activity activity) {
        super(activity);
        this.b = bx8Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        bx8 bx8Var = this.b;
        hq7 hq7Var = bx8Var.I;
        hq7 hq7Var2 = bx8Var.H;
        this.a = true;
        Point point = hl.q;
        int i3 = point.x > point.y ? 3 : 5;
        hq7Var2.setItemCount(i3);
        hq7Var.setItemCount(i3);
        hq7Var2.getLayoutParams().height = hl.L(54.0f) * i3;
        hq7Var.getLayoutParams().height = hl.L(54.0f) * i3;
        this.a = false;
        int size = View.MeasureSpec.getSize(i);
        bx8Var.O = size;
        if (size != 0) {
            bx8Var.c(false);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
