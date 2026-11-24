// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class reb extends veb {
    public int d;

    @Override // veb
    public final int a(efb efbVar, xeb xebVar, qeb qebVar, int i, boolean z) {
        return Math.max(0, this.a - qebVar.a(xebVar, i));
    }

    @Override // veb
    public final void b(int i, int i2) {
        super.b(i, i2);
        this.d = Math.max(this.d, i + i2);
    }

    @Override // veb
    public final void c() {
        super.c();
        this.d = TLObject.FLAG_31;
    }

    @Override // veb
    public final int d(boolean z) {
        return Math.max(super.d(z), this.d);
    }
}
