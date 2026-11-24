// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u16 implements View.OnLayoutChangeListener {
    public boolean a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z = i4 - i2 > i3 - i;
        if (z != this.a) {
            gm.c3(new bn3(this, (byte) 20));
            this.a = z;
        }
    }
}
