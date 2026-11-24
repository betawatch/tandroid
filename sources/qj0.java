// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qj0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ ak0 d;

    public /* synthetic */ qj0(ak0 ak0Var, int i, CharSequence charSequence, byte b) {
        this.a = b;
        this.d = ak0Var;
        this.b = i;
        this.c = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CharSequence charSequence = this.c;
        int i = this.b;
        ak0 ak0Var = this.d;
        switch (b) {
            case 0:
                lk0 lk0Var = ak0Var.m0;
                dqd dqdVar = lk0Var.c;
                if (dqdVar == null) {
                    dqdVar = new ik0();
                    lk0Var.c = dqdVar;
                }
                dqdVar.a(i, charSequence);
                break;
            default:
                ak0Var.U(i, charSequence);
                break;
        }
    }
}
