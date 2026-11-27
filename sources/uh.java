// default package

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uh extends FrameLayout {
    public final /* synthetic */ sg2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(Activity activity, sg2[] sg2VarArr) {
        super(activity);
        this.a = sg2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        sg2[] sg2VarArr = this.a;
        if (sg2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), sg2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
