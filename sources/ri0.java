// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ri0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ bj0 d;

    public /* synthetic */ ri0(bj0 bj0Var, int i, CharSequence charSequence, byte b) {
        this.a = b;
        this.d = bj0Var;
        this.b = i;
        this.c = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CharSequence charSequence = this.c;
        int i = this.b;
        bj0 bj0Var = this.d;
        switch (b) {
            case 0:
                mj0 mj0Var = bj0Var.m0;
                rsd rsdVar = mj0Var.c;
                if (rsdVar == null) {
                    rsdVar = new jj0();
                    mj0Var.c = rsdVar;
                }
                rsdVar.a(i, charSequence);
                break;
            default:
                bj0Var.U(i, charSequence);
                break;
        }
    }
}
