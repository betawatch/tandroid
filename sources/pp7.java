// default package

import android.widget.ImageView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class pp7 extends skb {
    public ImageView a0;

    @Override // skb, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int L = ob6.a0 ? hl.L(17.0f) : (i3 - i) - hl.L(41.0f);
        int D = ik8.D(24.0f, i4 - i2, 2);
        this.a0.layout(L, D, hl.L(24.0f) + L, hl.L(24.0f) + D);
    }

    @Override // skb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a0.measure(i, i2);
    }
}
