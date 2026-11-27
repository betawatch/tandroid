// default package

import android.view.TextureView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class ui5 extends TextureView {
    @Override // android.view.View
    public void invalidate() {
        if (si5.c) {
            si5.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (si5.c) {
            si5.b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
