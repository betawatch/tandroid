// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ufc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k7b b;
    public final /* synthetic */ p93 c;

    public /* synthetic */ ufc(k7b k7bVar, p93 p93Var, byte b) {
        this.a = b;
        this.b = k7bVar;
        this.c = p93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k7b k7bVar = this.b;
                p93 p93Var = this.c;
                vfc vfcVar = (vfc) k7bVar.c;
                String str = gcc.a;
                ea3 ea3Var = ((n64) vfcVar).a.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 1015, new aa3(U, p93Var, (byte) 22));
                break;
            default:
                k7b k7bVar2 = this.b;
                p93 p93Var2 = this.c;
                synchronized (p93Var2) {
                }
                vfc vfcVar2 = (vfc) k7bVar2.c;
                String str2 = gcc.a;
                s64 s64Var = ((n64) vfcVar2).a;
                ea3 ea3Var2 = s64Var.s;
                uj R = ea3Var2.R((vz6) ea3Var2.d.e);
                ea3Var2.V(R, 1020, new ht2(R, p93Var2, (byte) 17));
                s64Var.S = null;
                break;
        }
    }
}
