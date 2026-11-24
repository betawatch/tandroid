// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
