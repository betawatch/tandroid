// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zp5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bq5 b;
    public final /* synthetic */ j18 c;

    public /* synthetic */ zp5(bq5 bq5Var, j18 j18Var, byte b) {
        this.a = b;
        this.b = bq5Var;
        this.c = j18Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j18 j18Var = this.c;
        bq5 bq5Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new zp5(bq5Var, j18Var, (byte) 1));
                break;
            default:
                bq5Var.i = j18Var.a;
                break;
        }
    }
}
