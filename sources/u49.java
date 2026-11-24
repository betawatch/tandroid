// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class u49 extends q59 {
    public boolean c;
    public boolean d;
    public ArrayList e;
    public ArrayList f;

    public final void E() {
        this.c = false;
        if (!this.d && this.e.isEmpty() && this.f.isEmpty()) {
            return;
        }
        ((hu1) this).J(false);
    }

    @Override // y59
    public void f() {
        if (this.c) {
            this.d = true;
        } else {
            super.f();
        }
    }

    @Override // y59
    public void g(int i) {
        if (this.c) {
            return;
        }
        super.g(i);
    }

    @Override // y59
    public void i(int i) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.i(i);
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(1);
        }
    }

    @Override // y59
    public void l(int i, int i2) {
        if (this.c) {
            return;
        }
        super.l(i, i2);
    }

    @Override // y59
    public void p(int i, int i2) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.p(i, i2);
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
        }
    }

    @Override // y59
    public void q(int i, int i2) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.q(i, i2);
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
        }
    }

    @Override // y59
    public void s(int i) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.s(i);
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(1);
        }
    }
}
