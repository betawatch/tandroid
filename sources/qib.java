// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class qib {
    public int a;
    public int b;
    public int c;

    public qib() {
        c();
    }

    public int a(zib zibVar, sib sibVar, lib libVar, int i, boolean z) {
        return this.a - libVar.a(sibVar, i);
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
            lib libVar = zib.T;
            if ((i & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
