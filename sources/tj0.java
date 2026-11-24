// default package

import android.graphics.Bitmap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tj0 extends b93 {
    public Bitmap a;
    public final /* synthetic */ vj0 b;

    public tj0(vj0 vj0Var) {
        this.b = vj0Var;
    }

    @Override // b93, n01
    public final void clear() {
        this.a = null;
        super.clear();
    }

    @Override // b93
    public final void release() {
        this.b.o(this);
    }
}
