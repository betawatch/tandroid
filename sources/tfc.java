// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class tfc implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ k7b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ tfc(k7b k7bVar, int i, long j) {
        this.b = k7bVar;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        k7b k7bVar = this.b;
        switch (b) {
            case 0:
                vfc vfcVar = (vfc) k7bVar.c;
                String str = gcc.a;
                ea3 ea3Var = ((n64) vfcVar).a.s;
                uj R = ea3Var.R((vz6) ea3Var.d.e);
                ea3Var.V(R, 1018, new aa3(R, i, j));
                break;
            default:
                vfc vfcVar2 = (vfc) k7bVar.c;
                String str2 = gcc.a;
                ea3 ea3Var2 = ((n64) vfcVar2).a.s;
                uj R2 = ea3Var2.R((vz6) ea3Var2.d.e);
                ea3Var2.V(R2, 1021, new aa3(R2, j, i));
                break;
        }
    }

    public /* synthetic */ tfc(k7b k7bVar, long j, int i) {
        this.b = k7bVar;
        this.c = j;
        this.d = i;
    }
}
