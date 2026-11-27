// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ws1 extends yc8 {
    public final /* synthetic */ r47 a;
    public final /* synthetic */ no6 b;
    public final /* synthetic */ zu1 c;

    public ws1(zu1 zu1Var, r47 r47Var, no6 no6Var) {
        this.c = zu1Var;
        this.a = r47Var;
        this.b = no6Var;
    }

    @Override // yc8, ed8
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        zu1 zu1Var = this.c;
        if (zu1Var.H5 != this.a) {
            return;
        }
        no6 no6Var = this.b;
        if (no6Var.w || no6Var.v || no6Var.u || oecVar != null) {
            zu1Var.G(no6Var, oecVar, z, i2, z2, 0L);
        } else {
            zu1Var.a0.w0();
        }
    }

    @Override // yc8, ed8
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        return this.c.d7(this.a, null, i, z, true);
    }

    @Override // yc8, ed8
    public final boolean P() {
        zu1 zu1Var = this.c;
        if (zu1Var.a0 == null || !zu1Var.Y7()) {
            return false;
        }
        zu1Var.a0.U();
        return true;
    }

    @Override // yc8, ed8
    public final r47 V() {
        r47 r47Var = this.c.H5;
        r47 r47Var2 = this.a;
        if (r47Var == r47Var2) {
            return r47Var2;
        }
        return null;
    }

    @Override // yc8, ed8
    public final void f(CharSequence charSequence) {
        this.c.a0.Q1(charSequence, false);
    }

    @Override // yc8, ed8
    public final boolean h() {
        return false;
    }
}
