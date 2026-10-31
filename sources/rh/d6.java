package rh;

import org.telegram.ui.Components.pb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d6 extends pb {
    public int y;

    @Override // org.telegram.ui.Components.pb
    public final void setColor(int i10) {
        super.setColor(i10);
        this.y = i10;
        invalidate();
    }
}
