// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
