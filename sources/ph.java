// default package

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ph extends FrameLayout {
    public final /* synthetic */ ag2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(Activity activity, ag2[] ag2VarArr) {
        super(activity);
        this.a = ag2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ag2[] ag2VarArr = this.a;
        if (ag2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), gl.L(7.0f) + ag2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
