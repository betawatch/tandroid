// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class vgb {
    public int a;
    public int b;
    public int c;

    public vgb() {
        c();
    }

    public int a(ehb ehbVar, xgb xgbVar, qgb qgbVar, int i, boolean z) {
        return this.a - qgbVar.a(xgbVar, i);
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
            qgb qgbVar = ehb.T;
            if ((i & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
