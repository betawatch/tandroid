// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
