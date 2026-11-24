// default package

import android.view.TextureView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class sg5 extends TextureView {
    @Override // android.view.View
    public void invalidate() {
        if (qg5.c) {
            qg5.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (qg5.c) {
            qg5.b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
