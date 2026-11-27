// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class tr1 extends hw6 {
    public final /* synthetic */ zu1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr1(zu1 zu1Var, wq1 wq1Var, zq1 zq1Var) {
        super(wq1Var, zq1Var);
        this.x = zu1Var;
    }

    @Override // hw6
    public final void l(int i) {
        if (this.x.nb) {
            if (i == 0) {
                i = 1;
            } else if (i == 1) {
                i = 0;
            }
        }
        this.b = i;
    }
}
