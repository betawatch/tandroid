// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zpb extends pqb {
    public final /* synthetic */ zu1 m2;
    public final /* synthetic */ boolean n2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpb(Object obj, zu1 zu1Var, boolean z) {
        super(obj, null, true);
        this.m2 = zu1Var;
        this.n2 = z;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        xu1 xu1Var = this.m2.Ba;
        xu1Var.q(xu1Var.f, xu1Var.g, false, Boolean.valueOf(this.n2), false);
    }
}
