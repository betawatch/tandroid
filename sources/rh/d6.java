package rh;

import org.telegram.ui.Components.pb;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
