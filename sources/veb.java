// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class veb {
    public int a;
    public int b;
    public int c;

    public veb() {
        c();
    }

    public int a(efb efbVar, xeb xebVar, qeb qebVar, int i, boolean z) {
        return this.a - qebVar.a(xebVar, i);
    }

    public void b(int i, int i2) {
        this.a = Math.max(this.a, i);
        this.b = Math.max(this.b, i2);
    }

    public void c() {
        this.a = TLObject.FLAG_31;
        this.b = TLObject.FLAG_31;
        this.c = 2;
    }

    public int d(boolean z) {
        if (!z) {
            int i = this.c;
            qeb qebVar = efb.T;
            if ((i & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
