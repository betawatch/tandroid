// default package

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
