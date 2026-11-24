// default package

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qv8 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ tv8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv8(tv8 tv8Var, Activity activity) {
        super(activity);
        this.b = tv8Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        tv8 tv8Var = this.b;
        lp7 lp7Var = tv8Var.I;
        lp7 lp7Var2 = tv8Var.H;
        this.a = true;
        Point point = gm.q;
        int i3 = point.x > point.y ? 3 : 5;
        lp7Var2.setItemCount(i3);
        lp7Var.setItemCount(i3);
        lp7Var2.getLayoutParams().height = gm.L(54.0f) * i3;
        lp7Var.getLayoutParams().height = gm.L(54.0f) * i3;
        this.a = false;
        int size = View.MeasureSpec.getSize(i);
        tv8Var.O = size;
        if (size != 0) {
            tv8Var.c(false);
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
