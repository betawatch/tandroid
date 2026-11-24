// default package

import android.graphics.Bitmap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
