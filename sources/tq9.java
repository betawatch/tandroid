// default package

import android.view.Surface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
