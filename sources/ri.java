// default package

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ri extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oh2[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri(Activity activity, oh2[] oh2VarArr, byte b) {
        super(activity);
        this.a = b;
        this.b = oh2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        oh2[] oh2VarArr = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                if (oh2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), gm.L(7.0f) + oh2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    break;
                }
                break;
            default:
                super.onMeasure(i, i2);
                if (oh2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), gm.L(7.0f) + oh2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    break;
                }
                break;
        }
    }
}
