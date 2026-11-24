// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class qi0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ aj0 d;

    public /* synthetic */ qi0(aj0 aj0Var, int i, CharSequence charSequence, byte b) {
        this.a = b;
        this.d = aj0Var;
        this.b = i;
        this.c = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CharSequence charSequence = this.c;
        int i = this.b;
        aj0 aj0Var = this.d;
        switch (b) {
            case 0:
                lj0 lj0Var = aj0Var.m0;
                aod aodVar = lj0Var.c;
                if (aodVar == null) {
                    aodVar = new ij0();
                    lj0Var.c = aodVar;
                }
                aodVar.a(i, charSequence);
                break;
            default:
                aj0Var.U(i, charSequence);
                break;
        }
    }
}
