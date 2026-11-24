// default package

import android.view.ViewGroup;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z4c extends RadialProgressView {
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = gm.m / 2;
    }
}
