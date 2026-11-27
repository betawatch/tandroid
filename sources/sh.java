// default package

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sh extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sg2[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh(Activity activity, sg2[] sg2VarArr, byte b) {
        super(activity);
        this.a = b;
        this.b = sg2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        sg2[] sg2VarArr = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                if (sg2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), hl.L(7.0f) + sg2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    break;
                }
                break;
            default:
                super.onMeasure(i, i2);
                if (sg2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), hl.L(7.0f) + sg2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    break;
                }
                break;
        }
    }
}
