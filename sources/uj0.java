// default package

import android.graphics.Bitmap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
