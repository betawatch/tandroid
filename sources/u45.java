// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class u45 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ w45 c;
    public final /* synthetic */ tk7 d;

    public /* synthetic */ u45(boolean[] zArr, w45 w45Var, tk7 tk7Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = w45Var;
        this.d = tk7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tk7 tk7Var = this.d;
        w45 w45Var = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    if (!w45Var.m) {
                        tk7Var.dismiss();
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
                        tk7Var.dismiss();
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
