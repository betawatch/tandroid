// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class stb extends cja {
    public boolean m0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Q();
        if (getKeyboardHeight() != 0 || this.m0) {
            this.m0 = true;
            setPadding(0, 0, 0, 0);
        } else {
            int i3 = na7.b1().getInt("kbd_height", gl.L(200.0f));
            this.f = i3;
            setPadding(0, 0, 0, i3);
        }
        super.onMeasure(i, i2);
    }
}
