// default package

import android.view.Surface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class uo9 implements aq9 {
    public final vo9 a;
    public final aq9 b;

    public uo9(vo9 vo9Var, aq9 aq9Var) {
        this.a = vo9Var;
        this.b = aq9Var;
    }

    @Override // aq9
    public final void a(int i, int i2) {
        if (this.a.W != i || this.a.X != i2) {
            this.a.W = i;
            this.a.X = i2;
            gm.c3(new kf9(this, (byte) 13));
        }
        this.b.a(i, i2);
    }

    @Override // aq9
    public final boolean b() {
        return this.b.b();
    }

    @Override // aq9
    public final Surface getSurface() {
        return this.b.getSurface();
    }
}
