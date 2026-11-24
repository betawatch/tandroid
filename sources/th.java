// default package

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class th extends FrameLayout {
    public final /* synthetic */ ag2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(Activity activity, ag2[] ag2VarArr) {
        super(activity);
        this.a = ag2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ag2[] ag2VarArr = this.a;
        if (ag2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), ag2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
