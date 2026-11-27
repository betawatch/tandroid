// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class yz4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oy3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ yz4(oy3 oy3Var, int i, byte b) {
        this.a = b;
        this.b = oy3Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        oy3 oy3Var = this.b;
        switch (b) {
            case 0:
                jw6 jw6Var = ((a05) ((pm3) oy3Var.f).d).d;
                if (jw6Var != null) {
                    jw6Var.j(i);
                    break;
                }
                break;
            default:
                jw6 jw6Var2 = ((a05) ((pm3) oy3Var.f).d).d;
                if (jw6Var2 != null) {
                    jw6Var2.k(i);
                    break;
                }
                break;
        }
    }
}
