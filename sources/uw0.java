// default package

import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uw0 extends a {
    @Override // org.telegram.ui.ActionBar.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (hl.O1() && !hl.E && !hl.N1()) {
            Point point = hl.q;
            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
    }
}
