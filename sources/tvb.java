// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tvb extends ela {
    public boolean m0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Q();
        if (getKeyboardHeight() != 0 || this.m0) {
            this.m0 = true;
            setPadding(0, 0, 0, 0);
        } else {
            int i3 = oc7.c1().getInt("kbd_height", gm.L(200.0f));
            this.f = i3;
            setPadding(0, 0, 0, i3);
        }
        super.onMeasure(i, i2);
    }
}
