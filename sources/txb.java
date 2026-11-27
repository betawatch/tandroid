// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
