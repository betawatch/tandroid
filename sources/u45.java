// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class u45 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ w45 c;
    public final /* synthetic */ sk7 d;

    public /* synthetic */ u45(boolean[] zArr, w45 w45Var, sk7 sk7Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = w45Var;
        this.d = sk7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sk7 sk7Var = this.d;
        w45 w45Var = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    if (!w45Var.m) {
                        sk7Var.dismiss();
                        break;
                    } else {
                        hl.d3(this, 1000L);
                        break;
                    }
                }
                break;
            default:
                if (!zArr[0]) {
                    if (!w45Var.m) {
                        sk7Var.dismiss();
                        break;
                    } else {
                        hl.d3(this, 1000L);
                        break;
                    }
                }
                break;
        }
    }
}
