// default package

import android.widget.LinearLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class z75 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ hq7 b;
    public final /* synthetic */ v75 c;
    public final /* synthetic */ w75 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z75(LaunchActivity launchActivity, hq7 hq7Var, v75 v75Var, w75 w75Var) {
        super(launchActivity);
        this.b = hq7Var;
        this.c = v75Var;
        this.d = w75Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.a = true;
        hq7 hq7Var = this.b;
        hq7Var.setItemCount(5);
        v75 v75Var = this.c;
        v75Var.setItemCount(5);
        w75 w75Var = this.d;
        w75Var.setItemCount(5);
        hq7Var.getLayoutParams().height = hl.L(54.0f) * 5;
        v75Var.getLayoutParams().height = hl.L(54.0f) * 5;
        w75Var.getLayoutParams().height = hl.L(54.0f) * 5;
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
