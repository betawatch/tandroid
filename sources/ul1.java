// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ul1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ul1(zu1 zu1Var, int i, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.b9(i);
                break;
            case 1:
                zu1Var.c9(i);
                break;
            case 2:
                zu1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 3:
                this.b.J(this.c, 0, 0, 0, false, true);
                break;
            case 4:
                zu1Var.D8(i);
                break;
            case 5:
                zu1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 6:
                zu1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 7:
                zu1Var.C8(i);
                break;
            case 8:
                zu1Var.H9(i);
                break;
            default:
                zu1Var.getConnectionsManager().cancelRequest(i, true);
                break;
        }
    }
}
