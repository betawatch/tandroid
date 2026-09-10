package zh;

import android.view.TextureView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
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
