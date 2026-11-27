// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vl3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ vl3(zl3 zl3Var, int i, byte b) {
        this.a = b;
        this.b = zl3Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.a) {
            case 0:
                zl3 zl3Var = this.b;
                zl3Var.postOnAnimation(new vl3(zl3Var, this.c, b));
                break;
            default:
                zl3 zl3Var2 = this.b;
                int i = this.c;
                if (zl3Var2.e && !zl3Var2.r && i == zl3Var2.F) {
                    zl3Var2.y = true;
                    zl3Var2.requestRender();
                    break;
                }
                break;
        }
    }
}
