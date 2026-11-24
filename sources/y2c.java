// default package

import android.view.ViewGroup;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y2c extends RadialProgressView {
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = gl.m / 2;
    }
}
