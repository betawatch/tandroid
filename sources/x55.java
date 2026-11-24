// default package

import android.widget.LinearLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x55 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ hn7 b;
    public final /* synthetic */ t55 c;
    public final /* synthetic */ u55 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x55(LaunchActivity launchActivity, hn7 hn7Var, t55 t55Var, u55 u55Var) {
        super(launchActivity);
        this.b = hn7Var;
        this.c = t55Var;
        this.d = u55Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.a = true;
        hn7 hn7Var = this.b;
        hn7Var.setItemCount(5);
        t55 t55Var = this.c;
        t55Var.setItemCount(5);
        u55 u55Var = this.d;
        u55Var.setItemCount(5);
        hn7Var.getLayoutParams().height = gl.L(54.0f) * 5;
        t55Var.getLayoutParams().height = gl.L(54.0f) * 5;
        u55Var.getLayoutParams().height = gl.L(54.0f) * 5;
        this.a = false;
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
