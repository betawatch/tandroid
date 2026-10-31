package rh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ long c;

    public /* synthetic */ x0(e4 e4Var, long j10, int i10) {
        this.a = i10;
        this.b = e4Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 1;
        long j10 = this.c;
        e4 e4Var = this.b;
        switch (i10) {
            case 0:
                e4Var.U1(j10);
                break;
            case 1:
                e4Var.U1(j10);
                break;
            case 2:
                w0 w0Var = e4Var.m3;
                e4Var.s2(1, true, null);
                if (j10 > 0) {
                    org.telegram.messenger.i0.r(w0Var);
                    org.telegram.messenger.i0.g3(w0Var);
                    break;
                }
                break;
            case 3:
                e4Var.U1(j10);
                break;
            case 4:
                e4Var.U1(j10);
                break;
            case 5:
                new ph.l1(e4Var.getContext(), e4Var.a, this.c, null, new w1(e4Var, i11)).show();
                break;
            case 6:
                x7 x7Var = new x7(e4Var.getContext(), e4Var.I0, this.c, 10, null, new o(8, e4Var, new boolean[]{false}), 0L);
                x7Var.setOnDismissListener(new b2(e4Var, 0));
                x7Var.show();
                break;
            case 7:
                e4Var.U1(j10);
                break;
            case 8:
                new ph.l1(e4Var.getContext(), e4Var.a, this.c, null, new w1(e4Var, i11)).show();
                break;
            case 9:
                e4Var.U1(j10);
                break;
            case 10:
                new ph.l1(e4Var.getContext(), e4Var.a, this.c, null, new w1(e4Var, i11)).show();
                break;
            case 11:
                e4Var.U1(j10);
                break;
            default:
                new ph.l1(e4Var.getContext(), e4Var.a, this.c, null, new w1(e4Var, i11)).show();
                break;
        }
    }
}
