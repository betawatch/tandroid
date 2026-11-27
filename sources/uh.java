// default package

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
