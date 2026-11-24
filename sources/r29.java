// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class r29 extends n39 {
    public boolean c;
    public boolean d;
    public ArrayList e;
    public ArrayList f;

    public final void E() {
        this.c = false;
        if (!this.d && this.e.isEmpty() && this.f.isEmpty()) {
            return;
        }
        ((vs1) this).J(false);
    }

    @Override // w39
    public void f() {
        if (this.c) {
            this.d = true;
        } else {
            super.f();
        }
    }

    @Override // w39
    public void g(int i) {
        if (this.c) {
            return;
        }
        super.g(i);
    }

    @Override // w39
    public void i(int i) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.i(i);
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(1);
        }
    }

    @Override // w39
    public void l(int i, int i2) {
        if (this.c) {
            return;
        }
        super.l(i, i2);
    }

    @Override // w39
    public void p(int i, int i2) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.p(i, i2);
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
        }
    }

    @Override // w39
    public void q(int i, int i2) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.q(i, i2);
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
        }
    }

    @Override // w39
    public void r(int i) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.r(i);
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(1);
        }
    }
}
