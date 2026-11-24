// default package

import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tx0 extends a {
    @Override // org.telegram.ui.ActionBar.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (gm.O1() && !gm.E && !gm.N1()) {
            Point point = gm.q;
            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
    }
}
