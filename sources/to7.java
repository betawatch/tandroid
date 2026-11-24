// default package

import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class to7 extends xib {
    public ImageView a0;

    @Override // xib, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int L = jb6.a0 ? gm.L(17.0f) : (i3 - i) - gm.L(41.0f);
        int D = wi8.D(24.0f, i4 - i2, 2);
        this.a0.layout(L, D, gm.L(24.0f) + L, gm.L(24.0f) + D);
    }

    @Override // xib, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a0.measure(i, i2);
    }
}
