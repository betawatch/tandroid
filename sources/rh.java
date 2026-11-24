// default package

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rh extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ag2[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh(Activity activity, ag2[] ag2VarArr, byte b) {
        super(activity);
        this.a = b;
        this.b = ag2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        ag2[] ag2VarArr = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                if (ag2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), gl.L(7.0f) + ag2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    break;
                }
                break;
            default:
                super.onMeasure(i, i2);
                if (ag2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), gl.L(7.0f) + ag2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    break;
                }
                break;
        }
    }
}
