// default package

import android.view.TextureView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x75 implements nc8 {
    public final /* synthetic */ g95 a;

    public x75(g95 g95Var) {
        this.a = g95Var;
    }

    @Override // nc8
    public final TextureView J() {
        return null;
    }

    @Override // nc8
    public final void L(k47 k47Var) {
        this.a.b.invalidate();
    }

    @Override // nc8
    public final void p(k47 k47Var) {
        g95 g95Var = this.a;
        g95Var.J1.J0(true);
        g95Var.V3.f.r0(gm.L(13.0f), gm.L(13.0f), 0, 0);
        g95Var.b.invalidate();
    }
}
