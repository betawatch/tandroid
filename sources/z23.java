// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class z23 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h23 b;
    public final /* synthetic */ yu4 c;

    public /* synthetic */ z23(h23 h23Var, yu4 yu4Var, byte b) {
        this.a = b;
        this.b = h23Var;
        this.c = yu4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        h23 h23Var = this.b;
        switch (b) {
            case 0:
                h23Var.B(obj);
                break;
            case 1:
                if (obj == null) {
                    obj = new xu4("No provider data returned", (byte) 2);
                }
                h23Var.B(obj);
                break;
            default:
                h23Var.B(obj);
                break;
        }
    }
}
