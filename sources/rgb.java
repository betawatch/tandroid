// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rgb extends vgb {
    public int d;

    @Override // vgb
    public final int a(ehb ehbVar, xgb xgbVar, qgb qgbVar, int i, boolean z) {
        return Math.max(0, this.a - qgbVar.a(xgbVar, i));
    }

    @Override // vgb
    public final void b(int i, int i2) {
        super.b(i, i2);
        this.d = Math.max(this.d, i + i2);
    }

    @Override // vgb
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // vgb
    public final int d(boolean z) {
        return Math.max(super.d(z), this.d);
    }
}
