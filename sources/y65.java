// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
