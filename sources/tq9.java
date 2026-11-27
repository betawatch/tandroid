// default package

import android.view.Surface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tq9 implements qr9 {
    public final /* synthetic */ er9 a;

    public tq9(er9 er9Var) {
        this.a = er9Var;
    }

    @Override // qr9
    public final void a(int i, int i2) {
        hl.c3(new jt(this, i / i2, (byte) 4));
    }

    @Override // qr9
    public final boolean b() {
        return true;
    }

    @Override // qr9
    public final Surface getSurface() {
        return this.a.r0;
    }
}
