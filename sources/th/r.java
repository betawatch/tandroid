package th;

import android.view.TextureView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class r extends TextureView {
    @Override // android.view.View
    public void invalidate() {
        if (p.c) {
            p.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (p.c) {
            p.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
