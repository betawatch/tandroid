// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class za4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hb4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ za4(hb4 hb4Var, int i, byte b) {
        this.a = b;
        this.b = hb4Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        hb4 hb4Var = this.b;
        switch (b) {
            case 0:
                vb4 vb4Var = hb4Var.g0;
                if (vb4Var != null) {
                    vb4Var.b(hb4Var, i);
                }
                hb4Var.g();
                break;
            case 1:
                hb4Var.F0.add(Integer.valueOf(i));
                break;
            case 2:
                hb4Var.F0.remove(Integer.valueOf(i));
                break;
            default:
                hb4Var.F0.remove(Integer.valueOf(i));
                break;
        }
    }
}
