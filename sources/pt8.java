// default package

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pt8 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ st8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt8(st8 st8Var, Activity activity) {
        super(activity);
        this.b = st8Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        st8 st8Var = this.b;
        hn7 hn7Var = st8Var.I;
        hn7 hn7Var2 = st8Var.H;
        this.a = true;
        Point point = gl.q;
        int i3 = point.x > point.y ? 3 : 5;
        hn7Var2.setItemCount(i3);
        hn7Var.setItemCount(i3);
        hn7Var2.getLayoutParams().height = gl.L(54.0f) * i3;
        hn7Var.getLayoutParams().height = gl.L(54.0f) * i3;
        this.a = false;
        int size = View.MeasureSpec.getSize(i);
        st8Var.O = size;
        if (size != 0) {
            st8Var.c(false);
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
