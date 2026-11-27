// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class txb extends wma {
    public boolean g0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Q();
        if (getKeyboardHeight() != 0 || this.g0) {
            this.g0 = true;
            setPadding(0, 0, 0, 0);
        } else {
            int i3 = uc7.d1().getInt("kbd_height", hl.L(200.0f));
            this.f = i3;
            setPadding(0, 0, 0, i3);
        }
        super.onMeasure(i, i2);
    }
}
