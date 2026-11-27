// default package

import android.graphics.Bitmap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class uj0 extends u93 {
    public Bitmap a;
    public final /* synthetic */ wj0 b;

    public uj0(wj0 wj0Var) {
        this.b = wj0Var;
    }

    @Override // u93, w01
    public final void clear() {
        this.a = null;
        super.clear();
    }

    @Override // u93
    public final void release() {
        this.b.o(this);
    }
}
