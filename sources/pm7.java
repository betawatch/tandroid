// default package

import android.widget.ImageView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pm7 extends wgb {
    public ImageView a0;

    @Override // wgb, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int L = k96.a0 ? gl.L(17.0f) : (i3 - i) - gl.L(41.0f);
        int D = ug8.D(24.0f, i4 - i2, 2);
        this.a0.layout(L, D, gl.L(24.0f) + L, gl.L(24.0f) + D);
    }

    @Override // wgb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a0.measure(i, i2);
    }
}
