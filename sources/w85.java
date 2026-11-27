// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class w85 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x85 b;

    public /* synthetic */ w85(x85 x85Var, byte b) {
        this.a = b;
        this.b = x85Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        x85 x85Var = this.b;
        switch (b) {
            case 0:
                tb tbVar = x85Var.b;
                if (tbVar != null) {
                    tbVar.setVisibility(0);
                }
                hl.d3(new w85(x85Var, (byte) 2), 16L);
                break;
            case 1:
                tb tbVar2 = x85Var.b;
                if (tbVar2 != null) {
                    tbVar2.setVisibility(4);
                    break;
                }
                break;
            default:
                x85Var.b();
                break;
        }
    }
}
