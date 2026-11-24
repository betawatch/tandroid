// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z85 extends o95 {
    @Override // o95, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (gm.O1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(420.0f), View.MeasureSpec.getSize(i)), TLObject.FLAG_30), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
