// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class y65 extends s95 {
    @Override // s95, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (gl.O1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(420.0f), View.MeasureSpec.getSize(i)), TLObject.FLAG_30), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
