// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uz5 implements View.OnLayoutChangeListener {
    public boolean a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z = i4 - i2 > i3 - i;
        if (z != this.a) {
            gl.c3(new ql3(this, (byte) 20));
            this.a = z;
        }
    }
}
