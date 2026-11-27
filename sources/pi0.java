// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class pi0 extends xtb {
    public final int c;
    public final int d;

    public pi0(xtb xtbVar, int i, int i2) {
        super(xtbVar);
        this.c = i;
        this.d = i2;
    }

    @Override // xtb
    public final void a(qj0 qj0Var, byte[] bArr) {
        int i = 0;
        while (true) {
            int i2 = this.d;
            if (i >= i2) {
                return;
            }
            if (i == 0 || (i == 31 && i2 <= 62)) {
                qj0Var.b(31, 5);
                if (i2 > 62) {
                    qj0Var.b(i2 - 31, 16);
                } else if (i == 0) {
                    qj0Var.b(Math.min(i2, 31), 5);
                } else {
                    qj0Var.b(i2 - 31, 5);
                }
            }
            qj0Var.b(bArr[this.c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.c);
        sb.append("::");
        sb.append((r1 + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
