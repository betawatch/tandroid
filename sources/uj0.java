// default package

import android.graphics.Bitmap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
