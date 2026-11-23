package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t81 extends org.telegram.ui.Components.du0 {
    public boolean g0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        Q();
        if (getKeyboardHeight() != 0 || this.g0) {
            this.g0 = true;
            setPadding(0, 0, 0, 0);
        } else {
            int i11 = org.telegram.messenger.np.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            this.f = i11;
            setPadding(0, 0, 0, i11);
        }
        super.onMeasure(i7, i10);
    }
}
