// default package

import android.view.Surface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
